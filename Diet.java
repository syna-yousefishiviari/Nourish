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
import java.util.Date;

/**
 *
 * @author test
 */

public class Diet {
     String name;
     int calories = 0;
     int proteins = 0;
     int fat = 0;
     int carb = 0;
    
    //contructor that has 5 variables in its parameters
    public Diet (String name, int c, int p, int f, int ca) {
        
        this.name = name;
        this.calories = c;
        this.proteins = p;
        this.fat = f;
        this.carb = ca;
        
    }
    
    //getter method, returns string name value 
    public String getname() {
        return name;
    }
    
    //setter method, name userinput is set to this variable
    public void setname(String name) {
        this.name = name;
    }
    
    //getter method, returns int calories value 
    public int getcalories() {
        return calories;
    } 
    
    //setter method, calories userinput is set to this variable
    public void setcalories(int calories) {
        this.calories = calories;
    }
    
    //getter method, returns int proteins value 
    public int getproteins() {
        return proteins;
    } 
    
    //setter method, proteins userinput is set to this variable
    public void setproteins(int proteins) {
        this.proteins = proteins;
    }
    
    //getter method, returns int fat value 
    public int getfats() {
        return fat;
    } 
    
    //setter method, fats userinput is set to this variable
    public void setfats(int fat) {
        this.fat = fat;
    }
    
    //getter method, returns int carbs value 
    public int getcarbs() {
        return carb;
    } 
    
    //setter method, carbs userinput is set to this variable
    public void setcarbs(int carb) {
        this.carb = carb;
    }
    
    
   //returns string with all the variables
    @Override
    public String toString() {
        String sent = "Name: " + name  + "Calories: " + calories +  "Proteins: " + proteins + "Fat: " + fat + "Carbs: " + carb;
        return sent;
        
    }
    
    
    
}
