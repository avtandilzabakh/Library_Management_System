package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Loan {
    private Book book;
    private User user;
    private Date loadDate;
    private Date returnDate;

    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.loadDate =new Date();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Load{" +
                "book=" + book +
                ", user=" + user +
                ", loadDate=" + loadDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
