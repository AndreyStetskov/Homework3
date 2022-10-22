package homework6;

import java.util.Random;
import java.util.Scanner;

public class HW6 {

        public static void main(String[] args) {
        System.out.println("First level:");
        System.out.print("1. ");
        Scanner scan6 = new Scanner(System.in);
        System.out.print("Enter the age: ");
        byte age = scan6.nextByte();
        if (age >= 18) {
            System.out.println("You can go to watch movie");
        } else {
            System.out.println("You mustn't go to watch movie");
        }

        System.out.print("2. ");
        System.out.print("Enter some year: ");
        int year = scan6.nextInt();
        if (year % 4 == 0 && year != 100 || year % 400 ==0) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year isn't leap year");
        }

        System.out.print("3. ");
        System.out.println("How much money do you have? ");
        double money = scan6.nextDouble();
        System.out.println("How many a cookies do you want to buy? ");
        double cookie = scan6.nextDouble();
        double cookies = money / cookie * 2;
        if (cookies >= 1 && cookies < 2) {
            System.out.println("You can buy one cookie");
        }
        else
            if (cookies >= 2) {
            System.out.println("You can buy " + Math.floor(cookies) + " cookies");
        }
        else {
            System.out.println("You can't buy cookie");
        }
        System.out.print("4. ");
        Random random6 = new Random();
        if (random6.nextBoolean()) {
                System.out.println("Heads");
            }
        else {
                System.out.println("Tails");
            }

        System.out.println("5. ");
        int numberOfCar = random6.nextInt(10001);
        boolean isLorry = random6.nextBoolean();
        if (numberOfCar % 2 == 0 && isLorry == false) {
            System.out.println("Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
            System.out.println("You can move in");
        }
        else {
            System.out.println("Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
            System.out.println("You mustn't move in");
        }


            System.out.println("------------------------------------------");
            System.out.println("Second level:");
            System.out.println("1. ");
            System.out.println("Input first number:");
            double numberOne = scan6.nextDouble();
            System.out.println("Input first number:");
            double numberTwo = scan6.nextDouble();
            System.out.println("Input first number:");
            double numberThree = scan6.nextDouble();
            if (numberOne > numberTwo && numberOne > numberThree){
                System.out.println("The largest number is " + numberOne);
            }
            else if (numberTwo > numberThree) {
                System.out.println("The largest number is " + numberTwo);
            }
            else {
                System.out.println("The largest number is " + numberThree);
            }

            System.out.println("2. ");
            int second = random6.nextInt(28001);
            byte hours = (byte) (second / 3600);
            System.out.println(second);
            if (hours >=0 && hours < 1) {
                System.out.println("Less than an hour left");
            }
            else if (hours >=1 && hours < 2) {
                System.out.println("One hour left");
            }
            else {
                System.out.println(Math.floor(hours) + " hours left");
            }

            System.out.println("3. ");
            boolean isWeekend =random6.nextBoolean();
            if (numberOfCar % 2 == 0 && isLorry == false && isWeekend == true) {
                System.out.println("Today is weekend? " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You can move in");
            }
            else if (isWeekend == false) {
                System.out.println("Today is weekend: " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You can move in");
            }
            else {
                System.out.println("Today is weekend: " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You mustn't move in");
            }

            System.out.println("4. ");
            if (numberOfCar % 2 == 0 && isLorry == false && isWeekend == true) {
                System.out.println("Today is weekend? " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You can move in");
            }
            else if (isWeekend == false) {
                System.out.println("Today is weekend: " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You can move in");
            }
            else if (isWeekend == true && isLorry == true) {
                System.out.println("Today is weekend: " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You mustn't move in (you can't drive a lorry on a weekend)");
            }
            else {
                System.out.println("Today is weekend: " + isWeekend + " Your number of car: " + numberOfCar + " and it's a lorry: " + isLorry);
                System.out.println("You mustn't move in (you can't drive a car with an odd numbers on a weekend)");
            }
    }
}
