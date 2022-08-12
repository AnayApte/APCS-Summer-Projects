// DistanceFormula.java      Author: Anay Apte      Date: 7/23/22
//
// Asks the user for two points and finds the distance between them.
//
// Variables:
// x1 --> Holds the x value of the first coordinate point
// y1 --> Holds the y value of the first coordinate point
// x2 --> Holds the x value of the second coordinate point
// y2 --> Holds the y value of the second coordinate point
// distance --> Holds the value of the distance between the first and second coordinate points. 

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceFormula
{
    // Finds the distance between two points
    public static void main(String[] args)
    {
        double x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the x coordinate for the first point: ");
        x1 = scan.nextDouble();
        System.out.print("What is the y coordinate for the first point: ");
        y1 = scan.nextDouble();
        System.out.print("What is the x coordinate for the second point: ");
        x2 = scan.nextDouble();
        System.out.print("What is the y coordinate for the second point: ");
        y2 = scan.nextDouble();
        
        double distance = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
        // Formats a repeating decimal distance to three decimal places.
        DecimalFormat fmt = new DecimalFormat("0.###");
        System.out.println();
 
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and ("+ x2 + ", " + y2 + ") is "+ fmt.format(distance) + ".");
    }
}