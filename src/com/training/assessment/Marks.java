package com.training.assessment;

import java.io.*;
import java.util.*;

import org.w3c.dom.ranges.RangeException;

public class Marks {

    public static void main(String[] args) throws RangeException {
    	
        Scanner n = new Scanner(System.in);
        String name ;
        Scanner s = new Scanner(System.in);
        int [] marks = new int[6];
        double sum = 0;
        double percentage = 0;
        
        try {
        	
        	System.out.println("Enter the name of the student: ");
        	name = n.nextLine();
               
            for(int i=0; i<6; i++) {
            	System.out.print("Enter Marks of Subject"+(i+1)+":");
                marks[i] = s.nextInt();
                if (marks[i]<0 || marks[i]>50) {
                    throw new RangeException((short) 0, "The number is exceeding the given range");
                }
                	sum = sum + marks[i];
            }
            
            percentage = (sum * 100) / 600;
            
            System.out.println("The name of the student is : "+name);
            
            System.out.println("The total marks of "+name+" student is : "+sum);
            
            System.out.println(name+" Percentage is : "+percentage+"%");
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
