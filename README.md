# Generator PDF w Javie z wykorzystaniem biblioteki iTextPDF

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![iTextPDF](https://img.shields.io/badge/iTextPDF-5.5.14-green)

To repozytorium zawiera przykład prostej aplikacji w Javie, która generuje pliki PDF za pomocą biblioteki iTextPDF. Biblioteka iTextPDF jest potężnym narzędziem do generowania i modyfikowania plików PDF w języku Java.

## Funkcje

- Generowanie dokumentów PDF z tekstem, obrazami i innymi elementami graficznymi.
- Tworzenie tabel i dodawanie ich do dokumentów PDF.
- Dodawanie nagłówków i stopki do stron PDF.
- Ustawianie atrybutów stron, takich jak orientacja i rozmiar papieru.
- Eksportowanie wygenerowanych PDF do plików.

## Przykład użycia

Oto przykład prostego użycia biblioteki iTextPDF w Javie do wygenerowania prostego dokumentu PDF:

```java
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class SimplePDFGenerator {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("example.pdf"));
            document.open();

            String content = "To jest przykładowy tekst w dokumencie PDF wygenerowanym za pomocą iTextPDF.";
            document.add(new Paragraph(content));

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
