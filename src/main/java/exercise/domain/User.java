package exercise.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String status;

//    @Column(nullable = false, columnDefinition = "DATETIME")
//    @Temporal(TemporalType.TIMESTAMP)
//    @Type(type="timestamp")
//    private Date crDate;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

//    public Date getCrDate() {
//        return crDate;
//    }

    public void setUsername(String userName) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public void setCrDate(Date crDate) {
//        this.crDate = crDate;
//    }


}