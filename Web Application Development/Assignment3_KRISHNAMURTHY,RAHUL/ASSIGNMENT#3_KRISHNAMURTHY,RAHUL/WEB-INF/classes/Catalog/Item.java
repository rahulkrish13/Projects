package Catalog;  
  
/** 
 * 
 */  
public class Item {  
    String itemID;  
    String itemName;  
    String itemDescription;  
    String itemCategory;  
    String cost;  
    int active;  
      
    Item(){  
        itemID = "";  
        itemName = "";  
        itemDescription = "";  
        itemCategory = "";  
        cost = "";  
        active = 0;  
    }  
      
      
    public String getItemID() {  
        return itemID;  
    }  
  
    public void setItemID(String itemID) {  
        this.itemID = itemID;  
    }  
  
    public String getItemName() {  
        return itemName;  
    }  
  
    public void setItemName(String itemName) {  
        this.itemName = itemName;  
    }  
  
    public String getItemDescription() {  
        return itemDescription;  
    }  
  
    public void setItemDescription(String itemDescription) {  
        this.itemDescription = itemDescription;  
    }  
  
    public String getItemCategory() {  
        return itemCategory;  
    }  
  
    public void setItemCategory(String itemCategory) {  
        this.itemCategory = itemCategory;  
    }  
  
    public String getCost() {  
        return cost;  
    }  
  
    public void setCost(String cost) {  
        this.cost = cost;  
    }  
  
    public int getActive() {  
        return active;  
    }  
  
    public void setActive(int active) {  
        this.active = active;  
    }  
  
}  