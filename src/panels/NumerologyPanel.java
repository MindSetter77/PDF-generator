package panels;

import main.Window;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class NumerologyPanel extends JPanel {
    JTextField imie;
    JTextField nazwisko;
    JTextField data;
    JTextField znakZodiaku;
    JTextField rahu;
    JTextField ketu;



    MyNumerologyListener myNumerologyListener;

    GeneratorBtn generatorBtn;



    public NumerologyPanel(SettingsPanel settingsPanel){


        this.myNumerologyListener = new MyNumerologyListener(this, settingsPanel);

        imie = new JTextField("Imie");
        imie.setBounds(150,10,200,40);
        setupButtons(imie);

        this.nazwisko = new JTextField("Nazwisko");
        nazwisko.setBounds(150,60,200,35);
        setupButtons(nazwisko);

        this.data = new JTextField("Data");
        data.setBounds(150, 110, 200, 35);
        setupButtons(data);

        this.znakZodiaku = new JTextField("Znak zodiaku");
        znakZodiaku.setBounds(150, 160, 200, 35);
        setupButtons(znakZodiaku);

        this.rahu = new JTextField("Rahu");
        rahu.setBounds(150, 210, 200, 35);
        setupButtons(rahu);

        this.ketu = new JTextField("Ketu");

        setupButtons(ketu);

        this.generatorBtn = new GeneratorBtn();
        generatorBtn.addMouseListener(myNumerologyListener);

        this.add(generatorBtn);




        this.add(imie);
        this.add(nazwisko);
        this.add(data);
        this.add(znakZodiaku);
        this.add(rahu);
        this.add(ketu);




        this.setLayout(null);
        this.setBounds(64, 0, Window.WIDTH-64, Window.HEIGHT);
        this.setBackground(Window.red4);
    }

    public void setupButtons(JTextField jTextField){
        jTextField.addMouseListener(this.myNumerologyListener);

        Font fieldFont = new Font("Georgia", Font.PLAIN, 20);
        jTextField.setFont(fieldFont);
        jTextField.setBorder(null);
        jTextField.setBackground(Window.red5);
        jTextField.setForeground(Color.darkGray);
        jTextField.setHorizontalAlignment(JTextField.CENTER);

    }
}
