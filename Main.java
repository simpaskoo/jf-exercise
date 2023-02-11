package myPackage;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class Main {

    public static JFrame frame;
    public static int HEIGHT = 900;
    public static int WIDTH = 900;

    public static mujpanel blabla = new mujpanel();
    public static void windowx (){
        
        frame = new JFrame("Jsem borec");
        blabla.pozadi();
        frame.add(blabla);

        frame.setSize(WIDTH, HEIGHT);
        frame.setBackground(Color.black);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        windowx();

    }

}