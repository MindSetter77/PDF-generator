package panels;

import main.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPanel extends JPanel {

    JTextField textField;
    JLabel label;
    JButton btn;

    String path;

    public SettingsPanel(){
        this.label = new JLabel("src: ");
        this.textField = new JTextField();
        this.btn = new JButton();

        this.setLayout(null);

        label.setBounds(0,0,50,20);
        textField.setBounds(50,0,200,25);
        btn.setBounds(500,500,100,30);
        btn.setText("save");

        this.add(label);
        this.add(textField);
        this.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this.path = textField.getText();
            }
        });

        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
    }
}
