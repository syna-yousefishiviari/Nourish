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
class WeightTrain {
    
    String name;
    String exercise;
    int reps = 0;
    int sets = 0;
    int weights = 0;
    
    //contructor that has 4 variables in its parameters
    public WeightTrain (String n, String exe, int re, int set, int wei) {
        this.name = n;
        this.exercise = exe;
        this.reps = re;
        this.sets = set;
        this.weights = wei;
    }
    //getter method, returns int calories value 
    public String getname() {
        return name;
    }
    //setter method, calories userinput is set to this variable
    public void setname(String name) {
        this.name = name;
    }
    //getter method, returns String exercise value 
    public String getexercise() {
        return exercise;
    } 
    //setter method, exercise userinput is set to this variable
    public void setexercise(String exercise) {
        this.exercise = exercise;
    }
    //getter method, returns int reps value 
    public int getreps() {
        return reps;
    } 
    //setter method, reps userinput is set to this variable
    public void setreps(int reps) {
        this.reps = reps;
    }
    //getter method, returns int weights value 
    public int getweights() {
        return weights;
    } 
    //setter method, weights userinput is set to this variable
    public void setspeed(int weights) {
        this.weights = weights;
    }
    
   //returns string with all the variables
    @Override
    public String toString() {
        String sent = "Name: " + name  + "Exercise: " + exercise +  "Reps: " + reps + "Sets: " + sets + "Weight of weights:" + weights;
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
      //previouswork.add("SWIMMING ---->" + name + "--> Date:" + df.format(dateobj) + " Duration: " + duration +  "Lengths: " + lengths + "Speed: " + speed );
  
        previouswork.add("WEIGHT&BODY-> " + name  + "Date:" + df.format(dateobj) + "Exercise:" + exercise +  "Reps:" + reps + "Sets:" + sets + "Weights:" + weights);
        System.out.println("WEIGHT&BODY-> " + name  + "Date:" + df.format(dateobj) + "Exercise:" + exercise +  "Reps:" + reps + "Sets:" + sets + "Weights:" + weights);
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
