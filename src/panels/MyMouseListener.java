package panels;

import main.Window;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    LeftPanel leftPanel;
    Window window;
    public MyMouseListener(LeftPanel leftPanel, Window window){
        this.leftPanel = leftPanel;
        this.window = window;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(leftPanel.panelButton1)){
            leftPanel.panelButton1.setBackground(Window.red3);
            leftPanel.btn1c = true;
            leftPanel.btn2c = false;
            leftPanel.btn3c = false;
            leftPanel.panelButton2.setBackground(Window.red1);
            leftPanel.panelButton3.setBackground(Window.red1);
            window.seePanel(1);
        } else if (e.getSource().equals(leftPanel.panelButton2)) {
            leftPanel.panelButton2.setBackground(Window.red3);
            leftPanel.btn2c = true;
            leftPanel.btn1c = false;
            leftPanel.btn3c = false;
            leftPanel.panelButton1.setBackground(Window.red1);
            leftPanel.panelButton3.setBackground(Window.red1);
            window.seePanel(2);
        } else if (e.getSource().equals(leftPanel.panelButton3)) {
            leftPanel.panelButton3.setBackground(Window.red3);
            leftPanel.btn3c = true;
            leftPanel.btn2c = false;
            leftPanel.btn1c = false;
            leftPanel.panelButton2.setBackground(Window.red1);
            leftPanel.panelButton1.setBackground(Window.red1);
            window.seePanel(3);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(leftPanel.panelButton1)){
            if(!leftPanel.btn1c)leftPanel.panelButton1.setBackground(Window.red2);
        } else if (e.getSource().equals(leftPanel.panelButton2)) {
            if(!leftPanel.btn2c)leftPanel.panelButton2.setBackground(Window.red2);
        } else if (e.getSource().equals(leftPanel.panelButton3)) {
            if(!leftPanel.btn3c)leftPanel.panelButton3.setBackground(Window.red2);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(leftPanel.panelButton1)){
            if(!leftPanel.btn1c)leftPanel.panelButton1.setBackground(Window.red1);
        } else if (e.getSource().equals(leftPanel.panelButton2)) {
            if(!leftPanel.btn2c)leftPanel.panelButton2.setBackground(Window.red1);
        } else if (e.getSource().equals(leftPanel.panelButton3)) {
            if(!leftPanel.btn3c)leftPanel.panelButton3.setBackground(Window.red1);
        }
    }
}
