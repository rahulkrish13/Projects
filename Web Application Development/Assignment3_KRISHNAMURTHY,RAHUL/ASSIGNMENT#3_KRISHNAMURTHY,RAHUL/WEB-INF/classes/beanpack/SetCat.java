package beanpack;

public class SetCat {
public void setItems(String[] itemIDs) {


			String title;
            MainCatalogItem[] items;
            MainCatalogItem item;
             items = new MainCatalogItem[itemIDs.length];
             for(int i=0; i<items.length; i++) {
             items[i] = MainCatalog.getItem(itemIDs[i]);
               }
              }

            
    }