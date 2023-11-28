package customerdataapp;

import java.util.List;

public class CustomerService {
    private CustomerRepository repo = new CustomerRepository();

    public CustomerService() {
        repo.load();
    }

    /**
     * 모든 고객 정보를 반환한다.
     *
     * @return 고객 리스트
     */
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    /**
     * 신규 고객 정보를 전달받아서 등록시키니다.
     * 업무로직
     * - 고객번호로 고객정보를 조회한다. 고객정보가 존재하면 예외를 발생시킨다.
     * - 고객아이디로 고객정보를 조회한다. 고객정보가 존재하면 예외를 발생시킨다.
     * - 고객정보가 존재하지 않으면 신규 고객 정보를 등록시킨다.
     *
     * @param customer 신규 고객정보
     */
    public void addNewCustomer(Customer customer) {
        Customer savedCustomer = repo.findByNo(customer.getNo());
        if (savedCustomer != null) {
            throw new ShopException("고객번호는 이미 사용중입니다.");
        }
        savedCustomer = repo.findNyId(customer.getId());
        if (savedCustomer != null) {
            throw new ShopException("아이디는 이미 사용중입니다.");
        }
        repo.save(customer);
    }

    /**
     * 지정된 번호의 고객정보를 반환한다.
     *
     * @param no
     * @return
     */
    public Customer getCustomer(int no) {
        Customer customer = repo.findByNo(no);
        if (customer == null) {
            throw new ShopException("지정된 고객번호에 해당하는 고객정보가 존재하지 않습니다.");
        }

        return customer;
    }

    /**
     * 고객의 비밀번호를 변경한다.
     *
     * @param no          고객번호
     * @param password    현재 비밀번호
     * @param newPassword 새 비밀번호
     */
    public void changePassword(int no, String password, String newPassword) {
        Customer customer = getCustomer(no);

        if (!customer.getPassword().equals(password)) {
            throw new ShopException("비밀번호가 일치하지 않습니다.");
        }
        if (password.equals(newPassword)) {
            throw new ShopException("이전 비밀번호와 같은 비밀번호로 변경할 수 없습니다.");
        }

        customer.setPassword(newPassword);

        repo.store();
    }

    /**
     * 지정된 고객 정보를 삭제합니다.
     *
     * @param no       고객번호
     * @param password 비밀번호
     */
    public void deleteCustomer(int no, String password) {
        Customer customer = getCustomer(no);
        if (!customer.getPassword().equals(password)) {
            throw new ShopException("비밀번호가 일치하지 않습니다.");
        }
        repo.deleteByNo(no);
        repo.store();
    }
}