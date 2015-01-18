
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import beans4.*;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author nbuser
 */
public class AutoCompleteServlet extends HttpServlet {

    static{
            System.out.println("Aotu Complete present");
    }
    private ServletContext context;
    private ItemData itemData = new ItemData();
    private HashMap<String,MainCatalogItem> products = itemData.getitems();

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.context = config.getServletContext();
    }

    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
                System.out.println("#################do get ");
        String action = request.getParameter("action");
        String targetId = request.getParameter("id");
        StringBuffer sb = new StringBuffer();
        MainCatalogItem items = null;


        if (targetId != null) {
            targetId = targetId.trim().toLowerCase();
        } else {
            context.getRequestDispatcher("/error.jsp").forward(request, response);
        }

        boolean namesAdded = false;
        if (action.equals("complete")) {

            // check if user sent empty string
            if (!targetId.equals("")) {
                System.out.println("total products::"+products.size());
                Iterator it = products.keySet().iterator();
                System.out.println("All products::"+products);
                while (it.hasNext()) {
                    String id = (String) it.next();
                    items = (MainCatalogItem)products.get(id);
                    System.out.println("#############Going to get items#####################");
                    System.out.println("item::"+items);
                    if (items.getShortDescription().toLowerCase().startsWith(targetId)) 
                         {

                        sb.append("<item>");//change tags and keep the same 
                        sb.append("<id>" + items.getItemID() + "</id>");
                        sb.append("<shortDescription>" + items.getShortDescription() + "</shortDescription>");
                        //sb.append("<lastName>" + composer.getLastName() + "</lastName>");
                        sb.append("</item>");
                        namesAdded = true;
                    }
                }
            }
            System.out.println("items::"+sb.toString());
            System.out.println("######################GOt the ITems###########################");

            if (namesAdded) {
                response.setContentType("text/xml");
                response.setHeader("Cache-Control", "no-cache");
                response.getWriter().write("<items>" + sb.toString() + "</items>");//change
            } else {
                //nothing to show
                response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            }
        }
        System.out.println("############Reached outside if#################");

        if (action.equals("lookup")) {
                // put the target composer in the request scope to display 
            if((targetId != null) && products.containsKey(targetId.trim())) {
                System.out.println("#######################inside lookup###############");
                request.setAttribute("sd", products.get(targetId));
                context.getRequestDispatcher("/Itemlookup.jsp").forward(request, response);
            }
                
        }
    }
}
