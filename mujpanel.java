package myPackage;

import javax.swing.*;
import java.awt.*;

public class mujpanel extends JPanel {
    public static JPanel panel;
    public static jbuttons buttons = new jbuttons();

    public static void pozadi(){

        panel = new JPanel();
        buttons.button1();

        panel.setBackground(Color.cyan);
        panel.setVisible(true);
        panel.setBounds(0, 0, 900, 900);
        //panel.add(button);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);

    }

}
