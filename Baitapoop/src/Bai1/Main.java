package Bai1;

import Bai1.students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = input.nextLine();

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student class: ");
        String studentClass = input.nextLine();

        System.out.print("Enter course: ");
        int key = input.nextInt();

        students student = new students( id, name, studentClass, key);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student name: " + student.getName());
        System.out.println("Student class: " + student.getStudentClass());
        System.out.println("course: " + student.getCourse());
    }

}