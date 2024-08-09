package com.rubenrdc.javaspringweb.models;

/**
 *
 * @author Ruben
 */
public class User {

    private String name;
    private String lastname;
    private String mail;

    public User() {
    }

    public User(String name, String lastname,String mail) {
        this.name = name;
        this.lastname = lastname;
        this.mail=mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
