import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainCancelPage extends HttpServlet{


			MainHelperClass h = new MainHelperClass();
            MainItemOrder order;
            MainShoppingCart cart;
            ItemsList itm = null;
            Calendar cal = Calendar.getInstance();
            long miliSecondForDate2 = cal.getTimeInMillis();
            double diff ;
            int orderid=1001;
             public void cancel(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, java.io.IOException{

    				 response.setContentType("text/html");
    				 java.io.PrintWriter out = response.getWriter();
                     //if(request.getParameter("orderid")!= null)
                     try{
    				 

                     orderid = Integer.parseInt(request.getParameter("orderid"));
                     out.println("The order id is :"+orderid);

                        }  
                        catch (NumberFormatException e) {
                        out.println("Wrong order no");

                         }


                     Map<Integer, ItemsList> map = new HashMap<Integer, ItemsList>();
					 map = h.dserial();
                     Set set = map.entrySet();
                     Iterator iterator = set.iterator();
                     while(iterator.hasNext()) {
                     Map.Entry mentry = (Map.Entry)iterator.next();
                     
                     if(mentry.getKey()==orderid)
                     	{
                            ItemsList il =(ItemsList) mentry.getValue();
                            diff = ((miliSecondForDate2 - il.msd)/ (24 * 60 * 60 * 1000));
                     		 map.remove(orderid);
                     		 h.serial(map);
                     	     out.println("<h3>Your Order is Cancelled!!</h3>");

                     	 }    
                         else{

                            out.println("\n\n<h3>Sorry your order cannot be cancelled since it is Out for Delivery :(!!</h3>");
                         }
                    // System.out.print("key: "+ mentry.getKey() + " & Value: ");
                     //System.out.println(mentry.getValue());

				 }
        	}
             public void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, java.io.IOException {
       				 
   						cancel(request,response);
   			} 


} 