package L7;

public class Plate2 {

    private int food;
    private int plateSize;
    private int hungerAfterEaten;

    public Plate2(int food, int plateSize){
        this.food = food;
        this.plateSize = plateSize;
    }

    public void addFood(int newFood){
        if((plateSize - this.food) >= newFood){  //если в миске есть место для такого количества новой еды
            this.food += newFood;
            System.out.println("Миска наполнена");
        } else if(plateSize - this.food < newFood){ // если еды слишком много
            newFood -= (plateSize - this.food);
            this.food = plateSize;
            System.out.println("Миска переполнена. Вы насыпали " + newFood + " лишних порций");
        }
    }

    public void decreaseFood(int hunger){

        if((food - hunger) <= 0){
            hungerAfterEaten = (food - hunger) * -1;
            food = 0;

        } else {
            hungerAfterEaten = 0;
            food -= hunger;
        }
    }

    public void printInfo(){

        if(food <= 0){
            System.out.println("В миске пусто!\n");
        } else {
            System.out.println(this);
        }
    }

    @Override
    public String toString(){
        return "В миске осталось " + food + " единиц(ы) еды\n";
    }

    public int getHungerAfterEaten() {
        return hungerAfterEaten;
    }
}
