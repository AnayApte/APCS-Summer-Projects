// CalculationsTwoNums.java      Author: Anay Apte      Date: 7/22/22
//
// Reads two numbers inputted by the user and find's their sum, difference, product, quotient, remainder, and power.
//
// Variables:
// a --> Holds the first double inputted by the user.
// b --> Holds the second double inputted by the user.

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculationsTwoNums
{
    // Performs different mathematical operations between two doubles
    public static void main(String[] args)
    {
        double a,b;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your first double(a): ");
        a = scan.nextDouble();
        System.out.print("What is your second double(b): ");
        b = scan.nextDouble();
        System.out.println();
        
        // Java is imprecise and leaves a rounding error on some values.
        System.out.println("The sum of a and b is "+ (a+b) +", the difference of a and b is "+ (a-b) + ", and the product of a and b is "+ (a*b) + ".");
        System.out.println("The quotient of a and b is "+ (a/b) +", the remainder of dividing a and b is "+ (int)(a%b) + ", and a to the power of b is "+ Math.pow(a,b) + ".");
    }
}