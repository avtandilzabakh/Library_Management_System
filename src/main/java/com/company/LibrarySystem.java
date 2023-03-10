package com.company;

import java.util.ArrayList;
import java.util.Date;

public class LibrarySystem {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.removeIf(book1 -> book.getAuthor().equals(book1.getAuthor())&&
                book.getTitle().equals(book1.getTitle()));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.removeIf(user1 -> user.getFullName().equals(user1.getFullName()) &&
                user.getID().equals(user1.getID()));
    }

    public void loadBook(Book book, User user) {
        book.setAvailable(false);
        loans.add(new Loan(book, user));
    }
    public void returnBook(Book book,User user){
        for (Loan loan : loans) {
            if (loan.getBook().getTitle().equals(book.getTitle()) && loan.getReturnDate() == null){
        book.setAvailable(true);
                loan.setReturnDate(new Date());
            }
        }
    }

    public ArrayList<Book> searchBooks(String query) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(query.toLowerCase())){
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "LibrarySystem{" +
                "books=" + books +
                ", users=" + users +
                ", loans=" + loans +
                '}';
    }
}
