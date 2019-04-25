package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //name of arraylist is color
        ArrayList<String> color  = new ArrayList <>();

        //names of colors in arraylist
        color.add("Blue");
        color.add("Yellow");
        color.add("Green");

        //prompting system to accept input via the keyboard
        Scanner keybd = new Scanner(System.in);

        //prompting user to type
        System.out.println("Please add 1 new color : ");

        //storing what the user types
        String userinput = keybd.nextLine();

        //priting out what the user inputs
        System.out.println(userinput);

        //storing new color to the arraylist
        color.add(userinput);

        //
        System.out.println(color);


    }
}
