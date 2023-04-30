package com.example.sql2.entity;
import java.sql.Timestamp;

public class user {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Timestamp userAddTime;
    private Timestamp userUpdateTime;

    public user() {
    }

    // Getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Timestamp getUserAddTime() {
        return userAddTime;
    }

    public void setUserAddTime(Timestamp userAddTime) {
        this.userAddTime = userAddTime;
    }

    public Timestamp getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Timestamp userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }
    @Override  public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", userAddTime=" + userAddTime +
                ", userUpdateTime=" + userUpdateTime +
                '}';
    }
}