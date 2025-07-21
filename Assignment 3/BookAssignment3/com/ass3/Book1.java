package com.book;

//Book.java
public class Book1 {
 
 private String name;
 private Author author;
 private double price;
 private int qty;
 // private String gender;
 
 public Book1(String name,Author author, double price, int qty){
   this.name = name;
   this.author = author;
   this.price = price;
   this.qty = qty;
   // this.gender = gender;
 }
 
 
 
 // Default constructor
 // Book() {
 //     this.id = bookNo++;
 // }

 // Getters
 // public static int getBookCount() {
 //     return bookNo - 1;
 // }

 // public int getBookNo() { return bookNo; }
 public String getName() { return name; }
 // public String getAuthor() { return author; }
 public double getPrice() { return price; }
 public int getQty() { return qty; }

 // Setters



 public void setQty(int a) { this.qty = a; }

 public void setPrice(double p) {
     
     // this.isCorrectPrice = true;
     this.price = p;
 }



   @Override
 public String toString() {
     return "Book Details:\n" +
            "Book Name: " + name + " by " +
            "Author: " + author.getName() + "(" +author.getGender()+") " + " at " + author.getEmail();
            
 }
}
