import java.awt.BorderLayout;
import java.awt.Button;

class Awt extends java.awt.Frame {

    private java.awt.Button b[];
    Awt() {
        BorderLayout b_layout = new BorderLayout();
        setSize(500, 400);
        setLayout(b_layout);

        // Making buttons
        b = new java.awt.Button[5];

        //setting sizes and giving labels to buttons
        for (int i = 0; i < 5; i++) {
            b[i]=new Button();
            b[i].setLabel("Button "+(i+1));
            b[i].setSize(20, 20);
        }

            add(b[0],b_layout.NORTH);
            add(b[1],b_layout.EAST);
            add(b[2],b_layout.SOUTH);
            add(b[3],b_layout.WEST);
            add(b[4],b_layout.CENTER);
        
        setVisible(true);
        addWindowListener(new window());
    }
    public static void main(String[] args)
    {
        new Awt();
    }
}
class window extends java.awt.event.WindowAdapter   {
    public void windowClosing(java.awt.event.WindowEvent w)
    {
        System.exit(0);
    }
}