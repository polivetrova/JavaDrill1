package L6;

public abstract class Animal {

    private String name;
    private double maxRunDistance;
    private double maxJumpHeight;

    public Animal(String name, double maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    public Animal (String name){
        this.name = name;
    }

    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract void swim(double distance);

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public String toString(){
        return "{" + "name = " + name + '}';
    }
}
