package com.training.assessment;

import java.util.Scanner;

public class MovieBookingTest{
	
	public static void main(String[] args){
        System.out.println("*******The theatres available are*******");
        System.out.println("1.Navina Theatre");
        System.out.println("2.Nandan Theatre");
        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t == 1) {
            System.out.println("*******Navina Theatre*******");
            System.out.println();
            System.out.println("*******Select a movie*******");
            System.out.println("Movies available are ------ ");
            System.out.println("1.Shrek");
            System.out.println("2.Stuart Little");
            System.out.println("Enter your choice : ");
            Scanner a = new Scanner(System.in);
            int m = a.nextInt();
            if (m == 1) {
                System.out.println("Shrek Movie @ Navina Theatre");
                System.out.println();
                System.out.println("Enter the number of tickets to be booked --");
                Scanner b = new Scanner(System.in);
                int r = b.nextInt();
                int amount=40*r;
                System.out.println();
                System.out.println("To continue to book for this movie press 1:");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println();
                System.out.println();
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("Theatre ------------------- Navina Theatre");
                    System.out.println("Movie --------------------- Shrek");
                    System.out.println("Cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (m == 2) {
                System.out.println("Stuart Little Movie @ Navina Theatre");
            	System.out.println();
                System.out.println("Enter the number of tickets to be booked --");
                Scanner b = new Scanner(System.in);
                int r = b.nextInt();
                int amount=50*r;
                System.out.println();
                System.out.println("To continue to book for this movie press 1:");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println();
                System.out.println();
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("Theatre ------------------- Navina Theatre");
                    System.out.println("Movie --------------------- Staurt Little");
                    System.out.println("Cost ---------------------- Rs"+amount);
                    System.out.println("******************************************************");
                }

            }

        }
        
        if (t == 2) {
            System.out.println("*******Nandan Theatre*******");
            System.out.println();
            System.out.println("*******Select a movie*******");
            System.out.println("Movies available are ------");
            System.out.println("1.Shrek");
            System.out.println("2.Stuart Little");
            System.out.println("Enter your choice : ");
            Scanner a = new Scanner(System.in);
            int m = a.nextInt();
            if (m == 1) {
                System.out.println("Shrek Movie @ Nandan Theatre");
            	System.out.println();
                System.out.println("Enter the number of tickets to be booked --");
                Scanner b = new Scanner(System.in);
                int r = b.nextInt();
                int amount=40*r;
                System.out.println();
                System.out.println("To continue to book for this movie press 1:");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println();
                System.out.println();
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("Theatre ------------------- Nandan Theatre");
                    System.out.println("Movie --------------------- Shrek");
                    System.out.println("Cost ---------------------- Rs."+amount);
                    System.out.println("******************************************************");
                }

            }
            if (m == 2) {
                System.out.println("Stuart Little Movie @ Nandan Theatre");
            	System.out.println();
                System.out.println("Enter the number of tickets to be booked --");
                Scanner b = new Scanner(System.in);
                int r = b.nextInt();
                int amount=50*r;
                System.out.println();
                System.out.println("To continue to book for this movie press 1:");
                Scanner d = new Scanner(System.in);
                int h = d.nextInt();
                System.out.println();
                System.out.println();
                if (h == 1) {
                    System.out.println("******************************************************");
                    System.out.println("Theatre ------------------- Nandan Theatre");
                    System.out.println("Movie --------------------- Staurt Little");
                    System.out.println("Cost ---------------------- Rs"+amount);
                    System.out.println("******************************************************");
                }

            }

        }
        
     }
     
}
        
   
