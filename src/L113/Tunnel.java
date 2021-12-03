package L113;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import static L113.MainClass.CARS_COUNT;

public class Tunnel extends Stage {

    Semaphore semaphore = new Semaphore(Math.round(CARS_COUNT / 2F)); //  В тоннель не может одновременно заехать больше половины участников
    CountDownLatch finishCD = new CountDownLatch(CARS_COUNT);
    private String winner;

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                semaphore.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if(finishCD.getCount() == CARS_COUNT){
                    winner = c.getName();
                }
                finishCD.countDown();

                System.out.println(c.getName() + " закончил этап: " + description);
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getWinner() {
        return winner;
    }
}