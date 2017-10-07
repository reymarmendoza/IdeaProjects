package com.company;

import java.util.ArrayList;

/**
 * Created by reyma on 10/02/2017.
 */
public class ComputerBrands {

    public static void main(String[] args) {
        ArrayList<String> computerBrands = new ArrayList<>();

        computerBrands.add("Apple");
        computerBrands.add("Acer");
        computerBrands.add("Samsung");
        computerBrands.add("Asus");
        computerBrands.add("Sony");
        computerBrands.add("Dell");
        computerBrands.add("Hewlett-Packard");
        computerBrands.add("Asus");
        computerBrands.add("Apple");
        computerBrands.add("Acer");
        computerBrands.add("Toshiba");
        computerBrands.add("Sony");
        computerBrands.add("Samsung");

        for (int i = 0; i < computerBrands.size(); i++) {
            for (int j = i + 1; j < computerBrands.size(); j++) {
                if (computerBrands.get(i).equals(computerBrands.get(j))) {
                    computerBrands.remove(j);
                }
            }
        }

        for (int i = 0; i < computerBrands.size(); i++) {
            System.out.println(computerBrands.get(i));
        }

    }
}
