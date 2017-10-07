package com.company;

/**
 * Created by reyma on 1/02/2017.
 */
public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook {
    private int numberOfTracks;
    private String size;

    public ScienceFictioneAudioBook(String title, String author, int yearOfPublication, String subject, int numberOfTracks, String size){
        super(title, author, yearOfPublication, subject);
        this.numberOfTracks = numberOfTracks;
        this.size = size;
    }

    @Override
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String getSize() {
        return size;
    }

    public void print(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Subject: " + getSubject());
        System.out.println("Number of Tracks: " + numberOfTracks);
        System.out.println("Size:  " + size);
    }

}
