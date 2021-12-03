package L18;

public interface Participant {

    boolean canContinue();
    void run(Treadmill treadmill);
    void jump(Wall wall);
}
