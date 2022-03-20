// Name: Zack Spate
// filename: Lab 1 Scanner Exrpessions
// For: CSE 110- Lab #1
// Time Spent: 30 minutes
import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args) 
	{
		double test1;
		double test2;
		double test3;
		final double NUM_TESTS = 3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Plz input test 1 score: ");
		test1 = keyboard.nextDouble();
		System.out.println("Your test 1 is " + test1);
		
		System.out.print("Plz input test 2 score: ");
		test2 = keyboard.nextDouble();
		System.out.println("Your test 2 is " + test2);
		
		System.out.print("Plz input test 3 score: ");
		test3 = keyboard.nextDouble();
		System.out.println("Your test 3 is " + test3);
		
		double avg;
		avg = (test1 + test2 + test3) / NUM_TESTS;
		System.out.printf("Your avg is %.4f %n", avg);

		keyboard.close();
		
	}
}
