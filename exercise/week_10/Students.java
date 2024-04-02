/*
    .Create a GUI with title STUDENT which has labels roll no., name, course, gender, class,
    address with textboxes for taking input from the user(without any functionality) and checkboxes
    for selecting the course, radio buttons for selecting gender with appropriate background color. 
*/



import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;

public class Students extends Frame{
    public  Label l,l1,l2,l3,l4,l5,l6;
    public  TextField t1,t2,t3,t4;
    public  JComboBox cb;

    public Students(){
        Frame f=new Frame("Registration form");

        l1=new Label("Roll no");
        l1.setBounds(50,80,50,20);
        l2=new Label("Name");
        l2.setBounds(50,110,50,20);
        l3=new Label("Class");
        l3.setBounds(50,140,50,20);
        l4=new Label("Gender");
        l4.setBounds(50,170,50,20);
        l5=new Label("Course");
        l5.setBounds(50,200,50,20);
        l6=new Label("Address");
        l6.setBounds(50,230,50,20);

        String course[]={"Ds","Daa","OOPS","c"};

        cb=new JComboBox(course);
        cb.setBounds(140,200,80,20);
        t1=new TextField(); 
        t1.setBounds(140,80,100,20);
        t2=new TextField();
        t2.setBounds(140,110,100,20);
        t3=new TextField();
        t3.setBounds(140,230,100,20); 
        CheckboxGroup cbg=new CheckboxGroup(); 
        Checkbox box1=new Checkbox("c1",false,cbg); 
        Checkbox box2=new Checkbox("c2",false,cbg); 
        Checkbox box3=new Checkbox("c3",false,cbg);

        box1.setBounds(140,140,40,20);
        box2.setBounds(200,140,40,20);
        box3.setBounds(240,140,40,20); 
        CheckboxGroup cbg1=new CheckboxGroup(); 
        Checkbox box4=new Checkbox("Male",true,cbg1); 
        Checkbox box5=new Checkbox("Female",false,cbg1);

        box4.setBounds(140,170,60,20);
        box5.setBounds(200,170,60,20); 
        Button b=new Button("Submit");
        b.setBounds(140,280,70,30);
        l=new Label("Submitted!");
        l.setBounds(140,320,60,30);
        l.setVisible(false);
        b.addActionListener(new ActionListener(){
       
        public void actionPerformed(ActionEvent e){
        l.setVisible(true);
        }
    });
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l6);
    f.add(t1);
    f.add(t2);
    f.add(box1);
    f.add(box2);
    f.add(box3);
    f.add(box4);
    f.add(box5);
    f.add(l5);
    f.add(cb);
    f.add(t3);
    f.add(b);
    f.add(l);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() { public
    void windowClosing(WindowEvent e) {
    System.exit(0);
    }
    });
    }
    public void actionPerformed(ActionEvent e){
        l.setVisible(true);
    }
    public static void main(String[] args) {
        new Students();
}
}