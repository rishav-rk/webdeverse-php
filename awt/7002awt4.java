// Create a simple AWT application that displays a TextField with FlowLayout manager


class Main extends java.awt.Frame   {
    Main()
    {
        //Setting Layout Manager and sizing the Frame.
        setLayout(new java.awt.FlowLayout());
        setSize(600,600);
        
        //Making TextField
        java.awt.TextField tf = new java.awt.TextField("Write your text here");
        //Adding TextField to the Frame
        add(tf);
        setVisible(true);

        //adding window listener so that window can close.
        addWindowListener(new window());
    }
    public static void main(String[] args) {
        new Main();
    }
}
class window extends java.awt.event.WindowAdapter   {

    //function for closing the frame which is to be called when user try to close window.
    public void windowClosing(java.awt.event.WindowEvent w)
    {
        System.exit(0);
    }
}