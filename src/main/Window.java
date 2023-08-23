package main;

import panels.LeftPanel;
import panels.NumerologyPanel;
import panels.OptionsPanel;
import panels.SettingsPanel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public static Color red5 = new Color(218, 255, 251);
    public static Color red4 = new Color(153, 234, 217);
    public static Color red3 = new Color(100, 204, 197);
    public static Color red2 = new Color(23, 107, 135);
    public static Color red1 = new Color(0, 28, 48);
    public static int WIDTH = 600;
    public static int HEIGHT = 400;
    LeftPanel leftPanel;
    SettingsPanel settingsPanel;
    NumerologyPanel numerologyPanel;
    OptionsPanel optionsPanel;
    public Window(){

        this.optionsPanel = new OptionsPanel();
        this.leftPanel = new LeftPanel(this);

        this.settingsPanel = new SettingsPanel();
        settingsPanel.setVisible(false);

        this.numerologyPanel = new NumerologyPanel(settingsPanel);
        numerologyPanel.setVisible(false);

        this.add(leftPanel);
        this.add(settingsPanel);
        this.add(numerologyPanel);
        this.add(optionsPanel);

        MyRunnable r = new MyRunnable(this);
        Thread thread = new Thread(r);
        thread.start();

        this.setResizable(false);
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
                optionsPanel.setMeVisible(false);
                break;
            case 2:
                settingsPanel.setVisible(false);
                numerologyPanel.setVisible(true);
                optionsPanel.setMeVisible(false);
                break;
            case 3:
                settingsPanel.setVisible(false);
                numerologyPanel.setVisible(false);
                optionsPanel.setMeVisible(true);
                System.exit(0);

                break;
        }
    }
}
