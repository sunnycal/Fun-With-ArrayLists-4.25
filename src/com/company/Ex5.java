/*
1.Using the array list

2. prompt the user for colors

2a.until they type in "Q" or "q" to quit.

3. Each time the user
enters a color, add that to the array list.

4. Print out the list at the end.
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        // initialize Arraylist
        ArrayList<String> color = new ArrayList<>();

        //colors in Arraylist
        color.add("Turquois");
        color.add("Ecru");
        color.add("Emerald");

        //prompting user for data through keyboard
        Scanner keybd = new Scanner(System.in);

        //prompt user to type
        System.out.println("Please enter a color");

        String userinput = keybd.nextLine();

        //storing new color
        color.add(userinput);

        // start loop here

        //prompting user to type
        System.out.println("Please add 1 new color");

        //adding color to system
        color.add(userinput);

        System.out.println("Enter a color or Q to quit: ");
        userinput = keybd.nextLine();
        while (!userinput.equalsIgnoreCase("Q")) {
            color.add(userinput);
            System.out.println("Do you want to enter another color? or press Q to quit");
            userinput = keybd.nextLine();
        }
        System.out.print("Program has ended!");
    }
}











