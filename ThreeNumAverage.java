// ThreeNumAverage.java      Author: Anay Apte      Date: 7/22/22
//
// Reads three numbers inputted by the user and find's their average.
//
// Variables:
// num1 --> Holds the first number inputted by the user. Can be integer or double.
// num2 --> Holds the second number inputted by the user. Can be integer or double.
// num3 --> Holds the third number inputted by the user. Can be integer or double.


import java.util.Scanner;
import java.text.DecimalFormat;

public class ThreeNumAverage
{
    // Asks the user to input three numbers before finding average
    public static void main(String[] args)
    {
        double num1,num2,num3;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your first number: ");
        num1 = scan.nextDouble();
        
        System.out.print("What is your second number: ");
        num2 = scan.nextDouble();
        
        System.out.print("What is your third number: ");
        num3 = scan.nextDouble();
        System.out.println();
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        // Restricts the average to three decimal places if double
        
        System.out.println("Your three number average is: "+ fmt.format((num1+num2+num3)/3));
    }
}