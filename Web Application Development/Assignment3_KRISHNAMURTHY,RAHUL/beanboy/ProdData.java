package beanboy;

import java.io.*;
import java.util.*;
public class ProdData implements Serializable{


  public static Product finditem(String code){



  						
  				 String code1;
    			 String description;
    			 double price;

  				Product p= new Product();
                String[][] catalogitems =  { 
                                                { "moto1", "DROID MAXX", "249.99"},
                                                { "moto2", "MOTO X","229.99"},
                                                { "apple1", "IPhone 5s","499.99"},
                                                { "apple2", "Iphone 5c" , "429.99"},
                                                { "samsung1", "GALAXY S3" , "329.99"},
                                                { "samsung2", "GALAXY S4" , "499.99"}, 
                                                { "amazon1", "Kindle" , "479.99"}, 
                                                { "google1", "Nexus" , "329.99"}, 
                                                { "microsoft1", "Surface" , "499.99"}, 
                                                { "apple3", "I Pad 2" , "399.99"}, 
                                                { "samsung2", "GALAXY Tab" , "319.99"}, 
                                                { "apple4", "Mac Book Pro" , "1099.99"}, 
                                                { "asus1", "Asus Ax11" , "399.99"}, 
                                                { "lenovo1", "Lenovo u430" , "699.99"}, 
                                                { "sony1", "Sony vaio" , "899.99"},  
                                                { "samsung4", "Samsung LED" , "299.99"}, 
                                                { "panasonic1", "GALAXY S3" , "329.99"},
                                                { "sony2", "Sony HD LED" , "499.99"}
                                                };

     for(int i = 0 ; i < catalogitems.length ; i++)
         {
            for(int j = 0 ;j < 3 ; j++)
                {
                    if (code.equals(catalogitems[i][0]))
                        {
                            code1 = catalogitems[i][0];
                            description=catalogitems[i][1] ;
                            price=Double.parseDouble(catalogitems[i][2]);
                            p.setCode(code1);
                            p.setDescription(description);
                            p.setPrice(price);
                        }

   
                }
        }

        return p;


    
    }


}