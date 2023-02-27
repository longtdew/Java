package enitity;

public enum ProductGroup {
    ELECTRONICS, REFRIGERATION, COMPUTER, OFFICE_EQUIPMENT;

    public class Item {
        private int itemCode;
        private String itemName;
        private ProductGroup productGroup;
        private double sellingPrice;
        private int quantity;

        private static int nextItemCode = 1000;

        public Item(String itemName, ProductGroup productGroup, double sellingPrice, int quantity) {
            this.itemCode = nextItemCode++;
            this.itemName = itemName;
            this.productGroup = productGroup;
            this.sellingPrice = sellingPrice;
            this.quantity = quantity;
        }

        public int getItemCode() {
            return itemCode;
        }

        public String getItemName() {
            return itemName;
        }

        public ProductGroup getProductGroup() {
            return productGroup;
        }

        public double getSellingPrice() {
            return sellingPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}

