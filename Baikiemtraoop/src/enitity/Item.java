package enitity;

import enitity.ProductGroup;

public class Item {
    private int itemCode;
    private String itemName;
    private ProductGroup productGroup;
    private double sellingPrice;
    private int quantity;
    private int code;

    public Item(int itemCode, String itemName, ProductGroup productGroup, double sellingPrice, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.productGroup = productGroup;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(ProductGroup productGroup) {
        this.productGroup = productGroup;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return itemName + " (Item Code: " + itemCode + ", Product Group: " + productGroup + ", Selling Price: " + sellingPrice + ", Quantity: " + quantity + ")";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double sell(int quantityToSell) {
        return 0;
    }
}
