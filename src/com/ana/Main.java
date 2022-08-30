package com.ana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter student's name: ");
        student.name = scanner.next();

        System.out.println("Enter student's grades: ");
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        if (student.finalGrade() >= 60){
            System.out.println("PASS!");
        }else{
            System.out.println("FAILED. MISSING "+(60-student.finalGrade())+" POINTS");
        }
    }
}
