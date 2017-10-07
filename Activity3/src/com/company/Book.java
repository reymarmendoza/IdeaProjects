package com.company;

/**
 * Created by reyma on 1/02/2017.
 */
public class Book {

    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + yearOfPublication);
    }

}
