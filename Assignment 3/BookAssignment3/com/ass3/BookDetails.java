package com.ass3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BookDetails {
	
	
    public static Book findBookById( int id, Book[] books) throws BookIdNotFoundException  {
        for (Book book : books) {
            if (book.getBookNo() == id) {
                return book;
            }
        }
        throw new  BookIdNotFoundException("Book ID " + id + " not found");
    }

	public static void main(String [] args) throws BookIdNotFoundException{
			
//			3.1
	        Book[] books = BookPages.inputBooksData();
	        for(int i = 0;i<3;i++) {
	        	books[i].display();
	        }
	        // 3.2
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter id of the book to find: ");
	        int id = sc.nextInt();
	        try {
	            Book b = findBookById(id, books);
	            b.display();
	        } catch (BookIdNotFoundException e) {
	            System.err.println("Error: " + e.getMessage());
	        }


	        // 3. Serialize books
//	        BookPages.serializeBooks(books1);

	        // 5. Update book 
	        //3.3
	        BookPages.updateBookDetails(sc);

	        // 6. Create sample book
	        BookPages.createAndPrintSampleBook();
	}
}
