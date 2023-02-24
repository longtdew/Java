package enitity;

import java.time.LocalDate;

public class SalesPerson extends  Human {
    private int employeeCode;
    private LocalDate contractSigningDate;

    private static int nextEmployeeCode = 1000;

    public SalesPerson(String fullName, String address, String phoneNumber) {
        super (fullName, address, phoneNumber);
        this.employeeCode = nextEmployeeCode++;
        this.contractSigningDate = LocalDate.now();
    }

    public SalesPerson(String fullName, String address, String phoneNumber, int employeeCode, String contractSigningDate) {
        super(fullName, address, phoneNumber, employeeCode, contractSigningDate);
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public LocalDate getContractSigningDate() {
        return contractSigningDate;
    }

    public void addSale(Item itemToSell, int quantityToSell, double totalSales) {

    }
}
