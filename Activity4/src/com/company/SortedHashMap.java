package com.company;

import java.util.HashMap;

/**
 * Created by reyma on 10/02/2017.
 */
public class SortedHashMap {

    public static void main(String[] args) {

        String[] toys = new String[9];
        toys[0] = "Buzz Lightyear";
        toys[1] = "Sheriff Woody";
        toys[2] = "Mr. Potato Head";
        toys[3] = "Barbie";
        toys[4] = "Troll doll";
        toys[5] = "Tonka Truck";
        toys[6] = "Elmo";
        toys[7] = "Big bird";
        toys[8] = "Cookie Monster";

        //Make a list of lists or hashmap to classify the toys.
        //Then sort the list of lists or hashmap ascendingly
        //Print each value

        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < toys.length; i++) {
            hm.put(i, toys[i]);
            System.out.println(hm.get(i));
        }

    }
}
