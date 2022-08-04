package com.bridgelabs.basics.Functional_Programs;

public class WindChill {
    public static void main(String[] args) {

        double t = Double.parseDouble(args[0]); // temperature
        double v = Double.parseDouble(args[1]); // wind speed (mph)
        double windChill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Given a temperature of " + t + " Fahrenheit" + " and a wind speed of " + v + " mph");
        System.out.println("The wind chill is " + windChill);
    }
}