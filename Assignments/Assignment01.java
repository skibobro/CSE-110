
// CSE 110     : <Class #14869> / <Ali Altunkaya>
// Assignment  : <assignment #1>
// Author      : <Zack Spate> & <1222898651>
// Description : <Zack's Awesome Pizza Party>
/* <Assignment 1 using strings, math operators, and scanner statements 
to write a program that solves the age old dilemea of how to share a pizza> */

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {  

        try (Scanner keyboard = new Scanner(System.in)) {
            int pizzapurch;
               // # of pizza(s) purchsed
               int pizzaslice;
               // # of slices per pizza
               int hungryppl;
               // # of adults
               // adults get pizza first
               int hungrylttlppl;
               // # of children
               // children get the remaining slices evenly
                


                System.out.println("How many Pizzas were purchased?");
                pizzapurch = keyboard.nextInt();
                System.out.println("Awesome! There are" +pizzapurch);
                System.out.println("total Pizza(s)");

                System.out.println("How many slices are cut");
                pizzaslice = keyboard.nextInt();
                System.out.println("The slices per pizza is");
                System.out.print(pizzaslice);
                System.out.println(". Tasty!");

                System.out.println("How many adults are here?");
                hungryppl = keyboard.nextInt();
                System.out.println("Radical! The number of adults is" +hungryppl);

                System.out.println("How many children are here?");
                hungrylttlppl = keyboard.nextInt();
                System.out.println("The pizza party has");
                System.out.print(hungrylttlppl);
                System.out.println("children");
                


                int slicetotal = (pizzapurch * pizzaslice);
                int pplslice = (hungryppl * 2);
                int lttlpplsliceavail = (slicetotal - pplslice);
                int sliceperlttlppl = (lttlpplsliceavail / hungrylttlppl);
                int leftover = (lttlpplsliceavail % sliceperlttlppl);


        System.out.println("There are slicetotal total slices of pizza");
        System.out.println("The adults get pplslice slices");
        System.out.println("There are lttlpplsliceavail slices for the children");
        //adults get pizza before the children
        System.out.println("Each child will get sliceperlttlppl slices");
        //children get the remaining slices evenly
        System.out.println("There are");
        System.out.print(+ leftover); 
        System.out.println("remaining slices");

    }
}}
