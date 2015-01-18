<html>
<head>
 <%@ page import="java.io.*, java.util.*" %>
</head>
<body>
<%

	String userid = request.getParameter("userid");
	String password = request.getParameter("password");
	 HashMap users = new HashMap();
	users.put(userid,password);

      if(userid != null && userid.length() != 0) {
            userid = userid.trim();
        }
        if(password != null && password.length() != 0) {
            password = password.trim();
        }
        if(userid != null &&
            password != null) {
                String realpassword = (String)users.get(userid);
                if(realpassword != null &&
                    realpassword.equals(password)) {
                    //out.println("Login Success!");
                } else {
                    //out.println("Login Failure! Username or password is incorrect");
                }
        }  else {
            //out.println("Login Failure!  You must supply a username and password");
        }
%>
<h2><u>BestDeal.com</u></h2>
<% if(userid ==null)%>
<p><h4>Hello Guest ,</h4></p>
<% if(userid!=null) %>
<p><h4>Hello <%=userid%> , </h4>
   
<form action= "cancelorder.jsp">
<hr>
<input type = "text" size = "10" name = "orderid"><br>
<input type = "submit" value = "CancelOrder">

</form>
</body>
</html>