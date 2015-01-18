

public class MainCatalog {
  // This would come from a database in real life.
  // We use a static table for ease of testing and deployment.
  // See JDBC chapters for info on using databases in
  // servlets and JSP pages.
  private static MainCatalogItem[] items =
    { new MainCatalogItem
        ("moto1",
         "<I>DROID MAXX</I> " ,
         "Black 32GB 4G LTE \n" +
           "by MOTOROLA\n" +
           "<UL><LI>Android 4.2.2 (Jelly Bean) operating system " +
           "<LI>Qualcomm Snapdragon S4 Pro " +
           "<LI>10-megapixel rear camera " +
           "<LI>5-inch touchscreen AMOLED display \n" +
           "</UL>",
         249.99),

new MainCatalogItem
        ("moto2",
         "<I>MOTO X</I> " ,
         "Black 32GB 4G LTE \n" +
           "by MOTOROLA\n" +
           "<UL><LI>Android 4.2.2 (Jelly Bean) operating system " +
           "<LI>1.7 GHz dual-core processor + 400 MHz quad-core graphics processor" +
           "<LI>10-megapixel rear camera (Full HD)" +
           "<LI>4.7-inch touchscreen AMOLED display (720 x 1280) \n" +
           "</UL>",
         229.99),
new MainCatalogItem
        ("apple1",
         "<I>I Phone 5s</I> " ,
         "Black 32GB 4G LTE \n" +
           "by Apple Inc.\n" +
           "<UL><LI>iOS 7, upgradable to iOS 7.0.3, operating system " +
           "<LI>Dual-core 1.3 GHz Swift (ARM v8-based)" +
           "<LI>8-megapixel rear camera (Full HD)" +
           "<LI>LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
           "</UL>",
         499.99),
new MainCatalogItem
        ("apple2",
         "<I>I Phone 5c</I> " ,
         "Multiple colours 16GB 4G LTE \n" +
           "by Apple Inc.\n" +
           "<UL><LI>iOS 7, upgradable to iOS 7.0.3, operating system " +
           "<LI>Dual-core 1.3 GHz Swift (ARM v8-based)" +
           "<LI>8-megapixel rear camera (Full HD)" +
           "<LI>LED-backlit IPS LCD, capacitive touchscreen, 16M colors\n" +
           "</UL>",
         429.99),
new MainCatalogItem
        ("samsung1",
         "<I>Galaxy S3</I> " ,
         "Black 16GB 3G  \n" +
           "by SAMSUNG\n" +
           "<UL><LI>Android OS, v4.3 (Jelly Bean) operating system " +
           "<LI>Quad-core 1.2 GHz" +
           "<LI>8 MP, 3264 x 2448 pixels, autofocus, LED flash" +
           "<LI>Super AMOLED capacitive touchscreen, 16M colors\n" +
           "</UL>",
         329.99),
new MainCatalogItem
        ("samsung2",
         "<I>Galaxy S4</I> " ,
         "Black 32GB 4G LTE  \n" +
           "by SAMSUNG\n" +
           "<UL><LI>Android OS, v4.3 (Jelly Bean) operating system " +
           "<LI>Quad-core 1.6 GHz" +
           "<LI>13 MP, 3264 x 2448 pixels, autofocus, LED flash" +
           "<LI>Super AMOLED capacitive touchscreen, 16M colors\n" +
           "</UL>",
         499.99),
new MainCatalogItem
        ("amazon1",
         "<I>KINDLE</I> " ,
         "Black 64GB  \n" +
           "by AMAZON\n" +
           "<UL><LI>Android Customized for Amazon " +
           "<LI>Quad-core Processor" +
           "<LI>Wi-Fi" +
           "<LI> 8.9 touch-screen display\n" +
           "</UL>",
         479.99),
new MainCatalogItem
        ("google1",
         "<I>NEXUS</I> " ,
         "Black 16GB  \n" +
           "by GOOGLE\n" +
           "<UL><LI>Android 4.3 Jelly Bean operating system" +
           "<LI>Quad-core Processor" +
           "<LI>Wi-Fi" +
           "<LI> 7-inch touch screen with 1920 x 1200 resolution\n" +
           "</UL>",
         199.99),
new MainCatalogItem
        ("microsoft1",
         "<I>SURFACE 2</I> " ,
         "Black 32GB  \n" +
           "by MICROSOFT\n" +
           "<UL><LI>Windows RT 8.1 operating system" +
           "<LI>Quad-core Processor" +
           "<LI>Wi-Fi" +
           "<LI> 10.6-inch high-definition multitouch display\n" +
           "</UL>",
         499.99),
new MainCatalogItem
        ("apple3",
         "<I>i-Pad 2</I> " ,
         "white 16GB  \n" +
           "by Apple inc.\n" +
           "<UL><LI>Apple iOS 7" +
           "<LI>Quad-core Processor" +
           "<LI>Wi-Fi" +
           "<LI>9.7-inch Retina display with 2048 x 1536 resolution\n" +
           "</UL>",
         399.99),
new MainCatalogItem
        ("samsung3",
         "<I>Galaxy TAB</I> " ,
         "white 16GB  \n" +
           "by SAMSUNG\n" +
           "<UL><LI>Android 4.4 KitKat operating system" +
           "<LI>Quad-core Processor" +
           "<LI>Wi-Fi" +
           "<LI>10.1-inch touch screen with 1280 x 800 resolution\n" +
           "</UL>",
         319.99),
new MainCatalogItem
        ("apple4",
         "<I>MacBook Pro</I> " ,
           "by Apple inc.\n" +
           "<UL><LI>Retina display " +
           "<LI>13.3-inch Display " +
           "<LI> 8GB Memory" +
           "<LI>128GB Flash Storage\n" +
           "</UL>",
         1099.99),
new MainCatalogItem
        ("asus1",
         "<I>Asus X551</I> " ,
           "by ASUS\n" +
           "<UL><LI>Windows 8.1 64-bit" +
           "<LI>15.6-inch display " +
           "<LI> 500GB hard drive" +
           "<LI>intel i3 processor;4GB memory\n" +
           "</UL>",
         399.99),
new MainCatalogItem
        ("lenovo1",
         "<I>Lenovo U430</I> " ,
           "by LENOVO\n" +
           "<UL><LI>Windows 8.1 64-bit" +
           "<LI>14-inch display " +
           "<LI> 500GB hard drive" +
           "<LI>intel i5 processor;8GB memory\n" +
           "</UL>",
         699.99),
new MainCatalogItem
        ("sony1",
         "<I>VAIO Flip</I> " ,
           "by SONY\n" +
           "<UL><LI>Windows 8.1 64-bit" +
           "<LI>14-inch display " +
           "<LI> 500GB hard drive" +
           "<LI>intel i5 processor;8GB memory\n" +
           "</UL>",
         899.99),
new MainCatalogItem
        ("samsung4",
         "<I>UN32EH</I> " ,
           "by SAMSUNG\n" +
           "<UL><LI>LED" +
           "<LI>32-inch display " +
           "<LI> HDTV" +
           "<LI>60HZ\n" +
           "</UL>",
         299.99),
new MainCatalogItem
        ("panasonic1",
         "<I>TC-40</I> " ,
           "by PANASONIC\n" +
           "<UL><LI>LED" +
           "<LI>40-inch display " +
           "<LI> HDTV" +
           "<LI>60HZ" +
           "</UL>",
         299.99),
new MainCatalogItem
        ("sony2",
         "<I>KDL-40</I> " ,
           "by SONY\n" +
           "<UL><LI>LED" +
           "<LI>40-inch display " +
           "<LI> 1080p HDTV" +
           "<LI>60HZ" +
           "</UL>",
         449.99)
        };

  public static MainCatalogItem getItem(String itemID) {
    MainCatalogItem item;
    if (itemID == null) {
      return(null);
    }
    for(int i=0; i<items.length; i++) {
      item = items[i];
      if (itemID.equals(item.getItemID())) {
        return(item);
      }
    }
    return(null);
  }
}
               


