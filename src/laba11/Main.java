package laba11;


import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            Thread thread =new MyThread("Thread "+i);
            thread.start();
            try{
                thread.join();
            }
            catch (InterruptedException e){
                throw new RuntimeException();
            }
        }

        Thread runnable = new Thread(new MyRunnable());
        System.out.println(runnable.getState());
        runnable.start();
        System.out.println(runnable.getState());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        System.out.println(runnable.getState());

        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            CountDownLatch latch = new CountDownLatch(1000);
            Thread countThread = new Thread(new CountThread(counter, latch));
            countThread.start();
            System.out.println(latch);
            try {
                latch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(counter.getCount());

        ThreadName thread1 = new ThreadName("Thread 1");
        ThreadName thread2 = new ThreadName("Thread 2");
        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}



