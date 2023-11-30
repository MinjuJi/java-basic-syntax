package thread;

public class Repo {

    private String data;

    public synchronized void produce(int index) throws Exception {
        if (data != null) {
            wait();
        }
        data = index + "번째 값";
        System.out.println("[" + index + "]번째 값을 공급하다.");
        notify();    // 소비자의 일시정지를 해제한다.
    }

    public synchronized void consume() throws Exception {
        if (data == null) {
            wait();
        }
        System.out.println("[" + data + "]를 소비하다.");
        data = null;
        notify();
        System.out.println();
    }
}
