<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    
</head>
<body>
    <%-- import any packages needed by the page --%>
    <%@ page import="beanboy.*,java.util.Date, java.io.*" %>

    <%! 
        // declare an instance variable for the page
        int globalCount = 1000;  // this is not thread-safe
    %>
    <%!
        // declare a method for the page
        public void add(User user, String filename)
                throws IOException
        {
            PrintWriter out = new PrintWriter(
                    new FileWriter(filename, true));
            out.println(user.getEmailAddress()+ "|"
                    + user.getFirstName() + "|"
                    + user.getLastName()+ "|"
                    +user.getaddress()+ "|"
                    +user.getcity()+ "|"
                    +user.getstate()+ "|"
                    +user.getzip()+ "|"
                    +user.getcreditcardnumber()+ "|"
                    +user.getcvv());
            out.close();
        }
    %>
    <%
        String firstName = request.getParameter("FirstName");
        String lastName = request.getParameter("LastName");
        String emailAddress = request.getParameter("EmailId");
        String address = request.getParameter("Address");
        String city = request.getParameter("City");
        String state = request.getParameter("State");
        String zip= request.getParameter("Zip");
        String creditcardnumber = request.getParameter("CreditCardNumber");
        String cvv= request.getParameter("Cvv");
       


        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/WEB-INF/EmailList.txt");

        User user = new User(firstName, lastName, emailAddress,address,city,state,zip,creditcardnumber,cvv);

        // use the declared method
        this.add(user, path);

        // update the instance variable
        globalCount++;  // this is not thread-safe

    %>

    <h1>Thank You for shopping in Bestdeal</h1>

    <p>Here is the Confirmation recipt:</p>

    <p>Order Reference Number : <%=++globalCount%> </p>

    <table cellspacing="5" cellpadding="5" border="1">
        <tr>
            <td align="right">First name:</td>
            <td><%= user.getFirstName() %></td>
        </tr>
        <tr>
            <td align="right">Last name:</td>
            <td><%= user.getLastName() %></td>
        </tr>
        <tr>
            <td align="right">Email address:</td>
            <td><%= user.getEmailAddress() %></td>
        </tr>
         <tr>
            <td align="right">Address:</td>
            <td><%= user.getaddress() %></td>
        </tr>
         <tr>
            <td align="right">City:</td>
            <td><%= user.getcity() %></td>
        </tr>
         <tr>
            <td align="right">State:</td>
            <td><%= user.getstate() %></td>
        </tr>
         <tr>
            <td align="right">Zip Code:</td>
            <td><%= user.getzip() %></td>
        </tr>

    </table>
   
    <p><b>
        This Date of purchase is :<%= new Date() %><br>
        The product will be delivered within 15 days.<br>
        Cancellations must be done before five business days.
    </b>
    </p>

</body>
</html>