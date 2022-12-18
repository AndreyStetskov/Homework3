package homework12;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW12 { // треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.

    private static boolean triangle (int firstSide, int secondSide, int thirdSide) {
       int maxSide = 0;
        if (firstSide > secondSide && firstSide > thirdSide) {
            maxSide = firstSide;
            if (firstSide <= (secondSide + thirdSide)) {
                return true;
            }
        } else if (secondSide > firstSide && secondSide > thirdSide) {
            maxSide = secondSide;
            if (secondSide <= (firstSide + thirdSide)) {
                return true;
            }
        } else {
            maxSide = thirdSide;
                if (thirdSide <= (firstSide + secondSide)) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        Random random12 = new Random();
        Scanner scan12 = new Scanner(System.in);
//        First level:
//        1. Переменная num может принимать значения: 1, 2, 3 или 4.
//        Если она имеет значение 1, то в переменную result запишем "зима", если имеет значение 2 – "весна" и так далее.
//        Решите задачу через if-else и через switch-case.
        int seasons = random12.nextInt(4) + 1;
        if (seasons == 1) {
            System.out.println(seasons + " :Winter");
        } else if (seasons == 2) {
            System.out.println(seasons + ": Spring");
        } else if (seasons == 3) {
            System.out.println(seasons + ": Summer");
        } else {
            System.out.println(seasons + ": Autumn");
        }
        switch (seasons) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
        }
//        2. Есть два массива char[] first = {‘a’,’b’,’c’,’d’,’e’} и char[] second = {‘f’,’g’,’h’,’i’,’g’}
//        создать массив соединяющий два этих массива в один новый
        String[] first = {"a", "b", "c", "d", "e"};
        String[] second = {"f", "g", "h", "i", "g"};
        String[] united = new String[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        int unitedIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if (firstIndex == first.length || first[firstIndex] == second[secondIndex]) {
                united[unitedIndex] = second[secondIndex];
                secondIndex ++;
            } else {
                united[unitedIndex] = first[firstIndex];1
                firstIndex ++;
            }
            unitedIndex ++;
        }
        System.out.println(Arrays.toString(united));
//        3. Сгенерировать случайное трехзначное число. Вывести на экран само число, сумму и произведение его цифр.
        int threeDigitNumber = random12.nextInt(100, 1000);
        System.out.println(threeDigitNumber);
        int sum = 0;
        int multiplication = 1;
        while (threeDigitNumber > 0) {
            int someDigit = threeDigitNumber % 10;
            sum += someDigit;
            multiplication *= someDigit;
            threeDigitNumber = threeDigitNumber / 10;
        }
        System.out.println(sum);
        System.out.println(multiplication);
//        4. Вводятся длины трех сторон предполагаемого треугольника.
//        Определить, может ли существовать треугольник с такими сторонами при условии что,
//        треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.
        System.out.println("Input first side of the triangle: ");
        int firstSide = scan12.nextInt();
        System.out.println("Input second side of the triangle: ");
        int secondSide = scan12.nextInt();
        System.out.println("Input third side of the triangle: ");
        int thirdSide = scan12.nextInt();
        if (firstSide == 0 || secondSide == 0 || thirdSide == 0) {
            System.out.println("Pay Attention! The triangle cannot have a zero side");
        } else if (firstSide < 0 || secondSide < 0 || thirdSide < 0) {
            System.out.println("Pay Attention! The triangle cannot have a negative side");
        } else {
            String result4;
            result4 = triangle(firstSide, secondSide, thirdSide) ? "This triangle is an existing one" : "This triangle isn't an existing one";
            System.out.println(result4);
        }
//        5. Подсчитать количество слов во введенной пользователем строке.
//        Считаем, что слова разделяются исключительно одним пробелом, а первый и последний символы строки не являются пробелами.
        Scanner additional12 = new Scanner(System.in);
        System.out.println("Enter your phrase: "); // I have a question here. When I had written "String phrase = scan12.nextLine();", the console didn't allow me to enter a line. Before and after that everything is fine.
        String phrase = additional12.nextLine();   // But when I had written second new Scanner, the console allowed me to enter a phrase. Why is this happening?
        int numberOfWords = 1;                     // P.s. Sorry I wrote in English, because I don't have a Russian keyboard.
        for (int i = 0; i < phrase.length() - 1; i++) {
            char whitespace = phrase.charAt(i);
            if (whitespace == ' ') {
                numberOfWords ++;
            }
        }
        System.out.println(numberOfWords);
//        6. Напишите программу, которая выводит на экран символы с 32-го по 126-й включительно.
//        При выводе символу должен предшествовать вывод его номера. Вывод выполнить в табличной форме по пять пар (номер:символ) в строке.
        for (int i = 32; i < 127; i++) {
            System.out.println(i + " : " + (char) i);
        }
//        7. Напишите программу которая сортирует массив в обратном порядке
        int[] array = new int [11];
        for (int i = 0; i < array.length; i++) {
            array[i] = random12.nextInt(101);
        }
        System.out.println(Arrays.toString(array));
        int[] yarra = new int [11];
        for (int i = 0; i < array.length; i++) {
            yarra[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(yarra));
//        8. Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
        int[] array8 = new int[] {41, 7, 59, -46, 46, 1, -81, -14, -40, 67, 81, -96, 23, 30, -71, 98, -94, 49, -1, 95, -89, -84, -69, 94, -32, 67, 62, -59, -62, -90};
//        8.1 значение каждой ячейки массива (пройтись циклом)
        for (int i = 0; i < array8.length; i++) {
            System.out.print(array8[i] + " ");
        }
//        8.2 значение каждой ячейки всего массива с конца в начало
        int additional8 = 0;
        System.out.println("");
        for (int i = 0; i < array8.length; i++) {
            additional8 = array8[array8.length - 1 - i];
            System.out.print(additional8 + " ");
        }
//        8.3 сумму значений всех ячеек
        System.out.println("");
        int sumOfArray = 0;
        for (int i = 0; i < array8.length; i++) {
            sumOfArray = array8[i];
        }
        System.out.println("The sum of the values of the array elements is " + sumOfArray);
//        8.4 напечатать кого в массиве больше, четных или нечетных?
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i < array8.length; i++) {
            if (i % 2 == 0) {
                evenNumber ++;
            } else {
                oddNumber ++;
            }
        }
        String result8;
        result8 = evenNumber > oddNumber ? "There are more even numbers" : "There are more odd numbers";
        System.out.println(result8);
//        _______________________________________________________________
//        Second level
//        1. Дан массив arr[] и целое число K, где K меньше размера массива,
//        задача состоит в том, чтобы найти K-й наименьший элемент в данном массиве.
//        Дано, что все элементы массива различны. Распечатать индекс и число.
        int[] arr = new int[16];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random12.nextInt(10, 100);
        }
        int k = random12.nextInt(16);
        arr [15] = k;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int swap = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[maxIndex];
            arr[maxIndex] = swap;
        }
        System.out.println(arr[0]);
