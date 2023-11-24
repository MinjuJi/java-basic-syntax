package customerdataapp;

import java.text.MessageFormat;

public class Customer {
    private int no;
    private String id;
    private String password;
    private String name;
    private String email;
    private boolean deleted;

    public Customer() {

    }

    public Customer(int no, String id, String name, String email) {
        this.no = no;
        this.id = id;
        this.password = "zxcv1234";
        this.name = name;
        this.email = email;
        this.deleted = false;
    }

    public Customer(int no, String id, String password, String name, String email, boolean deleted) {
        this.no = no;
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.deleted = deleted;
    }

    public String toText() {
        return MessageFormat.format("{0},{1},{2},{3},{4},{5},{6}", no, id, password, name, email, deleted);
    }

    public static Customer toCustomer(String text) {
        String[] items = text.split(",");

        int no = Integer.valueOf(items[0]);
        String id = items[1];
        String password = items[2];
        String name = items[3];
        String email = items[4];
        boolean deleted = Boolean.valueOf(items[5]);

        return new Customer(no, id, password, name, email, deleted);
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getNo() {
        return no;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isDeleted() {
        return deleted;
    }
}
