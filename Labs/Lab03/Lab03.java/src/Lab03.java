/*-------------------------------------------------------------
// AUTHOR: Zack Spate
// FILENAME: Lab03.java
// SPECIFICATION: your own description of the program
// FOR: CSE 110- Lab #3
// TIME SPENT: how long it took you to complete the assignment.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
 
        double homework;
        double midtermExam;
        double finalExam;
        int i = 0;

        // Declare a loop control variable i
        // -->
        while (i < 3);

            // Design if-else control flow:

if (i == 0); {
System.out.println("Please enter your homework grade: ");
homework = keyboard.nextDouble();

} if (homework>100); {
System.out.println("Error, value must be between 0 and 100");
i++;}

if (i == 1); {System.out.println("Please enter your midterm exam grade: ");
midtermExam = keyboard.nextDouble();

} if (midtermExam>100); {System.out.println("Error, value must be between 0 and 100");
i++;

if (i == 2) { System.out.println("Pleas enter your final exam grade");
finalExam = keyboard.nextDouble();
 if (finalExam>200); {System.out.println("Error, value must be between 0 and 200");}
                
keyboard.close();
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.
            // -->

           // if (inputAttempts == 0) {
                // Ask the user for homework grade
                // -->

                // Do input validation
                // -->
                //if
                    // -->
                //} else {
                    // Update the loop variable
                    // -->
                
         //   }

            // The other two if-else statments go here
            // -->
        }}}}

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        //double weighted_total = ...;

        // Show the weighted total and tell the user s/he passed or not
        // -->
        //if (/* ... */) {
            // Print "the student PASSED the class."
       // } else {
            // Print "the student FAILED the class."
       // }

    

  //  }  // End of main
//}  // End of class

    
//}
