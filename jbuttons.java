package myPackage;

import javax.swing.*;
import java.awt.*;

public class jbuttons extends JButton {

    public static JButton button;
    public static void button1(){

        button = new JButton();

        button.setSize(40, 40);
        button.setVisible(true);
        button.setBounds(700, 700, 40, 40);
        button.setBackground(Color.BLUE);
        //button.addActionListener();

    }

}
