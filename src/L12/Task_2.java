package L12;

import java.util.Arrays;

public class Task_2 {

    public static void main(String[] args) {
        testArr();
        taskTwo();
        taskThree();
        taskFour();
        minMaxArr();

        int[] arr5 = {27, 41, 54, 48, 5, 86, 3, 2};
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr5));
        System.out.println(checkBalance(arr6));
    }

    //1
    private static void testArr(){
        int[] arr = {1,1,0,1,0,0,0,1,0};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            } else{
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2
    private static void taskTwo(){
        int[] arr = new int [8];

        for(int i = 0; i < 8; i++){
            arr[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3
    private static void taskThree(){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //4
    private static void taskFour(){
        int[][] arr = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0, j1 = arr.length; j < arr.length; j++, j1--){
                    if(i == j || i == (j1 - 1)) arr[i][j] = 1;
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
            }
        }

    //5
    private static void minMaxArr(){
        int[] arr = {1,5,12,-123,0,-122,1234,4};
        int arrMin = arr[0];
        int arrMax = arr[arr.length - 1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arrMax){
                arrMax = arr[i];
            } else if (arr[i] < arrMin){
                arrMin = arr[i];
            }
        }
        System.out.println(arrMin);
        System.out.println(arrMax);
    }

    //6
    private static boolean checkBalance(int[] arr){

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length + 1; i++) {
            int sumLeftSide = 0;
            int sumRightSide = 0;

            for (int j = 0; j < i; j++) {
                sumLeftSide += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sumRightSide += arr[j];
            }

            if (sumLeftSide == sumRightSide) {
                return true;
            }
        }
        return false;
    }
}

