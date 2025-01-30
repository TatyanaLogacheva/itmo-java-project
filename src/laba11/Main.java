package laba11;


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
        int count = 100;
        for (int i = 0; i < 100; i++) {
            Thread countThread = new Thread(new CountThread(counter));
            countThread.start();
            try {
                countThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count--;
        }
        if (count == 0) {
            System.out.println(counter.getCount());
        }

        ThreadName thread1 = new ThreadName("Thread 1");
        ThreadName thread2 = new ThreadName("Thread 2");
        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}


