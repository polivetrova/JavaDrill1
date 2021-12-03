package L3;

import java.util.Scanner;

public class Tasks_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int range = 10;
            int answer = (int) (Math.random() * range);
            int triesAll = 3;

            System.out.println("Угадайте число от 0 до " + (range - 1) + ". Количество попыток: " + triesAll);

            playNum(triesAll, answer);

            System.out.println("Хотите попробовать еще раз? 0 - нет, 1 - да");
            int exit = scanner.nextInt();
            if (exit == 0) {
                scanner.close();
                break;
            }
        }
    }

    private static void playNum(int triesAll, int answer) {

        for (int tryCount = 1; tryCount <= triesAll; tryCount++) {

           int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("Вы угадали!");
                break;
            }
            System.out.println((userAnswer > answer) ? "Загаданное число меньше." : "Загаданное число больше.");
            System.out.println("Осталось попыток: " + (triesAll - tryCount) + "\n");
        }
        System.out.println("Загаданное число: " +  answer + "\n");
    }
}
