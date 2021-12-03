package src.L13;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        String[] words = createArray();
        guessGame(words);
    }

    private static String[] createArray() {
        return new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "celery", "cherry", "garlic", "grape", "eggplant", "melon", "kiwi", "mango", "olive", "watermelon", "cucumber", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    }

    private static void guessGame(String[] words){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String answer = words[random.nextInt(words.length)];
        char[] hideAnswer = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',};

        System.out.println("Hello! Hello! Welcome to the Guess the word game.\nPlease enter the name of a fruit or a vegetable.");
        String userAnsw = (scan.nextLine()).toLowerCase(Locale.ROOT);

        while(!userAnsw.equals(answer)){
            System.out.println("Oops! Wrong guess, try again.");

            int minLength = Math.min(answer.length(), userAnsw.length());
            for(int i = 0; i < minLength; i++){
                if(answer.charAt(i) == userAnsw.charAt(i)){
                    hideAnswer[i] = answer.charAt(i);
                } else if (hideAnswer[i] != '#'){
                    hideAnswer[i] = hideAnswer[i];
                } else {
                    hideAnswer[i] = '#';
                }
            }
            System.out.println(hideAnswer);
            userAnsw = scan.nextLine();
        }
        System.out.println("RIGHT! You've won.");
    }
}