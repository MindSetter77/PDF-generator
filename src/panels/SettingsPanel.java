package panels;

import main.Window;

import javax.swing.*;
import java.awt.*;

public class SettingsPanel extends JPanel {

    public SettingsPanel(){
        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
    }
}
