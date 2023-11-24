package io;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 5646376782616478616L;
    private transient int no;
    private String id;
    private transient String password;
    private String email;

    public User(int no, String id, String password, String email) {
        this.no = no;
        this.id = id;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
    }
}