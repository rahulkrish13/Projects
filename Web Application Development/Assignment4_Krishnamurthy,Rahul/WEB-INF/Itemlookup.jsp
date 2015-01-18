<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.*"%>
<%@page import="java.util.*"%>
<%@page import="beans4.*"%>

<html>
  <head>
    <title>Items Information</title>

    <link rel="stylesheet" type="text/css" href="stylesheet.css">
  </head>
  <body>
    <%
    MainCatalogItem item = (MainCatalogItem)request.getAttribute("sd");
    %>
<table>
      <tr>
        <th colspan="2">Item Description</th>
      </tr>
      <tr>
        <td>Product Name: </td>
        <td><%=item.getShortDescription()%></td>
      </tr>
      <tr>
        <td>Product Description: </td>
        <td><%=item.getLongDescription()%></td>
      </tr>
      <tr>
        <td>Cost :</td>
        <td><%=item.getCost()%></td>
      </tr>
        
    </table>

    <p>Go back to <a href="Mainpage.html">application home</a>.</p>
  </body>
</html>

