package thread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                // 현재 진행중인 스레드의 이름 획득하기
                String threadName = Thread.currentThread().getName();
                System.out.println("[" + threadName + "]" + i);

                int sleepTime = (int) (Math.random() * 2000);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {

            }
        }
    }
}
