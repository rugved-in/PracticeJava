public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Worker thread execution started! Thread:" + Thread.currentThread().getName());
        for (int i = 0; i < 300; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" " + i + "on Thread: " + Thread.currentThread().getName());

        }
        System.out.println("Worker thread execution ended! Thread:" + Thread.currentThread().getName());
    }
}
