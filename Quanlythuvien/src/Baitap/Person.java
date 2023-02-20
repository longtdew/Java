package Baitap;

import java.util.Scanner;

public class Person {

    protected String Fullname;
    protected String Address;
    protected String Phone;


    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Fullname='" + Fullname + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
    public void inputInfo() {
        System.out.println("Nhap ho ten: ");
        this.Fullname = new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi: ");
        this.Address = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.Phone = new Scanner(System.in).nextLine();

    }
}
