package L7;

public class Test {

    public static void main(String[] args) {
        Plate2 plate = new Plate2(15, 15);

        Cat[] catArr = new Cat[3];
        catArr[0] = new Cat("Барсик");
        catArr[1] = new Cat("Васька");
        catArr[2] = new Cat("Невезучий");

        for (Cat cat : catArr) {
            cat.eat(plate);
            cat.printInfo();
            plate.printInfo();
        }

        plate.addFood(20);
    }
}
