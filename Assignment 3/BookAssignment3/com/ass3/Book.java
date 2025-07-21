package com.ass3;

//Book.java
public class Book {
 private static int bookNo = 101;
 private int id;
 private String title;
 private String author;
 private float price;
 private static String Copyright = "These are the Copyright rules";
 private String publisher;
 private Boolean isCorrectPrice = false;
 private Boolean isCorrectTitle = false;

 // Default constructor
 Book(String title,String author,float price,String publisher) {
     this.id = bookNo++;
     this.title = title;
     this.author = author;
     this.price = price;
     this.publisher = publisher;
     this.Copyright = Copyright;
 }

 // Getters
 public static int getBookCount() {
     return bookNo - 1;
 }

 public int getBookNo() { return id; }
 public String getTitle() { return title; }
 public String getAuthor() { return author; }
 public float getPrice() { return price; }
 public String getCopyRight() { return Copyright; }
 public String getPublisher() {return publisher;}
 // Setters
 public void setBookNo(int bn) { bookNo = bn; }
 public void setTitle(String t) {
     // if (t.length() >= 4) {
     //     this.title = t;
     //     this.isCorrectTitle = true;
     // } else {
     //     System.err.println("Title must have at least 4 characters");
     // }
 }

 public void setAuthor(String a) { this.author = a; }

 public void setPrice(float p) {
     if (p < 1 || p > 5000) {
         System.err.println("Price must be in range of 1 to 5000");
         return;
     }
     this.isCorrectPrice = true;
     this.price = p;
 }

 public void setPublisher(String p) { this.publisher = p; }
 // public void setId(int s)
 public void display() {
	   if (title.length() >= 4) {
	         // this.title = t;
	         this.isCorrectTitle = true;
	   } 
	   if (price >= 1 && price <= 5000) {
	         this.isCorrectPrice = true;
	   }
	     
	 System.out.println("\n---------------------------------------------------------------");
	 System.out.printf("%-10s %-30s %-20s %-10s %-15s %-10s\n", 
	                   "Book No", "Title", "Author", "Price", "Publisher", "Copyright");
	 System.out.println("---------------------------------------------------------------");
	 int bookNo = getBookNo();
	 String bookTitle = isCorrectTitle ? getTitle() :  "Title must have at least 4 characters";
	 String bookAuthor = getAuthor();
	 float bookPrice = isCorrectPrice ? getPrice() : 0;
	 String bookPublisher = getPublisher();
	 String bookCopyright = getCopyRight();
	
	 System.out.printf("%-10s %-30s %-20s %-10s %-15s %-10s\n",
	                   bookNo, bookTitle, bookAuthor, bookPrice, bookPublisher, bookCopyright);
}

}
