package com.ass3;

public class Author {

    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender){
      this.name = name;
      this.email = email;
      this.gender = gender;
    }
    
    public void setGender(char g){
      this.gender = g;
    }
    public void setEmail(String e){
      this.email = e;
    }
    
    public void setAuthorName(String a){
      this.name = a;
    }
    
    public String getName(){
      return name;
    }
     public char getGender(){
      return gender;
    }
    public String getEmail(){
      return email;
    }
    
    
    
    
    
    
    

}