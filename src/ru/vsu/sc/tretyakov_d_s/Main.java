package ru.vsu.sc.tretyakov_d_s;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double A = readNumber("A");
        double B = readNumber("B");
        double C = readNumber("C");
        double R = readNumber("R");

        checkingExistenceTriangle(A, B, C);

        double P = findHalfPerimeter(A, B, C);

        double R1 = findRadius(A,B,C,P);

        printResult(R1,R);
    }


    private static double readNumber(String sideType) {
        System.out.printf("Enter the value of the side %s of the triangle - ", sideType);

        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if (value <= 0) {
            System.out.println("Side can be only more than 0");
            System.exit(1);
        }

        return value;
    }

    private static double findHalfPerimeter(double A, double B, double C) {
        return ((A + B + C) / 2);
    }

    private static void checkingExistenceTriangle(double A, double B, double C) {
        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("The triangle exists");
        }
        else {
            System.out.println("The triangle does not exist");
            System.out.println("Try to enter new values");
            System.exit(1);
        }
    }

    private static double findRadius(double A, double B, double C, double P) {
        return (sqrt(((P-A)*(P-B)*(P-C))/P));
    }

    public static void printResult(double R1, double R) {
        if (R1 == R)
        System.out.print("A circle with radius R "
            + "can be inscribed in a triangle with sides A, B, C");
        else
            System.out.print("A circle with radius R "
                + "cannot be inscribed in a triangle with sides A, B, C");
    }

}

