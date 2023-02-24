package enitity;


import java.util.ArrayList;
import java.util.List;


public class SalesList {
    private SalesPerson SalesPerson;
    private List<Item> itemsSold;

    public SalesList(SalesPerson salesperson) {
        this.SalesPerson = salesperson;
        this.itemsSold = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (itemsSold.size() >= 5) {
            throw new IllegalStateException("Cannot sell more than 5 items per salesperson in a day.");
        }
        itemsSold.add(item);
    }

    public double getTotalSalesAmount() {
        double total = 0;
        for (Item item : itemsSold) {
            total += item.getSellingPrice();
        }
        return total;
    }

    public SalesPerson getSalesPerson() {
        return SalesPerson;
    }

    public List<Item> getItemsSold() {
        return itemsSold;
    }
}
