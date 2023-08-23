package panels;

import main.Window;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    PanelButton panelButton1;
    PanelButton panelButton2;
    PanelButton panelButton3;

    boolean btn1c;
    boolean btn2c;
    boolean btn3c;

    MyMouseListener myMouseListener;
    public LeftPanel(Window window){
        this.myMouseListener = new MyMouseListener(this, window);

        this.btn1c = false;
        this.btn2c = false;
        this.btn3c = false;

        this.panelButton1 = new PanelButton(0, 1);
        this.panelButton2 = new PanelButton(64,2);
        this.panelButton3 = new PanelButton(297,3);

        panelButton1.addMouseListener(myMouseListener);
        panelButton2.addMouseListener(myMouseListener);
        panelButton3.addMouseListener(myMouseListener);

        this.add(panelButton1);
        this.add(panelButton2);
        this.add(panelButton3);

        this.setLayout(null);
        this.setBounds(0,0,64, Window.HEIGHT);
        this.setBackground(Window.red1);
    }
}
