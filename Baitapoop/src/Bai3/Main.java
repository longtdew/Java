package Bai3;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap chieu rong:");
        String chieurong = new Scanner(System.in).nextLine();


        System.out.print("Nhap chieu cao:");
        String chieucao = new Scanner(System.in).nextLine();


        System.out.print("Nhap mau cho hinh:");
        String mau = new Scanner(System.in).nextLine();


        Hinhchunhat hinhchunhat = new Hinhchunhat(chieurong, chieucao, mau);


        System.out.println("Hinh chu nhat cua ban la: "+ hinhchunhat);
        System.out.println("Dien tich hinh chu nhat la: : "+ hinhchunhat.dientich());
        System.out.println("Chu vi hinh chu nhat la: "+ hinhchunhat.chuvi());

    }
}