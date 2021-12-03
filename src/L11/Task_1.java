package L11;

public class Task_1 {

    public static void main(String[] args) {
        //2
        /*byte num1 = -128;
        short num2 = 22020;
        int num3 = -1221123422;
        long num4 = 4_300_560_777L;

        float num5 = 2394.7F;
        double num6 = 34293.12324;

        char sign = 23094;
        System.out.println(sign);

        boolean boo = true;*/

        System.out.println(calculate());

        System.out.println(checkNum(12,4));
        System.out.println(checkNum(20,123));

        positiveNegative(12);
        positiveNegative(-123);

        System.out.println(posNegNum(-1));
        System.out.println(posNegNum(234));

        hello("Ваня");

        bissextus(400);
        bissextus(2016);
        bissextus(231);
        bissextus(2128);
    }

    //3
    private static float calculate() {
        float a = 12F;
        float b = 13431F;
        float c = 0.52F;
        float d = -0.12312F;

        return a * (b + (c / d));
    }

    //4
    private static boolean checkNum(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    //5
    private static void positiveNegative (int a){
        if(a >= 0){
            System.out.println("Число положительное");
        } else{
            System.out.println("Число отрицательное");
        }
    }

    //6
    private static boolean posNegNum(int a){
        return a < 0;
    }

    //7
    private static void hello(String name){
        System.out.println("Привет, " + name + "!");
    }

    //8
    private static void bissextus(int year){
        if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }
}

