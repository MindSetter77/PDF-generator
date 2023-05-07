package panels;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyNumerologyListener implements MouseListener {

    NumerologyPanel numerologyPanel;
    public MyNumerologyListener(NumerologyPanel numerologyPanel){
        this.numerologyPanel = numerologyPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(numerologyPanel.imie)){

        } else if(e.getSource().equals(numerologyPanel.nazwisko)){

        } else if(e.getSource().equals(numerologyPanel.data)){

        } else if(e.getSource().equals(numerologyPanel.znakZodiaku)){

        } else if(e.getSource().equals(numerologyPanel.rahu)){

        } else if(e.getSource().equals(numerologyPanel.ketu)){

        } else if (e.getSource().equals(numerologyPanel.generatorBtn)) {

            Numerologia numerologia = new Numerologia(
                    numerologyPanel.imie.getText(),
                    numerologyPanel.nazwisko.getText(),
                    numerologyPanel.data.getText(),
                    numerologyPanel.znakZodiaku.getText(),
                    numerologyPanel.rahu.getText(),
                    numerologyPanel.ketu.getText()
            );

            numerologia.start();



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
        if(e.getSource().equals(numerologyPanel.imie)){
            if(numerologyPanel.imie.getText().equals("Imie"))numerologyPanel.imie.setText("");
        } else if(e.getSource().equals(numerologyPanel.nazwisko)){
            if(numerologyPanel.nazwisko.getText().equals("Nazwisko"))numerologyPanel.nazwisko.setText("");
        } else if(e.getSource().equals(numerologyPanel.data)){
            if(numerologyPanel.data.getText().equals("Data"))numerologyPanel.data.setText("");
        } else if(e.getSource().equals(numerologyPanel.znakZodiaku)){
            if(numerologyPanel.znakZodiaku.getText().equals("Znak zodiaku"))numerologyPanel.znakZodiaku.setText("");
        } else if(e.getSource().equals(numerologyPanel.rahu)){
            if(numerologyPanel.rahu.getText().equals("Rahu"))numerologyPanel.rahu.setText("");
        } else if(e.getSource().equals(numerologyPanel.ketu)){
            if(numerologyPanel.ketu.getText().equals("Ketu"))numerologyPanel.ketu.setText("");
        } else if (e.getSource().equals(numerologyPanel.generatorBtn)) {

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(numerologyPanel.imie)){
            if(numerologyPanel.imie.getText().equals(""))numerologyPanel.imie.setText("Imie");
        } else if(e.getSource().equals(numerologyPanel.nazwisko)){
            if(numerologyPanel.nazwisko.getText().equals(""))numerologyPanel.nazwisko.setText("Nazwisko");
        } else if(e.getSource().equals(numerologyPanel.data)){
            if(numerologyPanel.data.getText().equals(""))numerologyPanel.data.setText("Data");
        } else if(e.getSource().equals(numerologyPanel.znakZodiaku)){
            if(numerologyPanel.znakZodiaku.getText().equals(""))numerologyPanel.znakZodiaku.setText("Znak zodiaku");
        } else if(e.getSource().equals(numerologyPanel.rahu)){
            if(numerologyPanel.rahu.getText().equals(""))numerologyPanel.rahu.setText("Rahu");
        } else if(e.getSource().equals(numerologyPanel.ketu)){
            if(numerologyPanel.ketu.getText().equals(""))numerologyPanel.ketu.setText("Ketu");
        }
    }
}
