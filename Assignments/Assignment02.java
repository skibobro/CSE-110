// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

import java.util.Scanner;

public class Assignment02 {
    
    public static void main(String[] args) {
        // declare and instantiate a Scanner
    try (Scanner keyboard = new Scanner(System.in)) {

        //declare and initialize variables

        //input variables
       double roadLengthMiles;
       int lanesNumber;
       int lanesIntersection;
       int asphaltDepthInch;
       int daysTime;
       //constant variables
       int truckCapactyVolume = (10000/150)^3; //296296
       double conduitLength = 24;
       int laneWidthInches = 144;

       //output variables
       int asphaltTruckloads; //round up
       int stoplightNumber;
       int conduitNumber;   //round up
       int peopleCrewmates; //round up

       //cost variables
       int asphaltCost; 
       int stoplightCost; 
       int conduitCost;
       int laborCost;
       int totalCost;
        
       //input variable values
        System.out.print("Length of road project(Miles) : ");
        roadLengthMiles = in.nextDouble();
        System.out.print("Number of Lanes : ");
        lanesNumber = in.nextInt();
        System.out.print("Depth of asphalt(Inches) : ");
        asphaltDepthInch = in.nextInt();
        System.out.print("Days to complete project : ");
        daysTime = in.nextInt();
        
        //outputs materials and people
        asphaltTruckloads = (truckCapactyVolume);
        stoplightNumber = (lanesNumber +2);
        conduitNumber = roadLengthMiles/conduitLength;
        peopleCrewmates = (50*roadLengthMiles*lanesNumber)/daysTime;

        //output cost

        asphaltCost = (200*5)*asphaltTruckloads +1;
        stoplightCost = 25000*stoplightNumber;
        //conduitCost = 500*conduitNumber +1;
       // payPerCrewmate = (daysTime*8)*24;
       // laborCost = payPerCrewmate*peopleCrewmates +1;
        //totalCost =
        
        //display results
        system.out.println();
        

    }

}}
