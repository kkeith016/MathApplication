package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

    double bobSalary = 52500.00;
    double garySalary = 80050.56;
    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println("The highest Salary is $" + highestSalary);


    // Vehicals Prices

        double carPrice = 28005.56;
        double truckPrice = 74054.56;

        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The Cheapest Vehical is" + " " + lowestPrice);


        //Area of a circle
        double radius = 7.25;

        double circleArea = Math.PI * Math.pow(radius,2);

        System.out.println("The area of the circle is " + circleArea);

        //Square Root
        double value = 5.0;
        double squared = Math.sqrt(value);

        System.out.println("Squared root of " + value + " is " + Math.round(squared));

        //Distance between (5,10) and (85,50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        int dx = x2 - x1; // 85 - 5 = 80
        double dy = y2 - y1; // 50 - 10 = 40

        double distance = Math.hypot(dx, dy);
        System.out.println("This is the hypotinos " + distance + " this is it rounded " + Math.round(distance));

        //absolute value
        double negNumber = -3.8;
        double absoluteValue = Math.abs(negNumber);
        System.out.println("This is the absolute vaulue of " + negNumber + " is " +  absoluteValue);

        //Random Number
        double random = Math.random()*((1-0)+1);
        System.out.println("This is a random number " + Math.round(random));

        // Minutes in 24 Days
        long days = 24L;
        long hoursPerDay = 24L;
        long minutesPerHour = 60L;
        long minutesIn24Days = days * hoursPerDay*minutesPerHour;

        long secondsPerMinute = 60L;
        long msPerSecond = 1000L;
        long millisecondsIn24Days = minutesIn24Days * secondsPerMinute * msPerSecond;
        System.out.println("The milliseconds in 24 days " +  millisecondsIn24Days);

    }
}
