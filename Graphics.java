/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

public class Graphics extends JFrame implements ActionListener {

    //creating variables that will keep track of certain outputs 
    static String bld;
    static String worko;
    
    //creating all the different frames and panels that will be used
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JFrame framerecorddiet = new JFrame();
    JPanel panelrecorddiet = new JPanel();
    JFrame framediet = new JFrame();
    JPanel paneldiet = new JPanel();
    JFrame fpastrecord = new JFrame();
    JPanel ppastrecord = new JPanel();
    JFrame framerecordworkout = new JFrame();
    JPanel panelrecordworkout = new JPanel();
    JFrame framerunning = new JFrame();
    JPanel panelrunning = new JPanel();
    JFrame framecycling = new JFrame();
    JPanel panelcycling = new JPanel();
    JFrame frameswim = new JFrame();
    JPanel panelswim = new JPanel();
    JFrame frameweighttrain = new JFrame();
    JPanel panelweighttrain= new JPanel();
    JFrame framepastrecordworkout = new JFrame();
    JPanel panelpastrecordworkout= new JPanel();
    JFrame frameworkouts = new JFrame();
    JPanel panelworkouts= new JPanel();
    JFrame framechallenges = new JFrame();
    JPanel panelchallenges= new JPanel();
    JFrame frameaboutus = new JFrame();
    JPanel panelaboutus= new JPanel();
    
    //creating all the different textfields that will be used, with default inputs
    JTextField caloriestext = new JTextField("0", 30);
    JTextField proteinstext = new JTextField("0", 30);
    JTextField fattext = new JTextField("0", 30);
    JTextField carbstext = new JTextField("0", 30);
    JTextField nametext = new JTextField ("Enter here", 30);
    JTextField durationtext = new JTextField("0", 30);
    JTextField distancetext = new JTextField("0", 30);
    JTextField pacetext = new JTextField ("0", 30);
    JTextField avgspeedtext = new JTextField ("0", 30);
    JTextField lengthstext = new JTextField ("0", 30);
    JTextField exercisetext = new JTextField("Enter", 30);
    JTextField repstext = new JTextField ("0", 30);
    JTextField setstext = new JTextField ("0", 30);
    JTextField weighttext = new JTextField ("0", 30);

    
    //creating all the different JLabels
        JLabel mondays = new JLabel ();
        JLabel tuesdays = new JLabel ();
        JLabel wednesdays = new JLabel ();
        JLabel thursdays = new JLabel ();
        JLabel fridays = new JLabel ();
        JLabel saturdays = new JLabel ();
        JLabel sundays = new JLabel ();
        JLabel namemess = new JLabel ("Enter in name");
        JLabel caloriesmess = new JLabel("How many calories?");
        JLabel proteinsmess = new JLabel("How much protein?");
        JLabel fatmess = new JLabel("How much fat?");
        JLabel carbsmess = new JLabel("How many carbs?");
        JLabel welcome = new JLabel("What meal of the day?");
        JLabel welcometochallenges = new JLabel ("Healthy Lifestyle Challenges");
        JLabel welcometoworkout = new JLabel ("Workout Ideas");
        JLabel whichworkoutmes = new JLabel ();
        JLabel workouts = new JLabel ();
        JLabel workouts2 = new JLabel ();
        JLabel quotesworkout = new JLabel ();
        JLabel welcometopastrecords = new JLabel("PAST RECORDS...");
        JLabel welcometorecordworkout = new JLabel("What activity would you like to record?");
        JLabel welcometorunning = new JLabel ("RUNNING");
        JLabel timemess = new JLabel ("Enter in duration");
        JLabel distancemess = new JLabel ("Enter in distance");
        JLabel pacemess = new JLabel ("Enter in pace");
        JLabel welcometocycling = new JLabel ("CYCLING");
        JLabel avgspeed = new JLabel ("Average Speed");
        JLabel welcometoswimming = new JLabel ("SWIMMING");
        JLabel lengthsmess = new JLabel ("Enter in lengths (yrds)");
        JLabel welcometoweight = new JLabel ("WEIGHT AND BODY TRAINING");
        JLabel exercisemess  = new JLabel ("Enter in exercise");
        JLabel repsmess = new JLabel ("Enter in reps");
        JLabel setsmess = new JLabel ("Enter sets");
        JLabel weightmess = new JLabel ("Enter in total pounds of weights");
        JLabel messageforweight = new JLabel ("If no weights were used, leave as zero");
        JLabel welcometoabout = new JLabel ("About Nourish");
        JLabel mission = new JLabel ("<html>The application Nourish is used to help people record their diet and as well participate in daily fitness<br/> activities and challenges by keeping our app minimalistic and user friendly.</html> ");
        JLabel created = new JLabel ("Designed and Created by: Syna Yousefi");
        JLabel recorddietmess = new JLabel ("<html> Allows the user to record carbs, protein, fats, and calories.<br/> The user will also have access to past records of their diet.</html> ");
        JLabel recordworkmess = new JLabel ("<html> Allows the user to record workouts for different sports. The user will<br/> also have access to past records of their workouts. </html>");
        JLabel workoutsmess = new JLabel ("<html> Nourish will recommend different workout plans to the users,<br/> helping them to achieve their healthly lifestyle goals. </html>");
        JLabel challenges = new JLabel ("<html> Nourish inspires and pushes the user to participate in different daily challenges<br/> each week to get used to more healthy lifestyle habits. </html>");
        JLabel missions = new JLabel ("Mission");
        JLabel recorddmess = new JLabel ("Recording Diet");
        JLabel recordwmess = new JLabel ("Recording Workouts");
        JLabel workoutmess2 = new JLabel ("Workout Ideas");
        JLabel challengesmess = new JLabel ("Challenges");
        
        
        JLabel pastdiet = new JLabel ();
        JLabel pastworkouts = new JLabel();
        
