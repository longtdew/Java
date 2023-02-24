import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enitity.Item;
import enitity.ProductGroup;
import enitity.SalesPerson;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();
        ArrayList<SalesPerson> salespersonList = new ArrayList<>();

        while (true) {
            System.out.println("Enter option:");
            System.out.println("1. Add new item");
            System.out.println("2. Add new salesperson");
            System.out.println("3. View item details");
            System.out.println("4. View salesperson details");
            System.out.println("5. Make a list of sales for each salesperson");
            System.out.println("6. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Item code: ");
                    int itemCode = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    System.out.print("Item name: ");
                    String itemName = scanner.nextLine();

                    System.out.print("Product group code (1: Electronics, 2: Refrigeration, 3: Computer, 4: Office Equipment): ");
                    int productGroupCode = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    ProductGroup productGroup;
                    switch (productGroupCode) {
                        case 1:
                            productGroup = ProductGroup.ELECTRONICS;
                            break;
                        case 2:
                            productGroup = ProductGroup.REFRIGERATION;
                            break;
                        case 3:
                            productGroup = ProductGroup.COMPUTER;
                            break;
                        case 4:
                            productGroup = ProductGroup.OFFICE_EQUIPMENT;
                            break;
                        default:
                            System.out.println("Invalid product group code. Item not added.");
                            continue;
                    }

                    System.out.print("Selling price: ");
                    double sellingPrice = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    Item newItem = new Item(itemCode, itemName, productGroup, sellingPrice, quantity);
                    itemList.add(newItem);
                    break;

                case 2:
                    System.out.println("Enter salespersons (press 0 to stop):");
                    while (true) {
                        System.out.print("1.Full name: ");
                        String fullName = scanner.nextLine();
                        if (fullName.equals("0")) {
                            break;
                        }

                        System.out.print("2.Address: ");
                        String address = scanner.nextLine();

                        System.out.print("3.Phone number: ");
                        String phoneNumber = scanner.nextLine();

                        System.out.print("4.Employee code: ");
                        int employeeCode = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("5.Contract signing date: ");
                        String contractSigningDate = scanner.nextLine();

                        SalesPerson newSalesperson = new SalesPerson(fullName, address, phoneNumber, employeeCode, contractSigningDate);
                        salespersonList.add(newSalesperson);
                    }
                    break;

                case 3:
                    System.out.println("Enter item code:");
                    itemCode = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    Item foundItem = null;
                    for (Item item : itemList) {
                        if (item.getCode() == itemCode) {
                            foundItem = item;
                            break;
                        }
                    }

                    if (foundItem != null) {
                        System.out.println("Item details:");
                        System.out.println(foundItem);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 5:
                System.out.println("Enter salesperson code:");
                int salespersonCode = scanner.nextInt();
                scanner.nextLine();

                SalesPerson foundSalesperson = null;
                for (SalesPerson salesperson : salespersonList) {
                    if (salesperson.getEmployeeCode() == salespersonCode) {
                        foundSalesperson = salesperson;
                        break;
                    }
                }

                if (foundSalesperson != null) {
                    System.out.println("Salesperson details:");
                    System.out.println(foundSalesperson);
                } else {
                    System.out.println("Salesperson not found.");
                }
                break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}