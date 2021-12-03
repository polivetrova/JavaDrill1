package L18;

public class Main {

    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Wall(1),
                new Wall(3),
                new Treadmill(500),
                new Treadmill(300)
        };

        Participant[] participants = {
                new Human(1000,1),
                new Cat(600,5), //cats' supremacy
                new Robot(400,8)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if(obstacle instanceof Treadmill && participant.canContinue()){
                    System.out.println(obstacle.toString());
                    participant.run((Treadmill) obstacle);
                } else if (obstacle instanceof Wall && participant.canContinue()){
                    System.out.println(obstacle.toString());
                    participant.jump((Wall) obstacle);
                } else if (!participant.canContinue()){
                    continue;
                }
            }
            System.out.println();
        }
    }
}
