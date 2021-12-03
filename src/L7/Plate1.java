//package L7;
//
//public class Plate1 {
//
//    int food;
//    boolean plateNotEmpty = true;
//    int fullness;
//
//
//    public void addFood(int food){
//        this.food = food;
//    }
//
//    public void printInfo(){
//        System.out.println(this);
//    }
//
//    @Override
//    public String toString(){
//        return "Plate: food = " + food;
//    }
//
//    public void decreaseFood(int food, int appetite) {
//
//        if(this.food > 0 && appetite > 0) {
//            this.food -= 1;
//            fullness += 1;
//            appetite -= 1;
//
//        } else {
//            plateNotEmpty = false;
//
//        }
//        /*else if ((this.food -= appetite) <= 0){
//            appetite = (this.food -= appetite) * -1;
//            plateEmpty = true;
//        }*/
//    }
//}
