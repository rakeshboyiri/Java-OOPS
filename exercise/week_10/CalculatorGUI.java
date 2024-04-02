import javax.swing.*;
import java.awt.*;

public class CalculatorGUI extends JFrame {

    public CalculatorGUI() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        TextField t1 = new TextField();        
        t1.setBounds(300,100,800,100);
        add(t1);
        Button b1 = new Button("/");
        b1.setBounds(300,200,270,100);
        add(b1);

        Button b2 = new Button("%");
        b2.setBounds(570,200,270,100);
        add(b2);

        Button b3 = new Button("+");
        b3.setBounds(840,200,260,100);
        add(b3);


        Button b4 = new Button("1");
        b4.setBounds(300,300,270,100);
        add(b4);

        Button b5 = new Button("2");
        b5.setBounds(570,300,270,100);
        add(b5);

        Button b6 = new Button("3");
        b6.setBounds(840,300,260,100);
        add(b6);

        Button b7 = new Button("4");
        b7.setBounds(300,400,270,100);
        add(b7);

        Button b8 = new Button("5");
        b8.setBounds(570,400,270,100);
        add(b8);

        Button b9 = new Button("6");
        b9.setBounds(840,400,260,100);
        add(b9);

        Button b10 = new Button("7");
        b10.setBounds(300,500,270,100);
        add(b10);

        Button b11 = new Button("8");
        b11.setBounds(570,500,270,100);
        add(b11);

        Button b12 = new Button("9");
        b12.setBounds(840,500,260,100);
        add(b12);        

        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
         new CalculatorGUI();
    }
}
