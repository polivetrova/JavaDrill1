package L18;

public class Treadmill extends Obstacle{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString(){
        return "Treadmill distance = " + distance;
    }
}
