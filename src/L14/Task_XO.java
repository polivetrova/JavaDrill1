package L14;

import java.util.Random;
import java.util.Scanner;

public class Task_XO {

    static final Scanner scan = new Scanner(System.in);
    static final Random rand = new Random();

    static char[][] field;
    static final char EMPTY = '◻';
    static final char USER_SYMBOL = '✕';
    static final char AI_SYMBOL = '◯';
    static final int WIN_LINE = 3;
    static boolean isEnd = false;

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        doField();
        playGame();
    }

    private static void doField() {
        createField();
        printField(field);
    }

    private static void createField() {
        int size;
        while (true){
            System.out.println("choose the field size");
            size = scan.nextInt();

            if(size < 3){
                System.out.println("the field size should be 3 or more.");
            } else {
                field = new char[size][size];
                break;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = EMPTY;
            }
        }
    }

    private static void printField(char[][] field) {
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true){
            userTurn();
            printField(field);
            checkEnd(USER_SYMBOL);

            aITurn();
            printField(field);
            checkEnd(AI_SYMBOL);
        }
    }

    private static void userTurn() {
        System.out.println("your turn!");

        while(true) {
            System.out.println("choose horizontal coordinate");
            int row = chooseCoordinate() - 1;

            System.out.println("choose vertical coordinate");
            int column = chooseCoordinate() - 1;

            if (checkCoordinate(row) && checkCoordinate(column) && isSpotFree(row,column)) {
                field[row][column] = USER_SYMBOL;
                break;
            } else {
                continue;
            }
        }
    }

    private static int chooseCoordinate(){
        int coordinate;
        while(true) {
            if (scan.hasNextInt()) {
                coordinate = scan.nextInt();
                break;
            } else {
                scan.next();
                System.out.println("coordinate is a number. try again.");
            }
        }
        return coordinate;
    }

    private static boolean checkCoordinate(int coordinate) {
        if (coordinate >= field.length) {
            System.out.println("stay within the field! enter the number from 1 to " + field.length);
            return false;
        }
        return true;
    }

    private static boolean isSpotFree(int row, int column) {
        if(field[row][column] != EMPTY){
            System.out.println("this spot is taken, try again.");
            return false;
        }
        return true;
    }

    private static void aITurn(){
        int row;
        int column;
        System.out.println("AI turn!");

        while(true){
            row = rand.nextInt(field.length);
            column = rand.nextInt(field.length);
            if(isSpotFree(row,column)){
                field[row][column] = AI_SYMBOL;
                break;
            } else {
                continue;
            }
        }
    }

    private static void checkEnd(char symbol){
        if(isWin(symbol)){
            isEnd = true;
            String winMessage;
            if(symbol == USER_SYMBOL){
                winMessage = "Congrats! You win.";
            } else {
                winMessage = "FATALITY";
            }
            System.out.println(winMessage);
        }

        if(isFieldFull(field) && !isWin(symbol)){
            System.out.println("it's a draw!");
            isEnd = true;
        }

        if(isEnd){
            System.exit(0);
        }
    }

    private static boolean isFieldFull(char[][] field) {
        for (char[] chars : field) {
            for (char symbol : chars) {
                if(symbol == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWin(char symbol) {

        for (int i = 0; i < field.length; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == symbol) {
                    row++;
                } else if (field[i][j] != symbol && row < WIN_LINE) {
                    row = 0;
                }
                if (field[j][i] == symbol) {
                    column++;
                }   else if (field[j][i] != symbol && column < WIN_LINE) {
                    column = 0;
                }
            }
            if (row >= WIN_LINE || column >= WIN_LINE) {
                return true;
            }
        }

        for (int i = 0; i < field.length; i++) { // все по главной диагонали
            int diagMain = 0;
            for (int j = 0; j < field.length; j++) {
                int shift = i + j;
                if (shift < field.length) {
                    if (field[j][shift] == symbol ) {
                        diagMain++;
                    } else if (field[j][shift] != symbol && diagMain < WIN_LINE) {
                        diagMain = 0;
                    } else if (field[shift][j] == symbol) {
                        diagMain++;
                    } else if (field[shift][j] != symbol && diagMain < WIN_LINE) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= WIN_LINE) {
                    return true;
                }
            }
        }

        for (int i = 0; i < field.length; i++) { //правая нижняя часть относительно побочной диагонали
            int diagOther = 0;
            for (int j = 0; j < field.length; j++) {

                int shift = i + j;
                int d = field.length - 1 - j;

                if (d >= 0 && shift < field.length) {
                    if (field[shift][d] == symbol) {
                        diagOther++;
                    } else if (field[shift][d] != symbol && diagOther < WIN_LINE) {
                        diagOther = 0;
                    }
                }
                if (diagOther >= WIN_LINE) {
                    return true;
                }
            }
        }

        for (int i = 1; i < field.length; i++) {  //левая верхняя часть относительно побочной диагонали
            int diagOther = 0;
            for (int j = 0; j < field.length; j++) {
                int k = field.length - 1 - i - j;
                if (k >= 0) {
                    if (field[j][k] == symbol) {
                        diagOther++;
                    } else if (field[j][k] != symbol && diagOther < WIN_LINE) {
                        diagOther = 0;
                    }
                }
                if (diagOther >= WIN_LINE) {
                    return true;
                }
            }
        }
        return false;
    }
}
