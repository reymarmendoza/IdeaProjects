package com.company;

/**
 * Created by reyma on 1/02/2017.
 */
public class ScienceFictionBook extends Book{

    private String subject;

    public ScienceFictionBook(String title, String author, int yearOfPublication, String subject){
        super(title, author, yearOfPublication);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void print(){
        System.out.println("Subject: " + subject);
    }
}
