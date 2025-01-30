package laba11;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

    }
}
