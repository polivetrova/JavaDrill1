package L113;

import java.util.concurrent.*;

public class MainClass {

    public static final int CARS_COUNT = 4;
    static final CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1);
    static final CountDownLatch cdStart = new CountDownLatch(CARS_COUNT);

    public static void main(String[] args) {

        System.out.println("ВНИМАНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));

        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }

        for (Car car : cars) {
            new Thread(car).start();
        }

        try {
            cdStart.await();
            System.out.println("ВНИМАНИЕ >>> Гонка началась!!!");
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВНИМАНИЕ >>> Гонка закончилась!!!");
            //System.out.println("В гонке победил " + Tunnel.getWinner());
        }
    }
}
