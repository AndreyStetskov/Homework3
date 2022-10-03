package Homework4;

import java.util.Scanner;

public class Convertation {

    double celsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
    double fahrenheit(double celsius) {
        return celsius * 1.8 - 32;
    }

    public static void main(String[] args) {
        Convertation convertation = new Convertation();
        System.out.println(convertation.celsius(5));
        System.out.println(convertation.fahrenheit(37.7));

    }
}
