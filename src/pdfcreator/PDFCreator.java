package pdfcreator;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.*;
import panels.Cykl;
import panels.SettingsPanel;


import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.MalformedInputException;

public class PDFCreator {
    static public Font ChopinScript40;
    static public Font ChopinScript30;
    static public Font ChopinScript20;

    static public Font AlegreyaSans20Bold;
    static public Font AlegreyaSans18;
    static public Font AlegreyaSans18Bold;

    BazaDanych bazaDanych;

    String imie;
    String nazwisko;
    String dataUrodzenia;
    int drogaZycia;
    int liczbaDuszy;
    int liczbaZewnetrzna;

    int pwz;
    int dwz;
    int twz;
    int cwz;

    int rokwibracji;

    String znakZodiaku;

    String rahu;
    String ketu;

    public PDFCreator(String imie, String nazwisko, String dataUrodzenia,
                      int drogaZycia, int liczbaDuszy, int liczbaZewnetrzna,
                      int pwz, int dwz, int twz, int cwz,
                      int rokwibracji, String znakZodiaku,
                      String rahu, String ketu){
        try{
            createFonts();
        } catch (IOException | DocumentException ex){
            ex.printStackTrace();
        }


        this.bazaDanych = new BazaDanych(this);

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.drogaZycia = drogaZycia;
        this.liczbaDuszy = liczbaDuszy;
        this.liczbaZewnetrzna = liczbaZewnetrzna;

        this.pwz = pwz;
        this.dwz = dwz;
        this.twz = twz;
        this.cwz = cwz;

        this.rokwibracji = rokwibracji;

        this.znakZodiaku = znakZodiaku;

        this.rahu = rahu;
        this.ketu = ketu;

    }
    public void create(String path){
        try{
            int lineSpacingText = 20;

            String zmienna = this.imie+"_"+this.nazwisko;

            path += "\\"+zmienna+".pdf";
            System.out.println(path);
            Document document = new Document(PageSize.A4);

            PdfWriter.getInstance(document, new FileOutputStream(path));
            Paragraph space = new Paragraph(" ");
            document.open();
            //Główna wiadomosc
            Paragraph portretNumerologiczny = new Paragraph(new Phrase(10f,"Portret Numerologiczny",
                    ChopinScript40));
            portretNumerologiczny.setAlignment(Element.ALIGN_CENTER);

            //Zdjecie
            Image image = Image.getInstance("src/source/awd.png");

            //Imie i nazwisko
            Paragraph imieINazwisko = new Paragraph(new Phrase(10f,this.imie+" "+this.nazwisko,
                    ChopinScript30));
            imieINazwisko.setAlignment(Element.ALIGN_CENTER);

            String day  = this.dataUrodzenia.substring(0, 2);
            String month  = this.dataUrodzenia.substring(2, 4);
            String year  = this.dataUrodzenia.substring(4, 8);

            //Data urodzenia
            Paragraph data = new Paragraph(new Phrase(10f,day+"."+month+"."+year,
                    ChopinScript20));
            data.setAlignment(Element.ALIGN_CENTER);

            //Droga zycia
            Paragraph drogaZyciaNaglowek = new Paragraph(new Phrase(10f,"DROGA ZYCIA W WIBRACJI "+this.drogaZycia,
                    AlegreyaSans20Bold));
            drogaZyciaNaglowek.setAlignment(Element.ALIGN_CENTER);

            //Droga cel
            Paragraph drogaZyciaCel = new Paragraph(new Phrase(10f,"CEL: "+bazaDanych.drogaZyciaCel(drogaZycia),
                    AlegreyaSans20Bold));
            drogaZyciaCel.setAlignment(Element.ALIGN_CENTER);

            //Droga zycia text
            Paragraph drogaZyciaText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.drogaZycia(drogaZycia),
                    AlegreyaSans18));

