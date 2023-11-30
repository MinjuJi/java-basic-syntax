package thread;

import java.util.Vector;

public class HorseRunnableApp {
    public static void main(String[] args) throws Exception {
        HorseRunnable runnable = new HorseRunnable();

        Thread t1 = new Thread(runnable, "번개");
        Thread t2 = new Thread(runnable, "맹호");
        Thread t3 = new Thread(runnable, "천둥");
        Thread t4 = new Thread(runnable, "백호");
        Thread t5 = new Thread(runnable, "한라");
        Thread t6 = new Thread(runnable, "금강");

        System.out.println("경주를 시작합니다.");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();

        System.out.println("경주를 종료합니다.");

        Vector<String> names = runnable.getNames();
        System.out.println("경기 결과");
        System.out.println("1등: " + names.get(0));
        System.out.println("2등: " + names.get(1));
        System.out.println("3등: " + names.get(2));
        System.out.println("4등: " + names.get(3));
        System.out.println("5등: " + names.get(4));
        System.out.println("6등: " + names.get(5));
    }
}