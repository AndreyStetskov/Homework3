package homework7;

import java.util.Random;
import java.util.Scanner;

public class HW7 {

    public static void main(String[] args) {
//        First level:
//        1.
        Scanner scan7 = new Scanner(System.in);
        System.out.print("Enter the apartment number: ");
        int apartmentNumber = scan7.nextInt();
        if (apartmentNumber > 0 && apartmentNumber <= 20) {
            System.out.println("Your apartment in the first entrance");
        } else if (apartmentNumber > 20 && apartmentNumber <= 48) {
            System.out.println("Your apartment in the second entrance");
        } else if (apartmentNumber > 48 && apartmentNumber <= 90) {
            System.out.println("Your apartment in the third entrance");
        }
        else {
            System.out.println("There is no such apartment in the house");
        }
//        2.
        Random random7 = new Random();
        int seasons = random7.nextInt(4) + 1;
        switch (seasons) {
            case 1:
                System.out.println(seasons + " :Winter");
                break;
            case 2:
                System.out.println(seasons + ": Spring");
                break;
            case 3:
                System.out.println(seasons + ": Summer");
                break;
            case 4:
                System.out.println(seasons + ": Autumn");
        }
//        3.
        int month = random7.nextInt(12) + 1;
        switch (month) {
            case 1:
            case 2:
                System.out.print(month + ": Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print(month + ": Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print(month + ": Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print(month + ": Autumn");
                break;
            case 12:
                System.out.print(month + ": Winter");
        }
//        Second level:
//        1.
        System.out.println("Input your amount from 1 till 9999");
        int number = scan7.nextInt();
        if (number > 9999) {
            System.out.println("It's wrong amount");
        } else {
            System.out.print(number + ": ");
            int thousand = (int) Math.floor(number / 1000);
            switch (thousand) {
                case 1:
                    System.out.print(":One thousand ");
                    break;
                case 2:
                    System.out.print(":Two thousand ");
                    break;
                case 3:
                    System.out.print(":Three thousand ");
                    break;
                case 4:
                    System.out.print(":Four thousand ");
                    break;
                case 5:
                    System.out.print(":Five thousand ");
                    break;
                case 6:
                    System.out.print(":Six thousand ");
                    break;
                case 7:
                    System.out.print(":Seven thousand ");
                    break;
                case 8:
                    System.out.print(":Eight thousand ");
                    break;
                case 9:
                    System.out.print(":Nine thousand ");
                    break;
            }
            int hundred = (int) Math.floor(number / 100) % 10;
            switch (hundred) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }
            int decide = (int) Math.floor(number / 10) % 10;
            switch (decide) {
                case 1:
                    break;
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            int unit = (int) Math.floor(number % 10);
            switch (unit) {
                case 1:
                    if (number == 1) {
                        System.out.println("one dollar");
                    } else if (decide == 1) {
                        System.out.println("eleven dollars");
                    } else {
                        System.out.println("one dollars");
                    }
                    break;
                case 2:
                    if (decide == 1) {
                        System.out.println("twelfe dollars");
                    } else {
                        System.out.print("two dollars");
                    }
                    break;
                case 3:
                    if (decide == 1) {
                        System.out.println("thirteen dollars");
                    } else {
                        System.out.print("three dollars");
                    }
                    break;
                case 4:
                    if (decide == 1) {
                        System.out.println("fourteen dollars");
                    } else {
                        System.out.print("four dollars");
                    }
                    break;
                case 5:
                    if (decide == 1) {
                        System.out.println("fifteen dollars");
                    } else {
                        System.out.print("five dollars");
                    }
                    break;
                case 6:
                    if (decide == 1) {
                        System.out.println("sixteen dollars");
                    } else {
                        System.out.print("six dollars");
                    }
                    break;
                case 7:
                    if (decide == 1) {
                        System.out.println("seventeen dollars");
                    } else {
                        System.out.print("seven dollars");
                    }
                    break;
                case 8:
                    if (decide == 1) {
                        System.out.println("eighteen dollars");
                    } else {
                        System.out.print("eight dollars");
                    }
                    break;
                case 9:
                    if (decide == 1) {
                        System.out.println("nineteen dollars");
                    } else {
                        System.out.print("nine dollars");
                    }
                    break;
            }
        }
    }
}
