package panels;

import com.itextpdf.text.*;
import pdfcreator.BazaDanych;
import pdfcreator.PDFCreator;

public class Cykl {

    Document document;

    public Cykl(Document document){
        this.document = document;
    }

    public void getCykl(String dataUr){
        int lineSpacingText = 20;

        int miesiac = Integer.parseInt(dataUr.substring(2, 4));


        Paragraph space = new Paragraph(" ");





        switch (miesiac){
            case 1:
                try {
                    document.add(space);

                    Paragraph cyklWWibracji = new Paragraph(new Phrase(10f,"Cykl w wibracji 1",
                            PDFCreator.AlegreyaSans20Bold));
                    cyklWWibracji.setAlignment(Element.ALIGN_CENTER);
                    document.add(cyklWWibracji);

                    Paragraph cyklWWibracjiText = new Paragraph(new Phrase(lineSpacingText,"Okres nabierania odwagi, oryginalności i niezależnego myślenia",
                            PDFCreator.AlegreyaSans18));
                    cyklWWibracjiText.setAlignment(Element.ALIGN_CENTER);
                    document.add(cyklWWibracjiText);

                    Paragraph lekcjaCyklu = new Paragraph(new Phrase(10f,"Lekcja cyklu w wibracji 1",
                            PDFCreator.AlegreyaSans20Bold));
                    lekcjaCyklu.setAlignment(Element.ALIGN_CENTER);
                    document.add(lekcjaCyklu);

                    Paragraph lekcjaCykluText = new Paragraph(new Phrase(lineSpacingText,"Osoba otrzymuje możliwość doświadczenia silnego poczucia tożsamości, tj. ego, oraz w dalszej kolejności oddania go pod prowadzenie siły wyższej. Uczy się ustalania granic. Dzięki sile intelektu i intuicji rozwija poczucie odrębności i szacunku do własnej wyjątkowości. Życie dostarcza odpowiednich lekcji, by nauczyła się wzajemności, brania innych pod uwagę i dzielenia się. Uczy się zrównoważyć niezależność wojownika, pioniera z wartościami społecznymi, takimi jak takt i dyplomacja. Nie jest w stanie dostrzec wszelkich powiązań składających się na całość, dopóki nie dostrzeże własnej unikalnej roli jako jej składowej. Z tego powodu najpierw przechodzi przez etap rozwoju, w którym koncentruje się na \"ja\". Niezbędna w tym procesie jest kreatywna ekspresja siebie autentycznej zaradności i samodzielności. W innych przypadkach celem jest wykształcenie \"ja\" jako istoty osobliwej i niepowtarzalnej i odejście od martwienia się o jakość życia osób wokół. Swoje największe osiągnięcia osoba uświadamia sobie, gdy uczy się służyć innym chętnie i bez oczekiwania na nagrody. Waha się, gdy podejmuje decyzje , ale wewnętrznie czuje wezwanie, aby zająć stanowisko w sprawie tego, co wie, że jest prawdą.",
                            PDFCreator.AlegreyaSans18));

                    document.add(lekcjaCykluText);




                } catch (DocumentException e) {
                    throw new RuntimeException(e);
                }
                break;
        }












    }
}
