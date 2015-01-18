package beans4;

import java.util.*;
import java.io.*;


public class ItemData{

	private HashMap items;


	public HashMap getitems(){
		return items;
	}

	public ItemData(){
		items = new HashMap();
		items.put("moto1",new MainCatalogItem("moto1","DROID MAXX ","Black 32GB 4G LTE by MOTOROLA Android 4.2.2(Jelly Bean) operating system",249.99));
		items.put("moto2",new MainCatalogItem("moto2","MOTO X ","Black 32GB 4G LTE by MOTOROLA Android 4.2.2 (Jelly Bean) operating system ",229.99));
		items.put("apple1",new MainCatalogItem("apple1","I Phone 5s","Black 32GB 4G LTE by Apple Inc. iOS 7, upgradable to iOS 7.0.3",499.99));
		items.put("apple2",new MainCatalogItem("apple2","I Phone 5c","Multiple colours 16GB 4G LTE by Apple Inc. iOS 7, upgradable to iOS 7.0.3",429.99));
		items.put("samsung1",new MainCatalogItem("samsung1","Galaxy S3","Black 16GB 3G by SAMSUNG Android OS, v4.3 (Jelly Bean)",329.99));
		items.put("samsung2",new MainCatalogItem("samsung2","Galaxy S4","Black 32GB 4G LTE by SAMSUNG Android OS, v4.3 (Jelly Bean)",499.99));
		items.put("amazon1",new MainCatalogItem("amazon1","KINDLE","Black 64GB by AMAZON Android Customized for Amazon",479.99));
		items.put("google1",new MainCatalogItem("google1","NEXUS","Black 16GB by GOOGLE Android 4.3 Jelly Bean",199.99));
		items.put("microsoft1",new MainCatalogItem("microsoft1","SURFACE 2","Black 32GB by MICROSOFT Windows RT 8.1 operating system", 499.99));
		items.put("apple3",new MainCatalogItem("apple3","i-Pad 2","white 16GB by Apple inc. Apple iOS 7",399.99));			
		items.put("samsung3",new MainCatalogItem("samsung3","Galaxy TAB","white 16GB by SAMSUNG Android 4.4 KitKat",319.99));
		items.put("apple4",new MainCatalogItem("apple4","MacBook Pro","by Apple inc. Retina display 13.3-inch Display",1099.99));
		items.put("asus1",new MainCatalogItem("asus1","Asus X551","by ASUS Windows 8.1 64-bit 15.6-inch display ",399.99));
		items.put("lenovo1",new MainCatalogItem("lenovo1","Lenovo U430","by LENOVO Windows 8.1 64-bit 14-inch display",699.99));
		items.put("sony1",new MainCatalogItem("sony1","VAIO Flip","by SONY Windows 8.1 64-bit 14-inch display",899.99));
		items.put("samsung4",new MainCatalogItem("samsung4","UN32EH","by SAMSUNG LED 32-inch display HDTV",299.99));
		items.put("panasonic1",new MainCatalogItem("panasonic1","TC-40","by PANASONIC LED 40-inch display", 299.99));
		items.put("sony2",new MainCatalogItem("sony2","KDL-40","by SONY LED 40-inch display 1080p HDTV",449.99));
	}
}