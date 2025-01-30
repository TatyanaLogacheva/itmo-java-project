package laba11;

import java.util.concurrent.CountDownLatch;

public class CountThread implements Runnable {
    Counter count;
    private CountDownLatch latch;

    CountThread(Counter count, CountDownLatch latch) {
        this.count = count;
        this.latch = latch;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            count.increment();
            latch.countDown();
        }
    }
}