        //creating all the JButtons that will later be used
        JButton Running = new JButton("Running");
        JButton Swimming = new JButton("Swimming");
        JButton Cycling = new JButton("Cycling");
        JButton Weighttraining = new JButton ("Weight and Body Training");
        JButton backtoworkout = new JButton("Back to Workouts");
        JButton Breakfast = new JButton("Breakfast");
        JButton Lunch = new JButton("Lunch");
        JButton Dinner = new JButton("Dinner");
        JButton backbutton = new JButton("Back");
        JButton viewpastdiet = new JButton("View Past Diet Records");
        JButton savediet = new JButton("Save Diet");
        JButton back2diet = new JButton("Back to Diet");
        JButton recordworkout = new JButton ("Record Workouts");
        JButton viewpastworkout = new JButton("View Past Workout Records");
        JButton saveworkout = new JButton("Save Workout");
        JButton back2workout = new JButton("Back to Workouts");
       
        
    //constructor
    //sets up  all the buttons and jlabels and as well has the code of the main menu 
    public Graphics() {
        
        //custom colours are created
        Color lightyellow = new Color(255, 250, 205);
        Color lightgreen = new Color(152, 251, 152);
        Color green = new Color(204, 255, 204);
        
        //creating actionlisteners, background colours and fonts for the rest of the buttons in entire program
        viewpastdiet.addActionListener(this);
        viewpastdiet.setOpaque(true);
        viewpastdiet.setBackground(Color.DARK_GRAY);
        viewpastdiet.setFont(new Font("Courier New", Font.PLAIN, 18));
        savediet.addActionListener(this);
        savediet.setOpaque(true);
        savediet.setBackground(Color.LIGHT_GRAY);
        savediet.setFont(new Font("Courier New", Font.PLAIN, 18));
        back2diet.addActionListener(this);
        back2diet.setOpaque(true);
        back2diet.setBackground(Color.RED);
        back2diet.setFont(new Font("Courier New", Font.PLAIN, 18));
        Breakfast.addActionListener(this);
        Breakfast.setOpaque(true);
        Breakfast.setBackground(green);
        Breakfast.setFont(new Font("Courier New", Font.PLAIN, 18));
        backbutton.addActionListener(this);
        backbutton.setOpaque(true);
        backbutton.setBackground(Color.RED);
        backbutton.setFont(new Font("Courier New", Font.PLAIN, 18));
        Lunch.addActionListener(this);
        Lunch.setOpaque(true);
        Lunch.setBackground(green);
        Lunch.setFont(new Font("Courier New", Font.PLAIN, 18));
        Dinner.addActionListener(this);
        Dinner.setOpaque(true);
        Dinner.setBackground(green);
        Dinner.setFont(new Font("Courier New", Font.PLAIN, 18));
        recordworkout.addActionListener(this);
        recordworkout.setOpaque(true);
        recordworkout.setBackground(Color.RED);
        recordworkout.setFont(new Font("Courier New", Font.PLAIN, 18));
        backtoworkout.addActionListener(this);
        backtoworkout.setOpaque(true);
        backtoworkout.setBackground(Color.YELLOW);
        backtoworkout.setFont(new Font("Courier New", Font.PLAIN, 18));
        Running.addActionListener(this);
        Running.setOpaque(true);
        Running.setBackground(Color.WHITE);
        Running.setFont(new Font("Courier New", Font.PLAIN, 18));
        Swimming.addActionListener(this);
        Swimming.setOpaque(true);
        Swimming.setBackground(Color.WHITE);
        Swimming.setFont(new Font("Courier New", Font.PLAIN, 18));
        Cycling.addActionListener(this);
        Cycling.setOpaque(true);
        Cycling.setBackground(Color.WHITE);
        Cycling.setFont(new Font("Courier New", Font.PLAIN, 18));
        Weighttraining.addActionListener(this);
        Weighttraining.setOpaque(true);
        Weighttraining.setBackground(Color.WHITE);
        Weighttraining.setFont(new Font("Courier New", Font.PLAIN, 18));
        viewpastworkout.addActionListener(this);
        viewpastworkout.setOpaque(true);
        viewpastworkout.setBackground(Color.DARK_GRAY);
        viewpastworkout.setFont(new Font("Courier New", Font.PLAIN, 18));
        saveworkout.addActionListener(this);
        saveworkout.setOpaque(true);
        saveworkout.setBackground(Color.LIGHT_GRAY);
        saveworkout.setFont(new Font("Courier New", Font.PLAIN, 18));
        back2workout.addActionListener(this);
        back2workout.setOpaque(true);
        back2workout.setBackground(Color.RED);
        back2workout.setFont(new Font("Courier New", Font.PLAIN, 18));
        
        
        //setting jlabels with font and size for the rest of the program
        welcometorunning.setFont(new Font("Courier New", Font.PLAIN, 50));
        namemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        timemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        distancemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        pacemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        welcome.setFont(new Font("Courier New", Font.PLAIN, 30));
        mondays.setFont(new Font("Courier New", Font.PLAIN, 20));
        tuesdays.setFont(new Font("Courier New", Font.PLAIN, 20));
        wednesdays.setFont(new Font("Courier New", Font.PLAIN, 20));
        thursdays.setFont(new Font("Courier New", Font.PLAIN, 20));
        fridays.setFont(new Font("Courier New", Font.PLAIN, 20));
        saturdays.setFont(new Font("Courier New", Font.PLAIN, 20));
        sundays.setFont(new Font("Courier New", Font.PLAIN, 20));
        namemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        caloriesmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        proteinsmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        fatmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        carbsmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        welcometochallenges.setFont(new Font("Courier New", Font.PLAIN, 50));
        whichworkoutmes.setFont(new Font("Courier New", Font.PLAIN, 30));
        workouts.setFont(new Font("Courier New", Font.PLAIN, 15));
        workouts2.setFont(new Font("Courier New", Font.PLAIN, 15));
        quotesworkout.setFont(new Font("Courier New", Font.PLAIN, 20));
        welcometoworkout.setFont(new Font("Courier New", Font.PLAIN, 50));
        welcometopastrecords.setFont(new Font("Courier New", Font.PLAIN, 30));
        welcometocycling.setFont(new Font("Courier New", Font.PLAIN, 50));
        timemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        distancemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        avgspeed.setFont(new Font("Courier New", Font.PLAIN, 30));
        welcometoswimming.setFont(new Font("Courier New", Font.PLAIN, 50));
        lengthsmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        welcometoweight.setFont(new Font("Courier New", Font.PLAIN, 40));
        exercisemess.setFont(new Font("Courier New", Font.PLAIN, 30));
        repsmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        setsmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        weightmess.setFont(new Font("Courier New", Font.PLAIN, 30));
        messageforweight.setFont(new Font("Courier New", Font.PLAIN, 15));
        welcometoabout.setFont(new Font("Courier New", Font.PLAIN, 50));
        mission.setFont(new Font("Courier New", Font.PLAIN, 15));
        created.setFont(new Font("Courier New", Font.PLAIN, 15));
        recorddietmess.setFont(new Font("Courier New", Font.PLAIN, 15));
        recordworkmess.setFont(new Font("Courier New", Font.PLAIN, 15));
        workoutsmess.setFont(new Font("Courier New", Font.PLAIN, 15));
        challenges.setFont(new Font("Courier New", Font.PLAIN, 15));
        missions.setFont(new Font("Courier New", Font.BOLD, 22));
        recorddmess.setFont(new Font("Courier New", Font.BOLD, 22));
        recordwmess.setFont(new Font("Courier New", Font.BOLD, 22));
        workoutmess2.setFont(new Font("Courier New", Font.BOLD, 22));
        challengesmess.setFont(new Font("Courier New", Font.BOLD, 22));
        welcometorecordworkout.setFont(new Font("Courier New", Font.PLAIN, 30));
        
        
        
        String quotes = " ";

        //generating random number
        int rand = 1 + (int) (Math.random() * ((7 - 1) + 1));
        
        //each number has a different quote
        if (rand == 1) {
            quotes = "<html>“Persistence can change failure <br/>into extraordinary achievement.“ <br/>- Marv Levy</html>";
        }
        if (rand == 2) {
            quotes = "<html>“Winning and losing isnt everything. Sometimes, the journey is<br/> just as important as the outcome.“<br/>- Alex Morgan</html>";
        }
        if (rand == 3) {
            quotes = "<html>“The hard days are <br/>what make you stronger.“ <br/>- Aly Raisman</html>";
        }
        if (rand == 4) {
            quotes = "<html>“It's never too late to change <br/>old habits.“ <br/>- Florence Griffith Joyner</html>";
        }
        if (rand == 5) {
            quotes = "<html>“Follow your dreams, work hard, practice, and persevere.“ <br/>- Jillian Michaels</html>";
        }
        if (rand == 6) {
            quotes = "<html>“Life is about challenges and <br/>how we face up to them.“ <br/>- Martina Navratilova</html>";
        }
        if (rand == 7) {
            quotes = "<html>“I've failed over and over and over again in my life.“ <br/>And that is why I succeed. <br/>- Michael Jordan</html>";
        }

        //the quote will turn into a JLabel to be added to the panel
        JLabel quote = new JLabel(quotes);
        quote.setFont(new Font("DialogInput", Font.ITALIC, 14));

        //title and credits as JLabels will be added to panel
        JLabel nourish = new JLabel("Nourish");
        nourish.setFont(new Font("Courier New", Font.PLAIN, 60));

        JLabel credits = new JLabel("Created By Syna Yousefi");
        credits.setFont(new Font("Courier New", Font.BOLD, 13));

       
        
        //creating main menu buttons 
        JButton RecordDiet = new JButton("Record Diet");
        JButton RecordWorkout = new JButton("Record Workouts");
        JButton Workouts = new JButton("Workouts");
        JButton Challenges = new JButton("Week Challenges");
        JButton About = new JButton("About Nourish");
        //adding action listeners, colors and font to each button
        RecordDiet.addActionListener(this);
        RecordDiet.setOpaque(true);
        RecordDiet.setBackground(lightyellow);
        RecordDiet.setFont(new Font("Courier New", Font.PLAIN, 18));
        RecordWorkout.addActionListener(this);
        RecordWorkout.setOpaque(true);
        RecordWorkout.setBackground(lightyellow);
        RecordWorkout.setFont(new Font("Courier New", Font.PLAIN, 18));
        Workouts.addActionListener(this);
        Workouts.setOpaque(true);
        Workouts.setBackground(lightyellow);
        Workouts.setFont(new Font("Courier New", Font.PLAIN, 18));
        Challenges.addActionListener(this);
        Challenges.setOpaque(true);
        Challenges.setBackground(lightyellow);
        Challenges.setFont(new Font("Courier New", Font.PLAIN, 18));
        About.addActionListener(this);
        About.setOpaque(true);
        About.setBackground(lightyellow);
        About.setFont(new Font("Courier New", Font.PLAIN, 18));
        
        //setting background colour for panel
        panel.setBackground(lightgreen);
        panel.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        //adding all the JLabels and buttons to the panel
        panel.add(quote);
        panel.add(nourish);
        panel.add(RecordDiet);
        panel.add(RecordWorkout);
        panel.add(Workouts);
        panel.add(Challenges);
        panel.add(About);
        panel.add(credits);

        //setting up the frame and displaying it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Nourish Menu");
        frame.pack();
        frame.setVisible(true);
        
    }

