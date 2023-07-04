package panels;

import java.util.ArrayList;

public class Numerologia {

    String imie;
    String nazwisko;
    String data;
    String znakZodiaku;
    String rahu;
    String ketu;

    int drogaZycia;
    int liczbaDuszy;
    int liczbaZewnetrzna;
    int miesiac;
    int pierwszeWarunkiZewnetrzne;
    int drugieWarunkiZewnetrzne;
    int trzecieWarunkiZewnetrzne;
    int czwarteWarunkiZewnetrzne;
    int rokNumerologiczny;
    public Numerologia(String imie, String nazwisko, String data, String znakZodiaku, String rahu, String ketu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.znakZodiaku = znakZodiaku;
        this.rahu = rahu;
        this.ketu = ketu;
    }

    public void start(){
        wyliczDrogeZycia(this.data);
        liczbaDuszy(this.imie, this.nazwisko);
        liczbaZewnetrzna(this.imie, this.nazwisko);
        sprawdzDlaMiesiace(this.data);
        warunkiZewnetrzne(this.data);
        rokNumerologiczny(this.drogaZycia);
        wezlyNS(this.rahu, this.ketu);

        this.drogaZycia = getSingleNumber(drogaZycia);
        this.liczbaDuszy = getSingleNumber(liczbaDuszy);
        this.liczbaZewnetrzna = getSingleNumber(liczbaZewnetrzna);

        this.pierwszeWarunkiZewnetrzne = getSingleNumber(pierwszeWarunkiZewnetrzne);
        this.drugieWarunkiZewnetrzne = getSingleNumber(drugieWarunkiZewnetrzne);
        this.trzecieWarunkiZewnetrzne = getSingleNumber(trzecieWarunkiZewnetrzne);
        this.czwarteWarunkiZewnetrzne = getSingleNumber(czwarteWarunkiZewnetrzne);

        this.rokNumerologiczny = getSingleNumber(this.rokNumerologiczny);

        //display();
    }

    public void wyliczDrogeZycia(String data){
        ArrayList<String> tablica = new ArrayList<>();

        for(int i = 0; i<data.length(); i++){
            char chr = data.charAt(i);
            String chrToString = String.valueOf(chr);
            tablica.add(chrToString);
        }

        int liczba = 0;

        for(String str : tablica){
            liczba += Integer.parseInt(str);
        }

        this.drogaZycia = liczba;
    }

    public void liczbaDuszy(String imie, String nazwisko){
        ArrayList <String> samogloski = new ArrayList<>();
        samogloski.add("a");
        samogloski.add("e");
        samogloski.add("i");
        samogloski.add("o");
        samogloski.add("u");
        samogloski.add("y");

        String imieINazwisko = imie + nazwisko;
        imieINazwisko = imieINazwisko.toLowerCase();
        String[] imieINazwiskoArr = imieINazwisko.split("");

        int liczbaSamoglosek = 0;

        for(String str : imieINazwiskoArr){
            for(String strSamo : samogloski){
                if(str.equals(strSamo)){
                    liczbaSamoglosek += returnLiczba(str);
                }
            }
        }

        this.liczbaDuszy = liczbaSamoglosek;
    }

    public void liczbaZewnetrzna(String imie, String nazwisko){
        char[] spolgloski = "bcdfghjklmnprstwz".toCharArray();

        String imieINazwisko = imie + nazwisko;
        imieINazwisko = imieINazwisko.toLowerCase();
        String[] imieINazwiskoArr = imieINazwisko.split("");

        int liczbaSpolglosek = 0;
        for(String str : imieINazwiskoArr){
            for(char chr : spolgloski){
                String literka = String.valueOf(chr);
                if(str.equals(literka)){
                    liczbaSpolglosek += returnLiczba(str);
                }
            }
        }
        this.liczbaZewnetrzna = liczbaSpolglosek;

    }

    public void sprawdzDlaMiesiace(String data){
        String miesiac = data.substring(2,4);
        this.miesiac = Integer.parseInt(miesiac);
    }

    public void warunkiZewnetrzne(String data){
        String dzien = data.substring(0, 2);
        String miesiac = data.substring(2, 4);
        String rok = data.substring(4, 8);

        int dzienI = Integer.valueOf(dzien);
        int miesiacI = Integer.valueOf(miesiac);
        int rokI = Integer.valueOf(rok);

        this.pierwszeWarunkiZewnetrzne = dzienI + miesiacI;
        this.drugieWarunkiZewnetrzne = dzienI + rokI;
        this.trzecieWarunkiZewnetrzne = this.pierwszeWarunkiZewnetrzne+ this.drugieWarunkiZewnetrzne;
        this.czwarteWarunkiZewnetrzne = miesiacI + rokI;


    }

    public void rokNumerologiczny(int drogaZycia){
        this.rokNumerologiczny = drogaZycia + 2023;
    }

    public void wezlyNS(String rahu, String ketu){

    }

    public int getSingleNumber(int zmienna){
        int zwrot = 0;
        String dane = String.valueOf(zmienna);
        if(dane.length()>1){
            ArrayList<Integer> tablica = new ArrayList<>();
            for(int i = 0; i<dane.length(); i++){
                tablica.add(Integer.parseInt(String.valueOf(dane.charAt(i))));
            }
            for(int i : tablica){
                zwrot+=i;
            }

            String zwrotS = String.valueOf(zwrot);
            if(zwrotS.length()>1){
                int l1 = zwrot/10;
                int l2 = zwrot%10;
                zwrot = l1 + l2;
            }
        }
        else {
            zwrot = zmienna;
        }

        return zwrot;



    }

    public void display(){
        System.out.println("Droga zycia: "+this.drogaZycia);
        System.out.println("Liczba duszy: "+this.liczbaDuszy);
        System.out.println("Liczba zewnetrzna: "+this.liczbaZewnetrzna);
        System.out.println("Miesiac: "+this.miesiac);
        System.out.println("=======================");
        System.out.println("PierwszeWarunkiZewnetrzne: "+this.pierwszeWarunkiZewnetrzne);
        System.out.println("DrugieWarunkiZewnetrzne: "+this.drugieWarunkiZewnetrzne);
        System.out.println("TrzecieWarunkiZewnetrzne: "+this.trzecieWarunkiZewnetrzne);
        System.out.println("CzwarteWarunkiZewnetrzne: "+this.czwarteWarunkiZewnetrzne);
        System.out.println("=======================");
        System.out.println("Rok numerologiczny: "+this.rokNumerologiczny);
    }

    public int returnLiczba(String str){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int returnNr = 1;
        for(char chr : alphabet){
            String literka = String.valueOf(chr);
            if(str.equals(literka)){
                return returnNr;
            }
            returnNr++;
            if(returnNr > 9){
                returnNr = 1;
            }
        }
        return 0;
    }
}
