package Homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("First level:");
        System.out.print("3. ");
        Scanner scan = new Scanner(System.in);
        System.out.println("value of variable: ");
        int n = scan.nextInt();
        int square = n * n;
        System.out.println("Square: " + square);

        System.out.print("4. ");
        int priceOfA = 1000;
        int priceOFB = 500;
        int discount = 100;
        int buying = priceOfA + priceOFB - discount;
        System.out.println("Purchase price: " + buying);
        System.out.println("Discount: " + discount);

        System.out.print("5. ");
        System.out.print("first: ");
        int a1 = scan.nextInt();
        System.out.println("second ");
        int a2 = scan.nextInt();
        int add = a1 + a2;
        int minus = a1 - a2;
        System.out.println("Addition: " + add);
        System.out.println("Diminution " + minus);
        System.out.println("------------------------------------------");
        System.out.println("Second level:");
        System.out.print("1. ");
        byte r1 = 14;
        byte r2 = 12;
        double s1 = Math.PI * r1 * r1;
        double s2 = Math.PI * r2 * r2;
        double kal1 = r1 * 40;
        double kal2 = r2 * 40;
        double d = kal1 - kal2;
        System.out.println("Calories received from first pizza: " + kal1);
        System.out.println("Calories received from second pizza: " + kal2);
        System.out.println("Calorie diffrence: " + d);

        System.out.print("2. ");
        System.out.println("Input the first side of rectangle: ");
        double a = scan.nextDouble();
        System.out.println("Input the second side of rectangle: ");
        double b = scan.nextDouble();
        double perimeterRectangle = a + a + b + b;
        double squareRectangle = a * b;
        System.out.println("Perimeter of rectangle with sides " + a + " and " + b + " equal: " + perimeterRectangle);
        System.out.println("Square of rectangle with sides " + a + " and " + b + " equal: " + squareRectangle);

        System.out.print("3. ");
        System.out.println("Input the storage size in square meters: ");
        double sizeStorage = scan.nextDouble();
        System.out.println("Input the wight of product in meters: ");
        double weightProduct = scan.nextDouble();
        System.out.println("Input the length of product in meters: ");
        double lengthProduct = scan.nextDouble();
        double sizeProduct = weightProduct * lengthProduct;
        double amountProduct = sizeStorage / sizeProduct;
        System.out.println("Amount of product in the storage " + Math.floor(amountProduct));

    }
}