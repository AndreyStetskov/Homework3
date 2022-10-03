package Homework4;

import java.util.Scanner;

public class HW4 {
    double calorie(double firstPizza, double secondPizza) {
        return firstPizza * firstPizza * Math.PI * 40 - secondPizza * secondPizza * Math.PI * 40;
    }
    public static void main(String[] args) {
        System.out.println("First level:");
        System.out.print("1. ");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Write something: ");
        String stringLength = scan1.nextLine();
        System.out.println("String length is " + stringLength.length());

        System.out.print("2. ");
        String s1 = "I love";
        String s2 = "Java";
        String qluing = s1.concat(" ").concat(s2);
        System.out.println(qluing);

        System.out.print("3. ");
        Hause myHause = new Hause(4, 14.5, 25.4, 3.7,"Blue");
        System.out.println(myHause);

        4.
        int main(String args) {
        }
        int main(String args, String args2) {
        }
        public void main(int number){
        }
        private void main(int a, int b) {
        }
        public void main(String qwerty, String ytrewq){
        }
        System.out.print("7. ");
        HW4 calories = new HW4();
        System.out.println(calories.calorie(22, 30));

        System.out.println("------------------------------------------");
        System.out.println("Second level:");
        System.out.print("1. ");
        String n1 = "123";
        String n2 = "456";
        System.out.println(Integer.valueOf(n1) + Integer.valueOf(n2));


        }
}
