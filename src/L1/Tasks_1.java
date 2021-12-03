package L1;

import java.util.Scanner;

public class Tasks_1 {


    public static void main(String[] args) {

       /* testVars();

        System.out.println("Результат: " + calculate());

        checkSum(10, 34);
        checkSum(-26, 39);*//*

        checkNumber(33);
        checkNumber(-123);

        *//*checkNegative(-23);
        checkNegative(345);

        sayHello();

        checkBisextile();*/
//        System.out.println(new int[][]{{1,2,7},{3,4,5}}[1][2]);
//        String s = "value " + 2 + 2;
//        System.out.println(s);
    }

   /* //2
    private static void testVars() {
        byte number1 = -126;
        short number2 = 32767;
        int number3 = 2_147_483_647;
        long number4 = 4_000_000_555L;

        double number5 = 6457.1231;
        float number6 = 123.123f;

        char val1 = 40845;
        System.out.println(val1);

        boolean val2 = true;
    }

    //3
    private static double calculate() {
        System.out.println("Введите числа a, b, c и d.\na * (b + (c / d))");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if(d == 0) {
            System.out.println("На ноль делить нельзя!");
        }
        double result = a * (b + (c / d));
        return result;
    }

    //4
    private static boolean checkSum(int a, int b) {

        return (a + b >= 10 && a + b <= 20);
    }

    //5
    private static void checkNumber(int a) {

        *//*if(a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");*//*

        //тернарный оператор
        //(условие) ? (true) : (false);
        String word = (a < 0) ? "negative" : "positive";
        System.out.printf("This num(%d) is %s digit%n", a, word);
    }

    //6
    private static boolean checkNegative(int a){

       *//* if (a < 0) return true;
        else return false;*//*
        return a < 0;
    }

    //7
    private static void sayHello (){
        System.out.println("Как вас зовут?");
        Scanner enterName = new Scanner(System.in);
        String name = enterName.next();
        System.out.println("Привет, " + name + "!");
    }

    //8
    private static void checkBisextile(){
        System.out.println("Введите год");
        Scanner enterYear = new Scanner(System.in);
        int year = enterYear.nextInt();

        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0){
            System.out.println("Этот год — високосный.");
        } else
            System.out.println("Этот год — невисокосный.");
    }*/
}