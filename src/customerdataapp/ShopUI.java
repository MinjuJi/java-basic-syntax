package customerdataapp;

import java.util.List;

public class ShopUI {
    // CustomerService 객체, Scanner 객체에 의존하기 떄문에 해당 객체와 연결할 멤버변수를 정의한다.
    private CustomerService service;
    private Scanner scanner;

    public ShopUI() {
        service = new CustomerService();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n------------------------------------------");
        System.out.println("1.전체조회 2.상세조회 3.등록 4.변경 5.삭제 0.종료");
        System.out.println("------------------------------------------");

        System.out.print("메뉴선택: ");
        int menuNo = scanner.nextInt();

        try {
            switch (menuNo) {
                case 1 -> 전체조회();
                case 2 -> 상세조회();
                case 3 -> 등록();
                case 4 -> PW변경();
                case 5 -> 삭제();
                case 0 -> 종료();
            }
        } catch (ShopException e) {
            System.out.println("오류: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("오류: " + e.getMessage());
        }
        showMenu();
    }

    private void 전체조회() {
        System.out.println("\n[ 전체조회 ]");
        List<Customer> customers = service.getAllCustomers();
        if (customers.isEmpty()) {
            System.out.println("등록된 고객이 없습니다.\n");
            return;
        }
        System.out.println("고객변호\t아이디\t고객명");
        for (Customer customer : customers) {
            System.out.print(customer.getNo() + "\t");
            System.out.print(customer.getId() + "\t");
            System.out.println(customer.getName());
        }
    }

    private void 상세조회() {
        System.out.println("\n[ 상세조회 ]");

        System.out.println("조회할 고객의 번호를 입력하세요.");
        System.out.print("고객번호: ");
        int no = scanner.nextInt();

        Customer customer = service.getCustomer(no);

        System.out.println("-------------------------------");
        System.out.println("고객번호: " + customer.getNo());
        System.out.println("아이디: " + customer.getId());
        System.out.println("이름: " + customer.getName());
        System.out.println("이메일: " + customer.getEmail());
        System.out.println("탈퇴여부: " + customer.isDeleted());
        System.out.println("-------------------------------");

        System.out.println("고객 상세정보 조회가 완료되었습니다.\n");
    }

    private void 등록() {
        System.out.println("\n[ 신규 고객 등록 ]");
        System.out.println("고객번호, 아이디, 이름, 이메일을 입력하세요.");

        System.out.print("고객번호: ");
        int no = scanner.nextInt();

        System.out.print("아이디: ");
        String id = scanner.nextString();

        System.out.print("이름: ");
        String name = scanner.nextString();

        System.out.print("이메일: ");
        String email = scanner.nextString();

        Customer customer = new Customer(no, id, name, email);
        service.addNewCustomer(customer);

        System.out.println("신규 고객 등록이 완료되었습니다.\n");
    }

    private void PW변경() {
        System.out.println("\n[ 고객 비밀번호 변경 ]");
        System.out.println("고객번호, 비밀번호를 입력해서 고객 비밀번호를 변경하세요.");

        System.out.print("고객번호: ");
        int no = scanner.nextInt();

        System.out.print("현재 비밀번호:  ");
        String password = scanner.nextString();

        System.out.print("새 비밀번호: ");
        String newPassword = scanner.nextString();

        service.changePassword(no, password, newPassword);
        System.out.println("비밀번호 변경이 완료되었습니다.\n");
    }

    private void 삭제() {
        System.out.println("\n[ 고객 정보 삭제 ]");
        System.out.println("고객번호와 비밀번호를 입력하고 삭제하세요.");

        System.out.print("고객번호: ");
        int no = scanner.nextInt();

        System.out.print("비밀번호: ");
        String password = scanner.nextString();

        service.deleteCustomer(no, password);
        System.out.println("고객 정보가 삭제되었습니다.\n");
    }

    private void 종료() {
        System.exit(0);
    }

    public static void main(String[] args) {
        ShopUI ui = new ShopUI();
        ui.showMenu();
    }
}