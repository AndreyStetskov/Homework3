package homework9;

import java.util.Random;
import java.util.Scanner;

public class HW9 {

    public static void main(String[] args) {

//        First level:
//        1.
        int sequence = 7;
        while (sequence <= 100) {
            System.out.print(sequence + " ");
            sequence += 7;
        }
//        2.
        System.out.println("");
        Scanner scan9 = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int integer1 = scan9.nextInt();
        System.out.println("Enter the second integer");
        int integer2 = scan9.nextInt();
        if (integer2 < integer1) {
            System.out.println("The second integer can't be less than the first integer");
        } else {
            int sumOfOddNumber = 0;
            for (int i = integer1; i <= integer2; i++) {
                if (i % 2 != 0) {
                    sumOfOddNumber += i;
                }
            }
            System.out.println(sumOfOddNumber);
        }
//        3.
        Random random9 = new Random();
        int threeDigitNumber = random9.nextInt(99,1_000);
        System.out.print(threeDigitNumber);
        int maxNumber = 0;
        while (threeDigitNumber > 0) {
            int someDigit = threeDigitNumber % 10;
            if (someDigit > maxNumber) {
                maxNumber = someDigit;
            }
            threeDigitNumber = threeDigitNumber / 10;
        }
        System.out.println(": max number is " + maxNumber);
//        4.
        System.out.println("Enter your number");
        int enteredNumber = scan9.nextInt();
        int theLargestDigit = 0;
        while (enteredNumber > 0) {
            int someDigit = enteredNumber % 10;
            if (someDigit > theLargestDigit) {
                theLargestDigit = someDigit;
            }
            enteredNumber = enteredNumber / 10;
        }
        System.out.println(theLargestDigit);
//        _______________________________________________________________
//        Second level
//        1.
        System.out.println("Enter building height:");
        int highOfBuilding = scan9.nextInt();
        System.out.println("Enter the number of floors to which a elevator rises:");
        int floorUp = scan9.nextInt();
        System.out.println("Enter the number of floors to which a elevator descends:");
        int floorDown = scan9.nextInt();
        System.out.println("Enter floor height:");
        int highOfFloor = scan9.nextInt();
        if (floorDown >= floorUp) {
            System.out.println("The elevator won't rise above " + floorUp + " floor");
        } else {
            int numberOfLift = 0;
            int currentFloor = 1;
            while (currentFloor < highOfBuilding) {
                numberOfLift ++;
                currentFloor += highOfFloor * (floorUp - floorDown);
            }
            System.out.println("Number of lift: " + numberOfLift);
        }
    }
}
