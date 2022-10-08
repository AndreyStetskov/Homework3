package homework5;

import java.util.Scanner;

public class HW5 {
    static boolean devideFor4And6 (int number){
        boolean devideFor4 = number % 4 == 0;
        boolean devideFor6 = number % 6 == 0;
        return devideFor4 && devideFor6;
    }
    static boolean temperature (int firstFlask, int secondFlask){
        boolean temperature1 = firstFlask > 100;
        boolean temperature2 = secondFlask < 100;
        return temperature2 && temperature1;
    }
    static boolean divisionOfIntegers (int firstInteger, int secondInteger){
        boolean integerDivision = firstInteger % secondInteger == 0;
        return integerDivision;
    }
    public static void main(String[] args) {
        System.out.println("First level:");
        System.out.print("1. ");
        boolean isSunny = true;
        boolean isWindy = false;
        boolean canSwim = isSunny && !isWindy;
        System.out.println(canSwim);

        System.out.print("2. ");
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isReweOpen || isEdekaOpen;
        System.out.println("I can buy food, this is: " + canBuy);

        System.out.print("3. ");
        Scanner scan5 = new Scanner(System.in);
        System.out.print("Write your number: ");
        int number = scan5.nextInt();
        System.out.println(devideFor4And6(number));

        System.out.print("4. ");
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Write your string: ");
        String phrase = scan2.nextLine();
        int length = phrase.length();
        boolean isLonger7 = length < 7;
        System.out.println(isLonger7);

        System.out.println("------------------------------------------");
        System.out.println("Second level:");
        System.out.print("1. ");
        System.out.println(temperature(101, 55));

        System.out.print("2. ");
        System.out.println("Enter your first integer: ");
        int integer1 = scan5.nextInt();
        System.out.println("Enter your second integer: ");
        int integer2 = scan5.nextInt();
        System.out.println(divisionOfIntegers(integer1, integer2));
    }
}
