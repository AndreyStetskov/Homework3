package homework11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW11 {

    public static void main(String[] args) {
        Random random11 = new Random();
        Scanner scan11 = new Scanner(System.in);
//        First level:
//        1. Найти номер и значение первого положительного элемента массива.
        int[] array1 = new int [11];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random11.nextInt(201) - 100;
        }
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
               System.out.print("Array number of a first positive number: " + i + " -> ");
               System.out.println("A value of a first positive number: " + array1[i]);
               break;
            }
        }
//        2. Создайте массив А[1..100] с помощью генератора случайных чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.
        int[] array2 = new int [100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random11.nextInt(10_000);
        }
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] * 2 + ", ");
        }
        System.out.println("");
//        3. С 8 до 20 часов температура воздуха измерялась ежечасно. Известно, что в течение этого времени температура понижалась.
//        Определите, в котором часу была впервые отмечена отрицательная температура.
        int[] temperature = new int[13];
        int additionalyForLowering = 1;
        int firstNegativeTemperature = 0;
        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = 7 - additionalyForLowering;
            additionalyForLowering = additionalyForLowering + random11.nextInt(4);
        }
        System.out.println(Arrays.toString(temperature));
        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < 0) {
                firstNegativeTemperature = i + 8;
                break;
            }
        }
        if (firstNegativeTemperature <= 12){
            System.out.println("The first negative tempreture was at " + firstNegativeTemperature + ".00 a.m.");
        } else {
            System.out.println("The first negative tempreture was at " + firstNegativeTemperature + ".00 p.m.");
        }
//        4. Создайте массив из пяти фамилий и выведите их на экран столбиком.
        String[] secondNames = {"Jonson", "Smith", "Williams", "Anderson", "Pupkin"};
        for (int i = 0; i < secondNames.length; i++) {
            System.out.println(secondNames[i]);
        }
//        5. В массиве, состоящем из N вещественных элементов (вводится из консоли), после заполняется случайными числами,
//        найти максимальный по модулю элемент массива.
        System.out.println("Enter the length of the array (at least 10):");
        int lengthOfArray5 = scan11.nextInt();
        if (lengthOfArray5 < 10) {
            System.out.println("Pay attention! This array can't be less than 10. Try again!");
        } else {
            int [] array5 = new int[lengthOfArray5];
            for (int i = 0; i < array5.length; i++) {
                array5[i] = random11.nextInt(3_001) - 1_500;
            }
            System.out.println(Arrays.toString(array5));
            int max = 0;
            for (int i = 0; i < array5.length; i++) {
                int abs = Math.abs(array5[i]);
                if (max < abs) {
                    max = abs;
                }
            }
            System.out.println("Maximum number of the array in absolute magnitude is " + max);
        }

//        _______________________________________________________________
//        Second level
//        1. Все элементы массива поделить на значение наибольшего элемента этого массива.
        System.out.println("Enter the length of the array");
        int lengthOfArray1SL = scan11.nextInt();
        if (lengthOfArray1SL < 2) {
            System.out.println("Pay attention! This isn't array! Try again!");
        } else {
            int [] array1SL = new int[lengthOfArray1SL];
            for (int i = 0; i < array1SL.length; i++) {
                array1SL[i] = random11.nextInt(11);
            }
            System.out.println(Arrays.toString(array1SL));
            int max1SL = 0;
            for (int i = 0; i < array1SL.length; i++) {
                if (max1SL < array1SL[i]) {
                    max1SL = array1SL[i];
                }
            }
            double divide = (array1SL.length + 0.0) / max1SL;
            System.out.println("Maximum number of the array in absolute magnitude is " + max1SL);
            System.out.println("The result of dividing all elements of the array by the maximum number of that array is " + divide);
        }
//        2. Дан массив (сгенерируйт значения).
//        Найти среднее арифметическое его элементов.
//        Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
        int[] array2SL = new int [11];
        for (int i = 0; i < array2SL.length; i++) {
            array2SL[i] = random11.nextInt(301);
        }
        System.out.println(Arrays.toString(array2SL));
        int sum = 0;
        for (int i = 0; i < array2SL.length; i++) {
            sum += array2SL[i];
        }
        int arifthmeticMean = sum / array2SL.length;
        System.out.println("Arithmetic mean is " + arifthmeticMean);
        System.out.print("Output of required numbers of task 2.2: ");
        for (int i = 0; i < array2SL.length; i++) {
            if (array2SL[i] > arifthmeticMean) {
                System.out.print(array2SL[i] + ", ");
            }
        }
        System.out.println("");
//        3. Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
        int[] array3SL = new int [22];
        for (int i = 0; i < array3SL.length; i++) {
            array3SL[i] = random11.nextInt(11);
        }
        System.out.println(Arrays.toString(array3SL));
        System.out.print("Output of required numbers of task 2.3: ");
        for (int i = 1; i < array3SL.length; i++) {
            if (array3SL[i] > array3SL[i - 1]) {
                System.out.print(array3SL[i] + ", ");
            }
        }
        System.out.println("");
//        4. Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
//        Вывести на экран количество элементов самой длиной последовательности и номер элемента, который является ее началом.
        int[] array4SL = new int [33];
        for (int i = 0; i < array4SL.length; i++) {
            array4SL[i] = random11.nextInt(2);
        }
        int theLongest = 1;
        int indexOfTheLongest = 0;
        int theLongestCurrent = 1;
        int indexCurrent = 0;
        System.out.println(Arrays.toString(array4SL));
        for (int i = 0; i < array4SL.length - 1; i++) {
            if (array4SL[i] == array4SL[i + 1]) {
                theLongestCurrent ++;
            } else {
                if (theLongestCurrent > theLongest) {
                    theLongest = theLongestCurrent;
                    indexOfTheLongest = indexCurrent;
                }
                theLongestCurrent = 1;
                indexCurrent = i + 1;
            }
        }
        if (theLongestCurrent > theLongest) {
            theLongest = theLongestCurrent;
            indexOfTheLongest = indexCurrent;
        }
        System.out.println("The number of elements of the longest sequence is " + theLongest);
        System.out.println("The number of the element that is the beginning of the longest sequence is " + indexOfTheLongest);
    }
}
