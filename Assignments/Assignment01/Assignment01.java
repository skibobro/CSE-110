/*-----------Class Name Assignment1
// CSE 110     : <Class #14869> / <Ali Altunkaya>
// Assignment  : <assignment #1>
// Author      : <Zack Spate> & <1222898651>
// Description : <Zack's Awesome Pizza Party>
/* <Assignment 1 using strings, math operators, and scanner statements 
to write a program that solves the age old dilemea of how to share a pizza> */

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {  

        (Scanner in = new Scanner(System.in)) {
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
                System.out.print("Awesome! There are " +pizzapurch); 
                System.out.println(" total Pizza(s)");
                System.out.println();

                System.out.println("How many slices are cut per pizza?");
                pizzaslice = keyboard.nextInt();
                System.out.print("The slices per pizza is ");
                System.out.print(pizzaslice);
                System.out.println(". Tasty!");
                System.out.println();

                System.out.println("How many adults are here?");
                hungryppl = keyboard.nextInt();
                System.out.println("Radical! The number of adults is " +hungryppl);
                System.out.println();

                System.out.println("How many children are here?");
                hungrylttlppl = keyboard.nextInt();
                System.out.print("The pizza party has ");
                System.out.print(hungrylttlppl);
                System.out.println(" children");
                System.out.println();
                


                int slicetotal = (pizzapurch * pizzaslice);
                int pplslice = (hungryppl * 2);
                int lttlpplsliceavail = (slicetotal - pplslice);
                int sliceperlttlppl = (lttlpplsliceavail / hungrylttlppl);
                int leftover = (lttlpplsliceavail % sliceperlttlppl);


        System.out.println("There are: ");
        System.out.print (+slicetotal);
        System.out.println(" total slices");
        System.out.println();

        System.out.println("The adults get: ");
        System.out.print(pplslice);
        System.out.println(" slices");
        System.out.println();
        //adults get pizza before the children

        System.out.println("The children get: ");
        System.out.print(lttlpplsliceavail);
        System.out.println(" slices to share");
        System.out.println();

        
        System.out.println("Each child will get: ");
        System.out.print(sliceperlttlppl);
        System.out.println(" slices");
        System.out.println();
        //children get the remaining slices evenly

        System.out.println("There are: ");
        System.out.print(+ leftover); 
        System.out.println(" remaining slices");
        System.out.println();
        System.out.println("Yahoo! Pizza!");


    }
}}
