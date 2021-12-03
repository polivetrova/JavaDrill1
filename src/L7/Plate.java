//package L7;
//
//public class Plate {
//
//    private int food;
//    private int hungerAfterEaten;
//    private int eatenFood;
//
//
//    public Plate(int food){
//        this.food = food;
//    }
//
//    public void decreaseFood(int hunger){
//
//        eatenFood = food - hunger;
//
//        if(eatenFood < 0){
//            hungerAfterEaten = eatenFood * -1;
//        } else {
//            hungerAfterEaten = 0;
//        }
//    }
//
//
//    public void printInfo(){
//
//        if(eatenFood <= 0){
//            System.out.println("Миска пуста!");
//        } else {
//            System.out.println(this);
//        }
//    }
//
//    @Override
//    public String toString(){
//        return "Plate: food = " + food;
//    }
//
//    public int getHungerAfterEaten() {
//        return hungerAfterEaten;
//    }
//}
