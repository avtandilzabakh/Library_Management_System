package com.company;

public class User {
    private String fullName;
    private String age;
    private String mail;
    private String ID;

    public User(String fullName, String ID) {
        this.fullName = fullName;
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", mail='" + mail + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
