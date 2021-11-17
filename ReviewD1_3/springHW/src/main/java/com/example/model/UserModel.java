package com.example.model;

public class UserModel {
    private String username;
    private String password;
    private int active;

    public UserModel(String username, String password, int active) {
        this.username = username;
        this.password = password;
        this.active = active;
    }

    public UserModel() {
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

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
}
