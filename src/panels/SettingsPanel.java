package panels;

import main.Window;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.nio.file.Paths;

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



        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
    }

    public String returnPath(){


        return this.path;
    }
}
