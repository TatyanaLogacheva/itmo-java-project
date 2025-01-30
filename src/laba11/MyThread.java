package laba11;

public class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.print(MyThread.currentThread().getName() + ": ");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
