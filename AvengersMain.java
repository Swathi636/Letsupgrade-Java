package com.Letsupgrade;

public class AvengersMain {
    public static void main(String[] args) {

        Avengers[] avgs = new Avengers[5];

        System.out.println("Avengers Initiative:");
        for (int i=0;i< avgs.length;i++){
            avgs[i] = new Avengers();
            avgs[i].getDetails();
            System.out.println();
        }
        System.out.println("Avengers Assemble...");
        for (int i=0;i< avgs.length;i++){
            System.out.println();
            avgs[i].displayDetails();
            System.out.println();
        }

    }
}
