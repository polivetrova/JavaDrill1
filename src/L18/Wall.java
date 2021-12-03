package L18;

public class Wall extends Obstacle{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return "Wall height = " + height;
    }
}
