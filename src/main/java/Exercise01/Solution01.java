/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise01;

//Sets up Scanner
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanName = new Scanner(System.in);

        //Sets up strings we will be using
        String name;

        //Prompts user for input
        System.out.println("What is your name?");
        //Scans users input
        name = ScanName.nextLine();
        //Prints out final output
        System.out.println("Hello, " + name + ", nice to meet you ");
    }
}
