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
public class Lunch extends Diet{
    
    
    //constructor takes all the super class variables in its parameters
    public Lunch(String n,int c, int p, int f, int ca) {
        super (n,c,p,f,ca);
    }
    
    @Override
    //overrides person toString method in superclass
    public String toString() {
        
        //super - takes the values of the parameters
        String var = super.toString();
        //sends to the method readerwriter to save variables to file
        readerwriter();
        //returns string var
        return var;

    }
    
    //method readerwriter saves all the variables to a file
    public void readerwriter() {
        //finds the current date
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        ArrayList<String> previous = new ArrayList<>();

        //try catch statement to view file
        try {
                    Scanner in = new Scanner(new File("Diet.txt"));
                   //for loop stores all the previous information
                    for (int i = 0; i < 38; i++)
                    {
                        //stores all previous information in arraylist
                        previous.add(in.nextLine());
                       
                    }

                } catch (Exception e) {
                    System.out.println("ERROR in a");
                    System.out.println(e);
                }

        //adds new information to the arraylist
        previous.add(name + "--> Date:" + df.format(dateobj) + "LUNCH---->Calories: " + calories +  " Protein: " + proteins + " Fat: " + fat + " Carbs: " + carb);
        System.out.println(name + "--> Date:" + df.format(dateobj) + "LUNCH---->Calories: " + calories +  " Protein: " + proteins + " Fat: " + fat + " Carbs: " + carb);

            //try catch statement to use filewriter and printwriter
                try {
                    //open filewriter and printwriter
                    FileWriter fw = new FileWriter("Diet.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    // prints out the previous records
                    for (int m = 0; m < previous.size(); m++) {
                            pw.println(previous.get(m));
                       

                    }
                    //closes printwriter
                    pw.close();
                } catch (Exception e) {
                    System.out.println("ERROR in b");
                    System.out.println(e);
                }
           
       
    }
            
}
