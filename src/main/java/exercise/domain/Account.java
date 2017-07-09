package exercise.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String balance;

    @OneToOne
    @JoinColumn(name="USER")
    private User user;

    public String getBalance() {
        return balance;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setUser(User user) {
        this.user = user;
    }
}