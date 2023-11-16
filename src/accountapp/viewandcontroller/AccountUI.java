package accountapp.viewandcontroller;

import accountapp.domain.Account;
import java.util.Scanner;
import accountapp.service.AccountService;

public class AccountUI {
    AccountService service = new AccountService();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.printf("\n%5s\n", "+--------+");
        System.out.printf("|1.%4s%s\n", "전체조회", "|");
        System.out.printf("|2.%4s%s\n", "상세조회", "|");
        System.out.printf("|3.%4s%s\n", "신규가입", "|");
        System.out.printf("|4.%4s%s\n", "입금하기", "|");
        System.out.printf("|5.%4s%s\n", "출금하기", "|");
        System.out.printf("|6.%4s%s\n", "비밀번호", "|");
        System.out.printf("|7.%4s%s\n", "해지하기", "|");
        System.out.printf("|0.%4s%s\n", "종료하기", "|");
        System.out.printf("%5s\n", "+--------+");
        System.out.print("메뉴선택: ");
        int menuNo = scanner.nextInt();

        if (menuNo == 1) {
            전체조회();
        }
        if (menuNo == 2) {
            상세조회();
        }
        if (menuNo == 3) {
            신규();
        }
        if (menuNo == 4) {
            입금();
        }
        if (menuNo == 5) {
            출금();
        }
        if (menuNo == 6) {
            비밀번호변경();
        }
        if (menuNo == 7) {
            해지();
        }
        if (menuNo == 0) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
        menu();
    }

    public void 전체조회() {
        System.out.println("\n전체 계좌 정보 조회\n");

        Account[] accounts = service.getAllAccounts();
        System.out.println("계좌번호 \t 예금주 \t 현재 잔액");
        for (Account acc : accounts) {
            acc.display();
        }
    }

    public void 상세조회() {
        System.out.println("\n계좌 상세 정보 조회\n");
        System.out.print("조회할 계좌번호: ");
        String accNo = scanner.next();

        Account account = service.getAccount(accNo);
        if (account == null) {
            System.out.println("조회할 계좌번호가 없습니다.");
        }
        if (account != null) {
            account.displayDetail();
        }
    }

    public void 신규() {
        System.out.println("\n신규 계좌 개설\n");
        System.out.println("신규 계좌 개설에 필요한 정보를 입력하세요.\n");

        System.out.print("계좌번호 입력: ");
        String accNo = scanner.next();

        System.out.print("예금주명 입력: ");
        String owner = scanner.next();

        System.out.print("비밀번호 입력: ");
        int password = scanner.nextInt();

        System.out.print("최초금액 입력: ");
        long amount = scanner.nextLong();

        Account account = new Account(accNo, owner, password, amount);
        boolean succeed = service.createAccount(account);
        if (succeed) {
            System.out.println("신규 계좌개설이 완료되었습니다.");
        }
        if (!succeed) {
            System.out.println("신규 계좌개설이 실패하였습니다.");
        }
    }

    public void 입금() {
        System.out.println("\n입금하기\n");
        System.out.println("계좌번호와 입금액을 입력하세요.\n");

        System.out.println("계좌번호 입력: ");
        String accNo = scanner.next();

        System.out.println("입금액 입력: ");
        long amount = scanner.nextLong();

        boolean succeed = service.deposit(accNo, amount);
        if (succeed) {
            System.out.println("입금이 완료되었습니다.");
        }
        if (!succeed) {
            System.out.println("입금처리 중 오류가 발생하였습니다.");
        }
    }

    public void 출금() {

    }

    public void 비밀번호변경() {
        System.out.println("\n계좌비밀번호 변경\n");
        System.out.println("비밀번호 변경에 필요한 계좌번호, 이전 비밀번호, 새 비밀번호를 입력하세요.\n");

        System.out.print("계좌번호 입력: ");
        String accNo = scanner.next();

        System.out.print("이전 비밀번호 입력 : ");
        int oldPwd = scanner.nextInt();

        System.out.print("새 비밀번호 입력 : ");
        int newPwd = scanner.nextInt();

        boolean succeed = service.changePassword(accNo, oldPwd, newPwd);
        if (succeed) {
            System.out.println("비밀번호 변경이 완료되었습니다.");
        }
        if (!succeed) {
            System.out.println("비밀번호 변경 중 오류가 발생하였습니다.");
        }
    }

    public void 해지() {
        System.out.println("\n계좌 해지\n");
        System.out.println("계좌번호와 비밀번호를 입력하세요.\n");

        System.out.println("계좌번호 입력: ");
        String accNo = scanner.next();

        System.out.println("비밀번호 입력: ");
        int password = scanner.nextInt();

        boolean succeed = service.expire(accNo, password);
        if (succeed) {
            System.out.println("해지처리 되었습니다.");
        }
        if (!succeed) {
            System.out.println("해지처리 중 오류가 발생하였습니다.");
        }
    }
}
