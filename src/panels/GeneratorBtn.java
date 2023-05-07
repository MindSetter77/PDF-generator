package panels;

import main.Window;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GeneratorBtn extends JPanel {
    JLabel display;

    public GeneratorBtn(){
        display = new JLabel("Generuj!");
        display.setBounds(0, 0, 200, 35);
        display.setHorizontalAlignment(JLabel.CENTER);
        Font fieldFont = new Font("Georgia", Font.PLAIN, 20);
        display.setVerticalAlignment(JLabel.CENTER);
        display.setFont(fieldFont);
        this.add(display);
        display.setBorder(new LineBorder(Window.red3, 2));


        this.setLayout(null);
        this.setBounds(486, 650, 200, 35);
        this.setBackground(Window.red5);
    }
}
