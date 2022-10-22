package homework8;

import java.util.Random;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
//        First level:
//        1.
        Scanner scan8 = new Scanner(System.in);
        System.out.println("Enter the first year");
        int year1 = scan8.nextInt();
        System.out.println("Enter the second year");
        int year2 = scan8.nextInt();
        if (year2 < year1) {
            System.out.println("The second year can't be less than the first year");
        }
        int year = 1;
        int sumOfLeapYears = 0;
        for (int i = year1; i <= year2; i++) {
            if (i % 4 == 0) {
                sumOfLeapYears = sumOfLeapYears + 1;
            }
        }
        System.out.println(sumOfLeapYears);

//        2.
        Random random8 = new Random();
        int number = random8.nextInt(10) + 1;
        int primeNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                primeNumber = primeNumber + 1;
            }
        }
        if (primeNumber > 2) {
            System.out.println(primeNumber + ": It isn't a prime number");
        } else {
            System.out.println(primeNumber + ": It's a prime number");
        }
//        3.
        int numberOfTask3 = random8.nextInt(100);
        System.out.print(numberOfTask3 + ": ");
        if (numberOfTask3 < 16) {
            System.out.println("There's no such numbers");
        }
        for (int i = 1; i <= numberOfTask3; i++) {
            if (Math.floor(i / 10) > 0 && i % 4 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
//        4.
        int sumFrom1Till100 = 0;
        for (int i = 0; i <= 100; i++) {
            sumFrom1Till100 = sumFrom1Till100 + i;
        }
        System.out.println(sumFrom1Till100);
//        5.
        int numberOfTask5 = 1;
        for (int i = 10; i <= 40; i++) {
            numberOfTask5 = i * -1;
            System.out.println(numberOfTask5);
        }
//        6.
        int multiplication = 1;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 13 == 0) {
                multiplication = multiplication * i;
            }
        }
        System.out.println(multiplication);
//        _______________________________________________________________
//        Second level
//        1.

//        2.
        int oddNumbers = 0;
        int middle = 0;
        for (int i = 0; i <= 100; i++) {
            middle = middle + 1;
            if (i % 2 != 0) {
                oddNumbers = oddNumbers + i;
            }
        }
        System.out.println(oddNumbers / middle);
//        3.
        int factorial = 1;
        int n = random8.nextInt(10) + 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(n + ": " + factorial);
//        4.
        String value = "476";
        int sumNumbers = 0;
        for (int i = 1; i <= value.length(); i++) {
            int a = value.charAt(i);
            int s = Integer.parseInt(String.valueOf(a));
            sumNumbers = sumNumbers + s;
        }
        System.out.println(sumNumbers);
//        5.
        String val = "476789";
        int sumNumber1 = 0;
        int sumNumber2 = 0;
        for (int i = 1; i <= value.length() / 2; i++) {
            int a = value.charAt(i);
            int s = Integer.parseInt(String.valueOf(a));
            sumNumber1 = sumNumber1 + s;
        }
        for (int i = val.length() / 2; i <= val.length(); i++) {
            int a = value.charAt(i);
            int s = Integer.parseInt(String.valueOf(a));
            sumNumber2 = sumNumber2 + s;
        }
        if (sumNumber1 == sumNumber2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
