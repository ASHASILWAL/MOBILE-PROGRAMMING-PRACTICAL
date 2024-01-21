package com.example.sqliteeg_database;

public class Contact {

    int id;
    String name;
    String phone;

    public String toString()
    {
        return "ID : " + id +  ", Name : " + name + " ,Phone : " +phone ;

    }

    public Contact(){

    }

    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

