public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Worker thread execution started!" + Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" " + i);
        }
        System.out.println("Worker thread execution ended!" + Thread.currentThread().getName());
    }
}
