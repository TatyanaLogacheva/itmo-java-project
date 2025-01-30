package laba11;

public class ThreadName extends Thread {
    final static private Object lock = new Object();
    private String name;
    boolean flag = true;

    public ThreadName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            synchronized (lock) {
                while (flag) {
                    try {
                        lock.notify();
                        lock.wait();

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    flag = false;
                }
                System.out.println(name);
                lock.notifyAll();
                flag = true;
            }


        }
    }
}

