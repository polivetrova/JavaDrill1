package L2;

import java.util.Arrays;

public class Tasks_2 {

    public static void main(String[] args) {

        //1
        int[] array1 = {1, 0, 1, 1, 0, 0, 0, 1, 0, 1};
        for( int i = 0; i < array1.length; i++) {
            if (array1[i] == 0)
                array1[i] = 1;
            else
                array1[i] = 0;
        }
        System.out.println(Arrays.toString(array1));

        //2
        int[] array2 = new int[8];
        int step = 3;
        array2[0] = 0;
        for(int i = 0; i < array2.length; i++){
            array2[i] = array2[0] + step * i;
        }
        System.out.println(Arrays.toString(array2));

        //3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < array3.length; j++){
            if (array3[j] < 6) array3[j] *= 6;
            else continue;
        }
        System.out.println(Arrays.toString(array3));

        //4
        int[][] deepArray4 = new int [5][5];
        for(int i = 0; i < deepArray4.length; i++){
            for(int j = 0, j1 = deepArray4[i].length; j < deepArray4[i].length; j++, j1--){
                if(i == j || i == (j1 - 1)) deepArray4[i][j] = 1;
                System.out.printf("%2d ", deepArray4[i][j]);
            }
            System.out.println();
        }

        //5
        int[] array5 = new int [8];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array5));

        int arrMax = array5[0];
        int arrMin = array5[array5.length - 1];
        int i = 0;
        while(i < array5.length) {
            if (array5[i] > arrMax) {
                arrMax = array5[i];
                i++;
            } else if (array5[i] < arrMin) {
                arrMin = array5[i];
                i++;
            } else i++;
        }
        System.out.println("Наибольшее число в массиве: " + arrMax + "\nНаименьшее число в массиве: " + arrMin);

        //6
        System.out.println(checkBalance(array5));

    }

    private static boolean checkBalance (int[] arr){

        for (int i = 0; i < arr.length + 1; i++) {
            int sumLeftSide = 0;
            int sumRightSide = 0;

            for (int j = 0; j < i; j++) {
                sumLeftSide += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sumRightSide += arr[j];
            }

            if (sumLeftSide == sumRightSide) return true;
        }
        return false;
    }
}
