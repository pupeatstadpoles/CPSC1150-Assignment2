
/**
 * Program Name: windChillIndex
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Sep 28, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;

public class windChillIndex {
    public static void main(String[] args) {
        // The program calcultes the Wind Chill Index given user input temperature and
        // wind speed

        int temp, windSpeed;
        double windChill = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("This program will calculate the current Wind Chill Index.");
        System.out.println("Please enter the current temperature in Celsius as an integer.");
        temp = input.nextInt();

        System.out.println("Please enter the current wind speed in km/h as an integer.");
        windSpeed = input.nextInt();

        if ((temp < -50 || temp > 5) || (windSpeed < 0 || windSpeed > 100)) {
            System.out.println(
                    "Invalid Input. Wind Speed must be between 0-100 km/h and temperature must be between -50 and 5 Celsius.");

            return;

        }

        else {
            // Calculating windChill
            double windChill = 13.112 + (0.6215 * temp) - (11.37 * Math.pow(windSpeed, 0.16))
                    + (0.3965 * temp * Math.pow(windSpeed, 0.16));

            System.out.println("The wind chill index is " + windChill);
        }

    }
}