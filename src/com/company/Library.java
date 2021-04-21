package com.company;


import java.util.*;

public class Library {

    // Add the missing implementation to this class
    String libraryAddress;
    ArrayList<Book> books;

    public Library(String address) {
        this.libraryAddress = address;
        this.books = new ArrayList();
    }

    public void addBook(Book book) {
      this.books.add(book);
    }

    public void returnBook(String bookTitle) {
        boolean found = false;

        for(int i = 0; i < this.books.size(); ++i) {
            Book libraryBook = (Book)this.books.get(i);
            String libraryBookTitle = libraryBook.getTitle();
            if (libraryBookTitle.equals(bookTitle)) {
                if (libraryBook.isBorrowed()) {
                    libraryBook.returned();
                    System.out.println("Returned accepted: " + libraryBookTitle + "!");
                    found = true;
                    break;
                }

                if (!found) {
                    System.out.println("Sorry that book is not in our system? I'll keep checking!");
                }
            }
        }

    }

    public void printAvailableBooks() {
        boolean libraryIsEmpty = true;

        for(int i = 0; i < this.books.size(); ++i) {
            Book libraryBook = (Book)this.books.get(i);
            if (!libraryBook.isBorrowed()) {
                System.out.println(libraryBook.getTitle());
                libraryIsEmpty = false;
            }
        }

        if (libraryIsEmpty) {
            System.out.println("Sorry, our catalog is empty");
        }

    }


    public void borrowBook(String BookTitle) {
        for(int i = 0; i < this.books.size(); ++i) {
            Book libraryBook = (Book)this.books.get(i);
            String libraryBookTitle = libraryBook.getTitle();
            if (libraryBookTitle.equals(books)) {
                if (!libraryBook.isBorrowed()) {
                    libraryBook.rented();
                    System.out.println("We have " + libraryBookTitle + ", and you have successfully borrowed it!");

                }
                System.out.println("Someone else has " + libraryBookTitle + " right now ");

            }
        }

        System.out.println("Your book was not found in our system, sorry.");

    }


    public void printAddress() {
        System.out.println(this.libraryAddress);


    }


    private static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");


    }


}


