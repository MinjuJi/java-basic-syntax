package thread;

public class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
