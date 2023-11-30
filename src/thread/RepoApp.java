package thread;

public class RepoApp {
    public static void main(String[] args) {
        Repo repo = new Repo();

        Producer producer = new Producer(repo);
        Consumer consumer = new Consumer(repo);

        producer.start();
        consumer.start();
    }
}
