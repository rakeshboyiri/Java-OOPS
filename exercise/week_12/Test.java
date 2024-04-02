import java.awt.*;
import java.awt.event.*;

public class Test extends Frame {

    static Button b1,b2;
    Test(){

        b1 = new Button("Click me");
        b1.setBounds(100,100,200,200);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                b1.setVisible(false);
                b2.setVisible(true);
            }
        });

        b2 = new Button("Click me");
        b2.setBounds(400,100,200,200);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b2.setVisible(false);
                b1.setVisible(true);
            }
        });
        b2.setVisible(false);

        add(b1);
        add(b2);

        setLayout(null);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }

    
}