package com.example.volleylibraryeg_json;

public class User {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    private String name;
    private String username;
    private String email;

    public User(int id, java.lang.String name, java.lang.String username, java.lang.String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }


}





