package thread;

// 소비자
public class Consumer extends Thread {

    private Repo repo;

    public Consumer(Repo repo) {
        this.repo = repo;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                repo.consume();
            }
        } catch (Exception ex) {

        }
    }
}
