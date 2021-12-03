package L18;

public class Robot implements Participant{

    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean canContinue = true;

    public Robot(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(Treadmill treadmill) {
        if(treadmill.getDistance() <= maxRunDistance){
            System.out.println("Robot runs " + treadmill.getDistance() + "m on the treadmill");
        } else {
            System.out.println("Robot failed to run the distance and drops out of the contest");
            canContinue = false;
        }
    }

    @Override
    public void jump(Wall wall) {
        if(wall.getHeight() <= maxJumpHeight){
            System.out.println("Robot jumps over the wall (" + wall.getHeight() +"m)");
        } else {
            System.out.println("Robot failed to jump over the wall and drops out of the contest");
            canContinue = false;
        }
    }

    @Override
    public boolean canContinue() {
        return canContinue;
    }
}
