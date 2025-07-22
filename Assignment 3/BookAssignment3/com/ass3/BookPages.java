package com.ass3;

import java.io.*;
import java.util.Scanner;



public class BookPages {

//    public static Book1[] inputBooks(Scanner sc) {
//        Book1[] books = new Book1[3];
//
//        for (int i = 0; i < 3; i++) {
//            String name = sc.next();
//            String email = sc.next();
//            char gender = sc.next().charAt(0);
//            Author a1 = new Author(name, email, gender);
//
//       1     double price = sc.nextDouble();
//            int qty = sc.nextInt();
//
//            books[i] = new Book1(name, a1, price, qty);
//        }
//
//        return books;
//    }
//    
        public static Book[] inputBooksData() {
            Scanner sc = new Scanner(System.in);
            Book[] books = new Book[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter details for Book " + (i + 1) + ":");

                System.out.print("Title: ");
                String title = sc.nextLine();

                System.out.print("Author: ");
                String author = sc.nextLine();

                System.out.print("Price: ");
                float price = sc.nextFloat();
                sc.nextLine(); // consume leftover newline

                System.out.print("Publisher: ");
                String publisher = sc.nextLine();

                books[i] = new Book(title, author, price, publisher);
                System.out.println(); // Blank line for readability
            }

            return books;
        }
    


    public static void serializeBooks(Book1[] books) {
        try {
            FileOutputStream fos = new FileOutputStream("BookDetails.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(books);
            oos.close();
            fos.close();
            System.out.println("Array of students serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }



    public static void updateBookDetails(Scanner sc) {
//    	Scanner sc = new Scanner(System.in);

    	// Input for Author
    	System.out.print("Enter Author Name: ");
    	String authorName = sc.nextLine();

    	System.out.print("Enter Author Email: ");
    	String authorEmail = sc.nextLine();

    	System.out.print("Enter Author Gender (M/F): ");
    	char gender = sc.nextLine().charAt(0);

    	// Create Author object
    	Author a = new Author(authorName, authorEmail, gender);

    	// Input for Book
    	System.out.print("Enter Book Title: ");
    	String title = sc.nextLine();

    	System.out.print("Enter Book Price: ");
    	double price = sc.nextDouble();
    	sc.nextLine(); // consume the leftover newline

    	System.out.print("Enter Book Publisher: ");
    	String publisher = sc.nextLine();

    	// Create Book1 objects
    	Book1 b1 = new Book1(title, a, price, 1);
    	Book1 b2 = new Book1(title, a, price, 2);

    	// Display the books
    	System.out.println("Book 1 Details:");
    	System.out.println(b1);
    	System.out.println("Book 2 Details:");
    	System.out.println(b2);

    }
//
    public static void createAndPrintSampleBook() {
        Author a = new Author("Abhinav", "abhinavssr2003@gmail.com", 'M');
        Book1 b1 = new Book1("BookName", a, 10000, 1);
        System.out.println(b1);
    }




    public static boolean searchBook(int bookNo, Book[] books) {
        for (Book book : books) {
            if (book.getBookNo() == bookNo) {
                return true;
            }
        }
        return false;
    }
}
