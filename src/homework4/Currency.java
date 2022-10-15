package Homework4;

import java.util.Scanner;

public class Currency {
    double dollar (double euro) {
        return euro * 0.98;
    }
    double euro (double dollar) {
        return dollar * 1.02;
    }

    public static void main(String[] args) {
        Currency convercation = new Currency();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Input the amount in dollars: ");
        double d = scan2.nextDouble();
        System.out.print("Input the amount in euro: ");
        double e = scan2.nextDouble();
        System.out.println(convercation.euro(d));
        System.out.println(convercation.euro(e));
    }
}
