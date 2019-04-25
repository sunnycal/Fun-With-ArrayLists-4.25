package com.company;

import java.util.ArrayList;

public class Ex3{



    public static void main(String[] args) {

        //name of arraylist
        ArrayList<String> color = new ArrayList<>();

        //name of colors in arraylist
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        //telling system what to output
        System.out.println("content of colors: " + color.get(1));

    }

}
