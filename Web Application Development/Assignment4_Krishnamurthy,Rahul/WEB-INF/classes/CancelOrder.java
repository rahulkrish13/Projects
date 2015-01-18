
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CancelOrder extends HttpServlet{

			MainHelperClass h = new MainHelperClass();
            MainItemOrder order;
            MainShoppingCart cart;
            ItemsList itm = null;
            Calendar cal = Calendar.getInstance();
            long miliSecondForDate2 = cal.getTimeInMillis();
            double diff ;

	 public void cancel(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, java.io.IOException{

    				 response.setContentType("text/html");
    				 java.io.PrintWriter out = response.getWriter();
    				 int orderid = Integer.parseInt(request.getParameter("orderid"));
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
             protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, java.io.IOException {
       				 
   						cancel(request,response);
   			} 

}