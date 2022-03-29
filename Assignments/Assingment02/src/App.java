import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //input variables
        double roadLengthMiles;
        int numLanes;
        int asphaltDepthInch;
        int daysComplete;

        Scanner keyboard = new Scanner(System.in);

        //ask for input variables
        System.out.print("Please input road length in Miles: ");
        roadLengthMiles = keyboard.nextDouble();
        System.out.print("Please input the amount of lanes: ");
        numLanes = keyboard.nextInt();
        System.out.print("Please input asphalt depth in inches: ");
        asphaltDepthInch = keyboard.nextInt();
        System.out.print("Please enter how many days to complete: ");
        daysComplete = keyboard.nextInt();

        keyboard.close();

        //output material variables
        double truckloads;
        double asphaltLbs;
        double intersection;
        int stoplightNum;
        int conduitPipeNum;
        double crewmatesNeed;

        //output cost variables
        double asphaltCost;
        double stoplightCost;
        double conduitPipeCost;
        double crewmatesCost;
        double projectTotalCost;


        //amount of materials needed
        asphaltLbs = ((roadLengthMiles*5280)*(numLanes*12)*((double) asphaltDepthInch/12)*150);
        
        truckloads = Math.ceil(asphaltLbs/10000);

        intersection = Math.floor(roadLengthMiles);

        stoplightNum = (int) (intersection)*(numLanes +2);
        
        conduitPipeNum = (int) (roadLengthMiles*5280)/24;

        crewmatesNeed =  Math.ceil ((50*roadLengthMiles*numLanes)/(daysComplete));

        
        //costs of materials
        asphaltCost = truckloads*1000;

        stoplightCost = stoplightNum*25000;

        conduitPipeCost = conduitPipeNum*500;

        crewmatesCost = (crewmatesNeed*200)*daysComplete;

        projectTotalCost = asphaltCost + stoplightCost + conduitPipeCost + crewmatesCost;
        

        //printed material outputs
        System.out.println();
        System.out.println("======= Amounts of Materials needed ======= ");

        System.out.println();
        System.out.print("Truckloads of Asphalt: ");
        System.out.println((int) truckloads);

        System.out.print("Stoplights: ");
        System.out.println(stoplightNum);

        System.out.print("Conduit Pipes: ");
        System.out.println(conduitPipeNum);

        System.out.print("Crewmates Needed: ");
        System.out.println((int) crewmatesNeed);

        //printed cost outputs
        System.out.println();
        System.out.println("======= Cost of Materials ======= ");

        System.out.println();
        System.out.print("Asphalt: $");
        System.out.println(asphaltCost);

        System.out.print("Stoplights: $");
        System.out.println(stoplightCost);

        System.out.print("Conduits: $");
        System.out.println(conduitPipeCost);

        System.out.print("Labor: $");
        System.out.println(crewmatesCost);

        System.out.println();
        System.out.println("======= Total Cost of Project =======");

        System.out.println();
        System.out.print("Total: $");
        System.out.println(projectTotalCost);


    }
}
