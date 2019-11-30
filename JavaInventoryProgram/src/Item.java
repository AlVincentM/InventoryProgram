public class Item {
  
  private String itemName;
  private double  itemPrice;
  private int itemCode;
  private int itemStock;

  Item() {
    
  }

  Item(int itemCode, String itemName, double itemPrice) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public void setItemCode(int itemCode) {
      this.itemCode = itemCode;
  }
  
  public int getItemCode() {
    return itemCode;
  }

  public int getItemStock() {
    return itemStock;
  }

  public void setItemStock(int itemStock) {
    this.itemStock = itemStock;
  }
}
