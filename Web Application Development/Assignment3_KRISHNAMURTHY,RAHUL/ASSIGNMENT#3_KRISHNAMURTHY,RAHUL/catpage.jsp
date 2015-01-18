<%@ page import= "beanpack.*, java.util.*" %>
<HTML> 
                <HEAD><TITLE>  catlog  </TITLE></HEAD> 
                <BODY BGCOLOR=#FDF5E6> 

                		
			
        <%! String[] itemIDs;
 						String title;
            MainCatalogItem[] items;
            MainCatalogItem item;
            SetCat sc;
  					%>
  					
  				

  					<%String prod =  request.getParameter("item");
            String[] ids = new String[]{"Hello", "World"};

            if(prod =="Phones")
  						{

  							ids = new String[]{ "moto1", "moto2", "apple1","apple2","samsung1","samsung2" };
    						
                sc.setItems(ids);
                 for(int i=0; i<ids.length; i++) {
                 
             items[i] = MainCatalog.getItem(ids[i]);

    						title="BEST SELLING SMARTPHONES";
  							}
              }
  					else if(prod =="Tablets")
  						{

  							ids = new String[]{ "amazon1", "google1", "microsoft1","apple3","samsung3"};
    						
                sc.setItems(ids);
                 for(int i=0; i<ids.length; i++) {
                 
             items[i] = MainCatalog.getItem(ids[i]);
    						title ="BEST SELLING Tablets";
              }

  							}
  					else if(prod == "Laptops")
  							{

  							ids = new String[]{ "apple4", "asus1", "lenovo1","sony1"};
                sc.setItems(ids);
    						for(int i=0; i<ids.length; i++) {
             items[i] = MainCatalog.getItem(ids[i]);
    						title ="BEST SELLING Laptops";
  							   }
                 }
  					else if(prod == "Tvs")
  							{

  							ids = new String[]{ "samasung4", "panasonic1", "sony2"};
              sc.setItems(ids);
              for(int i=0; i<ids.length; i++) {
             items[i] = MainCatalog.getItem(ids[i]);
    						title = "BEST SELLING Tvs";
  							}
              }
  					%>
  			 
             
				  
				  <%for(int i=0; i<ids.length; i++) {
            item = items[i];
         
           %>
				  <hr>
				  <% 
				      if (item == null) { %>
				      <FONT COLOR=RED> 
                    	Unknown item ID   itemIDs[i] 
                    	</FONT>
                    	 <% } else { %>
                    	  <FORM ACTION <%=response.encodeURL("")%> > 
                    	  	<INPUT TYPE=HIDDEN NAME=itemID  VALUE=  item.getItemID() > 
           					<H2> <% item.getShortDescription(); %>
          						  $ <% item.getCost();   %></H2> 
           						<%item.getLongDescription(); %>  
          						 <P><CENTER> 
          				 <INPUT TYPE=SUBMIT  VALUE=Add to Shopping Cart> 
          						 </CENTER><P></FORM>
      							<% } }%>
      							<HR>

      		</BODY>

      	</HTML>

