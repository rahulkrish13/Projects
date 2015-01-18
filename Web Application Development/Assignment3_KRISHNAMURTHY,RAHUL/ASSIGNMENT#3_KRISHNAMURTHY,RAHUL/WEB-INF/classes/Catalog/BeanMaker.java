package Catalog;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpSession;  
  
/** 
 * 
 */  
public class BeanMaker {  
    boolean error = false;  
    BeanMaker(HttpServletRequest request, String BeanType){  
        HttpSession session = request.getSession();  
          
        Item itemBean = new Item();  
          
        if(BeanType.equals("item"))  
        {  
            if(Validator.getIntParameter(request.getParameter("itemID"),0)>0){  
                itemBean.setItemID(request.getParameter("itemID"));  
            }  
            else  
            {  
                error = true;  
                itemBean.setItemID("Error with item ID");  
            }  
                request.setAttribute("item", itemBean);  
                  
               
            if(Validator.getIntParameter(request.getParameter("itemName"),0)>0){  
                itemBean.setItemID(request.getParameter("itemName"));  
            }  
            else  
            {  
                error = true;  
                itemBean.setItemID("Error with item name");  
            }  
                request.setAttribute("item", itemBean);  
                  
            if(Validator.getIntParameter(request.getParameter("itemDescription"),0)>0){  
                itemBean.setItemID(request.getParameter("itemDescription"));  
            }  
            else  
            {  
                error = true;  
                itemBean.setItemID("Error with item description");  
            }  
                request.setAttribute("item", itemBean);  
                  
            if(Validator.getIntParameter(request.getParameter("cost"),0)>0){  
                itemBean.setItemID(request.getParameter("cost"));  
            }  
            else  
            {  
                error = true;  
                itemBean.setItemID("Error with cost");  
            }  
                request.setAttribute("item", itemBean);  
        }  
    }  
}  