    //main method that calls up graphics 
    public static void main(String[] args) {
        new Graphics();
    }

    //method recorddiet allows user to pick which diet they want to record 
    public void RecordDiet() {
        
        frame.dispose();
        
        //creating custom colours
        Color green = new Color(204, 255, 204);
        Color lightyellow = new Color(255, 255, 153);

        //setting the background colour of the panel
        panelrecorddiet.setBackground(lightyellow);
        panelrecorddiet.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelrecorddiet.setLayout(new GridLayout(0, 1, 10, 10));
        //adding all the Jlabels and buttons to the panel
        panelrecorddiet.add(welcome);
        panelrecorddiet.add(Breakfast);
        panelrecorddiet.add(Lunch);
        panelrecorddiet.add(Dinner);
        panelrecorddiet.add(backbutton);

        //displaying the frame
        framerecorddiet.add(panelrecorddiet, BorderLayout.CENTER);
        framerecorddiet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framerecorddiet.setTitle("Record Diet");
        framerecorddiet.pack();
        framerecorddiet.setVisible(true);
        frame.setVisible(false);

    }

    //method diet
    public void Diet() {

        framerecorddiet.dispose();
        framediet.dispose();

        //creating custom colour
        Color lightyellow = new Color(255, 250, 205);


        //setting background colour to panel
        paneldiet.setBackground(lightyellow);
        paneldiet.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        paneldiet.setLayout(new GridLayout(0, 1, 10, 10));
        //adding Jlabels and buttons to panel
        paneldiet.add(namemess);
        paneldiet.add(nametext);
        paneldiet.add(caloriesmess);
        paneldiet.add(caloriestext);
        paneldiet.add(proteinsmess);
        paneldiet.add(proteinstext);
        paneldiet.add(fatmess);
        paneldiet.add(fattext);
        paneldiet.add(carbsmess);
        paneldiet.add(carbstext);
        paneldiet.add(savediet);
        paneldiet.add(viewpastdiet);
        paneldiet.add(back2diet);

        //creating action listeners for the JTextFields
        nametext.addActionListener(this);
        caloriestext.addActionListener(this);
        proteinstext.addActionListener(this);
        fattext.addActionListener(this);
        carbstext.addActionListener(this);

        //sets up an action listener just for the textfields
        new ActionListener() {

            public void actionPerformed(ActionEvent b) {
                //taking user input from JTextField to strings
                String name = nametext.getText();
                String cal = caloriestext.getText();
                String pro = proteinstext.getText();
                String fa = fattext.getText();
                String car = carbstext.getText();

                //making strings into integer values
                int calories = Integer.parseInt(cal);
                int proteins = Integer.parseInt(pro);
                int fat = Integer.parseInt(fa);
                int carbs = Integer.parseInt(car);
                
            }
        };

        //setting the frame visible
        framediet.add(paneldiet, BorderLayout.CENTER);
        framediet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framediet.setTitle("Diets");
        framediet.pack();
        framediet.setVisible(true);
        framerecorddiet.setVisible(false);
        frame.setVisible(false);

        
    }

