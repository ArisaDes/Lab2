package com.basht.example;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        String git100 = this.name;
        char git101 = this.gender;
        return this.email;
    }
}