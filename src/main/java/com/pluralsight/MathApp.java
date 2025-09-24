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

    }
}
