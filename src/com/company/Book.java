package com.company;


    public class Book {
        String title;
        boolean borrowed;

        public Book() {

        }
        // Creates a new Book
        public Book(String bookTitle){
            this.title = bookTitle;
            this.borrowed = isBorrowed();
        }

        public String toString() {
            return "Book{title='" + this.title + "', borrowed=" + this.borrowed + "}";
        }



        // Marks the book as rented
        public void rented() {
            this.borrowed = true;
        }

        // Marks the book as not rented
        public void returned() {
            this.borrowed = false;
        }

        // Returns true if the book is rented, false otherwise
        public boolean isBorrowed() {
            return this.borrowed;
        }

//         Returns the title of the book
        public String getTitle() {
           return this.title;

        }

//        public static void main(String[] arguments) {
//


    }

