import Baitap.Reader;

import java.util.Scanner;

public class Main {
    public static Reader[] reader;
    private static int chooseFunction;

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        while (true) {
            showMenuContent();
            logicHandle();
        }
    }

    private static void logicHandle() {
        int luaChon = chooseFuntion();
        switch (luaChon) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.exit(0);
        }
    }
    private static int chooseFuntion() {
        System.out.print("Moi chon chuc nang ! ");
        int luaChon;
        do {
            luaChon = new Scanner(System.in).nextInt();
            if (luaChon >= 1 && luaChon <= 8) {
                break;
            }
            System.out.println("Gia tri khong hop le ! ");
        } while (true);
        return luaChon;
    }

    private static void showReader() {
        if (reader == null && reader.length == 0) {
            System.out.println("Chua co nguoi nao");
            return;
        }
        for (int i = 0; i < reader.length; i++) {
            System.out.println(reader[i]);

        }

    }

    private static void inputReader() {
        System.out.println("Moi nhap so luong ban doc: ");
        int n = new Scanner(System.in).nextInt();
        reader = new Reader[n];
        for (int i = 0; i < reader.length; i++) {
            reader[i] = new Reader();
            reader[i].inputInfo();

        }
    }


    private static void showMenuContent() {
        System.out.println("======= Phan mem quan ly sach thu vien =====");
        System.out.println("1.Nhap danh sach ban doc moi");
        System.out.println("2.In ra danh sach ban doc");
        System.out.println("3.Nhap danh sach cuon sach moi");
        System.out.println("4.In danh sach cuon sach moi");
        System.out.println("5.Cho muon sach:");
        System.out.println("6.Sap xep danh sach muon sach:");
        System.out.println("7.Tim kiem danh sach muon sach:");
        System.out.println("8.Thoat");
        System.out.println("=========================");
    }
    }
