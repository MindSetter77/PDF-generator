package main;

import panels.LeftPanel;
import panels.NumerologyPanel;
import panels.SettingsPanel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public static Color red5 = new Color(238, 69, 96);
    public static Color red4 = new Color(199, 44, 65);
    public static Color red3 = new Color(128, 19, 54);
    public static Color red2 = new Color(81, 10, 49);
    public static Color red1 = new Color(45, 20, 44);
    public static int WIDTH = 1200;
    public static int HEIGHT = 800;
    LeftPanel leftPanel;
    SettingsPanel settingsPanel;
    NumerologyPanel numerologyPanel;
    public Window(){
        this.leftPanel = new LeftPanel(this);

        this.settingsPanel = new SettingsPanel();
        settingsPanel.setVisible(false);

        this.numerologyPanel = new NumerologyPanel();
        numerologyPanel.setVisible(false);

        this.add(leftPanel);
        this.add(settingsPanel);
        this.add(numerologyPanel);

        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void seePanel(int id){
        switch (id){
            case 1:
                settingsPanel.setVisible(true);
                numerologyPanel.setVisible(false);
                break;
            case 2:
                settingsPanel.setVisible(false);
                numerologyPanel.setVisible(true);
                break;
            case 3:
                settingsPanel.setVisible(false);
                numerologyPanel.setVisible(false);
                break;
        }
    }
}
