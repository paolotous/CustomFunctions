/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.text.DecimalFormat;

/**
 *
 * @author Paolo
 */
public class Sequence {
    
    
    //calculate square of a number
    public int calcSquare(int num){
        int result = (int) Math.round(Math.pow(num, 2));
        return result;
    }
    
    //calculate average of 3 numbers
    public int calcAverage(int num1, int num2, int num3){
        int avg = (num1 + num2 + num3) / 3;
        return avg;
    }
    
    //convert CAD to USD
    public String convertToUS(double can){
        double us = can * 0.774;
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(us);
    }
    
    //convert kg to lb
    public String convertToLb(double kg){
        double lb = kg * 2.2;
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(lb);
    }
    
    //convert cm to inches
    public String convertToIn(double cm){
        double in = cm / 2.54;
        DecimalFormat f = new DecimalFormat("##.00");
        return f.format(in);
    }
    
    //calculate price after discount and tax
    public void calcDiscount(double price, double discount){
        System.out.println("Original Price: " + price);
        System.out.println("Discount Amount: " + discount);
        
        discount = discount / 100;
        double total = price - (price * discount);
        total += (total * 0.15); //the 15% is for tax
        System.out.println("Amount to be paid: " + total);
    }
    
    //calculate electricity charges -- uses the difference between current and previous readings
    public void calcElectricity(String name, double prev, double curr){
        double numUnits = curr - prev;
        double total = 25 + (numUnits * 0.20);
        System.out.println("Receipt:");
        System.out.println("---------------");
        System.out.println("Consumer Name: " + name);
        System.out.println("Number of Units used: " + numUnits);
        System.out.println("Total Amount for the current period: $" + total);
        
    }
    
    //print transcript
    public String showTranscript(String name, double[] marks){
        double total = 0;
        
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }
        
        double avg = total/marks.length;
        String s = "Student Transcript: \n";
        s += "---------------\n";
        s += "Student Name: " + name + "\n";
        s += "Total Marks: " + total + "\n";
        s += "Average Marks: " + avg;
        
        return s;
    }
    
    //print and calculate Salary
    public String calcSalary(double salary, double deductions, double tax){
        String s = "";
        double taxAmount = tax / 100;
        double total = salary - deductions;
        double taxDeducted = total * taxAmount;
        total = total - taxDeducted;
        
        s += "Gross Salary: $" + salary + "\n";
        s += "Amount of tax deducted: $" + taxDeducted + "\n";
        s += "Net Pay: $" + total + "\n";
        s += "Tax percentage cut: %" + tax;
        return s;
    }
    
    //calculate cost of carpeting
    public String calcCost(double length, double breadth, double cost){
        String s = "";
        double area = length * breadth;
        double total = area * cost;
        s += "Area of the room: " + area + " square meters\n";
        s += "Cost of the carpet: $" + total;
        return s;
    }
    
    //calculate food items sold
    public String calcFood(double muffPrice, int muffAmount, double donPrice, int donAmount){
        String s = "";
        s += muffAmount + " Muffins sold at $" + muffPrice + " per Muffin\n";
        s += donAmount + " Donuts sold at $" + donPrice + " per Donut\n";
        s += "Muffin Sales: $" + (muffPrice * muffAmount) + "\n";
        s += "Donut Sales: $" + (donPrice * donAmount) + "\n";
        s += "A total of " + (muffAmount + donAmount) + " items were sold\n";
        s += "$" + (muffPrice * muffAmount + donPrice * donAmount) + " was collected in sales";
        return s;
    }
    
    
}
