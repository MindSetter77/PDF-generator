package panels;

import main.Window;

import javax.swing.*;

public class OptionsPanel extends JPanel {

    public OptionsPanel(){
        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
    }

    public void setMeVisible(boolean value){
        this.setVisible(value);
    }
}
