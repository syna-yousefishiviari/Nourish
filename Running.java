/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JLabel;

/**
 *
 * @author test
 */
public class Running {
    
   private String name;
   private int duration = 0;
   private int distance = 0;
   private int pace = 0;
    
    
    //contructor that has 4 variables in its parameters
    public Running (String n, int dur, int dis, int pac) {
        this.name = n;
        this.duration = dur;
        this.distance = dis;
        this.pace = pac;
    }
    //getter method, returns string name value 
    public String getname() {
        return name;
    }
    //setter method, name userinput is set to this variable
    public void setname(String name) {
        this.name = name;
    }
    //getter method, returns int duration value 
    public int getduration() {
        return duration;
    } 
    //setter method, duration userinput is set to this variable
    public void setduration(int duration) {
        this.duration = duration;
    }
    //getter method, returns int distance value 
    public int getdistance() {
        return distance;
    } 
    //setter method, distance userinput is set to this variable
    public void setdistance(int distance) {
        this.distance = distance;
    }
    //getter method, returns int pace value 
    public int getpace() {
        return pace;
    } 
    
    //setter method, pace userinput is set to this variable
    public void setpace(int pace) {
        this.pace = pace;
    }
    
   //returns string with all the variables
    @Override
    public String toString() {
        String sent = "Name: " + name  + "Duration: " + duration +  "Distance: " + distance + "Pace: " + pace ;
        readerwriter();
        return sent;
        
    }
    //method readerwriter saves all the variables to a file
    public void readerwriter() {
        //finds the current date
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        ArrayList<String> previouswork = new ArrayList<>();

        
        try {
                  Scanner in = new Scanner(new File("Workout.txt"));
                    // this for loop stores all the previous information
                    for (int i = 0; i < 38; i++)
                    {
                        //stores all previous information in arraylist
                        previouswork.add(in.nextLine());
                       
                    }

                } catch (Exception e) {
                    System.out.println("ERROR in a");
                    System.out.println(e);
                }
        //adds new information to the arraylist
        previouswork.add("RUNNING ---->" + name + "--> Date:" + df.format(dateobj) + "Duration: " + duration +  "Distance: " + distance + "Pace: " + pace );
        System.out.println("RUNNING ---->" + name + "--> Date:" + df.format(dateobj) + "Duration: " + duration +  "Distance: " + distance + "Pace: " + pace );
            //try catch statement to use filewriter and printwriter
                try {
                    //open filewriter and printwriter
                    FileWriter fw = new FileWriter("Workout.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    // prints out the entire song with the replaced line.
                    for (int m = 0; m < previouswork.size(); m++) {
                    // prints out the previous records
                            pw.println(previouswork.get(m));
                        System.out.println(previouswork.get(m));

                    }
                    //closes printwriter
                    pw.close();
                } catch (Exception e) {
                    System.out.println("ERROR in b");
                    System.out.println(e);
                }
           
       
    }
}