    //method actionperformed processes the button clicks
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getSource());

        String buttonid = e.getActionCommand();
        //gets the button id and turns it into String
        
        if (buttonid.equals("Record Diet")) {
            //sends to method recorddiet
             RecordDiet();
            frame.setVisible(false);
        }

        if (buttonid.equals("Record Workouts")) {
            //sets frame to not visible
            frameworkouts.setVisible(false);
            frameworkouts.dispose();
            //sends to method recordworkout
            RecordWorkout();
        }
        if (buttonid.equals("Workouts")) {
            //sends to method workout
            workout();
        }
        if (buttonid.equals("Week Challenges")) {
            //sends to method challenges
            challenges();
        }
        if (buttonid.equals("About Nourish")) {
            //sends to method aboutus
            aboutus();
        }

        if (buttonid.equals("Breakfast")) {
            //sets bld value to Breakfast
            bld = "Breakfast";
            //sends to method diet
            Diet();
        }

        if (buttonid.equals("Lunch")) {
            //sets bld value to Lunch
            bld = "Lunch";
            //sends to method diet
            Diet();
        }

        if (buttonid.equals("Dinner")) {
            //sets bld value to Dinner
            bld = "Dinner";
            //sends to method diet
            Diet();
        }

        if (buttonid.equals("Back")) {
            //if the button is back, set all frames to not visible except for main menu frame
            framerecorddiet.setVisible(false);
            framerecorddiet.dispose();
            framerecordworkout.setVisible(false);
            framerecordworkout.dispose();
            frameworkouts.setVisible(false);
            frameworkouts.dispose();
            framechallenges.setVisible(false);
            frameaboutus.setVisible(false);
            frameaboutus.dispose();
            
            frame.setVisible(true);
            repaint();
        }

        if (buttonid.equals("View Past Diet Records")) {
            //send to method filereaddiet
            filereaddiet();
        }

        if (buttonid.equals("Back to Diet")) {
            //sets all frames to not visible except for framerecorddiet
            framediet.setVisible(false);
            fpastrecord.setVisible(false);
            framediet.dispose();
            fpastrecord.dispose();
            framerecorddiet.setVisible(true);
        }

        if (buttonid.equals("Running")) {
            //sets worko value to running
            worko = "Running";
            //sends to method runnning
            running();
        }
        if (buttonid.equals("Cycling")) {
            //sets worko value to cycling
            worko = "Cycling";
            //sends to method cycling
            cycling();
        }
        if (buttonid.equals("Swimming")) {
            //sets worko value to swimming
            worko = "Swimming";
            //sends to method swimming
            swimming();
        }
        if (buttonid.equals("Weight and Body Training")) {
            //sets worko value to weight training
            worko = "Weight Training";
            //sends to method weighttraining
            weighttraining();
        }
       
        if (buttonid.equals("Save Diet")) {
                //converts JFieldTexts to string
                String name = nametext.getText();
                String cal = caloriestext.getText();
                String pro = proteinstext.getText();
                String fa = fattext.getText();
                String car = carbstext.getText();
                //string value is converted to integer
                int calories = Integer.parseInt(cal);
                int proteins = Integer.parseInt(pro);
                int fat = Integer.parseInt(fa);
                int carbs = Integer.parseInt(car);

               
            if (bld.equalsIgnoreCase("Breakfast")) {
                //creates a breakfast object (polymorphism)
            Diet breakfast = new Breakfast(name.toLowerCase(), calories, proteins, fat, carbs);
            System.out.println(breakfast);
            }
            
            if (bld.equalsIgnoreCase("Lunch")) {
                //creates a lunch object (polymorphism)
            Diet lunch = new Lunch(name.toLowerCase(), calories, proteins, fat, carbs);
          System.out.println(lunch);
            }
            
            if (bld.equalsIgnoreCase("Dinner")) {
                //creates a dinner object (polymorphism)
            Diet dinner = new Dinner(name.toLowerCase(), calories, proteins, fat, carbs);
          System.out.println(dinner);
            }
        }
        
        if (buttonid.equals("Save Workout")) {
                //converts JTextField to string
                String name = nametext.getText();
                String duration = durationtext.getText();
                String distance = distancetext.getText();
                String pace = pacetext.getText();
                String speed = avgspeedtext.getText();
                String length = lengthstext.getText();
                String exercise = exercisetext.getText();
                String reps = repstext.getText();
                String sets = setstext.getText();
                String weight =  weighttext.getText();
               
                
                //string gets converted to integer
                int re = Integer.parseInt(reps);
                int set = Integer.parseInt(sets);
                int wei = Integer.parseInt(weight);
                int len = Integer.parseInt(length);
                int spee = Integer.parseInt(speed);
                int dur = Integer.parseInt(duration);
                int dis = Integer.parseInt(distance);
                int pac = Integer.parseInt(pace);
                
                
                if (worko.equalsIgnoreCase("Running")) {
                    //creates a running object
                    Running run = new Running (name.toLowerCase(), dur, dis, pac);
                    System.out.println(run);
                }
                if (worko.equalsIgnoreCase("Cycling")) {
                    //creates a cycling object
                    Cycling cyc = new Cycling (name.toLowerCase(), dur, dis, spee);
                    System.out.println(cyc);
                }
                if (worko.equalsIgnoreCase("Swimming")) {
                    //creates a swimming object
                    Swimming swim = new Swimming (name.toLowerCase(), dur, len, spee);
                    System.out.println(swim);
                }
                if (worko.equalsIgnoreCase("Weight Training")) {
                    //creates a weighttraining object
                    WeightTrain weigh = new WeightTrain (name.toLowerCase(), exercise.toLowerCase(), re, set, wei);
                    System.out.println(weigh);
                }
        }
      
        
        if (buttonid.equals("View Past Workout Records")) {
            //sent to method filereadworkout
            filereadworkout();
        }
       
         if (buttonid.equals("Back to Workouts")) {
             //sets every frame to not visible except for framerecordworkout
             framerunning.setVisible(false);
             framerunning.dispose();
             framecycling.setVisible(false);
             framecycling.dispose();
             frameswim.setVisible(false);
             frameswim.dispose();
             frameweighttrain.setVisible(false);
             frameweighttrain.dispose();
             framepastrecordworkout.setVisible(false);
             framepastrecordworkout.dispose();
             
             framerecordworkout.setVisible(true);
             
        }
    }
    
    //method challenges prints out (as a jlabel) all the different week challenges 
    public void challenges() {
        frame.dispose();
        
        //create custom colour
        Color lightpurple = new Color(204, 153, 255);
        
        String monday = " ";
        String tuesday = " ";
        String wednesday = " ";
        String thursday = " ";
        String friday = " ";
        String saturday = " ";
        String sunday = " ";
        
        
        //creating random number
        //int rand = 1 + (int) (Math.random() * ((3 - 1) + 1));
        int rand = 3;
        //each random number has a different week of daily challenges
        if (rand == 1) {
            monday = "MONDAY → No carbs after lunch";
            tuesday = "TUESDAY → Eat meatless";
            wednesday = "WEDNESDAY → Drink 3 L of water";
            thursday = "THURSDAY → Make a green smoothie bowl for breakfast";
            friday = "FRIDAY → ISH DAY! Make a pizza for dinner";
            saturday = "SATURDAY → Meditate once in the morning and once at night";
            sunday = "SUNDAY → Go on a nature walk";
        }
        if (rand == 2) {
            monday = "MONDAY → Drink green tea instead of coffee";
            tuesday = "TUESDAY→ Fast by drinking only fruit and vegetable juices all day until dinner";
            wednesday = "WEDNESDAY → Try a new exercise you’ve never tried before";
            thursday = "THURSDAY → Eat vegan";
            friday = "FRIDAY → Bake something healthy";
            saturday = "SATURDAY → Add an extra serving of vegetable at lunch or dinner";
            sunday = "SUNDAY → ISH DAY! Make a dessert for a treat";
        }
        if (rand == 3) {
            monday = "MONDAY → Stretch in the morning and at night for 30 minutes";
            tuesday = "TUESDAY -->Clean out your fridge";
            wednesday = "WEDNESDAY -->Eliminate all sugar for the day";
            thursday = "THURSDAY → Eat fruit instead of snacks";
            friday = "FRIDAY → Only use reusable bags and cups";
            saturday = "SATURDAY → ISH DAY! Have your favourite take out for one meal";
            sunday = "SUNDAY → Make the day dairy free";
        }
        
        //setting string value to JLabel
        mondays.setText(monday);
        tuesdays.setText(tuesday);
        wednesdays.setText(wednesday);
        thursdays.setText(thursday);
        fridays.setText(friday);
        saturdays.setText(saturday);
        sundays.setText(sunday);
        
        
        //set the panel backgroud color
        panelchallenges.setBackground(lightpurple);
        panelchallenges.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelchallenges.setLayout(new GridLayout(0, 1, 10, 10));
        //adding all the JLabels and Jbuttons
        panelchallenges.add(welcometochallenges);
        panelchallenges.add(mondays);
        panelchallenges.add(tuesdays);
        panelchallenges.add(wednesdays);
        panelchallenges.add(thursdays);
        panelchallenges.add(fridays);
        panelchallenges.add(saturdays);
        panelchallenges.add(sundays);
        panelchallenges.add(backbutton);
        
        //setting up the frame and displaying it
        framechallenges.add(panelchallenges, BorderLayout.CENTER);
        framechallenges.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framechallenges.setTitle("Challenges");
        framechallenges.pack();
        framechallenges.setVisible(true);
        frame.setVisible(false);
    }
    
    //method workout prints out randomized workout plans
    public void workout() {
        frame.dispose();
        
        
        String whichworkoutmess = " ";
        String quote = " ";
        String workout = " ";
        String workout2 = " ";
        
        //creating custom colour
        Color lightpink = new Color(254, 194, 198);

        
        
        //generating random number
        int rand = 1 + (int) (Math.random() * ((4 - 1) + 1));
        //each random number has a different quote with different workout options
        if (rand == 1) {
            whichworkoutmess = "AB WORKOUT";
            quote = "Don't skip abs day!";
            workout = "<html>Sit Ups --> 2 Sets/30 Reps <br/> Right Side Crunches --> 2 Sets / 20 Reps<br/>Left Side Crunches --> 2 Sets / 20 Reps</html>";
            workout2 = "<html>Lying Leg Raises --> 3 Sets / 15 Reps<br/>V-Ups --> 3 Sets / 12 Reps</html>";
        }
        
        if (rand == 2) {
            whichworkoutmess = "CARDIO WORKOUT";
            quote = "Cardio is hardio!";
            workout = "<html>Running<br/>Biking<br/>Swimming</html>";
            workout2 = "<html>100 Jumping Jacks<br/>Jump Rope </html>";
        }
        
        if (rand == 3) {
            whichworkoutmess = "LEG WORKOUT";
            quote = "I workout so I can climb the stairs at hogwarts!";
            workout = "<html>Squats -->3 Sets / 20 Reps<br/>Leg Press Machine --> 3 Sets/15 Reps<br/>Seated Machine Leg Extensions -->3 Sets/20 Reps<br/>Flutter Kicks -->3 Sets/20 Reps</html>";
            workout2 = "<html>Barbell Squat -->4 Sets/25 Reps<br/>Dumbbell Lunges -->3 Sets/20 Reps </html>";
        }
        if (rand == 4) {
            whichworkoutmess = "ARM WORKOUT";
            quote = "Cardi... oh look weights!!";
            workout = "<html>Dumbbell Lateral Raise -->4 Sets /  10 Reps<br/>Forward Dumbbell Raise -->4 Sets / 10 Reps<br/>Dumbbell Overhead Shoulder Press -->3 Sets / 12 Reps</html>";
            workout2 = "<html>Bicep Curls -->2 Sets / 25 Reps<br/>Lying Tricep Extension--> 2 Sets / 20 Reps</html>";
        }
        
        //strings are assigned to JLabel variables to then be added to panel
        whichworkoutmes.setText(whichworkoutmess);
        workouts.setText(workout);
        workouts2.setText(workout2);
        quotesworkout.setText(quote);
        
        //panel is set up with backgroud colour and border
        panelworkouts.setBackground(lightpink);
        panelworkouts.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelworkouts.setLayout(new GridLayout(0, 1, 10, 5));
        //JLabels and buttons are added to the panels
        panelworkouts.add(welcometoworkout);
        panelworkouts.add(whichworkoutmes);
        panelworkouts.add(quotesworkout);
        panelworkouts.add(workouts);
        panelworkouts.add(workouts2);
        panelworkouts.add(recordworkout);
        panelworkouts.add(backbutton);
        
        //the frame is set up and made visible
        frameworkouts.add(panelworkouts, BorderLayout.CENTER);
        frameworkouts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameworkouts.setTitle("Workout Ideas");
        frameworkouts.pack();
        frameworkouts.setVisible(true);
        frame.setVisible(false);
        
    }
    
    //method filereadworkout reads and prints out previous workout records 
    public void filereadworkout() {
             ArrayList <String> pastrecordsworkoutstring = new ArrayList();

             framerunning.dispose();
             framecycling.dispose();
             frameswim.dispose();
             frameweighttrain.dispose();
             Color lightgreen = new Color(152, 251, 152);
        // String filename = name + "recordeddiet";
        String line = " ";
        
        //try catch statement used for file reader
        try {
            //create filereader and bufferedreader
            FileReader fr = new FileReader ("Workout.txt");
            BufferedReader br = new BufferedReader(fr);
            //while statement that will keep runnning until there is no more lines
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //adds the line to the array list as a JLabel to then later be printed onto a panel
                pastrecordsworkoutstring.add(line);
            }
            //closes the filereader
            fr.close();
        }
        
        catch (Exception e) {
            //prints error
            System.out.println(e);
        }
        

       String text = ""; 
        for(int i = 0; i < pastrecordsworkoutstring.size(); i++){
        text = text + pastrecordsworkoutstring.get(i);
        if(i < pastrecordsworkoutstring.size() - 2){
        text = text + "<br/>";   
        }
        pastworkouts.setText("<html>" +text +"</html>");
} 
        
        
        //panel is set up with backgroud colour and border
        panelpastrecordworkout.setBackground(lightgreen);
        panelpastrecordworkout.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
       // panelpastrecordworkout.setLayout(new GridLayout(0, 1, 10, 10));
        //JLabels and buttons are added to panel
        panelpastrecordworkout.add(welcometopastrecords);
        //JLabel arraylist is added to the panel 
        panelpastrecordworkout.add(pastworkouts);
        panelpastrecordworkout.add(backtoworkout);
        
        //the frame is set up and made visible
        framepastrecordworkout.add(panelpastrecordworkout, BorderLayout.CENTER);
        framepastrecordworkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framepastrecordworkout.setTitle("Past Records Workouts");
        framepastrecordworkout.pack();
        framepastrecordworkout.setVisible(true);
        framerunning.setVisible(false);
        framecycling.setVisible(false);
        frameswim.setVisible(false);
        frameweighttrain.setVisible(false);
        
    }
    
    
    //method filereaddiet prints out the diet past records as a JLabel 
    public void filereaddiet () {
       framediet.dispose();
       
      ArrayList <String> pastrecordsdietstring = new ArrayList();
       // String filename = name + "recordeddiet";
        String line = " ";
        
        //try catch statement used for file reader
        try {
            //create filereader and bufferedreader
            FileReader fr = new FileReader ("Diet.txt");
            BufferedReader br = new BufferedReader(fr);
            //while statement that will keep runnning until there is no more lines
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                //adds the line to the array list as a JLabel to then later be printed onto a panel
                pastrecordsdietstring.add(line);
            }
            //closes the filereader
            fr.close();
        }
        
        catch (Exception e) {
            //prints error
            System.out.println(e);
        }
        

       String text = ""; 
        for(int i = 0; i < pastrecordsdietstring.size(); i++){
        text = text + pastrecordsdietstring.get(i);
        if(i < pastrecordsdietstring.size() - 2){
        text = text + "<br/>";   
        }
        pastdiet.setText("<html>" +text +"</html>");
} 
        
        //panel is set up with backgroud colour and border
        ppastrecord.setBackground(Color.ORANGE);
        ppastrecord.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
       // ppastrecord.setLayout(new GridLayout(0, 1, 10, 10));
        //JLabels and buttons are added to panel
        ppastrecord.add(welcometopastrecords);
        //JLabel arraylist is added to the panel 
        ppastrecord.add(pastdiet);
        ppastrecord.add(back2diet);
        
        //the frame is set up and made visible
        fpastrecord.add(ppastrecord, BorderLayout.CENTER);
        fpastrecord.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fpastrecord.setTitle("Past Records Diet");
        fpastrecord.pack();
        fpastrecord.setVisible(true);
        framediet.setVisible(false);
        
    }
    //method recordworkout has buttons to see what the user wants to record
    public void RecordWorkout() {
        frame.dispose();
        
        Color lightblue = new Color(197, 239, 253);
        
        //setting up the panel color and border
        panelrecordworkout.setBackground(lightblue);
        panelrecordworkout.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelrecordworkout.setLayout(new GridLayout(0, 1, 10, 10));
        //adding all the Jlabels and buttons to the panel
        panelrecordworkout.add(welcometorecordworkout);
        panelrecordworkout.add(Running);
        panelrecordworkout.add(Cycling);
        panelrecordworkout.add(Swimming);
        panelrecordworkout.add(Weighttraining);
        panelrecordworkout.add(backbutton);
        
        //the frame is set up and made visible
        framerecordworkout.add(panelrecordworkout, BorderLayout.CENTER);
        framerecordworkout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framerecordworkout.setTitle("Record Workout");
        framerecordworkout.pack();
        framerecordworkout.setVisible(true);
        frame.setVisible(false);
    }
    
    //method running records running workout
    public void running () {
        frame.dispose();
        framerecordworkout.dispose();
        
        //sets up panel, sets backgroud colour and border
        panelrunning.setBackground(Color.pink);
        panelrunning.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelrunning.setLayout(new GridLayout(0, 1, 10, 10));
        //adds all the JLabels, JTextFields and JButtons
        panelrunning.add(welcometorunning);
        panelrunning.add(namemess);
        panelrunning.add(nametext);
        panelrunning.add(timemess);
        panelrunning.add(durationtext);
        panelrunning.add(distancemess);
        panelrunning.add(distancetext);
        panelrunning.add(pacemess);
        panelrunning.add(pacetext);
        panelrunning.add(saveworkout);
        panelrunning.add(viewpastworkout);
        panelrunning.add(back2workout);
        
        //adds action listeners to all the textfields
        nametext.addActionListener(this);
        durationtext.addActionListener(this);
        distancetext.addActionListener(this);
        pacetext.addActionListener(this);
        
        //creates a newactionlistener for the textfields
        new ActionListener() {
            
            public void actionPerformed(ActionEvent b) {
                //converts JTextField to string
                String name = nametext.getText();
                String duration = durationtext.getText();
                String distance = distancetext.getText();
                String pace = pacetext.getText();
               
                //makes string values into integers
                int dur = Integer.parseInt(duration);
                int dis = Integer.parseInt(distance);
                int pac = Integer.parseInt(pace);
 
            }
        };
        //the frame is set up and made visible
        framerunning.add(panelrunning, BorderLayout.CENTER);
        framerunning.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framerunning.setTitle("Running");
        framerunning.pack();
        framerunning.setVisible(true);
        framerecordworkout.setVisible(false);
        frame.setVisible(false);

    }
    
    //method cycling records cycling workout
    public void cycling () {
        frame.dispose();
        framerecordworkout.dispose();
        
        
        //sets up the panel, background colour and border, layout
        panelcycling.setBackground(Color.pink);
        panelcycling.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelcycling.setLayout(new GridLayout(0, 1, 10, 10));
        //adds jlabels and jtextfields and jbuttons to the panel
        panelcycling.add(welcometocycling);
        panelcycling.add(namemess);
        panelcycling.add(nametext);
        panelcycling.add(timemess);
        panelcycling.add(durationtext);
        panelcycling.add(distancemess);
        panelcycling.add(distancetext);
        panelcycling.add(avgspeed);
        panelcycling.add(avgspeedtext);
        panelcycling.add(saveworkout);
        panelcycling.add(viewpastworkout);
        panelcycling.add(back2workout);
        
        //adds action listener to jtextfields
        nametext.addActionListener(this);
        durationtext.addActionListener(this);
        distancetext.addActionListener(this);
        avgspeedtext.addActionListener(this);
        
        //creates a newactionlistener for the textfields
        new ActionListener() {

            public void actionPerformed(ActionEvent b) {
                //converts all textfields to strings
                String name = nametext.getText();
                String duration = durationtext.getText();
                String distance = distancetext.getText();
                String speed = avgspeedtext.getText();
                
                //certain strings are converted to integers
                int dur = Integer.parseInt(duration);
                int dis = Integer.parseInt(distance);
                int spee = Integer.parseInt(speed);
 
            }
        };
        
        //the frame is set up and made visible
        framecycling.add(panelcycling, BorderLayout.CENTER);
        framecycling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framecycling.setTitle("Cycling");
        framecycling.pack();
        framecycling.setVisible(true);
        framerecordworkout.setVisible(false);
        frame.setVisible(false);

    }
    
    //method swimming records swimming workout
    public void swimming () {
        frame.dispose();
        framerecordworkout.dispose();
        
        
        //setting up the panel, setting up backgroud colour and borders and layouts
        panelswim.setBackground(Color.pink);
        panelswim.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelswim.setLayout(new GridLayout(0, 1, 10, 10));
        //adding jtextfields, jlabel, jbuttons to the panels
        panelswim.add(welcometoswimming);
        panelswim.add(namemess);
        panelswim.add(nametext);
        panelswim.add(timemess);
        panelswim.add(durationtext);
        panelswim.add(lengthsmess);
        panelswim.add(lengthstext);
        panelswim.add(avgspeed);
        panelswim.add(avgspeedtext);
        panelswim.add(saveworkout);
        panelswim.add(viewpastworkout);
        panelswim.add(back2workout);
        
        //adding actionlisteners to jtextfields
        nametext.addActionListener(this);
        durationtext.addActionListener(this);
        lengthstext.addActionListener(this);
        avgspeedtext.addActionListener(this);
        
        //creates a newactionlistener for the textfields
        new ActionListener() {

            public void actionPerformed(ActionEvent b) {
                //converts jtextfields to string
                String name = nametext.getText();
                String duration = durationtext.getText();
                String length = lengthstext.getText();
                String speed = avgspeedtext.getText();
               
                //certain strings are converted to integers
                int dur = Integer.parseInt(duration);
                int len = Integer.parseInt(length);
                int spee = Integer.parseInt(speed);
 
            }
        };

        //the frame is set up and made visible
        frameswim.add(panelswim, BorderLayout.CENTER);
        frameswim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameswim.setTitle("Swimming");
        frameswim.pack();
        frameswim.setVisible(true);
        framerecordworkout.setVisible(false);
        frame.setVisible(false);
    }
    
    //method weighttraining records weight and body training workouts
    public void weighttraining () {
        frame.dispose();
        framerecordworkout.dispose();
        
        //setting up the panel, setting up backgroud colour and borders and layouts
        panelweighttrain.setBackground(Color.pink);
        panelweighttrain.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelweighttrain.setLayout(new GridLayout(0, 1, 10, 10));
        //adding jtextfields, jlabel, jbuttons to the panels
        panelweighttrain.add(welcometoweight);
        panelweighttrain.add(namemess);
        panelweighttrain.add(nametext);
        panelweighttrain.add(exercisemess);
        panelweighttrain.add(exercisetext);
        panelweighttrain.add(repsmess);
        panelweighttrain.add(repstext);
        panelweighttrain.add(setsmess);
        panelweighttrain.add(setstext);
        panelweighttrain.add(weightmess);
        panelweighttrain.add(messageforweight);
        panelweighttrain.add(weighttext);
        panelweighttrain.add(saveworkout);
        panelweighttrain.add(viewpastworkout);
        panelweighttrain.add(back2workout);
        
        //adding actionlisteners to jtextfields
        nametext.addActionListener(this);
        exercisetext.addActionListener(this);
        repstext.addActionListener(this);
        setstext.addActionListener(this);
        weighttext.addActionListener(this);
        
        //creates a newactionlistener for the textfields
        new ActionListener() {

            public void actionPerformed(ActionEvent b) {
                String name = nametext.getText();
                String exercise = exercisetext.getText();
                String reps = repstext.getText();
                String sets = setstext.getText();
                String weight =  weighttext.getText();
               
                int re = Integer.parseInt(reps);
                int set = Integer.parseInt(sets);
                int wei = Integer.parseInt(weight);
                
            }
        };

        //the frame is set up and made visible
        frameweighttrain.add(panelweighttrain, BorderLayout.CENTER);
        frameweighttrain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameweighttrain.setTitle("Weight and Body Training");
        frameweighttrain.pack();
        frameweighttrain.setVisible(true);
        framerecordworkout.setVisible(false);
        frame.setVisible(false);
        
    }
    
    //method about us shows information of what the application does and the mission
    public void aboutus() {
        
        //creating custom colour
        Color lightblue = new Color(197, 239, 253);
        //creating jbutton, adding actionlistener, setting colour, font and size
        
        //setting up the panel, setting up backgroud colour and borders and layouts
        panelaboutus.setBackground(lightblue);
        panelaboutus.setBorder(BorderFactory.createEmptyBorder(150, 100, 100, 100));
        panelaboutus.setLayout(new GridLayout(0, 1, 10, 10));
        //adding jlabels and jbuttonsto the panel
        panelaboutus.add(welcometoabout);
        panelaboutus.add(missions);
        panelaboutus.add(mission);
        panelaboutus.add(recorddmess);
        panelaboutus.add(recorddietmess);
        panelaboutus.add(recordwmess);
        panelaboutus.add(recordworkmess);
        panelaboutus.add(workoutmess2);
        panelaboutus.add(workoutsmess);
        panelaboutus.add(challengesmess);
        panelaboutus.add(challenges);
        panelaboutus.add(created);
        panelaboutus.add(backbutton);
        
       
        
        //the frame is set up and made visible
        frameaboutus.add(panelaboutus, BorderLayout.CENTER);
        frameaboutus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameaboutus.setTitle("About Nourish");
        frameaboutus.pack();
        frameaboutus.setVisible(true);
        frame.setVisible(false);
    }
}
