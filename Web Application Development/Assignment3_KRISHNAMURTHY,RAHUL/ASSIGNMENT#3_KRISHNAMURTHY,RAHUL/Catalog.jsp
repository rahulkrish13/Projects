<%@ page import="beanpack.MainCatalogPage" %>
<%@ page import="beanpack.MainCatalog" %>
<%@ page import="beanpack.MainCatalogItem" %>


 <HTML> 
                <HEAD><TITLE>  title  </TITLE></HEAD> 
                <BODY BGCOLOR=#FDF5E6> 
				
                	
				
				
				<jsp:getProperty name="beanpack" property="*"/>
				<jsp:setProperty name="beanpack" property="*"/>  
						
				
                <H1 ALIGN=CENTER>  title  </H1>);
    
    <%=
    MainCatalogItem item;
    for(int i=0; i<items.length; i) {
    %>
      <HR>
      <%
      item = items[i];
      if (item == null) { %>
        <FONT COLOR=RED> 
                    Unknown item ID   itemIDs[i] 
                    </FONT>
     <% } else { %>
      
       <% String formURL =/jsp-hw/Mainorderpage.jsp;  %>
        // Pass URLs that reference own site through encodeURL.
        <% formURL = response.encodeURL(formURL); %>
       
        
          <FORM ACTION=  formURL  > 
           <INPUT TYPE=HIDDEN NAME=itemID  VALUE=  item.getItemID() > 
           <H2> <% item.getShortDescription(); %>
            $ <% item.getCost();   %></H2> 
           <%item.getLongDescription(); %>  
           <P><CENTER> 
           <INPUT TYPE=SUBMIT  VALUE=Add to Shopping Cart> 
           </CENTER><P></FORM>
      <% } %>
   <% } %>
    <HR></BODY></HTML>
