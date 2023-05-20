package model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private Instant lastLogin;
    @Column
    private String firstName;
    @Column
    private String lastName;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Instant getLastLogin() {
//        return lastLogin;
//    }
//
//    public void setLastLogin(Instant lastLogin) {
//        this.lastLogin = lastLogin;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public User(){
//
//    }
//
//    public User(Long id, String username, String password, String email, Instant lastLogin, String firstName, String lastName) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.lastLogin = lastLogin;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
}
