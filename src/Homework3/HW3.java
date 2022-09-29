package Homework3;

import java.util.Locale;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        System.out.println("First level:");
        System.out.print("1. ");
        String phrase = "I study Basic Java!";
        System.out.println(phrase);

        System.out.print("2. ");
        System.out.println(phrase.charAt(18));

        System.out.print("3. ");
        System.out.println(phrase.contains("Java"));

        System.out.print("4. ");
        System.out.println(phrase.replace("a", "o"));

        System.out.print("5. ");
        System.out.println(phrase.toLowerCase());

        System.out.print("6. ");
        System.out.println(phrase.toUpperCase());

        System.out.print("7. ");
        System.out.println(phrase.substring(13, 18));

        System.out.print("8. ");
        double percent = (470.0 / 200) * 100;
        System.out.println("Percent: " + percent);

        System.out.print("9. ");
        System.out.println(phrase.indexOf("g"));
        System.out.println("------------------------------------------");
        System.out.println("Second level:");
        System.out.print("1. ");
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("2. ");
        System.out.println("What's your name?: ");
        String nameletter = scan.nextLine();
        System.out.println("Your name begins with a letter " + nameletter.charAt(0) + ".");

        System.out.print("3. ");
        double a = 59.976;
        int b = (int) a;
        System.out.print(b);

        System.out.print("4. ");
        int a1 = 475;
        short b1 =(short)a1;
        System.out.print(b1);
    }
}
