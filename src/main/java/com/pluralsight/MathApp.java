package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

    double bobSalary = 52500.00;
    double garySalary = 80050.00;
    double highestSalary = Math.max(bobSalary, garySalary);
    System.out.println(highestSalary);


    // Vehicals Prices

        double carPrice = 28005.56;
        double truckPrice = 74054.56;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println(lowestPrice);


        //Area of a circle
        double radius = 7.25;
        double circleArea = Math.PI * radius;
        System.out.println(circleArea);

        //Square Root
        double value = 5.0;
        double squared = Math.sqrt(value);
        System.out.println(squared);

        //Distance between (5,10) and (85,50)
        double pointax = 5;
        double pointay= 10;
        double pointbx = 85;
        double pointby = 50;

        double dx = pointbx - pointax; // 85 - 5 = 80
        double dy = pointby - pointay; // 50 - 10 = 40

        double distance = Math.hypot(dx, dy);
        System.out.println(distance);

        //absolute value
        double negNumber = -3.8;
        double absoluteValue = Math.abs(negNumber);
        System.out.println(absoluteValue);

        //Random Number
        double random = Math.random();
        System.out.println(random);

        // Minutes in 24 Days
        long days = 24L;
        long hoursPerDay = 24L;
        long minutesPerHour = 60L;
        long minutesIn24Days = days * hoursPerDay*minutesPerHour;


    }
}
