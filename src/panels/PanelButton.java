package panels;

import main.Window;

import javax.swing.*;

public class PanelButton extends JPanel {
    JLabel dispay;
    public PanelButton(int y, int id){

        this.dispay = new JLabel("");
        switch(id){
            case 1:
                dispay.setIcon(new javax.swing.ImageIcon("src/source/historyicon.png"));
                break;
            case 2:
                dispay.setIcon(new javax.swing.ImageIcon("src/source/bookicon.png"));
                break;
            case 3:
                dispay.setIcon(new javax.swing.ImageIcon("src/source/settingsicon.png"));
                break;


        }
        dispay.setBounds(0, 0, 64, 64);
        this.add(dispay);
        this.setBounds(0, y, 64, 64);
        this.setBackground(Window.red1);
    }
}
