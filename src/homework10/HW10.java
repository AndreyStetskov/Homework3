package homework10;

import java.util.Random;
import java.util.Scanner;

public class HW10 {

    private static String string (String phrase, char symbol1, char symbol2) {
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == symbol1) {
                phrase.charAt(i) = symbol2;
            }
        }
        return phrase;
    }

    public static void main(String[] args) {
        Scanner scan10 = new Scanner(System.in);
        Random random10 = new Random();

//        First level:
//        1. Напечатать все четырехзначные числа, в записи которых нет двух одинаковых цифр.
        for (int i = 1_000; i < 10_000; i++) {
            int firstDigit = i % 10;
            int secondDigit = i / 10 % 10;
            int thirdDigit = i / 100 % 10;
            int fourthDigit = i / 1000;
            if (firstDigit != secondDigit && firstDigit != thirdDigit && firstDigit != fourthDigit && secondDigit != thirdDigit && secondDigit != fourthDigit && thirdDigit != firstDigit) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
//        2. Двузначное десятичное число в сумме с числом, записанным теми же цифрами, но в обратном порядке, дает полный квадрат.
//        Найти все такие числа.
        for (int i = 9; i < 100; i++) {
            int theFirstTerm = i;
            int theSecondTerm = 0;
            while (i !=0) {
                int digit = i % 10;
                theSecondTerm = theSecondTerm * 10 + digit;
                i /= 10;
            }
            int sum = theFirstTerm + theSecondTerm;
            int square = (int) Math.sqrt (sum);
            if (square * square == sum) {
                System.out.println(theFirstTerm);
            }
            }
//        3. Распечатать треугольник из символов ^. Высоту выбирает пользователь.
        System.out.print("Input height of a triangle: ");
        int height = scan10.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("^");
            }
            System.out.println("");
        }
//        4. Вывести таблицу умножения от 1 до 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " times " + j + " equal " + i * j);
            }
        }
//        5. С клавиатуры вводятся целые числа до первого числа, которое меньше двух.
//        Написать программу, которая определяет сколько простых чисел было введено.
        System.out.println("Enter numbers");
        int number;
        int primeNumber = 0;
        do {
           number = scan10.nextInt();
            for (int i = 2; i < number; i++) {
                if (number % i != 0) {
                    break;
                } primeNumber ++;
            }
        } while (number > 2);
        System.out.println(primeNumber);
//        6. Для каждого натурального числа в промежутке от M до N вывести все делители, кроме единицы и самого числа.
//        Значения M и N вводятся с клавиатуры.
        System.out.println("Enter number M");
        int m = scan10.nextInt();
        System.out.println("Enter number N");
        int n = scan10.nextInt();
        for (int i = m; i < n; i++) {
            System.out.print("Deviders of number " + i +  ": ");
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("");
//        7. Напишите метод, который принимает строку и два символа.
//        В результате он возвращает заданную строку, где каждый первый символ был заменен вторым символом.
        System.out.println(string("I always do homework", 'o', 'O'));
//        _______________________________________________________________
//        Second level
//        1. В кассу на пятипроцентный вклад положили 100 рублей. Какой станет сумма вклада через 10 лет?
//        1.1 Посчитатйте сумму без капитализации
        double deposit1 = 100;
        int percent1 = 5;
        for (int i = 0; i <= 40; i++) {
            deposit1 = deposit1 + deposit1 * percent1 / 100 / 4;
        }
        System.out.println("Your account in 10 years: " + deposit1 + " rubles");
//        1.2 Посчитайте сумму с капитализацией в конце каждого года
        double deposit2 = 100;
        int percent2 = 5;
        for (int i = 0; i <= 10; i++) {
            deposit2 = deposit2 + deposit2 * percent2 / 100;
        }
        System.out.println("Your account in 10 years: " + deposit2 + " rubles");
//        1.3 Посчитатйте сумму с капитализацией в конце каждого месяца
        double deposit3 = 100;
        int percent3 = 5;
        for (int i = 0; i <= 120; i++) {
            deposit3 = deposit3 + deposit3 * 0.5 / 100;
        }
        System.out.println("Your account in 10 years: " + deposit3 + " rubles");
//        2. Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
//        После ввода нуля, показать на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое.
        System.out.println("Enter numbers");
        int numbers;
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
                do {
            numbers = scan10.nextInt();
            if (numbers !=0) {
                numberOfNumbers ++;
                sumOfNumbers += numbers;
            }
        } while (numbers != 0);
                System.out.println("It was introduced: " + numberOfNumbers);

        System.out.println("The arifmetic mean of these numbers: " + sumOfNumbers / numberOfNumbers);
//        3. Проверка гипотезы Сиракуз. Возьмем любое натуральное число.
//        Если оно четное - разделим его пополам, если нечетное - умножим на 3, прибавим 1 и разделим пополам.
//        Повторим эти действия с вновь полученным числом.
//        Гипотеза гласит, что независимо от выбора первого числа рано или поздно мы получим 1.
        int syracuse = random10.nextInt(100);
        while (syracuse != 1) {
            if (syracuse % 2 == 0) {
                syracuse /= 2;
                System.out.println(syracuse);
            } else {
                syracuse = (syracuse * 3 + 1) / 2;
                System.out.println(syracuse);
            }
        }
    }
}