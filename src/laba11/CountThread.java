package laba11;

public class CountThread implements Runnable {
    Counter count;

    CountThread(Counter count) {
        this.count = count;
    }

    @Override
    public void run() {
        synchronized (count){
                    for (int i = 0; i < 1000; i++) {
                        count.increment();
                    }

        }
    }
}
