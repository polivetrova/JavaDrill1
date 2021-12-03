package L4;

import java.util.Random;
import java.util.Scanner;

public class TicTacHome {

    static int size = 5;
    static int winLine = 3;

    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final char HEADER_FIRST_SYMBOL = '';
    static final String EMPTY = " ";

    static  final char[][] map = new char[size][size];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    static boolean isEnd = false;

    public static void main(String[] args) {
            turnGame();
    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.println();
        printHeaderMap();
        printBodyMap();
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + EMPTY);
        for(int i = 0; i < size; i++){
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printBodyMap() {
        for(int i = 0; i < size; i++){
            printMapNumber(i);
            for(int j = 0; j < size; j++){
                System.out.print(map[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    private static void playGame(){
        while(true){
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn(){

        int rowNumber;
        int columnNumber;

        System.out.println("\nВаш ход! Введите строку и столбец.");
        do {
            rowNumber = -1;
            columnNumber = -1;

            System.out.println("Строка =");
            if(in.hasNextInt()){
                rowNumber = in.nextInt() - 1;
            } else {
                in.next();
                System.out.println("Введите число!");
                continue;
            }

            System.out.println("Столбец =");
            if(in.hasNextInt()){
                columnNumber = in.nextInt() - 1;
            } else {
                in.next();

            }
        } while(!isHumanTurnValid(rowNumber, columnNumber));

        map[rowNumber][columnNumber] = DOT_HUMAN;
    }

    private static boolean isHumanTurnValid(int rowNumber, int columnNumber) {

        return isNumbersValid(rowNumber, columnNumber) && isCellAvailable(rowNumber, columnNumber);
    }

    private static boolean isNumbersValid(int rowNumber, int columnNumber) {
        if(rowNumber > size || rowNumber < 0 || columnNumber > size || columnNumber < 0) {
            System.out.println("\nДанные введены неверно, введите строку и столбец.");
            return false;
        }
        return true;
    }

    private static boolean isCellAvailable(int rowNumber, int columnNumber) {
        if(map[rowNumber][columnNumber] != DOT_EMPTY){
            System.out.println("\nТут занято!");
            return false;
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber;
        int columnNumber;

        System.out.println("\n Ход компьютера.");

        do{
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);

        } while (!isCellAvailable(rowNumber, columnNumber));

        map[rowNumber][columnNumber] = DOT_AI;
    }

    private static void checkEnd(char symbol) {

        if(checkWin(symbol)){
            isEnd = true;
            String winMessage;
            if(symbol == DOT_HUMAN){
                winMessage = "Вы победили!";
            } else {
                winMessage = "FATALITY";
            }

            System.out.println(winMessage);
        }

        if(!isEnd && isMapFull()){
            System.out.println("Ничья!");
            isEnd = true;
        }

        if(isEnd){
            System.exit(0);
        }
    }

    private static boolean checkWin(char symbol) {

        int row = 0;
        int column = 0;
        int diagonalLR = 0;
        int diagonalRL = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symbol) row++;
                if (map[j][i] == symbol) column++;
                if (i == j && map[i][j] == symbol) diagonalLR++;
                if (i + j == size - 1 && map[i][j] == symbol) diagonalRL++;

                if (row == winLine || column == winLine || diagonalLR == winLine || diagonalRL == winLine)
                    return true;
            }
        }
        return false;
    }

    private static boolean isMapFull() {
        for(char[] chars : map){
            for(char symbol : chars){
                if(symbol == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
}



