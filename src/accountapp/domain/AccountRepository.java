package accountapp.domain;

public class AccountRepository {
    Account[] db = new Account[100];
    int savePosition = 0;

    public AccountRepository() {
        db[savePosition++] = new Account("11-11", "이순신", 1234, 2_000_000);
        db[savePosition++] = new Account("11-22", "삼순신", 1234, 3_000_000);
        db[savePosition++] = new Account("11-33", "사순신", 1234, 4_000_000);
        db[savePosition++] = new Account("11-44", "오순신", 1234, 5_000_000);
        db[savePosition++] = new Account("11-55", "육순신", 1234, 6_000_000);
        db[savePosition++] = new Account("11-66", "칠순신", 1234, 7_000_000);
    }

    /**
     * 전체 계좌정보를 반환한다.
     *
     * @return 모든 계좌정보가 포함된 배열 객체
     */
    public Account[] findAll() {
        Account[] result = new Account[savePosition];
        for (int i = 0; i < savePosition; i++) {
            result[i] = db[i];
        }
        return result;
//        return db; // 사용 시 null값 고려해야 함
    }

    /**
     * 계좌번호를 전달받아서 일치하는 계좌정보를 반환한다.
     *
     * @param accNo 조회할 계좌번호
     * @return 계좌정보, 일치하는 계좌번호가 없는 경우 null이 반환될 수 있다.
     */
    public Account findAccountByAccNo(String accNo) {
        Account account = null;
        for (Account acc : db) {
            if (acc == null) {
                break;
            }
            if (acc.accNo.equals(accNo)) {
                account = acc;
                break;
            }
        }
        return account;
    }

    /**
     * 신규 계좌정보를 전달받아서 저장시킨다.
     *
     * @param account 신규 계좌정보
     */
    public void save(Account account) {
        db[savePosition++] = account;
    }

    /**
     * 계좌본호를 전달받아서 해당 계좌정보를 삭제한다.
     *
     * @param accNo
     */
    public void remove(String accNo) {
        int findIndex = -1;
        for (int index = 0; index < savePosition; index++) {
            Account acc = db[index];
            if (acc.accNo.equals(accNo)) {
                findIndex = index;
                break;
            }
        }
        int beginIndex = findIndex + 1;
        for (int index = beginIndex; index < savePosition; index++) {
            db[index - 1] = db[index];
        }
        db[savePosition - 1] = null;
        savePosition--;
    }
}
