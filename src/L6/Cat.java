package L6;

public class Cat extends Animal{

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    public Cat (String name){
        super(name);
        this.maxRunDistance = 200;
        this.maxJumpHeight = 2;
    }

    double maxRunDistance = this.getMaxRunDistance();
    double maxJumpHeight = this.getMaxJumpHeight();

    @Override
    public void run(double distance){
        String message = (distance > 0 & distance <= maxRunDistance) ? " Бегу" : " Не могу столько пробежать";

        System.out.printf(this.toString() + "%s (%.2fм)%n", message, distance);
    }


    @Override
    public void jump(double height) {
        String message = (height > 0 & height <= maxJumpHeight) ? " Прыжжжок!" : " Не могу так прыгнуть";

        System.out.printf(this.toString() + "%s (%.2fм)%n", message, height);
    }

    @Override
    public void swim(double distance) {
        System.out.println(this.toString() + " Не могу плавать, у меня лапки");
    }

    @Override
    public String toString(){
        return "Cat" + super.toString();
    }
}
