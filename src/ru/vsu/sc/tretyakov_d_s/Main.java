package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print("Введите значение гипотинузы  прямоугольного треугольника : С = ");
        double C = readNumber();
        double c = square(C);
        System.out.print("Введите значение радиуса вписанной окружности: R = ");
        double R = readNumber();
        double a = 2*(R*R)-(c+C)/2;
        double A = Math.sqrt(a);
        double b = c-A;
        double B = Math.sqrt(b);
            if (c == A + B) {
                    System.out.println("Окружность со стороной R можно вписать в прямоугольный треугольник с гипотинузой С");
                    System.out.println("Такой прямоугольный треугольник существует");
            }
            else {
                System.out.println("Окружность со стороной R нельзя вписать в прямоугольный треугольник с гипотинузой С");
                System.out.println("Такой прямоугольный треугольник не существует");
            }

    }

    public static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static double square(double a) {
        double result = a * a;
        return result;
    }
}