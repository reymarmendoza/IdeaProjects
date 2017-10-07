package com.company;

/**
 * Created by reyma on 1/02/2017.
 */
public class DramaBook extends Book {

    private String time;
    private String place;
    //como hereda de un constructor que recibe parametros estos se los debo enviar al constructor padre con super
    public DramaBook(String title, String author, int yearOfPublication, String time, String place){
        super(title, author, yearOfPublication);
        this.time = time;
        this.place = place;
    }

    public String getTime(){
        return time;
    }

    public String getPlace(){
        return place;
    }

    public void print(){
        System.out.println("Time: " + time);
        System.out.println("Place: " + place);
    }

}
