package panels;

import main.Window;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class SettingsPanel extends JPanel {

    JTextField textField;
    JLabel label;
    JButton btn;

    String path;


    JFileChooser file;

    public SettingsPanel(){
        this.file = new JFileChooser();
        this.add(file);
        file.setMultiSelectionEnabled(true);
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        file.setFileHidingEnabled(false);
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File f = file.getSelectedFile();
            this.path = f.getPath();
            System.err.println(f.getPath());
        }

        Icon imgIcon = new ImageIcon("src/source/Giphy.gif");
        JLabel label = new JLabel(imgIcon);
        label.setBounds(0, 0, 400, 365); // for example, you can use your own values

        this.add(label);

        Icon imgIcon3 = new ImageIcon("src/source/trippy.gif");
        JLabel label3 = new JLabel(imgIcon3);
        label3.setBounds(400, 250, 150, 150); // for example, you can use your own values

        this.add(label3);

        Icon imgIcon1 = new ImageIcon("src/source/fxcY.gif");
        JLabel label1 = new JLabel(imgIcon1);
        label1.setBounds(400, 0, 150, 150); // for example, you can use your own values

        this.add(label1);

        Icon imgIcon2 = new ImageIcon("src/source/200w.gif");
        JLabel label2 = new JLabel(imgIcon2);
        label2.setBounds(400, 150, 150, 150); // for example, you can use your own values

        this.add(label2);






        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
        this.setLayout(null);
    }



    public String returnPath(){


        return this.path;
    }
}
