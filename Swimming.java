/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author test
 */
class Swimming {
    
    String name;
    int duration = 0;
    int lengths = 0;
    int speed = 0;
    
    //contructor that has 4 variables in its parameters
    public Swimming (String n, int dur, int len, int spee) {
        this.name = n;
        this.duration = dur;
        this.lengths = len;
        this.speed = spee;
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
    //getter method, returns int lengths value 
    public int getlengths() {
        return lengths;
    } 
    //setter method, lengths userinput is set to this variable
    public void setlengths(int length) {
        this.lengths = lengths;
    }
    //getter method, returns int speed value 
    public int getspeed() {
        return speed;
    } 
    //setter method, speed userinput is set to this variable
    public void setspeed(int speed) {
        this.speed = speed;
    }
    
   //returns string with all the variables
    @Override
    public String toString() {
        String sent = "Name: " + name  + "Duration: " + duration +  "Lengths: " + lengths + "Speed: " + speed ;
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
        previouswork.add("SWIMMING ---->" + name + "--> Date:" + df.format(dateobj) + " Duration: " + duration +  "Lengths: " + lengths + "Speed: " + speed );
        System.out.println("SWIMMING ---->" + name + "--> Date:" + df.format(dateobj) + " Duration: " + duration +  "Lengths: " + lengths + "Speed: " + speed );
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

