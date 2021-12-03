package L111;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box <Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        //appleBox.add(new Orange()); // должна быть ошибка
        appleBox.compare(orangeBox); // ошибки быть не должно

        Box<Apple> box3 = new Box<>();
        appleBox.pourIntoOtherBox(box3);
        //appleBox.pourIntoOtherBox(orangeBox); //должна быть ошибка
    }

    private static <T> void shiftElements(T[] arr) {
        Random rand = new Random();
        int a = rand.nextInt(arr.length);
        int b = Math.abs(a - 1);

        T elem1 = arr[a];
        T elem2 = arr[b];

        arr[b] = elem1;
        arr[a] = elem2;

        System.out.println(Arrays.toString(arr));
    }

    private static <T> void arrToList(T[] arr) {
        List<T> list = new ArrayList<>(Arrays.asList(arr));
    }
}
