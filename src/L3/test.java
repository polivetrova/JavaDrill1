package L3;

import java.util.Scanner;

public class test {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int answer = (int) (Math.random() * 10);
        int triesAll = 3;

        System.out.println("Угадайте число от 0 до 9.\nУ вас 3 попытки.");
        for(int tryCount = 0; tryCount < triesAll; tryCount++){
            int userAnswer = scanner.nextInt();

            if(userAnswer == answer){
                System.out.println("good");
               /// return true;
            } else if (userAnswer < answer){
                System.out.println("Bigger");
            } else
                System.out.println("smaller");
        }
    }
}
