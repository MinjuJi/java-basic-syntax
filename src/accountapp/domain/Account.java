package accountapp.domain;

/**
 * 은행 계좌 정보를 표현하는 클래스
 */
public class Account {
    public String accNo;           // 계좌정보
    public String owner;           // 예금주명
    public int password;           // 비밀번호
    public long balance;           // 잔액
    public double interestRate;    // 이자율
    public boolean expired;        // 폐기여부

    public Account(String accNo, String owner, int password, long amount) {
        this.accNo = accNo;
        this.owner = owner;
        this.password = password;
        this.balance = amount;
        this.interestRate = 0.05;
    }

    public void display() {
        System.out.printf("%s \t %s \t %,d\n", accNo, owner, balance);
    }

    public void displayDetail() {
        System.out.println("\n*** 계좌 상세 정보 ***");
        System.out.println("  계좌정보: " + accNo);
        System.out.println("  예금주명: " + owner);
        System.out.println("  비밀번호: " + password);
        System.out.println("  현재잔액: " + balance);
        System.out.println("  적립이율: " + interestRate);
        System.out.println("  폐기여부: " + expired);
        System.out.println("******************\n");
    }
}
