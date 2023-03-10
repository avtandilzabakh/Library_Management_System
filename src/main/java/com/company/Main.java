package com.company;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        // Add some sample data to the library
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee",true));
        library.addBook(new Book("1984", "George Orwell", true));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", true));
        library.addUser(new User("mik ki" ,"1111"));
        library.addUser(new User("an mi" ,"2222"));


        library.loadBook(new Book("1984", "George Orwell", true),
                new User("mik ki" ,"1111"));
        System.out.println(library.getLoans());
        library.returnBook(new Book("1984", "George Orwell", true),
                new User("mik ki" ,"1111"));
        System.out.println(library.getLoans());
    }
}