//        2. Составить функцию checkPass (pswd), которая проверит пароль на соответствие требованиям:
//        •	Длина – 8 символов
//        •	В пароле должны быть:
//        o	заглавные буквы,
//        o строчные символы,
//        o	числа,
//        o специальные знаки (из перечня {'*','-','#',';'}
        System.out.println("Enter password");
        String password = scan12.nextLine();
        boolean hasUpper = password.equals(password.toLowerCase());
        boolean hasLower = password.equals(password.toUpperCase());
        if (password.length() == 8 && hasLower && hasUpper) {
            System.out.println("Your password is great!");
        } else  {
            if (!hasUpper) {
                System.out.println("Password must have an uppercase! Try again!");
            }
            if (!hasLower) {
                System.out.println("Password must have an lowercase! Try again!");
            }
            if (password.length() > 8) {
                System.out.println("Password is so large! Try again!");
            }
            if (password.length() < 8) {
                System.out.println("Password is so small! Try again!");
            }
        }
//        3. Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трех геометрических фигур:
//        прямоугольника, треугольника или круга.
        System.out.println("Choose a shape");
        int shape = scan12.nextInt();
        if (shape == 1) {
            System.out.println("Enter first side of the rectangle: ");
            int aRectangle = scan12.nextInt();
            System.out.println("Enter second side of the rectangle: ");
            int bRectangle = scan12.nextInt();
            int areaRectangle = aRectangle * bRectangle;
            System.out.println("The area of the rectangle is " + areaRectangle);
        } else if (shape == 2) {
            System.out.println("Enter first side of the triangle: ");
            int aTriangle = scan12.nextInt();
            System.out.println("Enter second side of the triangle: ");
            int bTriangle = scan12.nextInt();
            System.out.println("Enter third side of the triangle: ");
            int cTriangle = scan12.nextInt();
            int s = (aTriangle + bTriangle + cTriangle) / 2;
            double areaTriangle = Math.sqrt((s - aTriangle) * (s - bTriangle) * (s - cTriangle));
            System.out.println("The area of the triangle is " + areaTriangle);
        } else if (shape == 3) {
            System.out.println("Enter diameter of the circle: ");
            int diameter = scan12.nextInt();
            double areaCirclele = Math.PI * diameter * diameter / 4;
            System.out.println("The area of the circle is " + areaCirclele);
        } else {
            System.out.println("There is no such shape");
        }
    }
}
