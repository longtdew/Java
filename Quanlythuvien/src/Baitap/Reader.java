package Baitap;

import constant.Readertype;

import java.util.Scanner;

public class Reader extends Person {
    private int readerid;
    private Readertype readertype;
    private static int Auto_ID = 10000;

    public int getReaderid() {
        return readerid;
    }

    public void setReaderid(int readerid) {
        this.readerid = readerid;
    }

    public Readertype getReadertype() {
        return readertype;
    }

    public void setReadertype(Readertype readertype) {
        this.readertype = readertype;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        this.readerid = Auto_ID;
        Auto_ID++;
        System.out.println("Nhap loai ban doc: ");
        System.out.println("1. Sinh vien");
        System.out.println("2. Hoc vien cao hoc");
        System.out.println("3. Giang vien");
        System.out.println("Chon di");
        int temp = new Scanner(System.in).nextInt();
        do {
            temp = new Scanner(System.in).nextInt();
            if (temp>=1 && temp<=3){
                break;
            }
            System.out.print("Gia tri khong hop le vui long chon lai: ");
        } while (true);
        switch (temp) {
            case 1:
                this.readertype = readertype.Student;
                break;
            case 2:
                this.readertype = readertype.Post_Student;
                break;
            case 3:
                this.readertype = readertype.Teacher;
                break;
        }
    }
}
