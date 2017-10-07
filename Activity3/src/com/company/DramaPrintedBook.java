package com.company;

/**
 * Las clases heredadas me permiten hacer uso de los metodos de los padres en las clases hijas por lo que puedo acceder a esos metodos como si estuviesen declarados en el hijo
 */
public class DramaPrintedBook extends DramaBook implements PrintedBook{

    private String dimensions;
    private String weight;

    public DramaPrintedBook(String title, String author, int yearOfPublication, String time, String place,  String weight, String dimensions){
        super(title, author, yearOfPublication, time, place);
        this.dimensions = dimensions;
        this.weight = weight;
    }

    @Override
    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    public void print(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Time: " + getTime());
        System.out.println("Place: " + getPlace());
        System.out.println("Weight:  " + weight);
        System.out.println("Dimensions:  " + dimensions);
    }
}
