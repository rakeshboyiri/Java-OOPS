/*
 * 1. Write a small application with a default date 01/01/2000 and three 
 * combo boxes
 * displaying valid days, months & year (1990 – 2050). 
 * Change the displayed date with the
 * one chosen by user from these combo boxes.
 */


import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

public class Defaultdate extends Frame{
    public static JLabel l,l1,l2,l3,d1,d2,d3,d4,d5;
    public static JComboBox cb,cb1,cb2;

    public static void main(String[] args){
        new Defaultdate();
    }

    public Defaultdate(){
        Frame f = new Frame("Select your Date");
        f.setSize(400, 400);
        Integer days[]={01,02,03,04,05,06,07,8,9,10,11,12,13,14,15,16,17,     18,19,20,21,22,23,24,25,26,27,28,29,30,31};

        Integer months[]={01,02,03,04,05,06,07,8,9,10,11,12}; 

        Integer years[]=new Integer[61];

        int k=0;

        for(int i=1990; i<=2050;i++ ) {
            years[k]=i;
            k++;
        }

        l1=new JLabel("Date");
        l1.setBounds(50,80,80,20);
        l2=new JLabel("Month");
        l2.setBounds(160,80,80,20);
        l3=new JLabel("Year");
        l3.setBounds(260,80,80,20);
        cb=new JComboBox(days);
        cb.setBounds(50,100,80,20);
        cb1=new JComboBox(months);
        cb1.setBounds(160,100,70,20);
        cb2=new JComboBox(years);
        cb2.setBounds(260,100,70,20);
        l=new JLabel("Selected Date :");
        l.setBounds(105,160,200,100);
        
        d1=new JLabel("01");
        d1.setBounds(105,200,300,100);
         
        d4=new JLabel("/");
        d4.setBounds(130,200,300,100);
        
        d2=new JLabel("01");
        d2.setBounds(140,200,300,100);
        d5=new JLabel("/");
        d5.setBounds(160,200,300,100);
        d3=new JLabel("2000");

        d3.setBounds(175,200,300,100);
        
        f.add(cb);
        f.add(cb1);
        f.add(cb2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(d1);
        f.add(d2);
        f.add(d3);
        f.add(d4);
        f.add(d5);
        f.add(l);   
        
        cb.addActionListener(new ActionListener(){
        @java.lang.Override
        public void actionPerformed(ActionEvent e){
            int date=(int)cb.getSelectedItem();
            d1.setText(String.valueOf(date));
        }
        });

        cb1.addActionListener(new ActionListener(){
        @java.lang.Override
        public void actionPerformed(ActionEvent e){ 
            int day=(int)cb1.getSelectedItem();
            d2.setText(String.valueOf(day));
        }
        });


        cb2.addActionListener(new ActionListener(){
        @java.lang.Override
        public void actionPerformed(ActionEvent e){ 
            int yr=(int)cb2.getSelectedItem();
            d3.setText(String.valueOf(yr));
    }
    });

    f.setLayout(null);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() { public void
    windowClosing(WindowEvent e) { System.exit(0);
    }
    });
    }




}