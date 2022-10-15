package Homework4;

public class Calculator {
    double add (double first, double second) {
        return first + second;
    }
    double minus (double first, double second) {
        return first - second;
       }
    double multiplication (double first, double second) {
        return first * second;
    }
    double divide (double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5.3, 8));
        System.out.println(calculator.minus(23.3, 8.366));
        System.out.println(calculator.multiplication(1025, 9.25));
        System.out.println(calculator.divide(567, 1.23));
    }
}