            //Liczba duszy
            Paragraph liczbaDuszyNaglowek = new Paragraph(new Phrase(10f,"Liczba Duszy:",
                    AlegreyaSans20Bold));
            liczbaDuszyNaglowek.setAlignment(Element.ALIGN_CENTER);

            //Liczba Duszy cel
            Paragraph liczbaDuszyCel = new Paragraph(new Phrase(10f,"Wibracja "+this.liczbaDuszy,
                    AlegreyaSans20Bold));
            liczbaDuszyCel.setAlignment(Element.ALIGN_CENTER);

            //Droga zycia text
            Paragraph liczbaDuszyText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.liczbaDuszy(this.liczbaDuszy),
                    AlegreyaSans18));

            //Liczba realizacji zewnętrznej/ intymnej
            Paragraph liczbaRealizacji = new Paragraph(new Phrase(10f,"Liczba realizacji zewnętrznej/ intymnej",
                    AlegreyaSans20Bold));
            liczbaRealizacji.setAlignment(Element.ALIGN_CENTER);

            //Liczba zewnetrzna
            Paragraph liczbaZewnetrznaCel = new Paragraph(new Phrase(10f,"Liczba zewnetrzna: "+this.liczbaZewnetrzna,
                    AlegreyaSans20Bold));
            liczbaZewnetrznaCel.setAlignment(Element.ALIGN_CENTER);

            //Liczba zewnetrzna text
            Paragraph liczbaZewnetrznaText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.liczbaZewnetrzna(this.liczbaZewnetrzna),
                    AlegreyaSans18));

            //Jako osoba urodzona
            Paragraph jakoOsobaUrodzona = new Paragraph(new Phrase(10f,bazaDanych.jakoOsobaUrodzona(dataUrodzenia),
                    ChopinScript30));
            jakoOsobaUrodzona.setAlignment(Element.ALIGN_CENTER);

            int miesiac = Integer.parseInt(dataUrodzenia.substring(2,4));
            if(miesiac == 10) miesiac = 1;
            if(miesiac == 11) miesiac = 2;
            if(miesiac == 12) miesiac = 3;

            document.add(space);

            Paragraph cyklWWibracji = new Paragraph(new Phrase(10f,"Cykl w wibracji "+miesiac,
                    PDFCreator.AlegreyaSans20Bold));
            cyklWWibracji.setAlignment(Element.ALIGN_CENTER);


            Paragraph cyklWWibracjiText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.cyklWWibracjiText(miesiac),
                    PDFCreator.AlegreyaSans18));
            cyklWWibracjiText.setAlignment(Element.ALIGN_CENTER);

            Paragraph lekcjaCyklu = new Paragraph(new Phrase(10f,"Lekcja cyklu w wibracji "+miesiac,
                    PDFCreator.AlegreyaSans20Bold));
            lekcjaCyklu.setAlignment(Element.ALIGN_CENTER);

            Paragraph lekcjaCykluText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.lekcjaCykluText(miesiac),
                    PDFCreator.AlegreyaSans18));

            Paragraph celeCyklu = new Paragraph(new Phrase(10f,"Cele cyklu w wibracji "+miesiac,
                    PDFCreator.AlegreyaSans20Bold));
            celeCyklu.setAlignment(Element.ALIGN_CENTER);

            Paragraph celeCykluText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.celeCyklu(miesiac, dataUrodzenia),
                    PDFCreator.AlegreyaSans18));








            //Warunki zewnetrzne
            Paragraph warunkiZewnetrzneNaglowek = new Paragraph(new Phrase(10f,"WARUNKI ZEWNETRZNE :",
                    AlegreyaSans20Bold));
            warunkiZewnetrzneNaglowek.setAlignment(Element.ALIGN_CENTER);

            //warunki



            Paragraph pierwszeWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Do 25 roku życia wibracja liczby: "+this.pwz + "\n- pierwsze warunki zewnętrzne",
                    AlegreyaSans18));




            Paragraph drugieWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 25 do 34 roku życia wibracja liczby: "+this.dwz+"\n- drugie warunki zewnętrzne",
                    AlegreyaSans18));




            Paragraph trzecieWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 34 do 43 roku życia wibracja liczby: "+this.twz+"\n- trzecie warunki zewnętrzne",
                    AlegreyaSans18));




            Paragraph czwarteWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 43 roku życia będziesz w wibracja liczby: "+this.cwz+"\n- czwarte warunki zewnętrzne",
                    AlegreyaSans18));

            Paragraph naglowekPierwszy = new Paragraph(new Phrase(10f,"Warunki zewnętrzne w wibracji "+this.pwz+": ",
                    AlegreyaSans20Bold));
            naglowekPierwszy.setAlignment(Element.ALIGN_CENTER);

            Paragraph naglowekPierwszyText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.warunkiWWibracji(this.pwz),
                    AlegreyaSans18));

            Paragraph naglowekDrugi = new Paragraph(new Phrase(10f,"Warunki zewnętrzne w wibracji "+this.dwz+": ",
                    AlegreyaSans20Bold));
            naglowekDrugi.setAlignment(Element.ALIGN_CENTER);

            Paragraph naglowekDrugiText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.warunkiWWibracji(this.dwz),
                    AlegreyaSans18));

            Paragraph naglowekTrzeci = new Paragraph(new Phrase(10f,"Warunki zewnętrzne w wibracji "+this.twz+": ",
                    AlegreyaSans20Bold));
            naglowekTrzeci.setAlignment(Element.ALIGN_CENTER);

            Paragraph naglowekTrzeciText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.warunkiWWibracji(this.twz),
                    AlegreyaSans18));

            Paragraph naglowekCzwarty = new Paragraph(new Phrase(10f,"Warunki zewnętrzne w wibracji "+this.cwz+": ",
                    AlegreyaSans20Bold));
            naglowekCzwarty.setAlignment(Element.ALIGN_CENTER);

            Paragraph naglowekCzwartyText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.warunkiWWibracji(this.cwz),
                    AlegreyaSans18));

            //naglowek
            Paragraph twojRokNumerologiczny = new Paragraph(new Phrase(10f,"Twój rok numerologiczny:",
                    AlegreyaSans20Bold));
            twojRokNumerologiczny.setAlignment(Element.ALIGN_CENTER);

            // cel
            Paragraph rokwibracjitext = new Paragraph(new Phrase(10f,"Rok w wibracji: "+this.rokwibracji,
                    AlegreyaSans20Bold));
            rokwibracjitext.setAlignment(Element.ALIGN_CENTER);

            //text
            Paragraph rokwibracjitexttext = new Paragraph(new Phrase(lineSpacingText,bazaDanych.rokWWibracji(this.rokwibracji),
                    AlegreyaSans18));

            //Znak zodiaku naglowek
            String first = this.znakZodiaku.substring(0,1);
            first = first.toUpperCase();
            System.out.println(first);
            String last = this.znakZodiaku.substring(1);


            Paragraph znakZodiakuNaglowek = new Paragraph(new Phrase(10f,"Znak zodiaku: "+first+last,
                    AlegreyaSans20Bold));
            znakZodiakuNaglowek.setAlignment(Element.ALIGN_CENTER);

            //Znak zodiaku text
            Paragraph znakZodiakuText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.znakZodiaku(this.rahu),
                    AlegreyaSans18));

















            document.add(portretNumerologiczny);
            document.add(space);
            document.add(image);
            document.add(space);
            document.add(space);
            document.add(imieINazwisko);
            document.add(space);
            document.add(data);
            document.newPage();
            document.add(drogaZyciaNaglowek);
            document.add(space);
            document.add(drogaZyciaCel);
            document.add(space);
            document.add(drogaZyciaText);
            document.add(space);
            document.add(space);
            document.add(liczbaDuszyNaglowek);
            document.add(space);
            document.add(liczbaDuszyCel);
            document.add(space);
            document.add(liczbaDuszyText);
            document.add(space);
            document.add(space);
            document.add(liczbaRealizacji);
            document.add(space);
            document.add(liczbaZewnetrznaCel);
            document.add(space);
            document.add(liczbaZewnetrznaText);
            document.add(space);
            document.add(jakoOsobaUrodzona);
            document.add(space);
            document.add(space);

            //document.add("asdad");
            document.add(space);
            document.add(cyklWWibracji);
            document.add(space);
            document.add(cyklWWibracjiText);
            document.add(space);
            document.add(space);
            document.add(lekcjaCyklu);
            document.add(space);
            document.add(lekcjaCykluText);
            document.add(space);
            document.add(space);
            document.add(celeCyklu);
            document.add(space);
            document.add(celeCykluText);



            document.add(space);

            document.add(space);
            document.add(space);
            document.add(warunkiZewnetrzneNaglowek);
            document.add(space);
            document.add(space);

            //document.add(pierwszeWarunki);
            document.add(space);
            document.add(pierwszeWarunkiText);
            document.add(space);
            document.add(space);

            document.add(space);
            document.add(drugieWarunkiText);
            document.add(space);
            document.add(space);

            document.add(space);
            document.add(trzecieWarunkiText);
            document.add(space);
            document.add(space);


            document.add(space);
            document.add(czwarteWarunkiText);
            document.add(space);
            document.add(space);



            document.add(naglowekPierwszy);
            document.add(space);
            document.add(naglowekPierwszyText);
            document.add(space);
            document.add(space);

            if(pwz!=dwz){
                document.add(naglowekDrugi);
                document.add(space);
                document.add(naglowekDrugiText);
                document.add(space);
                document.add(space);
            }



            if(twz!= pwz && twz != dwz){
                document.add(naglowekTrzeci);
                document.add(space);
                document.add(naglowekTrzeciText);
                document.add(space);
                document.add(space);
            }



            if(cwz!=twz && cwz!=dwz && cwz!=pwz){
                document.add(naglowekCzwarty);
                document.add(space);
                document.add(naglowekCzwartyText);
                document.add(space);
                document.add(space);
                document.add(space);
            }



            document.add(twojRokNumerologiczny);
            document.add(space);
            document.add(rokwibracjitext);
            document.add(space);
            document.add(rokwibracjitexttext);
            document.add(space);
            document.add(space);

            document.add(znakZodiakuNaglowek);
            document.add(space);
            document.add(znakZodiakuText);
            bazaDanych.getRest(this.znakZodiaku, document);





            document.close();
        } catch (DocumentException | IOException ex){
            ex.printStackTrace();
        }
    }

    public void createFonts() throws DocumentException, IOException {
        String ChopinPath = "src/source/ChopinScript.otf";
        BaseFont channelbf = BaseFont.createFont(ChopinPath, BaseFont.CP1250, BaseFont.EMBEDDED);
        this.ChopinScript40 = new Font(channelbf, 40);
        this.ChopinScript30 = new Font(channelbf, 30);
        this.ChopinScript20 = new Font(channelbf, 20);

        String AlegreyaPath = "src/source/AlegreyaSans.otf";
        BaseFont Alegreya = BaseFont.createFont(AlegreyaPath, BaseFont.CP1250, BaseFont.EMBEDDED);
        this.AlegreyaSans18 = new Font(Alegreya, 20);

        String AlegreyaPathBold = "src/source/AlegreyaSans-Bold.otf";
        BaseFont AlegreyaBold = BaseFont.createFont(AlegreyaPathBold, BaseFont.CP1250, BaseFont.EMBEDDED);
        this.AlegreyaSans20Bold = new Font(AlegreyaBold, 20);
        this.AlegreyaSans18Bold = new Font(AlegreyaBold, 18);
    }
}
