<html>
<head>
    
</head>
<body>
    <%-- import any packages needed by the page --%>
    <%@ page import="beanboy.*,java.util.*, java.io.*" %>
<%
String oid = request.getParameter("orderid");
int days = 6;
//BufferedReader br = new BufferedReader(new FileReader("/WEB-INF/EmailList.txt"));
   //String line = "";
   //StringTokenizer st = null;

   //int lineNumber = 0; 
  // int tokenNumber = 0;

   //read comma separated file line by line
   //while ((line = br.readLine()) != null) {
     //lineNumber++;

     //use comma as token separator
     //st = new StringTokenizer(line, "|");

     //while (st.hasMoreTokens()) {
       //tokenNumber++;

       
       if(days<5 )
       	out.println("Order Cannot be Cancelled");

     

    
   

  

  
%>

<p>Order is Cancelled</p>
</body>
</html>
