/*--------------------------------------------------------------------------------------------------------------
// Author: Zack Spate
// Filename: Lab2.java
// Specification:
// For: CSE 110
// Time Spent: 1h30min
*/
import java.util.Scanner;


public class Lab2 {
    public static void main(String[] args) {

        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);



        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
  


        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();



        fullName = (firstName +  lastName);  
        System.out.println(fullName);


        
        System.out.println("Full name is "+ fullName);



        System.out.println("Length of full name is "+ fullName.length() );



        System.out.print(fullName.toUpperCase());



        System.out.println();
        String namelength;
        nameLength = fullName.charAt(0);
        System.out.println(nameLength);



        String title1 = new String("cse110");
        String title2 = "cse110"; 



        if ( title1 == title2 ) 
        {
        System.out.println("String comparison using "==" sign works ");

        } else {
        System.out.println("String comparison using "==" sign does NOT work");
        }

        if ( title1.equals(title2) ) {
        System.out.println("String comparison using equals method works");
            
    
        }else{
        System.out.println("String comparison using equals method does not work");
        }

    } 
}