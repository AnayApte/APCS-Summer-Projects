// HoursMinsSecs.java      Author: Anay Apte      Date: 7/23/22
//
// Revised version of Project 2.6 which allows the user to input a number of seconds before converting to hours minutes seconds.
//
// Variables:
// seconds --> Holds how many seconds passed initially. Inputted by the user. 
// hours --> Holds how many hours passed from the seconds given.
// minutes --> Holds how many minutes passed from the remaining seconds.

import java.util.Scanner;

public class HoursMinsSecs
{
    // Converts seconds to Hours, Minutes, and Seconds
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int seconds;
        
        System.out.print("How many seconds have passed: ");
        seconds = scan.nextInt();
        
        int hours, minutes;
        // Remainder function used to calculate hours, minutes, and seconds. Conversions used are 1 hour = 3600 sec and 1 min = 60 sec.
        hours = (seconds - (seconds % 3600)) / 3600;
        minutes = ((seconds % 3600) - ((seconds % 3600) % 60)) / 60;
        seconds = ((seconds % 3600) % 60);
        
        System.out.println();
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds have passed.");
    }
}
