/*
Carpet.java
Find the cost to carpet a room 8.5 m by 6 m if the carpet has a price of $19.95
per square meter. Display the answer in sentence form and use memory location
Created by: Lucas N-H
Created on: February 27, 2018
Last edited on: February 28, 2018
*/
package carpet;

public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double l, w, p;
        l = 8.5;
        w = 6;
        p = l*w*19.95;
        System.out.println("The price to carpet the room would be %"+p);
    }
}
