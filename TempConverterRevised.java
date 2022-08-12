// TempConverterRevised.java      Author: Anay Apte      Date: 7/22/22
//
// Revised version of the TempConverter application to convert from Fahernheit to Celsius.
//
// Variables:
// BASE --> Constant used to represent the base Fahrenheit value (32 degrees)
// CONVERSION_FACTOR --> Constant used to represent the conversion between Fahrenheit to Celsius
// fahrenheitTemp --> Holds the value for Fahrenheit temperature entered by the user

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverterRevised
{
    // Converts temperature from Fahrenheit to Celsius
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0/9.0;
        
        Scanner scan = new Scanner(System.in);
        double fahrenheitTemp;
        double celsiusTemp;
        
        System.out.print("What is the initial Fahrenheit Temperature: ");
        fahrenheitTemp = scan.nextDouble();
        
        DecimalFormat fmt = new DecimalFormat("0.###");
        // Formats any repeating decimal to three decimal places.
        
        System.out.println("The temperature in Celsius is: "+ fmt.format((fahrenheitTemp - BASE) * CONVERSION_FACTOR));
    }
}