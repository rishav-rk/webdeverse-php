
//Create a simple AWT application that displays a Choice with Custom Layout.
import java.awt.*;
import java.awt.event.*;

class choice extends Frame {
    choice(){
        super("Choice Example");
        setLayout(null);
        Choice choice = new Choice();
        choice.setBounds(100, 100, 75, 75);
        choice.add("Java");
        choice.add("C++");
        choice.add("Rust");
        add(choice);
        setSize(400, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });


    }

    public static void main(String[] args) {
        new choice();
    }
}
