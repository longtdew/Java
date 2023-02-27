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
