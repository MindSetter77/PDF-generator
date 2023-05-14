package pdfcreator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.*;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.MalformedInputException;

public class PDFCreator {
    public Font ChopinScript40;
    public Font ChopinScript30;
    public Font ChopinScript20;

    public Font AlegreyaSans20Bold;
    public Font AlegreyaSans18;
    public Font AlegreyaSans18Bold;

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
    public void create(){
        try{
            int lineSpacingText = 20;

            String path = "C:\\Users\\oleks\\Desktop\\test\\numerologia.pdf";
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

            //Data urodzenia
            Paragraph data = new Paragraph(new Phrase(10f,this.dataUrodzenia,
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
            Paragraph liczbaDuszyText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.liczbaDuszy(5),
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
            Paragraph liczbaZewnetrznaText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.liczbaZewnetrzna(5),
                    AlegreyaSans18));

            //Jako osoba urodzona
            Paragraph jakoOsobaUrodzona = new Paragraph(new Phrase(10f,"Jako osoba urodzona w maju- Cykl w wibracji 5",
                    ChopinScript30));
            jakoOsobaUrodzona.setAlignment(Element.ALIGN_CENTER);

            //Lekcja cyklu w wibracji
            Paragraph lekcjaCykluWWibracji = new Paragraph(new Phrase(10f,"LEKCJA CYKLU W WIBRACJI 5",
                    AlegreyaSans20Bold));
            lekcjaCykluWWibracji.setAlignment(Element.ALIGN_CENTER);

            //Cykl w wibracji
            Paragraph cyklWWibracjiText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.cyklWWibracji(5),
                    AlegreyaSans18));

            //Warunki zewnetrzne
            Paragraph warunkiZewnetrzneNaglowek = new Paragraph(new Phrase(10f,"WARUNKI ZEWNETRZNE :",
                    AlegreyaSans20Bold));
            liczbaDuszyNaglowek.setAlignment(Element.ALIGN_CENTER);

            //warunki
            Paragraph pierwszeWarunki = new Paragraph(new Phrase(10f,"Pierwsze warunki zewnętrzne: "+this.pwz,
                    AlegreyaSans20Bold));


            Paragraph pierwszeWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Do 25 roku życia byłaś w wibracji liczby: "+this.pwz,
                    AlegreyaSans18));

            Paragraph drugieWarunki = new Paragraph(new Phrase(10f,"Drugie warunki zewnętrzne: "+this.dwz,
                    AlegreyaSans20Bold));


            Paragraph drugieWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 25 do 34 roku życia byłaś w wibracji liczby: "+this.dwz,
                    AlegreyaSans18));

            Paragraph trzecieWarunki = new Paragraph(new Phrase(10f,"Trzecie warunki zewnętrzne: "+this.twz,
                    AlegreyaSans20Bold));


            Paragraph trzecieWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 34 do 43 roku życia jesteś w wibracji liczby: "+this.twz,
                    AlegreyaSans18));

            Paragraph czwarteWarunki = new Paragraph(new Phrase(10f,"Czwarte warunki zewnętrzne: "+this.cwz,
                    AlegreyaSans20Bold));


            Paragraph czwarteWarunkiText = new Paragraph(new Phrase(lineSpacingText,"Od 43 roku życia będziesz w wibracji liczby: "+this.cwz,
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
            Paragraph znakZodiakuNaglowek = new Paragraph(new Phrase(10f,"Znak zodiaku: "+this.znakZodiaku,
                    AlegreyaSans20Bold));
            znakZodiakuNaglowek.setAlignment(Element.ALIGN_CENTER);

            //Znak zodiaku text
            Paragraph znakZodiakuText = new Paragraph(new Phrase(lineSpacingText,bazaDanych.znakZodiaku(this.znakZodiaku),
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
            document.add(lekcjaCykluWWibracji);
            document.add(space);
            document.add(cyklWWibracjiText);
            document.add(space);
            document.add(space);

            document.add(pierwszeWarunki);
            document.add(space);
            document.add(pierwszeWarunkiText);
            document.add(space);
            document.add(space);

            document.add(drugieWarunki);
            document.add(space);
            document.add(drugieWarunkiText);
            document.add(space);
            document.add(space);

            document.add(trzecieWarunki);
            document.add(space);
            document.add(trzecieWarunkiText);
            document.add(space);
            document.add(space);

            document.add(czwarteWarunki);
            document.add(space);
            document.add(czwarteWarunkiText);
            document.add(space);
            document.add(space);

            document.add(naglowekPierwszy);
            document.add(space);
            document.add(naglowekPierwszyText);
            document.add(space);
            document.add(space);

            document.add(naglowekDrugi);
            document.add(space);
            document.add(naglowekDrugiText);
            document.add(space);
            document.add(space);

            document.add(naglowekTrzeci);
            document.add(space);
            document.add(naglowekTrzeciText);
            document.add(space);
            document.add(space);

            document.add(naglowekCzwarty);
            document.add(space);
            document.add(naglowekCzwartyText);
            document.add(space);
            document.add(space);
            document.add(space);

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
