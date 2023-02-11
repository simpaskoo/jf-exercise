package myPackage;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class Main {

    public static JFrame frame;

    //public static JButton button;
    //public static JPanel panel;
    public static int HEIGHT = 900;
    public static int WIDTH = 900;

    public static mujpanel blabla = new mujpanel();
    //public static mujpanel aa = new mujpanel();
    public static void windowx (){

        //button = new JButton("klick");
        //panel = new JPanel();
        frame = new JFrame("Jsem borec");
        blabla.pozadi();
        frame.add(blabla);

        /*button.setVisible(true);
        button.setBackground(Color.orange);
        button.setSize(100, 100);
        button.setBounds(0, 0, 100, 100);
        button.setBounds(0, 0, 100, 100);

        panel.setVisible(true);
        panel.setBackground(Color.cyan);
        panel.setBounds(0, 0, 900, 900);
        panel.add(button);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);*/

        frame.setSize(WIDTH, HEIGHT);
        frame.setBackground(Color.black);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        //frame.add(panel);

    }

    public static void main(String[] args) {

        windowx();

    }

}