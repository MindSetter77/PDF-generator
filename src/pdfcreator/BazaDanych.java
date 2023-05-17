package pdfcreator;

import com.itextpdf.text.*;

public class BazaDanych {
    PDFCreator pdfCreator;
    public BazaDanych(PDFCreator pdfCreator){
        this.pdfCreator = pdfCreator;
    }

    public String drogaZycia(int id){
        String text = "";
        switch (id){
            case 1:
                text = "Masz wszelkie aspekty numerologicznej Drogi Życia Dwójki, przy czym " +
                        "wzmocniony jesteś charyzmą, przywództwem i inspiracją. Życie wypełnione jest " +
                        "tajemniczymi powiązaniami i doświadczeniami, które wydają się misternie " +
                        "uplecionymi zbiegami okoliczności. Jest to liczba dwoistości, która tworzy " +
                        "dynamizm i wewnętrzny konflikt. Liczba 11 to dwie jedynki, więc z jednej strony " +
                        "wzmocniona jest tutaj męska energia wibracji 1 - yang, a z drugiej strony suma cyfr " +
                        "wynosi 2, co jest przeciwstawną energią żeńską - yin. Z tego powodu twoja Droga " +
                        "Życia nie należy do łatwych, a związany z nią jesteś czasami bardzo trudny do " +
                        "zrozumienia - dla siebie, jak i dla innych. Wiesz, że się wyróżniasz i tak też się " +
                        "czujesz. Energia 1 sprawia, że jesteś wielkim indywidualista, a wysokie ambicje, " +
                        "nie zadowolą Ci zajmowania drugiego miejsca. Jesteś również energiczny, " +
                        "przedsiębiorczy i niezależny, a cechy te sprawiają, że jesteś gotowy podejmować " +
                        "decyzje trudne i wymagające odwagi. Z kolei pod energią wibracji 2 skrywa się " +
                        "głęboka emocjonalność, wrażliwość i delikatność. W niej zawarta jest też ogromna " +
                        "intuicyjność i potencjał do rozwoju takich umiejętności, jak m.in. jasnowidzenie. " +
                        "Hybryda tych dwóch różniących się między sobą energii - ogromnej lwiej odwagi, " +
                        "a przy tym kobiecej delikatności sprawia, ze osoby z 11 w portrecie często okazują " +
                        "się dość nieprzewidywalne. Tak naprawdę są splotem sprzeczności. Czasami " +
                        "mówisz za dużo, a czasami jesteś zbyt cichy. Toczy się tu walka pomiędzy " +
                        "ambicjami i niepewnością. Obecna jest inteligencja niezbędna do sukcesu, ale " +
                        "brakuje wystarczającej siły, by po niego sięgnąć. Potrzebujesz wsparcia, a " +
                        "jednocześnie odrzucasz je, postrzegając jako słabość. Chciałbyś dowodzić, ale " +
                        "nieśmiałość nie pozwala Ci się bronić. Ambicje sprawiają, że pragniesz więcej, ale " +
                        "pragnienia przekraczają możliwości. Z jednej strony nie możesz zaakceptować " +
                        "porażki, z drugiej brakuje Ci siły do walki. Czujesz pozytywne nastawienie dopóki " +
                        "wszystko idzie gładko, lecz jak tylko pojawi się pierwsza oznaka niepowodzenia " +
                        "lub oporu, zaraz się denerwujesz, opatulasz się pesymizmem, a nawet popadasz w " +
                        "głęboką depresję. Jeśli chodzi o wprowadzanie w czyn własnych pomysłów, " +
                        "znakomicie potrafisz realizować swoje plany. Jest tylko jeden warunek, a " +
                        "mianowicie, że zadziałasz natychmiast. Wyobraźnia pozwala ci snuć bardzo " +
                        "odważne plany, ale w tym przypadku zdarza się, że zabraknie ci iskry do ich " +
                        "realizacji, bądź wkrada się zwątpienie i wówczas plany natychmiast ulegają " +
                        "rozkładowi. Często spotykaną cechą są próby narzucania swojej wizji czy woli " +
                        "innym osobom, ale unicestwia je ich naturalna łagodność. Z jednej strony " +
                        "pragniesz wyrażać swoje poglądy swobodnie, a jednocześnie są zbyt wrażliwe na " +
                        "uczucia innych, co doprowadza do wewnętrznego konfliktu. Ta niezdolność do " +
                        "otwartego działania oraz jasnego i wprost wyrażenia tego, co intuicyjnie czujesz, " +
                        "powoduje wchodzenie w emocje i gryzienie się z tym jeszcze długo po zaistnieniu " +
                        "zdarzenia. Uczysz się, że bycie wrażliwym nie zawsze jest uzasadnione, " +
                        "szczególnie gdy w grę wchodzi poradzenie sobie z energią wymagającą zajęcia " +
                        "odważnego i zdecydowanego stanowiska wobec postaw, które urągają ludzkiej " +
                        "życzliwości i serdeczności bądź naruszają godność istoty ludzkiej. " +
                        "Rozdarcie zachodzi również w życiu emocjonalnym i intymnym. Ludzie mają duży " +
                        "apetyt, lecz są zbyt nieśmiali, by szukać zaspokojenia swoich pragnień. " +
                        "Niezwykle szczerzy i wierni, nie są w stanie tolerować zdrady. Jeśli nie spotkają " +
                        "odpowiedniego partnera, będą czuć się samotni. Nieśmiali i niepewni, nie będą też " +
                        "tolerować jakiejkolwiek ingerencji, a oferta wsparcia może zostać odebrana jako " +
                        "zniewaga. Szukasz niezależności, a mimo wszystko nie jesteś do niej zdolny, gdyż " +
                        "nie czujesz się na siłach, by ją zrealizować. Jakość życia zawiera się w " +
                        "symbolizmie rozdartej sosny z powieści Żeromskiego. Tu jakby jedna noga mocno " +
                        "stąpa po Ziemi, a druga fruwa z motylami, zażywając niebiańskiej kąpieli. " +
                        "Nieustannie tocząca się walka pomiędzy energiami aktywnej, silnej i niezależnej a " +
                        "miękką, pasywną i zależną naturą, rozstraja i w rezultacie często prowadzi do " +
                        "poczucia niepokoju i nie szczęśliwości. Na planie duchowym niesie to oczywiście " +
                        "głębszy sens i dlatego zestawienie tych energii poprzez wprowadzenie twórczego " +
                        "niepokoju tak bardzo popycha, motywuje i inspiruje do głębszych poszukiwań. Aż " +
                        "wreszcie zaczniesz działać, znajdziesz dla siebie formę konstruktywnego ujścia i " +
                        "plecione wysoko marzenia i najśmielsze wizje ściągniesz i postawisz na " +
                        "praktycznym gruncie. Te wszystkie niepokoje i sprzeczności wydobywają wielką " +
                        "zdolność wynalazczą i twórczą. Dlatego właśnie tak wielu wynalazców, artystów, " +
                        "przywódców religijnych, proroków i wybitnych postaci historycznych okazuje się " +
                        "być numerologicznymi Jedenastkami. Swoją obecnością stają się katalizatorem " +
                        "zmian w życiu innych ludzi. W związku z tym twoim głównym zadaniem jest być " +
                        "twórcą, inicjatorem, inspirującym uzdrowicielem. Celem jest pomagać ludziom i w " +
                        "pewnym stopniu ich uzdrawiać - czy to wykonując zawód lekarza, wychowawcy, " +
                        "uzdrowiciela, jasnowidza, czy też poprzez sztukę, słowo lub inne twórcze talenty. " +
                        "W ten sposób wchodzisz na ścieżkę duchową i pozwalasz, by dary, które nosisz, " +
                        "mogły służyć innym. Bardzo intensywnie przeżywane trudne sytuacje życiowe, " +
                        "chociaż czasami mogą być niewyobrażalnie męczące, to jednak mają swój wyższy " +
                        "cel. Nie możesz pozwolić sobie na to, by poszukując duchowego oświecenia, " +
                        "poświęcisz swoje życie i ważne dla ciebie relacje. To właśnie przyjaciele i " +
                        "członkowie rodziny sprzyjają wzrostowi i nagradzają wysiłki w dążeniu do " +
                        "oświecenia. Poruszasz się na granicy pomiędzy wielkością a autodestrukcją. " +
                        "Potencjał wzrostu, stabilności i osobistej siły leży w akceptacji intuicyjnego " +
                        "zrozumienia i prawdy duchowej. Tu spokoju wewnętrznego nie odnajduje się w " +
                        "logice, a w wierze. W procesie duchowego przygotowania wykorzystany zostaje " +
                        "wysoki poziom twórczości artystycznej i darów psychicznych. Wkład polega na " +
                        "doświadczeniu, które zapewnia innym. To poprzez nią przychodzi inspiracja, której " +
                        "nagły błysk pojawia się w polu drugiej osoby. Poprzez wielkie i otwarte na drugiego " +
                        "człowieka serce, intuicję i ekspresję artystyczną, wywierasz ogromny wpływ na " +
                        "ludzi, choć sam nie do końca możesz być tego świadoma. Przechodzisz przez " +
                        "intensywne doświadczenia - osobiste, zdrowotne, emocjonalne, by dopiero w " +
                        "drugiej połowie życia wejść w pełną moc mistrzowskiej wibracji. Czas jest tu " +
                        "niezbędny, by zdobyć wystarczająco dużo doświadczeń. które poruszą struktury " +
                        "na tyle, byś był w stanie wykorzystać płynącą z Ciebie wiedzę i zastosować w " +
                        "niesieniu pomocy na szeroką skalę.";
                break;

            case 2:
                text = "Księżyc sprawuje opiekę nad numerologiczną Dwójką, stąd osoby kroczące tą " +
                        "Drogą Życia, podobnie jak ich patron, odznaczają się wysoką emocjonalnością i " +
                        "podatnością na zmiany nastroju. Są niezwykle wrażliwe i nieśmiałe, a przy tym " +
                        "bardzo opiekuńcze, zmysłowe i kreatywne. Mają w sobie wiele uczuć i emocji, " +
                        "dlatego często roztaczają matczyną opiekę nad drugim człowiekiem. Nauka " +
                        "polega na rozwijaniu miłości, harmonii, równowagi, współpracy i dyplomacji. " +
                        "Numerologiczna Dwójka pragnie czuć się potrzebna i kochana. A także, aby drugi " +
                        "człowiek doceniał wkład, jaki wnosi, i darzył ją szacunkiem. Księżycowa wibracja 2 " +
                        "ma jakość yin, czyli naturę bierną, żeńską i jest wysoce intuicyjna. Cieszy ją, kiedy " +
                        "dary, z którymi przychodzi, mogą służyć dobru grupy. Z tego powodu dobrze się " +
                        "czuje, gdy może zaangażować się w działania w służbie innym ludziom. Posiada " +
                        "takt i umiejętności dyplomatyczne, co czyni ją wyjątkowo sprawnym mediatorem, " +
                        "asystentem, współpracownikiem, idealnym małżonkiem i przyjacielem. Życiowym " +
                        "celem jest wyznaczenie granic odpowiedzialności oraz nauka pracy w harmonii, " +
                        "równowadze i wzajemnym szacunku. Dwójka częściej podąża utartymi ścieżkami, " +
                        "pozostawiając pionierską rolę innym. Uczy się także na błędach innych po to, by " +
                        "mądrze podejmować niezbędne środki ostrożności, kiedy przychodzi jej działać w " +
                        "pojedynkę. Z racji dostrojenia do energii opartej na współpracy, raczej nie będzie " +
                        "gotowa zaryzykować prowadzenia własnej działalności. Najszczęśliwsza jest, gdy " +
                        "służy swojej rodzinie, grupie lub gdy doskonali się w karierze zorientowanej na " +
                        "usługi. Praca w zespole jest często najlepszym sposobem na osiągnięcie sukcesu. " +
                        "Świadomość bycia częścią drużyny i wspierania wspólnych przedsięwzięć jest " +
                        "bardziej satysfakcjonująca dla numerologicznej Dwójki niż obejmowanie stanowisk " +
                        "niezależnych. Delikatna i uprzejma nie toleruje dysharmonii i nieporozumień, więc " +
                        "gdy te się pojawiają, zrobi wszystko, co w jej mocy, by taktownie załagodzić i " +
                        "dyplomatycznie wyprowadzić zaognione stosunki na prostą. Wie, że kluczem do " +
                        "sukcesu jest współpraca, dlatego wesprze i poprowadzi tych, którzy są mniej " +
                        "zdolni, by wspólnymi siłami zrealizować projekty. Podobnie, jeśli w jej związku " +
                        "pojawią się jakieś komplikacje, najprawdopodobniej pójdzie na kompromis i " +
                        "poświęci się, aby ten związek uratować. Czasami jednak podąża przeciwną drogą i " +
                        "staje się bojowa. Musi uświadomić sobie, że kiedy wpada w wojowniczy nastrój i " +
                        "czuje wewnętrzny niepokój, reaguje na sytuacje odruchowo, instynktownie, a nie w " +
                        "sposób empatyczny. Jako że emanuje energią serdeczności, ciepła i gotowości do " +
                        "udzielenia pomocy, szybko wywiera dobre wrażenie na ludziach. Działa spokojnie i " +
                        "racjonalnie w każdym środowisku i w każdych okolicznościach. Dzięki " +
                        "umiejętności koncentracji, nastawieniu na życzliwą współpracę i dobremu " +
                        "odnajdywaniu się w pracy zespołowej, bez większego wysiłku potrafi zebrać " +
                        "owoce dobrze wykonanej pracy. Wprawdzie jest w stanie doskonale wykonywać " +
                        "obowiązki szefa firmy i z łatwością przychodzi jej radzenie sobie w przypadku " +
                        "braku współmałżonka, to jednak woli grać drugie skrzypce, zajmować pozycję " +
                        "podległą, zdać się na drugą osobę i wykonać czyjeś polecenia. Osoba z Drogą " +
                        "Życia 2 uczy się, jak definiować siebie na własnych warunkach, a nie poprzez " +
                        "opinię innych osób. Jest gotowa, by dawać z siebie jak najwięcej, musi jednak " +
                        "przede wszystkim zauważyć i doceniać siebie. Pozwala jej to uniknąć popadania w " +
                        "schemat rozdawania siebie i podporządkowania drugiemu. Ze względu na"+
                        "wyjątkową wrażliwość emocjonalną i autentyczne,,serce na dłoni\", różnorodne " +
                        "doświadczenia życiowe sprzyjają opanowaniu sztuki wyjścia poza konflikt i " +
                        "znalezienia dla niego rozwiązania. Jednak na drugim biegunie znajdujemy " +
                        "całkowite podporządkowanie się drugiej osobie: Dwójka rezygnuje z własnych " +
                        "pragnień i odstępuje od tego, co stanowi dla niej wartość. Wybiera wówczas " +
                        "umilenie życia drugiemu człowiekowi i wykonywanie jego woli, mimo że sama " +
                        "czuje się z tym źle. Ponadto często mogą występować wahania nastroju, " +
                        "niepewność i nadwrażliwość. Związane jest to z nabytą osobowością i " +
                        "przeszłością. Księżycowa wibracja 2 wskazuje odziedziczone cechy, karmę, " +
                        "przywiązania emocjonalne, instynkty przetrwania i programowanie z dzieciństwa. " +
                        "Wciąga nas z powrotem w przeszłość, łączy z korzeniami i służy jako magazyn " +
                        "nieświadomej pamięci. Instynktowna natura pomaga nam trzymać się " +
                        "uwarunkowanych wychowaniem przekonań, zachowań i reakcji. Podobnie jak " +
                        "przywiązanie do matki, nieświadomie trzymamy się nawyków i uczuć, które wydają " +
                        "się dawać poczucie bezpieczeństwa. Celem jest nauczenie się, jak powrócić do " +
                        "istoty naszej duszy i połączyć się z tym, co wewnętrznie prawdziwie nas karmi, " +
                        "odżywia i wspiera. Emocje i uczucia są żeńską energią. Musimy sobie z nimi " +
                        "odpowiednio poradzić, tj. wykorzystać wolę, aby skupić na nich uwagę i pozwolić, " +
                        "aby te energie były odczuwalne i wyrażane. Trzeba nam również zidentyfikować " +
                        "energię, którą odrzucamy i wypieramy. Nasz umysł może się temu przeciwstawiać, " +
                        "ale mamy intuicję i to ona pokazuje nam prawdę. Poprzez akceptację i miłość " +
                        "dociera ona do naszej świadomości, nie po to, by ją dalej wypierać, a by ją " +
                        "zidentyfikować i uhonorować. Proces ten jest wyzwalający z tego względu, że " +
                        "nasze stałe reakcje i powielane zachowania kosztują nas znaczną część energii " +
                        "psychicznej. Kiedy już dotrzemy do źródła uwarunkowanych odczuć i reakcji w " +
                        "danych sytuacjach, możemy nie tylko dokonać innego wyboru postrzegania życia, " +
                        "ale też świadomie i konstruktywnie przekierować energię. Każdy z nas ucieleśnia " +
                        "energię cnoty, bo to część naszej duszy. Musimy więc zwrócić uwagę na tę " +
                        "pierwotną cechę naszej istoty, którą zwykle inni ludzie widzą i odczuwają przy nas " +
                        "bardzo wyraźnie. Na przykład mówią nam, że czują się przy nas spokojnie, choć " +
                        "my sami wewnątrz doświadczamy nieziemskich zmagań. Jest to dla nas jednak " +
                        "wskazówka, co jest naszą pierwotną cechą, gdyż wówczas możemy ją kultywować " +
                        "i wreszcie naturalnie obdarować nią siebie. Kultywowanie naszej prawdziwej " +
                        "esencji nie tylko uwalnia od wcześniej nabytych uwarunkowań, ale przede " +
                        "wszystkim pomaga przyciągnąć do życia to, czego autentycznie pragniemy. " +
                        "Dwójka często ocenia siebie na podstawie tego, co ktoś inny mówi lub myśli o niej. " +
                        "Wyzwaniem jest rozwinięcie wewnętrznego kompasu i zwrócenie się do wewnątrz " +
                        "w celu obdarzenia siebie samego uznaniem i szacunkiem. Często jest zbyt zajęta " +
                        "robieniem tego, co uważa, że powinna robić, i oczekuje, że inni zrobią to samo. " +
                        "Znajduje się wówczas w stanie współzależności. Dawanie zamienia się w " +
                        "niezadowolenie, bo osoba daje za dużo, a potem musi się całkowicie wycofać. " +
                        "Powinna być ostrożna, by nie oddawać się ciągle do dyspozycji innych osób i " +
                        "zajmować się problemami ludzi, których kocha, ponieważ może spotkać się z " +
                        "niedocenieniem. Zamiast tego uczy się wspierać ich dary, wyrażać aprobatę dla " +
                        "ich przedsięwzięć i głośno dostrzegać, co robią dobrze - w ten sposób Dwójka " +
                        "zasila ich pozytywną energię. Obejmuje to uznanie wartości innych i wyraźny " +
                        "sygnał, że bez nich nie dałoby się wykonać zadania."+
                        "W ten sam sposób członkowie rodziny, podopieczni czy współpracownicy " +
                        "traktowani z szacunkiem są bardziej skłonni do słuchania i wykonania tego, co " +
                        "trzeba poprawić. Wrażliwość Dwójki jest tak ogromna, że osoba może doznawać " +
                        "bólu emocjonalnego w sposób, którego nikt nie jest w stanie zrozumieć. Jest " +
                        "bardzo świadoma tego, co dzieje się w życiu emocjonalnym każdego innego " +
                        "człowieka i często bierze to na siebie. Jej zadaniem jest uświadomić sobie, że inni " +
                        "ludzie niekoniecznie widzą i odbierają świat w taki sam sposób jak ona. Ponieważ " +
                        "Dwójka chce dawać i kochać cały czas, może mieć tendencję do stawiania " +
                        "oczekiwań swoim bliskim, które nie mogą być spełnione. Tu zawiera się nauka " +
                        "akceptacji i odpuszczenia. Kiedy będzie w stanie zrozumieć, jak zrównoważyć " +
                        "swoją intensywną potrzebę miłości, poczuje w sobie bezpieczeństwo i wsparcie. " +
                        "Aby tego dokonać, musi przestać szukać potwierdzenia miłości na zewnątrz, a po " +
                        "prostu dać je sobie - ta nauka dawania sobie jest częścią wyzwania Drogi Życia 2. " +
                        "Koniecznym staje się znalezienie odwagi, by wchodzić w kontakt ze swoimi " +
                        "uczuciami i przekazywać te uczucia innym - uczciwie je ujawniając, przyznając się " +
                        "do tego, co autentycznie czuje, mówiąc o odczuciach, wyrażając je jak najbardziej " +
                        "naturalnie, bez konieczności robienia czegoś z nimi, cenzurowania ich, ukrywania " +
                        "czy przepracowywania. Naturalny przepływ potwierdza emocje i pozwala " +
                        "zintegrować się z resztą osobowości. Dla Dwójki najbardziej istotną sprawą jest " +
                        "rozwinięcie wrażliwości na własne potrzeby. Uczenie się przytulenia siebie\" - " +
                        "obdarowania siebie troską i miłością, zanim zechce uzyskać to od kogoś innego. " +
                        "Musi zapewnić siebie, że wszystko będzie dobrze, że nie ma się o co martwić, że " +
                        "zajmie się sobą. W tym procesie jej energia, która dotąd pozostawała skierowana " +
                        "na zewnątrz i zorientowana na cel lub na drugą osobę, teraz zaczyna przepływać " +
                        "do wnętrza. Wtedy jest w stanie poczuć się usatysfakcjonowana, zadbana i " +
                        "kochana. Kiedy własna energia jest skupiona w nas samych, możemy być wrażliwi " +
                        "i czuli na innych. Zadbaliśmy o własne potrzeby, więc teraz jesteśmy emocjonalnie " +
                        "bezpieczni. Kiedy Dwójka nie potrzebuje już rozpaczliwie być kochana przez " +
                        "kogoś, wówczas inni ludzie są w stanie ją pokochać. Kiedy daje sobie to " +
                        "zapewnienie, zyskuje wystarczającą wewnętrzną pewność siebie, aby być z innymi " +
                        "po cichu, bez konieczności kontrolowania, bez konieczności wyglądania dobrze " +
                        "czy poczucia, że coś musi zrobić, by to osiągnąć. Kiedy może po prostu być, " +
                        "karmi innych swoją obecnością, odżywia ich pełnią tego, kim tak naprawdę w całej " +
                        "głębi duszy jest. Po prostu jest i ta obecność jest wystarczająca.";
                        break;
            case 3:
                text = "Osoby z Drogą Życia 3 pozostają pod opieką Jowisza - planety mądrości i " +
                        "obfitości. Odznaczają się zmysłem do interesów, potrafią zarządzać finansami, " +
                        "stąd wielu z nich wybiera karierę maklera giełdowego czy analityka finansowego. " +
                        "Równie istotna i charakterystyczna dla Drogi Życia 3 jest ogromna kreatywność, " +
                        "towarzyskość, otwartość na świat, radość, optymizm i umiłowanie zabawy. Jest " +
                        "tutaj obecny talent do łatwego nawiązywania kontaktu z ludźmi i skupianie wokół " +
                        "siebie szerokiej publiczności. Na wyróżnienie zasługują tu dwie piękne cechy - " +
                        "inteligencja i przenikliwy umysł, dzięki którym Trójka jest w stanie łatwo zdobyć " +
                        "wiedzę, wykazać talent w wielu różnych dziedzinach, ale też powiedzieć właściwe " +
                        "rzeczy ludziom i o ludziach. Czasami może być zbyt krytyczna i swoją " +
                        "przenikliwością dotknąć nawet najbliższych, jednak raczej zrobi to w dobrej wierze " +
                        "niż z intencją urażenia. Jest obdarzona wspaniałym poczuciem humoru, którym " +
                        "potrafi przepędzić smutki swoich bliskich i rozproszyć znużenie jej kompanów. Ma " +
                        "tyle zaraźliwego entuzjazmu, że nie przewyższy go jakakolwiek inna wibracja. " +
                        "Jednocześnie dość szybko traci zainteresowanie jednym i porywa się na coś " +
                        "innego. Trójka jest wibracją komunikowania się, w związku z tym osoba, która ma " +
                        "ją w swoim portrecie, potrafi być niezwykle elokwentna. Chętnie dzieli się tym, " +
                        "czego dowiedziała się z różnych źródeł. Słowo pisane i mówione stanowi pokarm " +
                        "jej duszy. Nic dziwnego więc, że tak umiejętne posługiwanie się nim, wzbogacone " +
                        "jeszcze dawką humoru, ujmuje serca audytorium. Komunikuje się przejrzyście - " +
                        "może rozmawiać z kimkolwiek o czymkolwiek, jest zazwyczaj bezpośrednia i " +
                        "współczująca. Potrafi zobaczyć siebie w myślach drugiej osoby i prowadzić " +
                        "rozmowę o czymkolwiek przez wiele godzin, dzięki czemu druga osoba czuje się " +
                        "komfortowo w atmosferze przyjaźni i akceptacji. Jest tak świadoma umysłów " +
                        "innych ludzi, że często dostosowuje swój tok myślowy i słownictwo do drugiej " +
                        "oso- by w nadziei, że będzie przez nią lepiej zrozumiana. W procesie tym Trójka " +
                        "tak bardzo kontroluje słowa i język, którego używa, że w efekcie zamiast " +
                        "intuicyjnego przekazu, rozmówca otrzymuje jego ocenzurowaną wersję. Z drugiej " +
                        "strony może mieć tendencję do dominacji i wypuszczania potoku słów i emocji, " +
                        "dlatego warto jej oddać się kontemplacji tego, co i jak chce przekazać. Jedną z " +
                        "przeszkód może być niepewność siebie i wątpliwości, choć Trójce wystarczy przez " +
                        "nie przejść kreatywnie i obrócić na swoją korzyść to, co dotąd stanowiło " +
                        "przeszkodę. Niepewność ujawnia się również podczas podejmowania decyzji. " +
                        "Trójka widzi obie strony medalu, więc gdy nawet wie, co zrobić, dostrzega również " +
                        "alternatywny punkt widzenia. Pojawia się wówczas zakłopotanie, bo z jednej " +
                        "strony czuje, który wybór jest tym właściwym, a z drugiej - kwestionuje to " +
                        "odczucie. Znów rozważa jedną i drugą opcję, co tyko dalej doprowadza do " +
                        "zapętlenia. Kiedy tylko próbuje wziąć coś na logikę, cała rzecz staje się trudniejsza " +
                        "do tego stopnia, że zaczyna czuć, że w danej sytuacji nie ma możliwości " +
                        "wygranej\". Proces ten związany jest ze stratą co straci, podejmując taką decyzję, a " +
                        "co straci, podejmując inną. Tyle że właśnie przez to skupianie się na możliwości " +
                        "utraty czegoś, wkrada się poczucie niepewności. A przecież Trójka chce zdobyć, " +
                        "wygrać, wyciągnąć coś pozytywnego. Zachodzi tu proces nauki skupiania się na " +
                        "celu. W momencie, w którym podejmie już decyzję, wszechświat wspiera ją i " +
                        "wszystko zaczyna się do niej dostosowywać. Charakterystyczna jest wysoka " +
                        "moralność, godność i miłosierność. Również miłość numerologicznej Trójki jest " +
                        "czysta, a pragnienie, by widzieć świat sprawiedliwym miejscem do życia, czyni ją " +
                        "prawdziwym dobroczyńcą. Intelekt sprawia, że stwarza wspaniałe możliwości dla " +
                        "siebie i innych. Cieszy się z tego, co widzi, i ogrzewa ciepłem ludzkiej egzystencji. " +
                        "Wspaniałe poczucie humoru pozwala akceptować otaczające ją szaleństwa z " +
                        "dobrą, naturalną tolerancją. " +
                        "Jest prawdziwa, hojna i nie sprawia przy tym wrażenia, że szuka przez to uznania. " +
                        "Największym szczęściem osób z Drogą Życia 3 jest kochać i być kochanym. " +
                        "Bardzo ważne jest tutaj przywiązanie emocjonalne. Z tak ogromną potrzebą " +
                        "miłości potrafi stworzyć piękny związek, a swoim podejściem do niego stanowi " +
                        "wzór do naśladowania. Z drugiej strony, obserwowane jest też popadanie w " +
                        "depresję, ekstremalne wzloty i upadki, które doświadczane są, jeśli osoba nie " +
                        "wykorzystuje swoich talentów. Kiedy jednak zda sobie sprawę, że jej podróż jest " +
                        "podróżą emocjonalną, może skuteczniej zarządzać zmianami nastrojów. Uczy się " +
                        "być ostrożna co do tego, z kim spędza czas, i odchodzi od relacji " +
                        "niezrównoważonych. Energia 3 jest energią radości życia, dlatego Trójka jest " +
                        "pozytywna, radosna i otwarta na świat. Z lekkością na sercu nawiązuje relacje z " +
                        "innymi i niesie ludziom pomoc. Jej optymizm jest naturalny i gotowa jest włożyć " +
                        "wysiłek, by osiągnąć wyniki - jeśli czuje, że są możliwe do osiągnięcia. Działa z " +
                        "pozytywnym nastawieniem do przyszłości. Umysł może podsuwać negatywne " +
                        "myśli, więc osoba czasami wspomina o swoich lękach, ale w działaniu i tak " +
                        "zachowuje optymizm. Kiedy jednak podda się negatywności, jest to znak, że za " +
                        "dużo rozmyśla. Najlepszym rozwiązaniem dla niej jest oddać myśli w ręce Siły " +
                        "Wyższej i poprosić ją o zajęcie się nimi i o przewodnictwo. Kiedy pozwoli się " +
                        "odprężyć swojemu umysłowi, będzie w stanie odbudować naturalną wiarę w " +
                        "pozytywny wynik dotyczący danej sytuacji. Jednym z największych darów Trójki " +
                        "jest umiejętność pomagania innym w przezwyciężaniu negatywnych myśli i " +
                        "pokazania im, jak zmienić perspektywę na pozytywną. Kiedy pomaga innym " +
                        "skupić się na jaśniejszej stronie życia, sama również wpuszcza światło w swój " +
                        "sposób myślenia. Łatwo konsoliduje informacje i wie, jak je przekształcić w nowe " +
                        "idee. Jest urodzonym aktorem, doradcą, nauczycielem bądź pisarzem. Spełnia się " +
                        "w każdym zawodzie, w którym może zaprezentować swoje pomysły publiczności. " +
                        "Jako że jej umysł bardzo szybko funkcjonuje, raczej nie zadowoli jej praca w " +
                        "ustalonych ramach i rutynowym trybie, a przy tym nie czuje się najlepiej, gdy " +
                        "pracuje pod nadzorem lub w sztywnych strukturach. Jeśli chodzi o negatywne " +
                        "aspekty, jest nimi skłonność do trwonienia bądź niewykorzystywania w pełni " +
                        "licznych talentów. Czasami smak namiętności jest w stanie stłumić głos rozumu, w " +
                        "takim przypadku Trójka staje się niewolnikiem niskich instynktów z tendencją do " +
                        "nawiązywania niekorzystnych relacji. Jest też skłonna do próżności i rozpraszania " +
                        "swojej ogromnej energii. Mając tyle talentów i pomysłów, czasami przejawia " +
                        "trudności z realizacją planów. Niełatwo jej zdecydować, jak kierować swoją " +
                        "energią, i staje się przez to rozproszona, przygnębiona i nieskuteczna w realizacji " +
                        "zamierzeń. Pragnienie zwycięstwa i pójścia do przodu jest jak najbardziej zdrowe, " +
                        "gdyż Trójka potrzebuje odejść od dopasowywania się do myślenia zbiorowego, " +
                        "kolektywnego na rzecz twórczej witalności na nowym poziomie. Trzymanie się " +
                        "starych wzorców nie pozwalałoby jej ruszyć do przodu. Musi ufać temu, co dodaje " +
                        "jej energii i sił witalnych, i to jest wygrana, której szuka. " +
                        "Kiedy pojawia się jakiś pomysł i kiedy intuicyjnie poczuje, że to jest to, co " +
                        "chciałaby zrobić, będzie temu towarzyszyło ożywienie i entuzjazm. Jest to energia, " +
                        "której Trójka może zaufać, i droga, którą ma podążać, ponieważ doprowadza ją do " +
                        "kolejnego etapu ewolucji. Trójka rozwija twórcze wyrażanie siebie, wrażliwość " +
                        "emocjonalną, radość i inspirującą komunikację. Ma tendencję do rozpraszania " +
                        "energii, gdy towarzyszy jej nadmiar pomysłów. Rozmienianie się na drobne " +
                        "nierzadko powoduje, że nie podejmuje kroków, by przenieść te idee na praktyczny " +
                        "grunt. Uczy się wyrażać prawdę jasno i wyraźnie, z humorem i radością. Rozkwita, " +
                        "gdy przezwycięża wątpliwości, strach przed krytyką czy zawirowania emocjonalne, " +
                        "a także gdy oddaje się pracom, w których, dzięki kreatywnemu potencjałowi, staje " +
                        "się prawdziwym i godnym podziwu ekspertem.";
                break;

            case 4:
                text = "Osoby z Drogą Życia 4 działają w materii, są ugruntowane i mocno stąpają po " +
                        "ziemi. Ich osobistą misją jest osiągnięcie poczucia bezpieczeństwa i stabilizacji w " +
                        "każdym aspekcie życia, dlatego obdarzone są zmysłem organizacyjnym, " +
                        "zachowują realizm w ocenie sytuacji i oddają się działaniom, które mają praktyczne " +
                        "zastosowanie i namacalne rezultaty. Patronuje im węzeł północny, zwany Rahu, " +
                        "oraz Uran związany z nauką, inżynierią, przewodnictwem i niekonwencjonalnymi " +
                        "rozwiązaniami. Ponieważ Rahu reprezentuje materialne, ziemskie pragnienia, " +
                        "Czwórka, oddając się pracy, doświadcza sukcesów finansowych. Praca, którą " +
                        "wybiera, oparta jest na działaniach zespołowych, stąd często spotykane " +
                        "towarzystwo partnera biznesowego, z którym dzieli status lidera. Numerologiczna " +
                        "Czwórka nie będzie uganiać się za ulotnymi przyjemnościami, a raczej zwracać " +
                        "uwagę głównie na te rzeczy, które mają trwałą i solidną wartość i mogą służyć " +
                        "przez długi czas. Percepcja pozwala dostrzegać wszelkie szczegóły i jest w stanie " +
                        "przekształcić nawet najbardziej żmudną pracę w demonstrację wirtuozerii. Osoba " +
                        "ta ma w sobie pokłady cierpliwości i oddając się pracy, zachowuje przy niej " +
                        "zegarmistrzowską dokładność. Gdzie inni już dawno stracili zainteresowanie, tam " +
                        "nadal odnajdziemy doprowadzającą do perfekcji każdy detal Czwórkę. Jak długo " +
                        "zachowuje w sobie poczucie trwałości, tak długo wkłada całą siebie w wykonanie " +
                        "powierzonego jej zadania. Z tej też przyczyny woli żyć i pracować w jednym " +
                        "miejscu, do którego zdążyła się już przyzwyczaić i w nie wniknąć. Wysoce lojalna, " +
                        "ceni oddanie, sprawiedliwość i równość. Jej życie jest poświęcone realizacji planu. " +
                        "Osoba czuje się najbardziej komfortowo, kiedy działa systematycznie, " +
                        "metodycznie, powoli i celowo. Opracowuje plan i chce nadać strukturę i porządek " +
                        "swojemu życiu osobistemu i zawodowemu. Pod tym planowaniem kryje się obawa " +
                        "przed chaosem i prawdziwa niechęć do tego, by miała uchodzić za " +
                        "niekompetentną. Zdaje sobie sprawę, że tym, co zbuduje, położy pod- waliny pod " +
                        "swoje nowe osiągnięcia. To niezwykle pracowity i cierpliwy człowiek, którego " +
                        "energia sprawia, że jest przygotowany do włożenia ogromnego wysiłku i poddania " +
                        "się nierzadko wyczerpującemu rytmowi. Jego narzędziami są porządek, logika i " +
                        "niezawodność. Dzięki nim zapewnia sobie i swoim bliskim pożądany dostatek. " +
                        "Można na nim polegać, a kiedy zachodzi taka konieczność, jest gotów wziąć na " +
                        "swoje barki dodatkowe zobowiązania. Jest w stanie zaakceptować każdy pomysł, " +
                        "podjąć się każdego projektu i przenieść realizację na praktyczny grunt. Ponieważ " +
                        "wie, jak budować solidne fundamenty, często bierze odpowiedzialność za rozwój " +
                        "całych systemów operacyjnych. Oczekuje się od niego dbałości o szczegóły. Jest " +
                        "tytanem pracy, inżynierem, technikiem, księgowym i „budowniczym\" świata. W ten " +
                        "sam sposób staje się najlepszym projektantem również własnego domu. Dom oraz " +
                        "korzenie rodzinne są istotnymi sprawami leżącymi u podstaw poczucia " +
                        "bezpieczeństwa, zdrowia psychicznego i fizycznego Czwórki. Często trudne " +
                        "przejścia z rodziną, z której pochodzi, są podstawą uzdrowienia z poczucia bólu i " +
                        "braku. To nauka, którą w tym celu odbywa, i stąd również wywodzi się pragnienie " +
                        "ochrony siebie, rzeczy i ludzi wokół. Lubi rzeczy, które są namacalne i trwale, stąd " +
                        "też kluczowa dla niej jest uczciwość w relacjach. Jedną z podstawowych kwestii, z " +
                        "którymi musi się pogodzić, są ograniczenia - zarówno te narzucane zewnętrznie, " +
                        "jak i te, które sama sobie narzuca. " +
                        "Woli otaczać się ludźmi podobnie myślącymi, którzy jak ona unikają ryzyka, " +
                        "przestrzegają zasad oraz rozwijają się w tradycyjnym środowisku pracy lub " +
                        "rodziny. Częścią jej podróży życiowej jest jednak nauka wychodzenia poza utarte " +
                        "ścieżki mentalne, by raz na jakiś czas podjąć ryzyko lub wykorzystać nadarzającą " +
                        "się okazję. Kobieta Czwórka zwykle jest tak silna, że dzięki mocy, jaką posiada, " +
                        "może być postrzegana jako bardziej męska niż kobieca. Dba o wszystko i jest " +
                        "wyjątkowo odpowiedzialna. Wprawdzie ma poczucie humoru i momenty " +
                        "lekkomyślności, lecz bar- dziej skłonna jest zachować powagę, oddać się " +
                        "aktywności umysłowej i racjonalnemu myśleniu. Udzielając rad, oferuje informacje, " +
                        "które jej zdaniem pomogą drugiemu. Czwórka ma tendencję do bycia " +
                        "opiniotwórczym w sprawach, na których czuje, że się zna, co nierzadko " +
                        "doprowadza do sporów. Potrzebuje pozytywnej afirmacji. W obawie przed krytyką " +
                        "nie zrobi tego, co nie jest zgodne z jej standardami. Na tej samej zasadzie niektóre " +
                        "pragnienia również nie dochodzą do urzeczywistnienia. Kiedy znajdzie interesujące " +
                        "zagadnienie, zdobędzie całą niezbędną wiedzę na jego temat, a przy tym będzie " +
                        "potrafiła przekazać tę wiedzę innym, co daje jej również predyspozycje do zawodu " +
                        "nauczyciela. Z drugiego bieguna - nadmierne skupienie na szczegółach może " +
                        "spowodować ograniczenie perspektywy. Inne negatywne cechy to upór, zazdrość i " +
                        "zajadłość. Czwórka powinna słuchać i rozważać opinie bardziej doświadczonych " +
                        "ludzi, bo jeśli okaże swój upór i spróbuje udowodnić sobie, że jej pomysły są " +
                        "najbardziej praktyczne, może dojść do zatrzymania postępu. Ze względu na " +
                        "intensywny sposób przyswajania i przetwarzania informacji ważne jest, by " +
                        "Czwórka poświęcała dużo czasu sobie i kultywowała spokój i ciszę w swoim " +
                        "otoczeniu. Piękno natury działa na nią uspokajająco i jest najlepszym sposobem " +
                        "relaksu, mimo to niektóre osoby z tą Drogą Życia zapewniają go sobie innymi " +
                        "środkami, np. alkoholem czy lekami uspokajającymi. Odprężenie jest konieczne " +
                        "dla zdrowia psychicznego i fizycznego oraz w celu uniknięcia przeciążenia mózgu, " +
                        "pracującego na wysokich obrotach. Numerologiczne Czwórki są z reguły " +
                        "pragmatyczne i skoncentrowane na konkretnych materialnych celach, które budują " +
                        "fundament bezpieczeństwa na przyszłość. Ich osiągnięcie wymaga pracy i " +
                        "poświęcenia, a energia reprezentowana przez wibrację 4 sprawia, że jest ono " +
                        "łatwiejsze, gdyż wpisane w jej częstotliwość. Ważne jest tutaj osiągnięcie " +
                        "elastyczności mentalnej i fizycznej, wychodzenie poza schematy i rutynę dnia " +
                        "codziennego, a także akceptacja ograniczeń, które warto postrzegać tutaj nie jako " +
                        "przeszkody na drodze do osiągnięcia sukcesu, lecz jako formę jego " +
                        "zabezpieczenia. Nagrody i osiągnięcia przyznawane są numerologicznej Czwórce " +
                        "ze względu na włożony wysiłek, ale też determinację, cierpliwość, wytrwałość, " +
                        "oddanie pracy, lojalność, solidność, sumienność, metodyczność, produktywność i " +
                        "niezawodność.";
                break;
            case 5:
                text = "Droga Życia Piątki to umiłowanie wolności, zabawy, zmian, wędrówki, spotkań towa" +
                        "rzyskich i degustowania życia wszystkimi zmysłami. To wybitni obserwatorzy. Piątkę" +
                        "cechuje ciekawość, szybki umysł oraz zmienność. Jej celem jest rozwijanie nieustra" +
                        "szoności, odwagi, odporności i konstruktywne wykorzystanie wolności. W wyższym" +
                        "wymiarze jest nim poznanie wieloaspektowości duszy. Stąd wszystko staje się tutaj" +
                        "eksperymentem, doświadczeniem, do którego Życie prowadzi Piątkę i jej to umożli" +
                        "wia. Musi dowiedzieć się, co należy zrobić i w jakim czasie. Sukcesy osiągane są dzięki" +
                        "właściwemu działaniu podjętemu we właściwym czasie i ze zrozumieniem."+
                        "Piątka to także ruch i przemieszczanie się, stąd osoby te często dokonują zmian na płaszczyźnie mentalnej i fizycznej, gdyż w ten właściwy dla siebie sposób realizują swoje cele. Piątki interesuje badanie zarówno tego, co znane, jak i tego, co nieznane. Ich ciekawość nie zna granic, co ułatwia im instynktowne gromadzenie informacji. Pragną wybrać, przeanalizować, porównać i się tym podzielić, choć nie zawsze odbywa się to w sposób racjonalny czy metodyczny. Imponująca jest ich wytrwałość w prowadzeniu badań dotyczących życia wewnętrznego i zewnętrznego, gdzie wszelkie dane stanowią kawałki układanki i składają się w całość. Nie są źródłem informacji, ale odbierają je zewsząd i przekazują dalej. Zachowując przy tym neutralność. Dla Piątki wszystko jest informacją. Wymienia je i przekazuje. Cenią doświadczanie różnorodności, stąd często zmieniają krajobraz, miejsce zamieszkania, pracę czy partnerów. Interesują się wieloma rzeczami, co pozwala na gromadzenie ogromnych ilości informacji oraz umożliwia żywą komunikację. Zdobywają wiedzę dzięki doświadczeniom, innym ludziom i za pomocą pięciu zmysłów. Są dostrojone do zmienności w życiu, akceptują jej istnienie, a jako że patronuje im Merkury, odznaczają się polotem intelektualnym. Stąd bierze się łatwość przyswajania dużej ilości danych czy opanowywania języków obcych. W wibracji tej następuje również lekcja wykraczania poza pięć zmysłów i nauka słuchania intuicji, a nie tylko logicznego umysłu. Piątka potwierdza, że istnieje magiczna sfera istnienia i im bardziej w nią wkraczamy, tym bardziej podążamy za naszą duszą, za sercem. Magia rozpoczyna się jednak wówczas, gdy racjonalny umysł rezygnuje z potrzeby rozumienia wszystkiego. Dominującym tematem przewodnim Drogi Życia 5 jest poszanowanie wolności własnej i cudzej. Przejawia się w ciągłym poszukiwaniu przygód, naturalnej inteligencji, optymizmie, zmysłowości i ciekawości. Autentyczne zainteresowanie różnymi aspektami życia, wiedza zdobywana na podstawie doświadczeń i towarzyszące temu poczucie humoru czyni tę osobę atrakcyjną w jakimkolwiek towarzystwie się znajdzie. Poza tym sposób myślenia i przenikliwość spostrzeżeń zapewniają jej magnetyczny urok, co naturalnie przyciąga zainteresowanie płci przeciwnej. Pomysłowość i zdolności adaptacyjne pozwalają jej zaangażować się w prowadzenie kilku działalności naraz, a przez to pomnażanie zysków. Dlatego numerologiczne Piątki zwykle dochodzą do pieniędzy i sukcesów w bardzo młodym wieku. Preferowana jest praca, gdzie człowiek pozostawiony jest samemu sobie - wtedy może pozwolić sobie na swobodny przepływ myśli. Jako że Piątka związana jest z komunikowaniem się, słowo jest jej mocną stroną. Osoby te bardzo dobrze się nim posługują, dzięki czemu często wybierają zawód pisarza lub lingwisty, zostają aktorami lub ekspertami od reklamy, PR i we wszystkich tych dziedzinach, które wymagają inteligencji, bystrości, nietuzinkowości, elokwencji i umiejętności prowadzenia dyskusji. Istotną kwestią jest dla nich pielęgnowanie wszelkich porcji zdobywanej wiedzy, by móc ją wykorzystać w celach zawodowych. Negatywne manifestacje energii Piątki dotyczą niestałości, zazdrości, złośliwości i niechlujności. Pojawiają się okresy smutku. Żarty bądź ironia mogą szkodzić, gdy skierowane są przeciwko drugiemu człowiekowi. Dążenie do poznania wielu barw życia nierzadko prowadzi do wszelkiego rodzaju uzależnień, w tym od hazardu, ryzyka, stymulantów i wszelkich sytuacji podwyższających poziom adrenaliny. Charakterystyczna jest podatność na podejmowanie spontanicznych decyzji, działania pod wpływem impulsu, robienia tego, na co w danym momencie nachodzi ochota, a to nierzadko nie jest właściwym rozwiązaniem i może wprowadzać chaos i przynosić niepożądane rezultaty. Do punktu krytycznego prowadzi nieustanna potrzeba zmiany partnerów, zawodu, miejsca zamieszkania i nie tylko - zdarza się, że numerologicznej Piątce przychodzi wówczas budować całe życie na nowo. Osoba musi być przygotowana na częste i pilne zmiany, przemieszczanie się i podróże, gdyż ta energia nie pozwala pozostawać zbyt długo w tym samym miejscu. Dobrze, gdy zmiany są postrzegane jako kolejna przygoda i wychodzenie życiu naprzeciw, gdyż wzbogacają o nowe doświadczenia i pozwalają gromadzić kolejną porcję wiedzy, przydatnej w przyszłości. Na poziomie duchowym Piątka dokonuje syntezy poznania i mądrości, ułatwia wymianę informacji i energii pomiędzy osobowością i duszą, płaszczyzną fizyczną i niefizyczną oraz umysłem racjonalnym i intuicję";
                break;
            case 6:
                text = "Największą siłą leżącą u podstawy Drogi Życia 6 jest miłość. To ona reguluje" +
                        "całe życie, jest nieskończona i pozwala stanąć u boku swoich bliskich zawsze we" +
                        "właściwym momencie. Mogą oni liczyć na wsparcie i pocieszenie, wysłuchanie" +
                        "i podniesienie na duchu. Z tego względu numerologiczna 6 dąży do tego, by w jej" +
                        "otoczeniu królowały piękno, zgoda, harmonia i spokój. Wyróżnia się fizyczną" +
                        "atrakcyjnością i magnetyczną osobowością. Jako że dom i rodzina są tutaj w centrum"+
                        ", obecność miłości, ciepła i dobrego słowa płynącego prosto z serca jest najwyższym błogostanem i poczuciem spełnienia. Miłość jest w tej wibracji niesiona bezinteresownie. Przekazanie wiedzy, mądrości i doświadczenia odbywa się w nadziei, że pomogą one ludziom przejść spokojnie ich drogę. Pogrążeni w smutku, cierpieniu i rozczarowaniu odnajdują tu współczucie, zrozumienie i słowa otuchy. Osoby z Drogą Życia 6 pozostają pod opieką Wenus, która reprezentuje piękno, symetrię, harmonię i sztukę. Z racji wysokiego poczucia estetyki, ludzie ci są koneserami piękna i dlatego starają się upiększać świat wokół. Kochają dom i ogród, uwielbiają zajmować się nimi i urządzać je, wkładając w wystrój i atmosferę całe swoje serce. Są niezwykle kreatywni i muszą znaleźć sposoby na konstruktywne wykorzystanie tej kreatywności. Wiele Szóstek jest niezwykle utalentowanych muzycznie, stąd często rozwijają swoje umiejętności poprzez grę na instrumentach. Silne przywiązanie do domu sprawia, że osoby te preferują wykonywać pracę, która pozwala im zachować kontakt z domem. Traktują go jako najpiękniejsze miejsce do życia, stąd często wybierają takie profesje, jak dekorator wnętrz czy ekspert feng shui. Jeśli pracują poza domem, wówczas miejsce pracy czynią takim, by czuli się w nim jak w domu. Bez względu na to, czym się Szóstki zajmują, istotny jest dla nich spokój. Dlatego też wolą zarządzać lub prowadzić własną firmę niż mieć nad sobą szefa. Naturalne poczucie odpowiedzialności i opiekuńczości czyni Szóstki wychowawcami, pielęgniarzami, wizjonerami i mistrzami sprawiedliwości. Dlatego na ich drodze pojawiają się ludzie z problemami, którzy proszą je o pomoc. Przydzielane są im również stanowiska wymagające odpowiedzialności, co pozwala wykorzystać wrodzone umiejętności i talenty w tych dziedzinach. Jeśli nie zdecydują się zostać rodzicem, pełnią tę rolę w inny sposób: jako nauczyciele i wychowawcy w przedszkolu, szkole i na uczelniach, lekarze i pielęgniarki, współpracownicy i przyjaciele, opiekunowie w domach pomocy roztaczający opiekę nad osobami słabszymi i chorymi, opiekunowie zwierząt domowych - dlatego szczególnie często towarzyszą im małe zwierzątka, jak koty, psy czy rodziny zyskuje dzięki nim szersze znaczenie. Jeśli tworzą związek małżeński, wolą spędzać czas z małżonkiem niż z przyjaciółmi. Jeśli są osobami samotnymi, dynamikę rodziny przenoszą do obszaru swojej aktywności. Kobieta Szóstka ma tendencję do przyciągania młodszych mężczyzn. Rozwiedziona kobieta Szóstka może zanadto angażować się w życie swoich dzieci i mieć trudności z postrzeganiem ich jako dorosłych. Nie jest zdrowe";
                break;
            case 7:
                text = "Drodze Życia 7 patronują węzeł południowy zwany Ketu, jak również Księżyc i " +
                        "Neptun - z tego względu 7 jest najbardziej duchową wibracją w numerologii. To " +
                        "liczba mistyki, której trzeba się nauczyć: zadawać pytania, by przeniknąć " +
                        "tajemnice duszy. Najczęściej wybierają ją dusze samotne, myśliciele i introwertycy. " +
                        "Celem jest rozwijanie duchowości, analiza oparta na danych, intuicji, wierze, " +
                        "zaufaniu i otwartości. Osoby z tą Drogą Życia poszukują Prawdy i dążą do bycia " +
                        "autentycznym. Wibracja 7 sprzyja obserwacji toczącego się wokół życia i osób " +
                        "tworzących nasz świat, by poznać wszelkie związane z nimi aspekty. " +
                        "Numerologiczna Siódemka dobrze się czuje z samotnością. Działa wtedy " +
                        "niezależnie, ceni prywatny czas i skupia się na tym, co potrafi najlepszego dać " +
                        "innym ludziom. Nawet jeśli oglądając świat zewnętrzny na jeszcze niedojrzałym " +
                        "etapie życia, coś każe jej buntować się przeciwko swojej samotności, to tak " +
                        "naprawdę największą inspirację do działania znajduje właśnie w niej. " +
                        "Numerologiczna Siódemka patrzy na wszystko, starając się zrozumieć przyczynę " +
                        "stanu rzeczy. Nie zaakceptuje niczego bez oczywistego dowodu i wyrabia trwałą " +
                        "opinię na dany temat. Każda nowa myśl przechodzi długi proces, zanim umysł " +
                        "pozwoli jej rozbłysnąć wszystkimi kolorami. Gdy stanie się w pełni zrozumiała i " +
                        "przyjęta do świadomości, osoba albo zadziała pod jej wpływem, albo ją odrzuci. To " +
                        "jej droga docierania do filozoficznych prawd, którymi posłuży się w przyszłości, " +
                        "pocieszając cierpiących i pomagając innym. Do przezwyciężenia jest tendencja do " +
                        "wyobcowania, mroczności, tajemniczości, a także spryt i skłonność do " +
                        "hipochondrii. Chłód emocjonalny i zamknięcie utrudnia nawiązywanie przyjaznych " +
                        "relacji Wewnętrznie odczuwany dystans w stosunku do świata zewnętrznego " +
                        "sprawia, że osoba postrzegana jest jako od legła i niedostępna. W wyglądzie i " +
                        "manierach Siódemki tkwi jednak coś majestatycznego, dostojnego, szlachetnego i " +
                        "pełnego arystokratycznej godności, stąd cen ona okazywany szacunek i " +
                        "odpowiednie traktowanie. Na ogół jednak Siódemka jest pełna energii i entuzjazmu " +
                        "i raczej nie stanowi dla niej wielkiego wyzwania podjęcie się pozornie trudnego " +
                        "przedsięwzięcia, zdobycie nowych kwalifikacji zawodowych lub rozpoczęcie pracy " +
                        "w nowym miejscu czy na nowym stanowisku. Śmiało wręcz próbuje rzeczy, na " +
                        "które niejednej osobie nie byłoby łatwo się odważyć W pracy, jak i w życiu " +
                        "osobistym, ceni sobie przede wszystkim niezależność Jej zainteresowania " +
                        "najczęściej obejmują takie dziedziny jak kultura, historia, psychologia, filozofia, " +
                        "ezoteryka czy wszelkie nauki tajemne. Bardziej nawet niż powietrze, ważne jest " +
                        "wszystko, co czyni życie piękniejszym. Może to być gustowny obraz, książka " +
                        "ulubionego autora, muzyka, unikalny wystrój wnętrza czy wszelkie estetyczne " +
                        "dodatki i ozdoby. Stanowią one niezbędny atrybut spełnionego i przyjemnego " +
                        "życia dla takiego konesera umiejętności artystycznych, jakim jest Siódemka. Z " +
                        "tego też powodu jest ona cudownym rodzicem, bo zaszczepia w swoich dzieciach " +
                        "zdolność kochania życia we wszystkich jego przejawach. Czę sto okazuje się " +
                        "również dobrym pisarzem, malarzem lub poetą, a cokolwiek robi. jest w tym " +
                        "odrobina filozoficznego ujęcia. " +
                        "Lubi podróże i zmiany. Wybiera więc taki rodzaj pracy, w którym może mieć wiele " +
                        "okazji do przemieszczania się - dojeżdżania do pracy, udaje się w podróże " +
                        "służbowe. Ta zewnętrzna manifestacja powodowana jest duchową potrzebą " +
                        "kontynuowania połączenia z obcą ziemią. Jeśli ma możliwość osiągnięcia " +
                        "pożądanych rezultatów, wyrusza w podróż i głęboko interesuje się sprawami " +
                        "miejsc, do których się udaje. Pisze książki o wycieczkach i podróżach, tworzy " +
                        "albumy, gromadzi pamiątki z różnych miejsc, a przy tym posiada dobrą znajomość " +
                        "świata Życie Siódemki wypełnione jest także dawką przykrych lub frustrujących " +
                        "zdarzeń. Władający nią Ketu przymusza, by pozwoliła odejść temu, do czego była " +
                        "mocno przywiązana w świecie zewnętrznym. Nierzadko oznacza to rozstanie z " +
                        "bliską i ukochaną osobą lub istotą. Dzieje się to po to, by ona sama w swoim " +
                        "wnętrzu miała sposobność nawiązania kontaktu z duszą. Często do takiego " +
                        "kontaktu dochodzi poprzez sny, kontemplację piękna i natury, medytację lub " +
                        "rozmowy z Bogiem Ten rodzaj egzystencji wykorzystuje możliwość zagłębiania się " +
                        "w tajemnice życia i zdobywania wiedzy do duchowego doskonalenia. Wiedza o " +
                        "charakterze duchowym i praktycznym jest tutaj sposobem na znalezienie " +
                        "szczęścia. W poszukiwaniach swojej własnej prawdy czy filozofii życia osoba ta " +
                        "odzyskuje równowagę wewnętrzną i nierzadko rozpoczyna służbę na rzecz innych " +
                        "ludzi bądź istot Poznanie siebie, traktowanie siebie dobrze, robienie tego, co " +
                        "sprawia autentyczną i płynącą prosto z serca przyjemność, tego, co wyzwala " +
                        "radość oraz pozwala być sobą, przynosi poczucie równowagi, której tak bardzo " +
                        "pragnie Siódemka. Sprawia też, że sama w sobie Siódemka czuje się silna, " +
                        "zadbana i niezależna.";
                break;

            case 8:
                text = "Sława, władza i bogactwo z zachowaniem równowagi świata ducha i materii to " +
                        "elementy składowe Drogi Życia Ósemki. Patronuje jej Saturn, co oznacza " +
                        "wymagającą naukę opanowania świata ducha i materii, sztuki biznesu z " +
                        "zachowaniem i poszanowaniem wszelkich uniwersalnych zasad duchowych. " +
                        "Saturn symbolizuje ból, walkę, ograniczenia, dyscyplinę i karmę. Życie przynosi " +
                        "przeszkody i twarde lekcje, ale są one lekcjami koniecznymi, by nabrać dyscypliny " +
                        "wewnętrznej i wyzwolić się z ograniczeń, które na siebie nałożyliśmy. Poprzez " +
                        "uczenie się lekcji życia Ósemka osiąga prawdziwą wolność, doświadcza osobistej " +
                        "mocy i łączy się z uniwersalną Prawdą. Wytrwałe i konsekwentne mierzenie się z " +
                        "nimi buduje moc i pozwala znieść wszystkie rodzaje życiowych zawirowań. Dzięki " +
                        "nim numerologiczna Ósemka uczy się sensu życia. Jako że Saturn jest planetą " +
                        "karmy (przyczyna-skutek), mówi się, że wstrzymuje, ale nigdy nie odmawia, " +
                        "dlatego osoba ta musi pracować najciężej, aby osiągnąć swoje cele, ale co " +
                        "najważniejsze, osiąga je wówczas z sukcesem. Odpowiednio, wytrwale i w " +
                        "zdyscyplinowany sposób przepracowane lekcje pozwalają cieszyć się wewnętrzną " +
                        "mocą i niekwestionowanym autorytetem. Zdolności administracyjne i " +
                        "organizacyjne to narzędzia, które pomagają stworzyć stabilną i godną pozycję dla " +
                        "siebie i rodziny. Dobrobyt, sukces i ludzkość są zarazem przyczyną i skutkiem " +
                        "rozwoju. Zachodzi konieczność objęcia działalności w znaczącej dziedzinie, gdyż " +
                        "im większa jest odpowiedzialność, tym większa przychodzi nagroda, zarówno w " +
                        "znaczeniu materialnym, jak i duchowym. Wysoki autorytet i jasna wizja tego, co " +
                        "jest właściwe, otwiera drogę do wielkich osiągnięć. Niezwykle korzystna jest " +
                        "działalność filantropijna i charytatywna, gdyż pozwala zdobyć wiedzę, jak uzyskać " +
                        "to, co nie jest dostępne dla innych, a tym samym stworzyć najbardziej udane " +
                        "projekty. Wydajność i zręczność, tak charakterystyczne dla wibracji 8, pozwalają " +
                        "zaoszczędzić czas, wysiłek i energię, aby przeprowadzić je tam, gdzie są " +
                        "najbardziej potrzebne. To, co jawi się przeszkodą, uczy, jak poruszać się w " +
                        "podróży przez życie. Przeszkoda musi być przyjęta dla własnej korzyści. Tylko " +
                        "wtedy, gdy jest się w stanie zobaczyć jej piękno, człowiek może uwolnić się od " +
                        "ignorancji i potrzeby wal- ki. Życie Ósemki to seria zmagań, ale jeśli chce ona " +
                        "osiągnąć szczęście podczas swej podróży, musi dowiedzieć się, jak radzić sobie, " +
                        "by cieszyć się procesem oraz jak oswoić i z wdzięcznością przyjąć przeszkody. " +
                        "Aby to zrobić, musi zrozumieć prawdziwą naturę Saturna i lekcje zadane na to " +
                        "życie. Dlatego wytrwale poszukuje Prawdy, bo wie, że cierpienie przynosi nie " +
                        "karma czy pech, lecz ignorancja. Im bardziej osoba jest świadoma i obudzona, tym " +
                        "bardziej rozpoznaje i przyjmuje Prawdę. To proces uczenia się poprzez dyscyplinę, " +
                        "aby pokonać ból i ograniczenia, osiągnąć szersze zrozumienie i świadomość oraz " +
                        "doświadczyć harmonijnej kompletności. Kompletność oznacza, że nie tylko dobry\" " +
                        "aspekt, ale że każdy przejaw natury i każda ludzka jakość pełni użyteczną funkcję. " +
                        "Przekraczając kategoryzację dobre - złe, przyjemne - nieprzyjemne człowiek jest w " +
                        "stanie odkryć wartość we wszystkim, czego doświadcza i co obserwuje. Dzięki " +
                        "wewnętrznej eksploracji Ósemka identyfikuje mentalne i emocjonalne wzorce, " +
                        "które generują jej zewnętrzną rzeczywistość. Wewnętrzne i zewnętrzne " +
                        "rzeczywistości odzwierciedla- ją się nawzajem, stanowiąc wyraz prawdy zawartej " +
                        "w słowach jak na górze, tak na dole\" czy co posiejesz - zbierzesz\". " +
                        "Gdy rozpozna to, w jaki sposób przyciąga do siebie sytuacje życiowe, dzięki " +
                        "twórczej sile własnych myśli i emocji jest w stanie zainicjować zmiany w swoim " +
                        "życiu. Poprzez przyjęcie odpowiedzialności za to, co tworzy, może wreszcie " +
                        "uwolnić się od złudnego poczucia niesprawiedliwości i równie złudnej " +
                        "przypadkowości sytuacji z jej życia. Kiedy uzna siebie za przyczynę, może stać się " +
                        "świadomym twórcą swojego życia. Doświadczenie harmonijnej całości przynosi " +
                        "Ósemce spokój i spełnienie, a radość z wolności emocjonalnej i umysłowej - " +
                        "prawdziwą satysfakcję. Jeżeli na szczyt prowadzi negatywna natura wibracji 8, w " +
                        "której to człowiek używa swojej mocy, aby zaszkodzić innym, nie ucieszy się z " +
                        "bogactwa, ponieważ będzie ono zepsute w samym zalążku. Typowym " +
                        "mechanizmem, który wykorzystuje Egzystencja, gdy prawa duchowe są gwałcone, " +
                        "to depresja wywołana doświadczeniami straty, przeciwności, separacji i żalu. " +
                        "Depresja jest duchowym cierpieniem wynikającym z poczucia oddzielenia od " +
                        "Źródła. Tym sposobem życie zmusza Ósemkę do zbadania sytuacji i tego, jak do " +
                        "niej doprowadziła. Zobowiązuje do porzucenia niedojrzałych zachowań i wzorców " +
                        "myślowych. Musi wówczas stawić czoła wewnętrznym konfliktom, odejść od " +
                        "potrzeby zadowalania ego i nabrać głębokiej pokory bez względu na to, jak bardzo " +
                        "boli. Ten gorzki do przełknięcia lek prowadzi ostatecznie do duchowego " +
                        "oczyszczenia, uzdrowienia, nabrania samodzielności i wyższego poziomu " +
                        "świadomości. Trzeba wyciągnąć wnioski i pójść dalej - tym razem jednak już z " +
                        "większą mądrością, akceptacją i dojrzałością z osobowością dostosowaną do " +
                        "duszy. Kiedy Ósemka wchodzi w kontakt z autentycznym ja, zaczyna otrzymywać " +
                        "wskazówki, przewodnictwo, dostosowuje się do prawdziwej tożsamości i " +
                        "rekonstruuje swoje życie w harmonii z duchowym celem. Świadoma Ósemka jest " +
                        "bardzo spostrzegawcza i rozumiejąca ludzi. Potrafi wczuć się w naturę człowieka, " +
                        "który jest mniej zdolny i nie odnosi sukcesów, a przy tym nie męczy jej pomaganie " +
                        "tym, którzy tej pomocy potrzebują. Wszystko, co ofiarowuje, wraca pomnożone po " +
                        "wielokroć. Jedną z głównych jej zalet jest odwaga, którą posługuje się, by " +
                        "zachowane zostały równe prawa dla wszystkich ludzi. Jest przy tym gotowa bronić " +
                        "ofiar niesprawiedliwości. Na ścieżce życia numerologiczna Ósemka odkrywa " +
                        "poczucie moralnej satysfakcji płynącej z faktu, że uczynione zostało nadzwyczajne " +
                        "dobro i że akt ten odbył się z wykorzystaniem właściwych jej zdolności. Musi " +
                        "opanować wszystko, co dla niej nowe, a co może prowadzić do wybranego przez " +
                        "nią głównego celu, gdyż wtedy bez wątpienia go osiągnie. Niosąc w sobie " +
                        "głębokie współczucie do ludzi i wszelkiego stworzenia, będzie cieszyć się swoim " +
                        "dostatkiem tylko dlatego, że może dzielić się nim z tymi, którym się mniej w życiu " +
                        "poszczęściło. Ono stanowi siłę i motywację napędzającą do działań, którym " +
                        "oddaje się człowiek z Drogą Życia 8. To, na czym koncentruje się z wyraźną, " +
                        "czystą intencją, uczciwością i wysiłkiem, jest w stanie z niesamowitą mocą " +
                        "przejawić się w jego życiu. Życie zapewnia testy, które pomagają Ósemce " +
                        "osiągnąć dojrzałość i wziąć odpowiedzialność za swoje działania. Saturn w " +
                        "astrologii znany jako Pan Karmy jest opiekunem, który stoi przy Bramach Inicjacji. " +
                        "Człowiek musi więc nie tylko spłacić swoje długi, zanim przejdzie przez bramę " +
                        "wyższej świadomości, ale też zasłużyć na tę łaskę. Żeby to uczynić, uczy się żyć " +
                        "świadomie i dokonywać mądrych wyborów w obliczu każdej próby, kryzysu i " +
                        "wyzwania. " +
                        "Musi zrozumieć i żyć według praw uniwersalnych. Samodyscyplina jest wymagana " +
                        "nie po to, by uprzykrzyć życie, ale by obudzić Ósemkę do świadomości, w której " +
                        "objawia się jej dharma - właściwe, pełne sensu i wartości działanie. Wtedy jest w " +
                        "stanie sumiennie podążać tą ścieżką i wnieść do świata swój wkład. Cena jest " +
                        "wysoka, ale nagroda bezcenna - jest nią mądrość, mistrzostwo nad samym sobą i " +
                        "zdolność do urzeczywistnienia płynących z serca pragnień.";
                break;

            case 9:
                text = "Drodze Życia 9 numerologia przyporządkowuje patronat planety Mars, głównie ze " +
                        "względu na charakteryzujący ją niepokój, ale też motywację, która pozwala " +
                        "doprowadzać sprawy do finału. W związku z tym, ze numerologiczne Dziewiątki " +
                        "czynią wiele rzeczy dla innych ludzi - troszczą się o nich, kochają i zapewniają " +
                        "najlepszą opiekę - przyczyna tego leży w znaczącym wpływie energii Neptuna. " +
                        "Patronuje ona również zodiakalnym Rybom - znakowi, który zamyka cały zodiak i " +
                        "podobnie jak numerologiczna Dziewiątka - również stanowi zwieńczenie cyklu " +
                        "Neptun to wyższa oktawa Wenus, a w związku z tym niesie energię " +
                        "bezinteresownej miłości, całkowitego oddania i głębokiego współczucia. Osoby z " +
                        "Drogą Życia 9 czują, że są na misji - pragną zmienić świat i uczynić go lepszym i " +
                        "spokojniejszym miejscem do życia - najwyraźniej właśnie dlatego, ze same w sobie " +
                        "toczą walkę i borykają się z wewnętrznym niepokojem Charakterystyczna jest " +
                        "niezwykła wrażliwość na ludzkie emocje, różne osobowości, atmosferę, muzykę, " +
                        "dźwięki natury i rytm. Dziewiątki rozwijają wgląd i przejawiają zainteresowanie " +
                        "istotą rzeczy zawartą w naukach tajemnych. Pociąga je mistycyzm i towarzyszy " +
                        "nieodparta potrzeba samodzielnego zgłębiania wiedzy. Obecny jest dar " +
                        "pozazmysłowego postrzegania, stąd spotkamy tę wibrację u wielu " +
                        "bioenergoterapeutów Powołanie odnajdują w działalności filantropijnej, " +
                        "charytatywnej, wolontariacie i branży usługowej. Cokolwiek czynią, obejmuje to " +
                        "szeroki zasięg Często oddają się powołaniu w dziedzinie medycyny, wybierając " +
                        "zawód lekarza lub zarządzając szpitalem. Ze względu na charakterystyczną dla " +
                        "nich zdolność do oddania się ludziom, znajdziemy tutaj wielu aktorów, a ze " +
                        "względu na gościnność - będą stanowić też główny trzon kadry hotelarskiej. " +
                        "Jednym z największych pragnień jest nieograniczone wędrowanie, odbywanie " +
                        "dalekich podróży, docieranie do otwartych przestrzeni. Posiadanie czegoś na " +
                        "własność lub gromadzenie bogactwa zatrzymuje je w miejscu i hamuje rozwój, " +
                        "gdyż przeznaczeniem tej ścieżki jest osiągnięcie mokszy, a więc uwolnienie od " +
                        "doświadczania cierpienia i strachu. Nie dotyczy to jedynie aspektu materialnego. a " +
                        "obejmuje również romantyczne i osobiste relacje. Dziewiątka nader łatwo popada " +
                        "w sidła związków, w których wymaga się od niej jakiejś zmiany. Mimo że chęć " +
                        "tworzenia idealnej relacji w harmonii i szczęściu, a także potrzeba opierania się na " +
                        "partnerze, by czuć się kompletną, jest ogromną pokusą, to jednak Dziewiątka nie " +
                        "może jej ulegać. Nie dla niej zmiany, by zadowolić partnera - zwykle nie czyni to " +
                        "relacji szczęśliwą. Dziewiątka musi być sobą i wierzyć, że znajdzie szczęście, które " +
                        "jest przeznaczone tylko dla niej. Dopiero z miejsca wierności sobie i ideałom jest w " +
                        "stanie zaprosić do swojego życia dokładnie to, czego szuka. Miłość jest w tej " +
                        "Drodze Życia bardzo ważna, Dziewiątka potrafi wręcz kochać jednocześnie kilka " +
                        "osób i cieszyć się szczęściem miłości we wszystkich jej odcieniach i kolorach. " +
                        "Jednak wieczna romantyczna miłość nie jest jej przeznaczeniem. Może zanurzać " +
                        "się w ekstazie, pogrążać w smutku, a następnie, pomnażając doświadczenie, " +
                        "znaleźć nową miłość. I to jest sposób, w jaki odnajduje pełną satysfakcję w swoim " +
                        "życiu. Troską o interesy innych ludzi często pozbawia się spokoju umysłu - po tym, " +
                        "jak wzbija się do lotu i rozpościera skrzydła szczęścia, następują okresy głębokiej " +
                        "depresji. Tu odbywa się nauka podporządkowania swoich emocji rozumowi. " +
                        "A kiedy zrozumie, dlaczego coś dzieje się w jej życiu, nigdy więcej nie będzie czuła " +
                        "już smutku z tego powodu, że ktoś ją znów oszukał. Będzie czekać na jutro z " +
                        "przekonaniem, że każda zmiana na tym świecie jest zawsze zmianą na lepsze. " +
                        "Dziewiątka, podobnie jak jej patron Mars, zachęca do samodzielności i motywuje " +
                        "do odkrywania nowych horyzontów. Nie waha się ani nie poddaje innym. Zmierza " +
                        "do celu, napotykając przeszkody, ale pamięta, że wszelkie wyzwania muszą zostać " +
                        "pokonane, a sprawy rozwiązane. Jest pewna siebie i ma wyjątkowo silną wolę, " +
                        "która sprzyja osiąganiu celów. Zdaje sobie sprawę, że do człowieka należy wybór " +
                        "tego, czego chce z życia, więc polega na sobie i nie wzywa na pomoc sił " +
                        "zewnętrznych. Zamiast tego uczy się korzystać z własnych zasobów, wzmacniać " +
                        "siebie i znajdować siłę w sobie. Nieprzebudzona Dziewiątka zazwyczaj pragnie " +
                        "sprawować władzę nad innymi. Pragnienie kontrolowania innych może być jawne " +
                        "lub potajemne (biernie agresywne). Rodzi się ono z głębokiego strachu przed " +
                        "własną mocą i otoczeniem - kontrolując innych, sama czuje się mniej zagrożona. " +
                        "Podstawową potrzebą jest poczucie bezpieczeństwa, choć kontrola otoczenia " +
                        "oddala ją od niego. Dlatego w tym życiu uczy się panować nad swoją energią i " +
                        "reakcjami oraz działać w sposób, który ułatwia jej tworzenie własnej ochrony i " +
                        "bezpieczeństwa. Ostatecznym wyzwaniem nie jest wybór a integracja. Kiedy " +
                        "osoba koncentruje się na wyborze, konflikt się nie kończy. Zawsze jest światło i " +
                        "ciemność, dobro i zło, więc dążąc do integracji, musi być zdolna do świadomego " +
                        "przeplatania materii i Ducha, nie tracąc przy tym swojej tożsamości. Jeśli próbuje " +
                        "tłumić swoją energię, traci moc obrony, ochrony i dbania o siebie. Jeśli postrzega " +
                        "siebie jako ofiarę, nie dość, że ktoś lub jakiś system z pewnością na tym skorzysta, " +
                        "to jeszcze zwracając się przeciwko sobie, dokona wewnętrznych szkód. Pierwotna " +
                        "energia musi być wykorzystana konstruktywnie, by wieść szczęśliwe, zdrowe i " +
                        "harmonijne życie. Energia Dziewiątki powinna być skierowana na tworzenie, a nie " +
                        "niszczenie, dlatego Dziewiątka musi walczyć o coś, a nie być przeciwko czemuś. " +
                        "Rezultaty są wówczas nieskończenie bardziej satysfakcjonujące. Kiedy jest " +
                        "nieustraszona, doświadcza miłości uniwersalnej. Wtedy też czuje się bezpieczna i " +
                        "szanuje, a nie walczy z innymi. Strach jest zakorzeniony w odłączeniu się od duszy " +
                        "i uniwersalnej energii. Jest źródłem wszelkich konfliktów i konfrontacji. " +
                        "Nieustraszoność jest zatem sztuką, którą Dziewiątka uczy się świadomie " +
                        "kultywować. Poprzez objęcie energii emocji i przepuszczenie jej przez ciało, łączy " +
                        "się z rytmem życia, który przepływa przez każdą istotę w każdej chwili. Celem jest " +
                        "objęcie każdego uczucia, ruchu i ekspresji energetycznej - wtedy aura człowieka " +
                        "staje się bardziej promienna i tym większą osiąga jedność z całym istnieniem. " +
                        "Odchodzi też wówczas od reagowania i zmierza w kierunku działania oraz oddala " +
                        "się od ofiary do współtwórcy własnego życia. Zdrowe ego służy sercu, a gdy jest " +
                        "na nim skoncentrowane, dar silnej woli wykorzystany zostaje, by bronić słusznej " +
                        "sprawy. Daje hart ducha do realizacji marzeń oraz determinację do wyrażania " +
                        "prawdy, wspierania idei, które są bliskie sercu, i poszukiwania najwyższej ekspresji " +
                        "„ja\". Zintegrowana Dziewiątka działa uczciwie, czuje wewnętrzną siłę, a jej życie " +
                        "staje się pasją. Przeznaczenie osoby z Drogą Życia 9 jest sumą losów wyznaczoną " +
                        "przez wszystkie inne liczby, a w związku z tym zawiera ona wszystkie pozytywne i " +
                        "negatywne cechy innych liczb. To oczywiście tłumaczy, dlaczego jest tak niezwykle " +
                        "silną postacią w każdym znaczeniu tego słowa. " +
                        "Uczy odwagi bycia sobą, bycia swoim najlepszym przyjacielem, bycia uczciwym i " +
                        "sprawiedliwym wobec siebie i innych. Dziewiątka pielęgnuje swoją niezależność i " +
                        "wyrabia poczucie kompletności jako już dokonanej - nie zdobywanej przy kimś. " +
                        "Sama w sobie jest całością.";
                break;

        }
        return text;

    }

    public String drogaZyciaCel(int id){
        String text = "";
        switch (id){
            case 1:
                text = "Inspiracja";
                break;
            case 2:
                text = "Uhonorowanie intuicji";
                break;
            case 3:
                text = "Kreacja";
                break;
            case 4:
                text = "Ugruntowanie";
                break;
            case 5:
                text = "Doświadczenie";
                break;
            case 6:
                text = "Miłość i odpowiedzialność";
                break;
            case 7:
                text = "Rozwój duchowy";
                break;

            case 8:
                text = "Zrównoważenie ducha i materii";
                break;
            case 9:
                text = "Pasja i powołanie";
                break;

        }
        return text;

    }

    public String liczbaDuszy(int id){
        String text = "";
        switch (id){
            case 1:
                text = "Osoba czuje się jak w domu, kiedy może zaangażować się w swoją pasję i być bezpośrednia w wyrażaniu. Prywatnym, bezpiecznym miejscem jest to, w którym ma poczucie wolności i w którym może bronić swoich pragnień. Z tego powodu za zamkniętymi drzwiami regularnie toczy się walka i konfrontacja. W rzeczywistości ten ogień jest jej niezbędny - ożywia i utwierdza ją w przekonaniu, że innym zależy równie mocno co jej. Nie dla niej apatia, bierność i nijakość - te powodują poczucie dyskomfortu. Już jako dziecko była dynamiczna, przebojowa, pełna ducha i temperamentu. Członkowie rodziny oczekiwali od niej, że ożywi atmosferę w domu i będzie stawiać im wyzwania. W dorosłym życiu Jedynka za rodzinę uznaje każdego, kto jest tak samo silny i niezależny jak ona oraz ma w sobie ducha walki, odwagi i honoru. Osoba pochodzi ze świata, w którym znajdywała ukojenie w zdrowym egoizmie. Dziedzictwo to polega na zachowaniu równowagi w byciu zorientowanym na „ja\" i skoncentrowaniu na swoich własnych pragnieniach.";
                break;
            case 2:
                text = "Jest tu głębokie uzależnienie od bezpiecznej przystani, w sidła którego osoba " +
                        "wpada w prywatnym zaciszu. Będzie poszukiwała wyciszenia, wycofania i refleksji. " +
                        "Ogromną potrzebą jest zanurzenie się w swoich emocjach i uczuciach, " +
                        "charakterystyczna - potężna wrażliwość na potrzeby drugiego człowieka. " +
                        "Prywatne „ja\" za zamkniętymi drzwiami uwalnia swoją ciemniejszą, nierozpoznaną " +
                        "stronę. Tu przechodzi przez silne cykle irracjonalności i nastrojowości. Potrzebuje " +
                        "jednak drugiego człowieka, który zrozumie ją w pełni. Zdenerwować potrafi " +
                        "jakakolwiek niewrażliwość, bez względu na to, czy była zamierzona, czy tylko tak " +
                        "została odebrana. Wtedy osoba wycofuje się w siebie. Zawsze była najbardziej " +
                        "wrażliwym członkiem rodziny. Od dzieciństwa postrzegana jako zdominowana " +
                        "przez emocje, uczucia i potrzeby. Stąd po dziś dzień z jednej strony osoby z " +
                        "zewnątrz czują, że nadal muszą otaczać ją opieką, a z drugiej - ze względu na jej " +
                        "wrażliwość, tego samego mogą oczekiwać od niej. Często, ze względu na pokłady " +
                        "czułości, osoba staje się zastępczym członkiem rodziny, np. poprzez adopcję. " +
                        "Dziedzictwo, które ustanowiła, opiera się na instynkcie wspierania i troskliwości. W " +
                        "ten sposób poprzez poszanowanie korzeni, z których się wywodzi, tworzy " +
                        "przytulne, ciepłe miejsce - tu może się rozwijać, pozwalając dbać o siebie i " +
                        "roztaczając opiekę nad innymi.";
                break;
            case 3:
                text = "Kiedy osoba udaje się do swojego bezpiecznego miejsca, utwierdza się w przekonaniu, kim jest. Dlatego w domu musi czuć się komfortowo i pewnie, aby po prostu być sobą. Prywatne „ja\" jest jej prawdziwym „ja\" i ta dobrze znana z domu atmosfera stanowi scenę, której potrzebuje do wyrażenia siebie. Jednak za zamkniętymi drzwiami może stawać się dość wymagająca lub zaabsorbowana sobą, zwłaszcza jeśli inni ludzie nie poświęcają jej tyle uwagi lub uznania, ile potrzebuje. Ogromny dyskomfort przynosi jej poczucie bycia ignorowaną lub niedocenianą. W rodzinie była rozrywkową, radosną i pogodną artystką. Od dzieciństwa wiedziała, jak ściągnąć na siebie uwagę bliskich. Dziś nadal oczekuje się od niej, że będzie w jakiś sposób występować\", choć nie przybiera to już aż tak intensywnego charakteru. Tworząc relacje z ludźmi, których traktuje jak rodzinę, zapewnia im dobrą zabawę i dużo pewności siebie. Dziedzictwem jest bycie liderem i granie pierwszych skrzypiec. Ten kontakt z korzeniami utrzymany zostaje, gdy pozytywnym i wzmacniającym wpływem może obdarzać swoich bliskich.";
                break;
            case 4:
                text = "Poczucie bezpieczeństwa na poziomie dosłownym i duchowym część osób z tą wibracją odnajduje w potrzebie przyjemności, która płynie z komfortu, harmonii i relaksu. Najlepiej się czują, kiedy mogą po prostu odpocząć i cieszyć się sobą, aż do osiągnięcia stanu lenistwa i samozadowolenia. Intymne „ja\" zanurza się we wszystkich zmysłowych radościach, które życie ma do zaoferowania - jedzeniu, muzyce, dobrym filmie czy grze. Strasznie nie lubią, gdy ktoś próbuje im przerwać, zmienić lub zabrać rzeczy, które kochają. Od dzieciństwa ludzie ci wiedzieli, jak się ustabilizować. Rodzina oczekiwała od nich wiarygodności, konsekwencji i cierpliwości, a przy tym zdawała sobie sprawę z ich ogromnego uporu. Po dziś dzień zauważa to każdy, kogo również traktują jak rodzinę. Dzięki temu są solidni jak skała. Zawsze też wiedzieli, co kochają i cenią, więc nadal darzą to wszystko szacunkiem i trzymają się tego bardzo mocno. Druga grupa osób poczucie bezpieczeństwa odnajduje w rutynowych czynnościach. W życiu prywatnym mogą odczuwać konieczność porządkowania, sprzątania, naprawiania lub organizowania spraw. Może to również oznaczać oddawanie się stałym codziennym zadaniom, które pomagają uporządkować życie. Za zamkniętymi drzwiami są bardzo pomocnymi i skromnymi ludźmi, którzy odzyskują poczucie bezpieczeństwa, gdy mają możliwość pomagania innym. Łatwo się jednak denerwują, gdy nie są w stanie czegoś lub kogoś naprawić. Od najmłodszych lat odgrywali w domu rolę pomocnika i stąd dziś są w stanie nie tylko pomagać swoim bliskim, ale również przyjmować od nich polecenia. Rodzina wyznacza wysokie standardy moralne, stosuje i oczekuje pewnej dozy krytyki. Te osoby pochodzą z przeszłości, w której były najlepszą wersją siebie, a dziś budują silną bazę, gdy mogą wykazać się pracą, rozwojem osobistym i jednocześnie pomagać innym dokonać tego samego.";
                break;
            case 5:
                text = "Intymne „ja\" jest niespokojne, ciekawe i potrzebujące stymulacji. Osoba czuje się " +
                        "jak w domu, gdy dzieje się coś ekscytującego coś, co pobudza i ożywia umysł " +
                        "spragniony komunikacji. Nic jej bardziej nie rozstraja niż brak otwartości na dialog i " +
                        "zaangażowania w rozmowę ze strony ludzi, z którymi dzieli przestrzeń życiową. " +
                        "Wtedy pojawia się ta niespokojna jakość, która domaga się interakcji. Wytrąca ją " +
                        "również z równowagi, gdy sprawy nie przybierają zbyt poważnego kierunku. " +
                        "Za zamkniętymi drzwiami chce się śmiać i rozmawiać, rozmawiać, rozmawiać... " +
                        "Wczesne uwarunkowanie sprawiło, że odgrywa rolę, w której nikt się nie " +
                        "spodziewa, co powie, jak się zachowa, jak zareaguje. Jest typem, z którym nie " +
                        "można się nudzić. Dziedzictwem osoby jest silnie rozwinięta ciekawość i wartość " +
                        "poznawcza. Dlatego intelekt jest motorem popychającym do nieustannego " +
                        "badania, odkrywania i rozbudzania zainteresowań.";
                break;

            case 6:
                text = "Prawdziwą motywacją jest połączenie z innymi ludźmi. Aby czuć się bezpiecznie, " +
                        "osoba dąży do tego, by podejmować wspólne działania z drugim człowiekiem. " +
                        "Dom jest miejscem, w którym ożywiają relacje, a prywatne „ja\" jest całkowicie " +
                        "współzależne. Nie dla niej życie w pojedynkę ani przebywanie z ludźmi, którzy są " +
                        "nieuprzejmi lub samolubni. Potrzebuje atmosfery spokoju i miłości, aby naprawdę " +
                        "czuć się jak w domu. W rodzinie jest zawsze tą miłą i grzeczną, która nie bierze " +
                        "sterów w swoje ręce. Jako dziecko pragnęła, aby wszyscy się dogadywali i " +
                        "kochali. Dlatego po dziś dzień członkowie rodziny spodziewają się po niej, że " +
                        "podtrzyma atmosferę harmonii i współpracy. Swoim kochającym „ja\" dzieli się z " +
                        "ludźmi, którzy stają się jej rodziną. W głębi duszy jest bardzo życzliwa, przyjemna i " +
                        "wspierająca. Otaczając się takimi osobami, czuje się jak w miejscu, z którego się " +
                        "wywodzi.";
            case 7:
                text = "Bezpieczne miejsce duszy jest wysoce idealistyczne. Jako że osoba karmi się wrażeniami psychicznymi, potrzebuje dużo czasu na pobycie sam na sam ze sobą i refleksję. Dlatego powrót do domu, do wnętrza jest całkiem relaksującym doświadczeniem. Osoba jest bardzo empatycznym i wyrozumiałym człowiekiem wobec tych, którzy towarzyszą jej w życiu osobistym. Musi jedynie uważać na brak granic, gdyż emocje i kiepskie nastroje innych ludzi w bardzo łatwy sposób wywołują w niej podobny dyskomfort. Już jako dziecko potrafiła wtopić się w atmosferę i przybierać rolę w zależności od potrzeby. Ze względu na otwartość psychiczną, od samego początku rodzina przelewała na nią mnóstwo projekcji, nie zawsze sprawiedliwych i uzasadnionych. A jednak, nikt nie zna jej na tyle, by móc powiedzieć, że wie o niej wszystko. Dziś choć traktuje ludzi jak rodzinę, nadal pozostaje nieuchwytna i tajemnicza. Dziedzictwem jest wiara, sztuka, współczucie, niezwykła intuicja i prawdziwie duchowe korzenie.";
                break;
            case 8:
                text = "Powrót do wnętrza jest paradoksem, ponieważ oznacza zabranie się do pracy. W " +
                        "swoim prywatnym świecie osoba czuje się jak w domu, który jest stabilnym i " +
                        "solidnym fundamentem. Jednak w tej intymnej atmosferze wiecznie musi oddawać " +
                        "się wytężonej pracy nad sobą, co prowadzi do poważnych zmagań i obciążeń. " +
                        "Wewnętrzne „ja\" jest niespokojne i bardzo łatwo ulega podenerwowaniu, a przy " +
                        "tym wciąż obecne jest poczucie melancholii. Ukojeniem jest siła i niezawodność w " +
                        "kierowaniu swoim prywatnym życiem. Determinacja i wytrwałość dają tu poczucie " +
                        "bezpieczeństwa, którego tak bardzo osoba potrzebuje. Już jako dziecko nigdy nie " +
                        "była tak naprawdę dzieckiem. Zawsze oczekiwano od niej dojrzałości i " +
                        "odpowiedzialności. Po dziś dzień stanowi w rodzinie rodzaj spoiwa, które trzyma " +
                        "wszystkich razem. Rola ta może być męcząca, ale przykłada się do niej z należytą " +
                        "starannością i poświęceniem. Gdy traktuje kogoś jak swoją rodzinę, równie chętnie " +
                        "staje się dla niego opoką. Stworzyła dla siebie mocny osobisty fundament " +
                        "wytrzymałości i samodyscypliny. Zawsze może z niego korzystać, gdy jest " +
                        "potrzebny - zwłaszcza gdy sprawy stają się trudne. Jego dziedzictwem jest " +
                        "umiejętność załatwiania spraw i odwracania wszelkich trudności.";
                break;
            case 9:
                text = "Powrót do wnętrza to połączenie się z miłością i współczuciem, by mogły zostać przelane na innych ludzi i istoty żyjące. Motywacją wewnętrzną jest tworzenie piękna, harmonii i pokoju dla wszystkich. Ze względu na wysoki poziom energii współodczuwania osoba często poświęca swoje własne potrzeby na rzecz oddania się innym ludziom. Potrzeba uzdrawiania leży u podstaw i stanowi dziedzictwo. Osoba jest życzliwym altruistą, kierującym się ideą humanitaryzmu i pragnącym uczynić świat lepszym miejscem. Największym wyzwaniem jest nadanie tym impulsom konkretnego wyrażenia. Często osoba jest zbyt delikatna i wrażliwa, w związku z czym może nie mieć wystarczającej motywacji, by przenieść wizję na praktykę. Z drugiej strony, droga do sukcesu nie może też polegać na agresywnych ambicjach. Ważne jest zatem przyjęcie zdecydowanej postawy, która pozwoli czynić dobro. Osoba zawsze miała rodzaj władzy w rodzinie, nawet jako dziecko. Od samego początku była w tym intensywna jakość, która pozwalała wywierać wyjątkowy wpływ na innych. Dziś rodzina nadal spodziewa się, że osoba będzie postacią skomplikowaną i tajemniczą, więc nie można jej poznać. Jednak każdemu, kogo traktuje jak rodzinę, przekazywana jest moc głębokiego uzdrowienia. Jeśli osobista miłość nie znajduje tutaj spełnienia, jest to wezwaniem do swobodnego wyrażania miłości uniwersalnej. Aby nie dopuścić do poczucia wyższości, wrodzona mądrość i poczucie perfekcjonizmu powinny zostać uhonorowane i z pokorą przekazywane innym.";
                break;
        }
        return text;
    }

    public String liczbaZewnetrzna(int id){
        String text = "";
        switch (id){
            case 1:
                text = "Osoba zauważana jest od razu i może wzbudzać mieszane odczucia. Nierzadko przy pierwszym spotkaniu może sprawiać wrażenie obcesowej, twardej czy nawet nieco niegrzecznej. Najczęściej nie trzeba jej przedstawiać nikomu, gdyż zrobi to sama. Może wydawać się młodsza, niż jest w rzeczywistości. Wrażenie niedojrzałości może płynąć ze spontaniczności, odwagi lub dość brutalnej szczerości, choć najczęściej całkiem niewinnej i nie niosącej intencji, by komuś zaszkodzić. Bardzo wyraziste jest skupienie na sobie. Sposób zachowania osoby zmienia się, gdy rozmowa schodzi z niej i przenosi się na inny obiekt/obszar. Nadal będzie jednak próbowała za pomocą „ja\" przyciągnąć uwagę do siebie. Udzieli wskazówek lub zmotywuje do działania, by popchnąć innych we właściwym kierunku. Jest jednak zbyt skoncentrowana na tym, co sama ma do zrobienia, więc nie będzie zaprzątać sobie głowy tym, jakich wyborów dokonają inni. Gdy prowadzimy z nią rozmowę i obserwujemy język ciała, wzrok, gestykulację i sposób poruszania się lub słuchamy tonu głosu, coś nam mówi, że już gdzieś pędzi dalej, że ma jeszcze do załatwienia wiele spraw niecierpiących zwłoki. Rzadko boi się czegoś nowego i łatwo rozwiązuje problemy w swoim życiu, wymagając od innych takiego samego podejścia. Jest innowatorem. Wie, że niektóre rzeczy są warte ryzyka i często je podejmuje. Dość uparta, nierzadko przyjmuje surową postawę, co może zrażać niektórych ludzi. Jeśli zachowa agresywny styl, musi liczyć się z tym, że staną za nią ludzie słabi, co będzie wymagało robienia wielu rzeczy dla nich. Wskazane jest zmiękczenie osobowości. Powinna zwracać uwagę na drobne szczegóły garderoby, gdyż podkreślą jej osobowość. Jako że spędza dużo czasu w oficjalnym ubraniu, warto, żeby dodała do niego nieco kolorów. Stara się dostosować trendy do siebie, zachowując swój indywidualny styl.";
                break;

            case 2:
                text = "Osoba zwraca uwagę swoją delikatnością i miękkością w wyrażaniu. Nawet jeśli jest w kiepskim nastroju, to albo wyraża to cicho, albo zauważa się to na jej twarzy. Jest w niej coś miłego i przyjaznego, inni czują się przy niej dobrze i bezpiecznie. Ma miłą, troskliwą twarz, która sprawia, że ludzie się przy niej otwierają. Często przyznają, że jest sympatyczna i serdeczna i łatwo się z nią komunikują. Potwierdzają jej opiekuńczość, szczere zainteresowanie ich życiem i gotowość do pomocy, jako że zapewnia im poczucie, że są ważni i potrzebni. Sama często przygląda się ludziom z boku lub unika kontaktu wzrokowego. Cechą charakterystyczną jest zadawanie pytań o to samo na wiele różnych sposobów, choćby o czyjeś samopoczucie. Przy pierwszym spotkaniu sprawia wrażenie nieśmiałej lub powściągliwej, z czasem jednak staje się bardziej przystępna. Bardzo silnie oddziałuje na nią atmosfera otoczenia. Kiedy była dzieckiem, pewne wydarzenia sprawiły, że stała się nieśmiała, a z wiekiem ta wewnętrzna nieśmiałość nie zniknęła. Nadal bardzo łatwo ją zranić słowami, urazić bądź poruszyć. Jej ekspresja zmienia się, ożywia i rozjaśnia, gdy mówi o rodzinie, relacjach lub matce. Wiele rozmów może dotyczyć wspomnień i nostalgii. Gdy włącza się do rozmowy, tematy dyskusji i sama rozmowa podlegają spowolnieniu oraz zyskują na delikatności. Stroni od kłótni i podniesionego głosu, gdyż wywołują w niej one emocje. Zdecydowanie woli, gdy w otoczeniu panuje harmonijna i zgodna atmosfera, co inni dostrzegają. Powinna zwracać uwagę na przedsięwzięcia, do których jest zapraszana, gdyż jest to oznaką docenienia jej inteligencji, dowcipu oraz intuicji. Lubi porządek w mieszkaniu i ubiorze, które musi być wygodne i wykonane z miękkich tkanin. Powinna zrezygnować z tkanin błyszczących, jeśli nie chce uchodzić za naiwną i dziecinną. Korzystne są eksperymenty ze stylem i wypróbowanie jaśniejszych kolorów, jako że wtedy pozostaje w harmonii ze swoim wnętrzem. Wskazane jest ukazywanie swojej namiętnej strony. Ludzie zauważają i naturalnie doceniają jej poczucie piękna i dobrego smaku, które manifestują się już w samym sposobie ubierania. Potrzebuje sportu nie dlatego, żeby schudnąć, ale by utrzymać swoje ciało w dobrej kondycji. Bratnią duszę przyciągnie inteligencją i życzliwością.";
                break;

            case 3:
                text = "Jest tutaj mieszanka atrakcyjności, pewności siebie i świadomości samego siebie. " +
                        "Osoba ma naturalny czar i sprawia wrażenie, że wie, jaki wpływ wywiera na innych. " +
                        "I rzeczywiście ludzie reagują na to, co o nich myśli bądź mówi. " +
                        "Nie jest to bez znaczenia dla ich pewności siebie. Gdy sprawi komuś komplement, " +
                        "ten zwykle bardzo wyraźnie reaguje na niego - albo jest nim rozbawiony, albo mu " +
                        "kilka razy zaprzecza, tłumacząc się z niego, co jest tak naprawdę otwartą furtką do " +
                        "dalszych pochlebstw. Wypełnia ją aura szczęśliwości, która wraz z pozytywnym " +
                        "nastawieniem stanowi dla innych bardzo przyjemne i budujące towarzystwo. Lubi " +
                        "opowiadać o sobie w sposób, który często jest odkrywczy. Jest w tym również " +
                        "bardzo autentyczna, gdyż zdaje się dobrze znać i rozumieć siebie. Rzadko się " +
                        "zdarza, że jest przygnębiona. Ma silną wolę i wewnętrzną witalność, przez co " +
                        "nawet nieświadomie inspiruje innych. Czasami jednak może być to odbierane jako " +
                        "forma wymuszenia na kimś konkretnego działania. Tak czy inaczej jest to robione " +
                        "w sposób ciepły i uprzejmy. Charakterystyczna jest teatralna mimika twarzy i " +
                        "ubarwianie najprostszych wypowiedzi. Lubi piękne i estetyczne rzeczy i ubrania, w " +
                        "których zawarta jest doza ekstrawagancji i artyzmu. Wie, jak podkreślić swoje " +
                        "zalety i ukryć mankamenty. Posiada umiejętności organizacyjne, więc praca nad " +
                        "poziomem koncentracji i właściwym zarządzaniem czasu zwiększą wydajność " +
                        "pracy. Łatwo znajduje partnera i ma romantyczne usposobienie, choć ze względu " +
                        "na wielorakość dziejących się w jej życiu spraw i zainteresowań, nie potrafi się " +
                        "zatrzymać przy kimś dłużej. Musi starać się być bardziej konsekwentna i szukać " +
                        "takich rzeczy w ludziach, które są w stanie pogłębić jej pierwotne zauroczenie i " +
                        "przerodzić w miłość.";
                break;
            case 4:
                text = "Osoba sprawia wrażenie nieskomplikowanej w pozytywny sposób, a wynika to z " +
                        "jej praktycznego podejścia do rzeczy. Zwykle udziela prostych odpowiedzi na to, o " +
                        "czym jest mowa, sprowadzając dyskusję do podstaw. Niekiedy ostrożnie " +
                        "podchodzi do tematu lub odpowiedzi, innym razem może udzielić odpowiedzi " +
                        "wymijającej, choć zrobi to w słodki lub rozsądny sposób. Jest silna, pracowita, " +
                        "odpowiedzialna i zdeterminowana, co tworzy bezpieczną i pełną zaufania " +
                        "atmosferę. Ludzie czują, że mogą na niej polegać. Wiele rozmów może dotyczyć " +
                        "pracy. Jest już coś bardzo precyzyjnego w samym sposobie jej mówienia. Twarz " +
                        "osoby przybiera często wygląd uważny i krytyczny, co może powodować, że " +
                        "rozmówca nierzadko odbiera to jako formę osa- du. Tak czy inaczej osoba jest " +
                        "szczera, również kiedy mówi o tym, co sama ma do przepracowania. Takie jest " +
                        "nawet jej podstawowe założenie - by starać się poznawać świat wewnętrzny raczej " +
                        "niż oceniać rzeczy po wyglądzie. Powinna postarać się o bardziej zrelaksowany " +
                        "sposób życia, gdyż poświęcając czas na planowanie lepszej przyszłości, zapomina " +
                        "o tu i teraz. W odzieży ceni sobie komfort i praktyczność, choć skłania się ku temu, " +
                        "by wyglądać elegancko. Dużo pracuje, więc zna wartość pieniądza. Bardzo dobrze " +
                        "potrafi odróżnić wysoką jakość ubrań od tych, które zbyt wiele nie kosztowały. " +
                        "Dobry gust nie pozwoli jej nosić czegoś nieodpowiedniego. Korzystne dla niej są " +
                        "jaśniejsze kolory lub łączenie tego, co posiada, z wyrazistszymi elementami. Zna " +
                        "wartość domu i rodziny. Docenia partnera, który potrafi dzielić radości i smutki, " +
                        "ciepło i stabilizację. To nadaje sens życiu. Jest przy tym bardzo pomocnym " +
                        "człowiekiem, a dzięki drobnym aktom dobrej woli każdego dnia, można " +
                        "powiedzieć, że świat staje się lepszy, gdy są w nim ludzie tacy jak ona.";
                break;
            case 5:
                text = "Osobę otacza żywa, choć niespokojna i nerwowa energia. W rozmowie wyraźnie " +
                        "zauważa się przeskakiwanie z wątku na wątek, a w działaniach przemieszczanie " +
                        "się pomiędzy wykonywaniem takiej czy innej czynności. Można powiedzieć, że jest " +
                        "kompulsywnym rozmówcą, który mówi to wszystko, co mu napływa strumieniem " +
                        "do głowy. Niezwykle inteligentny i ciekawy wielu rzeczy, ale w natłoku myśli może " +
                        "uchodzić za chaotycznego. Czasami może tak bardzo analizować i przetwarzać " +
                        "wszystko w swojej głowie, że rozmowa staje się aż niewygodna. Nie można mu " +
                        "jednak odmówić dowcipu i dobrego poczucia humoru, choć nierzadko wcale nie " +
                        "ma intencji bycia zabawnym. Charakterystyczna jest dwoistość, ujmowanie rzeczy " +
                        "z różnych perspektyw, a nawet mówienie o sobie w trzeciej osobie lub z pozycji " +
                        "obserwatora zdarzeń. Twarz osoby jest często dość chłodna, czasem wręcz " +
                        "znudzona, ale ni stąd, ni zowąd może rozświetlić się, gdy zaistnieje sposobność " +
                        "podzielenia się zabawną historią, ciekawostką albo drobnym przytykiem czy " +
                        "urokliwą złośliwością. W pracy do wszystkiego dokłada swojej kreatywności, " +
                        "nawet jeśli jest to rutynowa praca. Kumuluje kreatywną energię i szuka różnych " +
                        "sposobów jej realizacji. Jest komunikatywna, ekstrawagancka i świetnie odnajdzie " +
                        "się w sprzedaży. Tu umysł działa na pełnych obrotach i stale opracowuje nowe " +
                        "pomysły oraz dopracowuje rozpoczęte projekty. Woli się jednak nie spieszyć, a " +
                        "udoskonalać pomysł, choć zazwyczaj trwa to nieco dłużej niż jest konieczne. Ma " +
                        "tendencję do podążania za modą, wypróbuje wszystko, co nowe i ciekawe w " +
                        "codziennym życiu. Dla osoby z wibracją 5 życie jest przygodą, dlatego wiecznie " +
                        "poszukuje czegoś świeżego, co wzbogaca doświadczenie. Żyje szybko, wiecznie " +
                        "coś załatwia, przemieszcza się, a jej apetyt na życie i poznawanie jest " +
                        "niezaspokojony. Wrodzony entuzjazm i spontaniczność często nie pozwalają się " +
                        "długo zastanawiać i osoba porywa się na to, co nowe i nieznane. Jest prawdziwą " +
                        "inspiracją i zagrzewa ludzi do działania. Jeśli chodzi o sprawy miłosne, to drzemie " +
                        "w niej dusza motyla. Magnetyczna osobowość, niezwykle zmysłowa i namiętna. " +
                        "Może mieć trudności z zatrzyma- niem się przy jednym partnerze/partnerce. Wie, " +
                        "że jest atrakcyjna i lubi dostawać potwierdzenia tego w postaci komplementów. " +
                        "Korzystnym jest, gdy zamiast rozpraszać swoją uwagę na wielu, znajduje tę jedną " +
                        "jedyną osobę wartą stuprocentowej uwagi. Inni ludzie często myślą o Piątce lepiej " +
                        "niż ona sama o sobie. To za sprawą ogromnego czaru osobowości, którym uwodzi " +
                        "i przyciąga ludzi. Z powodu jednak braku skupienia na jednym człowieku, często " +
                        "pierwsze wrażenie, któremu tak szybko ulega, wkrótce prowadzi do " +
                        "rozczarowania. Ciało Piątki jest w dobrej kondycji, a jeśli potrzebuje wzmocnienia, " +
                        "wystarczy powrót do niezbyt intensywnego treningu. Obecna jest tendencja do " +
                        "nadużywania wszystkiego, co przynosi więcej doznań i adrenaliny. Stąd " +
                        "uśmiechają się do Piątki wszelkiego rodzaju stymulanty, jak np. pyszne jedzenie, " +
                        "słodycze, seks, hazard, narkotyki bądź alkohol. Musi zachować ostrożność i " +
                        "poprawić sposób, w jaki żyje, narzucić sobie pewne ograniczenia, żeby nie popaść " +
                        "w tarapaty. Rozwój i praca nad sobą doprowadza Piątkę do naprawdę wyjątkowo " +
                        "szybkich postępów.";
                break;

            case 6:
                text = "Jest coś miłego, ciepłego i łatwego w odbiorze w aurze osoby z wibracją 6. Wyczuwalna jest harmonia, spokój i zrozumienie dla drugiego człowieka. Stąd też w jej otoczeniu pojawiają się ludzie, którzy sami dość niespokojni, potrzebują przywrócenia równowagi wewnętrznej. Urzeka delikatnością i szczerością, a także łatwością komunikowania się z drugim człowiekiem - podczas rozmowy przywrócony zostaje w jego sercu spokój. Osoba stara się widzieć w kimś jego pozytywne strony, choć musi pamiętać, że każdy ma również swoją ciemną stronę. Szóstka jest oazą spokoju i będzie starała się go zachować bez względu na okoliczności, w których się znajdzie. Jako że sama ma wysokie poczucie odpowiedzialności, może zostać to wykorzystane przez tych, którzy postrzegają osobę jako słabszą i uległą. Często zatem próbują przerzucić na nią swoje obowiązki. Nie powinna sobie na to pozwalać, ani dawać sobą manipulować, gdyż w ten sposób odbiera sobie energię, a co ważniejsze - nie wykorzystuje okazji ku temu, by przekazać drugiemu dar satysfakcji płynącej z przejęcia odpowiedzialności za swoje sprawy. Jest bardzo towarzyską i hojną osobą, chętnie podejmuje gości w swoim domu, lubi też spotkania w gronie przyjaciół i znajomych. Jej najlepsze wspomnienia związane są właśnie z domem, przyjaciółmi, a także serdeczną atmosferą pełną ciepłych i radosnych rozmów, dekoracji, ładnych zapachów, dobrego jedzenia i pięknej muzyki. Jako rodzic jest wysoce empatyczna i życzliwa. Bardzo kocha dzieci i swoich bliskich, choć ma tendencję do nadopiekuńczości. Na sercu leży jej dobro rodziny, choć i tu głównym zadaniem jest nauka konsekwencji w postępowaniu z dziećmi. Dopóki wyręcza członków rodziny w ich zadaniach, staje się nerwowa, gdyż ci - tak samo konsekwentnie - odmawiają współpracy. Trzeba Szóstce pamiętać, że dla prawdziwego dobra drugiego człowieka jej zadaniem jest stworzyć mu okazję wykazania się odpowiedzialnością. W ten mądry i dojrzały sposób postępowania z nim on zyskuje wiarę i pewność siebie, a Szóstka poczucie autentycznej satysfakcji i spełnienia. Uwielbia naturę, kwiaty, małe zwierzęta. Ma wrodzone poczucie piękna i estetyki. Jest zwolenniczką symetrii i stonowanych barw. Jeśli chodzi o ludzi, nie ma dla niej większego znaczenia, jak oni wyglądają - ważniejsza jest ich osobowość.";
                break;
            case 7:
                text = "CYKL W WIBRACJI 7 \n" +
                        "Okres rozwoju duchowego i intelektualnego \n" +
                        "I CYKL FORMUJACY W WIBRACJI 7 \n" +
                        "Dziecko uczy się wrażliwości i czułości w relacji z rodzicem. Relacja może być " +
                        "emocjonalnie poruszająca i niestabilna, co przyprawia dziecko o zmartwienia. " +
                        "Dlatego też rozwija się wrażliwość, a wraz z nią potrzeba ochrony przed tą " +
                        "wrażliwością. W niektórych sytuacjach rodzic wydobywa przykre nastroje i " +
                        "poczucie niepewności u swojego dziecka. To tak, jakby to, co mówi/ robi, miało " +
                        "moc zadania rany, wywołania zdenerwowania, irytacji lub depresji u dziecka. Może " +
                        "to sprawić, że dziecko będzie w coraz większym stopniu zależne od reakcji " +
                        "rodzica. \n" +
                        "Może zatem odczuwać, że stabilizacja jego uczuć odżywa lub zamiera wraz z " +
                        "rodzicem. Z tą postawą przenosi się do świata. Dlatego może sprawiać, że drugi " +
                        "człowiek czuje się winny za to, co osoba czuje. I dlatego właśnie przychodzi jej " +
                        "nauczyć się przede wszystkim dbać o siebie. Konieczne jest tu obserwowanie " +
                        "własnych uczuć, ale nie traktowanie ich w sposób dla siebie pobłażliwy. Może " +
                        "łatwo popadać w zawirowania emocjonalne i nie zastanawiać się, czy jej to w " +
                        "czymkolwiek pomaga - tak bardzo w to wrasta, że nie dostrzega, że mogłoby być " +
                        "inaczej. Nawet jeśli jest bardzo świadoma swoich emocji, przejawia niedojrzałość, " +
                        "jeśli nie wie, co z nimi zrobić. Kluczem cyklu jest rozwinięcie pewności siebie, aby " +
                        "stanąć w tych uczuciach, ale także pozwolić im przepłynąć przez siebie. Nie może " +
                        "kontrolować pływów emocji, które są w niej, jednakże musi być pewna, że one " +
                        "nieuchronnie się zmienią, więc nie ma absolutnie żadnej potrzeby się ich trzymać. " +
                        "Nieprzebudzony człowiek jest całkowicie nieświadomy siebie jako jednostki. " +
                        "Utożsamia się z rodzicami, pochodzeniem, rodziną. Niewiadomie powtarza w " +
                        "kółko karmiczne wzorce, które wiążą go z fizycznym planem. Wykazuje skłonność " +
                        "do gromadzenia, posiadania i bycia przywiązanym. Odczuwa życie zarówno " +
                        "zmysłowo, jak i psychicznie. Reaguje na wpływy faz Księżyca i emocje w " +
                        "otoczeniu. Może mieć trudności z odróżnianiem swoich wrażeń od wpływu innych. " +
                        "Znowu nieświadomie, stara się zachować najbardziej elementarną koncepcję " +
                        "siebie. Wewnętrzna walka często przejawia się poprzez gromadzenie przedmiotów, " +
                        "przywiązanie do pieniędzy i żywności. Gdy człowiek się przebudza, zaczyna " +
                        "tworzyć wyraźniejszą relację z otoczeniem. Narasta poczucie odrębności, które na " +
                        "początku może być przerażające. Strach przed odrębnością rozprasza się, gdy " +
                        "wybiera ścieżkę twórczej autoekspresji i odnajduje swoją niszę w życiu. Przechodzi " +
                        "od instynktownej, nadmiernie opiekuńczej opieki nad dziećmi do bardziej " +
                        "inteligentnego kierowania ich ku światu. Chociaż rozwija umiejętność odróżniania " +
                        "własnych psychicznych wrażeń od wpływu innych, nie jest jeszcze w stanie " +
                        "oddzielić tego, co jest jego, od tego, co jest czyjeś. Przechodzi od poczucia " +
                        "bezpieczeństwa wyłącznie wśród swojej rodziny do poczucia bezpieczeństwa " +
                        "gdziekolwiek się znajdzie. Przebudzenie pozwala przekształcić się w osobę z " +
                        "nieograniczonym współczuciem i ogromnymi wewnętrznymi zasobami energii " +
                        "opiekuńczej. Jest zaawansowaną istotą ludzką, która bezinteresownie tworzy " +
                        "formy i struktury, działające na rzecz poprawy istoty człowieczeństwa. Jest teraz " +
                        "osobą dobrej woli i źródłem nieograniczonej opieki dla wszystkich form życia.";
                break;

            case 8:
                text = "Ósemka jest bardzo silną osobowością i wywiera duży wpływ na innych - inspiruje " +
                        "do bardziej wytężonej pracy, w tym pracy nad sobą. Działa według planu. Wie, co i " +
                        "jak należy zrobić oraz jak efektywnie zarządzać czasem. Nie poddaje się presji " +
                        "innych ludzi, a jeśli ktoś próbuje na nią wpłynąć, spotka się z tym większym " +
                        "naciskiem - a z tym już nie każdy potrafi sobie dać radę. Jest pewna siebie, ma " +
                        "silną wolę i wysoko ceni swoją niezależność, dlatego najlepiej czuje się, gdy działa " +
                        "samodzielnie i na własnych klarownych zasadach. Odnosi sukcesy finansowe w " +
                        "biznesie. " +
                        "Jest silnie skoncentrowana na rezultatach, co sprawia, że jest postrzegana jako " +
                        "osoba wiarygodna i skazana na sukces w każdym przedsięwzięciu. Ma na koncie " +
                        "wiele osiągnięć różnej natury i wydaje się być dumna z tego, co osiągnęła. Ożywia " +
                        "się na pytanie czym się zajmujesz\", w przeciwnym razie sprawia wrażenie, jakby " +
                        "nadchodził już czas na zrobienie paru innych, ważniejszych rzeczy. Ósemka " +
                        "najlepiej czuje się w środowisku zawodowym, w którym jej obecność jest " +
                        "niezbędna. Skutecznie przekazuje to, co ma do przekazania, rozwiązuje problem i " +
                        "udziela końcowych wskazówek. Sposób, w jaki się wypowiada, jest bardzo " +
                        "stabilny - raczej nie moduluje głosu, ale też nie jest to nigdy monotonna " +
                        "wypowiedź. Wie, że jej życie jest pełne wyzwań i zmagań, ale akceptuje taki stan " +
                        "rzeczy - tym większej siły nabiera w sobie, poczucia niezłomności i determinacji. " +
                        "Większy spokój i pewność siebie pojawia się po ukończeniu trzydziestego, " +
                        "trzydziestego piątego roku życia. Do tego momentu Ósemce nie jest lekko. " +
                        "Twarz jej czasami jest powściągliwa i surowa, choć może też być niezdecydowana " +
                        "i wątpiąca, co ujawnia ostrożny charakter. Osoba rozumie, jakie znaczenie ma " +
                        "dobra odzież i akcesoria. Wie, jak wywrzeć pożądane wrażenie, a przez to potrafi " +
                        "dostosować ubiór do sytuacji, w której chce wyglądać bardziej łagodnie, a kiedy " +
                        "wręcz przeciwnie. Wybiera wyróżniającą się odzież i koniecznie dobrej jakości. " +
                        "Jest przy tym atrakcyjna, a jej pewność siebie potęguje wrażenie. Miewa problemy " +
                        "z żołądkiem i sercem, dlatego wie, że musi kontrolować swoją dietę oraz uprawiać " +
                        "sport w mądry sposób. Jeśli chodzi o alkohol, najlepiej, gdy nie pije go w ogóle i " +
                        "uczyni to jedną ze swoich życiowych zasad. Negatywne jest przeświadczenie, że " +
                        "tylko jej opinia jest jedyną słuszną. Ma huśtawki nastroju i bywa niewybredna w " +
                        "słowach. Wyzwaniem jest pokonanie egocentryzmu - wtedy ma szansę stać się " +
                        "wyjątkową osobą. Tak czy inaczej, jest wspaniałym przywódcą i wyczuwa się w " +
                        "niej silę autorytetu - ludzie doceniają jej moc, skuteczność i mądre prowadzenie.";
                break;
            case 9:
                text = "Dziewiątka jest wyrafinowana, pełna uroku, delikatna, dobrze wychowana i ma eleganckie maniery, czym zdecydowanie imponuje innym. Przyciąga do swojego życia wielu ludzi, którzy trwale zapamiętują wrażenie, jakie na nich wywarła. W życiu Dziewiątki ludzie dzielą się jednak na dwie ekstremalne kategorie - ci, którzy ją uwielbiają i ci, którzy żywią skrajnie negatywne odczucia wobec niej, kierując się zazdrością i całkowitym brakiem zrozumienia. Nie ma tu odczuć pośrednich. W samotności osoba odnajduje spokój, dlatego preferuje ją bardziej niż inne wibracje. Owszem, jest pewna ilość czasu, którą Dziewiątka poświęci innym, ale zaraz potem z całą przyjemnością powróci do swojego prywatnego świata, do samotni, by oddać się już wyłącznie swoim sprawom. W pracy odwrotnie – lepiej działa, gdy ma do czynienia z wieloma ludźmi czy z mnóstwem informacji. Wobec przyjaciół jest empatyczna i uprzejma. Cechuje ją wyjątkowy gust i smak jeśli chodzi o dobór strojów do okazji. Ze względu na wysoce magnetyczną prezencję, Dziewiątka musi mocno zdawać sobie sprawę, że poprzez swoje podejście do życia, przyciąga do niego to, co w rzeczy samej podświadomie chce do niego przyciągnąć. Jeśli uwierzy zatem, że np. jest zła, szalona, niepoczytalna i nie ma co z nią pogrywać, będzie w tym rzeczywiście bardzo przekonująca i tym samym z całą mocą odstraszy ludzi od siebie. Pasja, motywacja i odwaga mogą czynić Dziewiątkę wybuchową i impulsywną, musi więc ona objąć tę moc - w sensie duchowej świadomości i opanowania mistrzostwa nad samą sobą. Kiedy traci panowanie, bierze ją we władanie nieprzyjemna i gwałtowna energia, która czyni tę osobę autodestrukcyjną. Również postrzeganie życia jako bolesne, pełne bólu i cierpienia powoduje, że sama przywołuje do niego te wszystkie straszne rzeczy, np. porzucenie, śmierć, stratę czy zdradę. Musi więc Dziewiątka pamiętać, że istnieje pozytywny rodzaj destrukcji i polega on na pozbywaniu się tego, co nas powstrzymuje przed poczuciem wewnętrznej mocy. Jeśli szczerze uwierzy, że rolą, jaką tutaj ma do spełnienia, jest transformacja ludzi po to, by ich uleczyć, uzdrowić czy po prostu wzmocnić - będzie w stanie wywrzeć na nich już zupełnie inny wpływ. Wtedy też sama zaczyna przyciągać do swojego życia wszelkie dobro. Na tym etapie przechodzi od odgrywania roli tej, która jest wciąż ciężko doświadczana przez życie (i wciąż się podnosi), do punktu, w którym to przeżywanie zdarzeń jako dramatu ma już całkowicie za sobą. Jest wtedy w stanie żyć jako uzdrowiciel i doradca, bo poprzez swój wgląd i głębię doświadczenia znalazła sposób na uleczenie rany.\n";
                break;
        }
        return text;
    }

    public String cyklWWibracji(int id){
        if(id==10){
            id=1;
        } else if (id==11) {
            id=2;
        } else if (id==12) {
            id=3;
        }


        String text = "";
        switch (id){
            case 1:
                text = "CYKL W WIBRACJI 1 \n" +
                        "Okres nabierania odwagi, oryginalności i niezależnego myślenia \n" +
                        "LEKCJA CYKLU W WIBRACJI 1 \n" +
                        "Osoba otrzymuje możliwość doświadczenia silnego poczucia tożsamości, tj. ego, " +
                        "oraz w dalszej kolejności oddania go pod prowadzenie siły wyższej. Uczy się ustalania " +
                        "granic. Dzięki sile intelektu i intuicji rozwija poczucie odrębności i szacun- ku " +
                        "do własnej wyjątkowości. Życie dostarcza odpowiednich lekcji, by nauczyła się " +
                        "wzajemności, brania innych pod uwagę i dzielenia się. Uczy się zrównoważyć " +
                        "niezależność wojownika, pioniera z wartościami społecznymi, takimi jak takt i " +
                        "dyplomacja. Nie jest w stanie dostrzec wszelkich powiązań składających się na " +
                        "całość, dopóki nie dostrzeże własnej unikalnej roli jako jej składowej. Z tego " +
                        "powodu najpierw przechodzi przez etap rozwoju, w którym koncentruje się na „ja\". " +
                        "Niezbędna w tym procesie jest kreatywna ekspresja siebie. Zadaniem jest " +
                        "samokontrola i poszukiwanie całości. Z czasem doświadcza autentycznej " +
                        "zaradności i samodzielności. W innych przypadkach celem jest wykształcenie „ja\" " +
                        "jako istoty osobliwej i niepowtarzalnej i odejście od martwienia się o jakość życia " +
                        "osób wokół. Swoje największe osiągnięcia osoba uświadamia sobie, gdy uczy się " +
                        "służyć innym chętnie i bez oczekiwania na nagrody. Waha się, gdy podejmuje " +
                        "decyzje, ale wewnętrznie czuje wezwanie, aby zająć stanowisko w sprawie tego, " +
                        "co wie, że jest prawdą. \n" +
                        "Lekcje cyklu w wibracji 1 wiążą się z: zależnością, złym humorem, niepewnością " +
                        "prowadząca do braku działania, ograniczaniem siebie poprzez strach, uciekaniem " +
                        "się do przeszłości, aby uniknąć teraźniejszości, izolacją i spędzaniem dużej ilości " +
                        "czasu w domu, brakiem poczucia własnej wartości, unikaniem ryzyka, " +
                        "kontrolowaniem innych poprzez nadmierne reakcje emocjonalne \n" +
                        "W cyklu w wibracji 1 dzięki otaczającym ją ludziom osoba mierzy się z " +
                        "charakterystycznymi dla niej tematami po to, by mogła ujawnić zdrowe podejście " +
                        "do poszczególnych aspektów. Obejmują one: panowanie nad sobą i innymi po to, " +
                        "by kroczyć ścieżką samokontroli bycie traktowanym jak dziecko, które niewiele wie " +
                        "i rozumie, by podchodzić do życia z pozycji osoby dorosłej brak szacunku, by " +
                        "odkryć wartość szacunku do siebie i wykonywanej pracy nieumiejętność " +
                        "znalezienia celu, by z pełną determinacją obrać go i do niego dążyć. Piętrzące się " +
                        "kłopoty, by je rozwiązywać w rozsądny sposób nieobowiązkowość, " +
                        "niedotrzymywanie słowa, niespełnione obietnice, by podążać ścieżką " +
                        "dotrzymywania zobowiązań, obietnic i danego słowa rozpamiętywanie przeszłości, " +
                        "by potrafiła ją odpuścić i skupić się na celu wygląd, waga, utrzymanie porządku, " +
                        "by ujawnić własne poczucie dyscypliny w dbaniu o siebie mowy Tea osiągnięcie " +
                        "sukcesu, by przejąć pełną odpowiedzialność za wszystko, co się z nim wiąże. " +
                        "Osoba z wibracją 1 musi zająć się tworzeniem tego, czego potrzebuje dla siebie. " +
                        "Dążąc do osiągnięcia celu, który ją ożywia i pobudza do działania, znajdując jakąś " +
                        "ideę lub wyznaczając zasady, które budują szacunek do samego siebie, osoba " +
                        "rozwija poczucie przynależności. \n" +
                        "CELE CYKLU W WIBRACJI 1 \n" +
                        "Zauważenie mechanizmów funkcjonowania, m.in. gdy brakuje pewności siebie. " +
                        "Pojawia się tendencja do oddawania się bezczynności i stagnacji, a gdy nie " +
                        "wykorzystujemy swojej kreatywności, czujemy ospałość, frustrację lub " +
                        "zahamowania. Podobnie czujemy blokowanie lub powstrzymywanie, gdy " +
                        "przejawiamy zachowa- nia uzależniające. Pojawia się potrzeba udowodnienia " +
                        "czegoś sobie lub innym. Kiedy jesteśmy przyparci do muru kierujemy się (a przez " +
                        "to też spotykamy się) negatywnością, osądem, cynizmem, gniewem lub " +
                        "agresywnością. Wyjście poza destrukcyjne tendencje kierowania się wyłącznie " +
                        "interesem własnym, cynizmem i egoistycznym nastawieniem. Sprzyja temu " +
                        "właściwy dobór partnerów, którzy są równi w relacjach intymnych i biznesowych. " +
                        "Nie jest wskazane dobieranie partnerów słabszych lub uległych. Budowanie " +
                        "pewności siebie na podstawie swoich zasobów i umiejętności. Kiedy budujemy w " +
                        "sobie poczucie pewności siebie, stajemy się bar- dziej dynamiczni, nabieramy " +
                        "stylu i magnetyzmu, które przyciągają innych. Niezbędne jest zaufanie we własne " +
                        "siły i podążanie za unikalnymi wizjami, w żadnym wypadku nie za tłumem, gdyż cel " +
                        "w wibracji 1 służy pionierskim przedsięwzięciom. Jedynka jest ekspertem w " +
                        "kreatywnym rozwiązywaniu. problemów i musi to sobie uświadomić, by mogła " +
                        "przejść do wyrażania wrodzonych umiejętności. Często popada w wątpliwości, " +
                        "gdy ma do czynienia z czymś nowym. Ten wewnętrzny krytyk spełnia rolę " +
                        "katalizatora do wykrzesania własnej mocy, daru przedsiębiorczości i ambicji w celu " +
                        "zrealizowania planów. Z tej też przyczyny wszelkie niepowodzenia trzeba " +
                        "traktować jak bodziec służący rozwijaniu nowych pomysłów, a popełnianie " +
                        "ewentualnych błędów wzmacnia naszą odporność. Pozytywne i twórcze " +
                        "nastawienie na osiągnięcie czegoś sprzyja podążaniu w wybranym kierunku, " +
                        "wzmacnia pewność siebie i empatię wobec innych. Wskazana jest praca nad " +
                        "pozytywnymi afirmacjami i docenianie siebie za dobrze prze- prowadzone " +
                        "działania. Podstawą jest kreatywność, więc celem jest wykorzystywanie każdej " +
                        "okazji oferowanej przez życie, by zwracać się w kierunku oryginalnego myślenia i " +
                        "podejmowania innowacyjnych przedsięwzięć. \n" +
                        "I cykl formujący w wibracji 1 \n" +
                        "Charakterystyczne jest dążenie do zachowania zgody, harmonii, umiaru i " +
                        "równowagi w relacjach z drugim człowiekiem. Aby stało się to możliwe, wczesne " +
                        "uwarunkowanie musiało sprzyjać wykształceniu tej tęsknoty. Zwykle dzieje się tak, " +
                        "że rodzic wymaga od dziecka okazania pewnej troski wtedy, gdy albo ze względu " +
                        "na okoliczności nie może sobie na to pozwolić, albo zdaje sobie sprawę, że sam " +
                        "nie postępuje zbyt rozważnie. Obowiązek ten przejmuje dziecko, które w miarę " +
                        "zaznajamiania się z sytuacją panującą w rodzinie czuje, że to ono w jakiś sposób " +
                        "musi wnieść balans do swoich relacji z rodzicem. Dziecko nie wykształca w sobie " +
                        "silnej tożsamości. Rodzic zazwyczaj aprobuje wszystko i kieruje wszystkim, więc " +
                        "gdy dziecko zostaje bez rodzica, może czuć się zagubione. Nie wie, jak ma sobie " +
                        "bez rodzica poradzić, a tym samym nie jest w stanie wyrobić sobie własnego " +
                        "zdania. Idąc dalej w dorosłość, jego zdanie jest właściwie jedynie reakcją na to, co " +
                        "ktoś inny sądzi, a on sam staje się odbiciem drugiej osoby. Stanowi to dużą " +
                        "przeszkodę dla niego w podejmowaniu własnych decyzji. Nawet jeśli ją podejmie, " +
                        "spotyka się z podejściem przeciwnym, na co znów przychodzi mu zareagować. " +
                        "Neutralność jest tym, co pozwala osobie zachować równowagę, gdyż przyjęcie " +
                        "któregoś z punktów widzenia kojarzy jej się z wykroczeniem na teren dysharmonii, " +
                        "a tego woli unikać. Pod tym wszystkim kryje się również głęboko zakorzeniona " +
                        "potrzeba bycia lubianym i akceptowanym. A że osobie bardzo na tym zależy, to " +
                        "pragnie utrzymywać swoje relacje z ludźmi tak, by jej służyły, i odegra jakąkolwiek " +
                        "rolę, która jest potrzebna w danej sytuacji. Nieprzebudzona osoba nawiąże relacje " +
                        "w imię ich posiadania. Występuje tu ogromna potrzeba doświadczenia projekcji " +
                        "swojej osobowości. " +
                        "Wybrzmiewa motto: „Współpracuj i rób rzeczy po mojemu!\". W sercu rozgrywa się " +
                        "dramat i pasja wobec spraw miłosnych. Uwielbia spełniać swoje osobiste " +
                        "pragnienia. Naturalny urok i umiejętności społeczne są często wykorzystywane do " +
                        "maskowania prawdziwego celu - chęci wyjścia z każdej relacji jako zwycięzca. " +
                        "Wyzwaniem zatem staje się nauka bycia otwartym na różne punkty widzenia, a " +
                        "jednak mimo to zachowanie swojego własnego punktu zero - punktu " +
                        "utrzymującego wszystkie możliwości w równowadze. Budząc się, odbywa naukę " +
                        "współpracy w relacjach. Odchodzi od funkcjonowania w świadomości ja i wchodzi " +
                        "w świadomość „my\", co czyni ją wysoce dyplomatyczną. Lubi podróżować i " +
                        "poznawać nowe horyzonty. Przyjazna, ekstrawertyczna, sprawiedliwa i " +
                        "zainteresowana życiem. Ma silne poczucie sprawiedliwości i chęć czynienia dobra. " +
                        "Nabiera wyrafinowanego wyglądu i smaku. Lubi, aby jej dom był piękny i spokojny. " +
                        "Uśmiechem potrafi stopić serca ludzi. Najszczęśliwsza w pracy, która wymaga " +
                        "partnerstwa i wykonywana jest w przyjemnym otoczeniu. Docenia sztukę, nawet " +
                        "jeśli nie jest utalentowana. Naturalny urok, intuicja i umiejętności społeczne dobrze " +
                        "wpisują się w kontekst społeczny. Zazwyczaj spokojna. W miłości czuła i lojalna. " +
                        "Przebudzona może nie być zainteresowana małżeństwem - wówczas można " +
                        "powiedzieć, że poślubia samą siebie. Aby zachować harmonię w sobie, powinna " +
                        "pamiętać, że ma osobistą moc polegającą na tym, że gdy wysłucha wszystkich " +
                        "punktów widzenia, jest w stanie je przez siebie przefiltrować i następnie wydać " +
                        "naprawdę obiektywny werdykt. Musi stanąć w nim mocno, bez względu na to, jak " +
                        "ktoś inny próbuje go podważać. U budzącej się osoby chęć harmonii rozszerza się " +
                        "na sztukę, biznes, politykę i filozofię. Celem na tym poziomie jest uzyskanie " +
                        "większego powiązania z miłością. Rozpoczyna poszukiwanie idealnego partnera, " +
                        "który uzupełnia cele i aspiracje. Rozwija wyrafinowany gust, zamiłowanie do " +
                        "piękna oraz pragnienie uczciwych zasad między nią a drugim człowiekiem. Na tym " +
                        "etapie jest bardzo świadoma zwiększonego napięcia, które się w niej pojawia, gdy " +
                        "otoczenie nie jest harmonijne lub gdy nie panują w nim sprawiedliwe i uczciwe " +
                        "zasady wobec innych ludzi. Ważną lekcją jest, że stawienie czoła i narażenie się na " +
                        "czyjąś dezaprobatę jest największym krokiem w osiągnięciu dojrzałości, " +
                        "decyzyjności i stanowczości. Przeistacza się wówczas w filar, który utrzymuje " +
                        "równowagę, pozostając jednocześnie prawdziwym i sprawiedliwym wobec " +
                        "samego siebie. Ostatecznym jej celem jest stworzenie równowagi pomiędzy " +
                        "wyrażaniem woli, miłości i inteligencji w każdej sytuacji życiowej. \n" +
                        "II CYKL PRODUKTYWNY W WIBRACJI 1 \n" +
                        "II Cykl Produktywny wskazuje na formę wybitnego osiągnięcia. Zaczynamy prowadzić " +
                        "własną firmę lub obejmujemy rolę lidera, kierownika, koordynatora itp. " +
                        "Dziedzina działalności zazwyczaj wiąże się z możliwością kariery na wysokim " +
                        "szczeblu, innowacji lub konkurencyjności, a nie takiej, która jest tradycyjna lub w " +
                        "której zanikamy w tłumie. Podążamy własną drogą na szczyt poprzez własne " +
                        "wysiłki. Potencjalną trudność może stanowić nader silne ego oraz brak " +
                        "cierpliwości. Są to obszary, nad którymi prawdopodobnie przyjdzie się pochylić.";
                break;

            case 2:
                text = "CYKL W WIBRACJI 2 \n" +
                        "Okres podejmowania współpracy, stowarzyszania się, budowania relacji i \n" +
                        "osiągania równowagi \n" +
                        "LEKCJA CYKLU W WIBRACJI 2 \n" +
                        "Życie stwarza okazję do nawiązania kontaktu z uczuciami oraz do uczenia się " +
                        "kontrolowania i konstruktywnego kierowania emocji w twórcze i humanitarne " +
                        "przedsięwzięcia. To początek nowego cyklu ewolucji i budowania silnego " +
                        "wewnętrznego fundamentu, na którym opierać się będzie duchowa ewolucja. Jest " +
                        "to okazja do rozwinięcia cech współczucia, opieki, karmienia i wychowywania. \n" +
                        "CELE CYKLU W WIBRACJI 2 \n" +
                        "Zadaniem jest pomagać ludziom z wykorzystaniem do tego swoich darów. Trzeba " +
                        "nauczyć się rozróżnienia między wsparciem a służebnością, dawać tylko wtedy, " +
                        "gdy nas to ożywia, pobudza i podbudowuje, a ograniczać, kiedy czujemy się wy. " +
                        "czerpani. Obecna jest tutaj motywacja, by służyć, pomagać, prowadzić i wspierać. " +
                        "Daje to poczucie satysfakcji i spełnienia. Osoba ma wielkie serce i uczy się " +
                        "rozwiązywania problemów. Nie może pozwolić sobie na to, by poddała się " +
                        "emocjonalnym zawirowaniom, a zamiast tego musi skupić się na swoich celach. " +
                        "Zachodzi tu nauka działania na podstawie tego, co naprawdę czujemy, oraz " +
                        "uczciwego i autentycznego wyrażania intensywnych emocji. Liczba 2 w dacie " +
                        "urodzenia niesie informację o wrodzonej odpowiedzialności i niezawodności. " +
                        "Stąd sytuacje, które się pojawiają w tym cyklu mogą po wodować odczucia " +
                        "ciągłego popychania się i wycofywania poprzez balansowanie pomiędzy " +
                        "dawaniem z siebie za dużo a urazą, gdy słyszymy, że nie jesteśmy wystarczająco " +
                        "dobrzy, dojrzali, silni, zaradni i że nie robimy wystarczająco dużo. Możemy " +
                        "spotykać się z niedocenieniem. Trzeba porzucić przesadne poczucie " +
                        "odpowiedzialności i pracować w wymiarze umiarkowanym. To nauka " +
                        "zrównoważenia poczucia odpowiedzialności wobec innych z własnymi " +
                        "wewnętrznymi potrzebami i ograniczeniami. Znalezienie równowagi pomiędzy " +
                        "dawaniem i otrzymywaniem, mówieniem tak i nie, myślami i uczuciami, własnymi " +
                        "potrzebami a potrzebami innych. Również, stworzenie wewnętrznego poczucia " +
                        "integracji przeciwstawnych sil. Zatrzymanie wewnętrznego dialogu dotyczącego " +
                        "tego, co powinienem lub co. Zachodzi potrzeba zaufania intuicji, własnemu " +
                        "wewnętrznemu głosowi i doświadczeniu, zamiast szukania wskazówek i rad innych " +
                        "osób. Dojście do punktu, w którym nie jest już też nam potrzebna aprobata innych. " +
                        "Odnalezienie wewnętrznej równowagi i zdrowia, oddając innym część " +
                        "odpowiedzialności. Ważna jest przy tym intencja miłości i współczucia versus " +
                        "kierowanie się urazą i ego. Powstrzymanie się od nadmiernej współpracy, " +
                        "współzależnych relacji i brania odpowiedzialności za szczęście innych ludzi. " +
                        "Zaobserwowanie mechanizmu, że gdy czujemy się przytłoczeni zadaniem, " +
                        "współpraca szybko zamienia się w konflikt. Stawiamy wówczas opór bądź wręcz " +
                        "wycofujemy się całkowicie. Jest to przejaw naszego niezadowolenia i forma " +
                        "samoobrony. Za uporem z kolei kryje się uczucie bezradności i strach przed tym, " +
                        "że sobie z czymś nie poradzimy lub zostaniemy wykorzystani. Należy ustanowić " +
                        "zdrowe granice. \n" +
                        "I CYKL FORMUJĄCY: \n" +
                        "Pomiędzy dzieckiem i rodzicem istnieje pewien dystans - dosłownie lub w " +
                        "przenośni, w którym dobrze się odnajdują i rozumieją. Rodzic może nie należeć do " +
                        "osób zbyt wylewnych emocjonalnie czy uczuciowo. Pozwoli to później dziecku " +
                        "radzić sobie z uczuciami tak, by nim nie zawładnęły. Rodzic zwykle też odznacza " +
                        "się pewną ekscentrycznością charakteru, którą będzie również przejawiało " +
                        "dziecko. Relacja ta przypomina stosunki panujące pomiędzy przyjaciółmi czy " +
                        "rówieśnikami, gdzie jest wzajemne zrozumienie, ale też przestrzeń wolności, by " +
                        "móc być niezależnym. Rzadziej się zdarza, choć też jest obserwowane, że rodzic " +
                        "jest dość surowy, czym niejako prowokuje dziecko do ciągłego buntu przeciwko " +
                        "jego oczekiwaniom. Tak czy inaczej, równie mocno podkreślana jest wolność " +
                        "osobista w relacjach. Ta postawa przenoszona jest w wiek dojrzały, w którym " +
                        "relacje między partnerami, będą wymagały przestrzeni, by miały szansę się " +
                        "rozwijać i przy- nosić spełnienie. Już od najmłodszych lat osoba jest indywidualistą " +
                        "trzymającym się własnych myśli i opinii. Nie przejmuje się tym, co ludzie mogą " +
                        "myśleć, i na tej samej zasadzie pozwala innym żyć po swojemu, bez oceniania. " +
                        "Nieprzebudzony Wodnik jest jeszcze pozbawiony samoświadomości, stąd " +
                        "przyciąga niezliczone doświadczenia życiowe. Nie jest w stanie nadać priorytetu " +
                        "doświadczeniom, dlatego ma tendencję do dobierania grona przyjaciół, " +
                        "nieukierunkowanego na cele życiowe. Czasami robi coś z niczego, komplikując " +
                        "relacje. Aby osiągnąć prawdziwą równość w relacjach, musi przejść przez bolesny " +
                        "etap zawiązywania ich, a następnie ich utraty. \n" +
                        "Stara się być wszystkim dla wszystkich, co często prowadzi do wyczerpania. Jako " +
                        "że lubi reprezentować pewien zbiór wartości, bezkrytycznie może dołączyć do " +
                        "kultów lub sekt, gdzie identyfikacja z grupą zajmuje miejsce indywidualizacji. Na " +
                        "tak nieświadomym poziomie może doświadczać pewnych bardzo trudnych " +
                        "okoliczności. Dopóki brakuje mu pewności siebie, ze swą niekonwencjonalnością " +
                        "może po prostu czuć się szaleńcem, a to czasami popycha go do działania w " +
                        "sposób szokujący. Potrzebuje pewnej dozy pewności siebie i samoświadomości, " +
                        "aby ten indywidualizm wyrażać w zdrowy sposób. Budzący się człowiek, który " +
                        "dotąd wykorzystywał ludzi dla swojej korzyści, teraz na nowo ukierunkowuje się na " +
                        "to, by żyć i działać dla ich dobra. Jest w stanie wykorzystać swoją naturalną sieć " +
                        "kontaktów z innymi, aby ustanowić większą, jednoczącą zasadę. Jego chęć " +
                        "wywierania wpływu na innych poprzez twórcze wysiłki jest modyfikowana potrzebą " +
                        "przynoszenia korzyści społeczeństwu. Ujawnienie twórczej auto ekspresji pomaga " +
                        "mu zsyntetyzować osobowość w spójną całość. Przyjaźń jest tu niezwykle istotna i " +
                        "dlatego przebudzony człowiek: zaczyna traktować każdego jak przyjaciela. " +
                        "Motywacją jest równość, stąd charakterystyczny jest tutaj brak uprzedzeń, " +
                        "identyfikacji z ego oraz zachowywanie zdrowego dystansu - tak wobec siebie, jak i " +
                        "innych ludzi. Jednym z charakterystycznych wyrażeń, którego używa, jest „nie " +
                        "bierz tego do siebie\". W miarę jak zyskuje na pewności siebie, może realizować się " +
                        "twórczo i na pierwszy plan wysuwać cechy innowacyjne. To poziom postępu " +
                        "społecznego i rewolucjonistów, by służyć jakiejś sprawie. Odczuwa przy tym " +
                        "ogromną potrzebę wprowadzenia wolności i równości w całym ludzkim życiu. " +
                        "Wyróżnia się w sposób raczej niekonwencjonalny. Choć bywa nierozumiany, ma " +
                        "niebywałą zdolność przyciągania. Jest inny, ponieważ nie pasuje do ustalonych " +
                        "społecznie wzorów. Nosi w sobie ciepło, ale wydaje się być zdystansowany. Ta " +
                        "jednak pozorna obojętność wynika z troski o całość, a nie o poszczególne " +
                        "jednostki. Dlatego jego wybory często będą czymś, co odczuwa się jako postęp, " +
                        "który pomoże innym ludziom. Ceni pracę, w której może przejawić talenty " +
                        "innowacyjności i niezależności w sposobie myślenia. W miłości ważna jest dla " +
                        "niego nić porozumienia i komunikacji, dlatego wybiera towarzystwo osoby na " +
                        "odpowiednim poziomie intelektualnym. Pragnie jak najwięcej przestrzeni i " +
                        "wolności, co może sprawiać, że relacje wydają się dla niego zbyt wiążące. Warto " +
                        "tu jednak oprzeć się pokusie, by emocjonalnie nie angażować się w związek. " +
                        "Wręcz przeciwnie - uczuciowe zaangażowanie może znacznie poprawić relacje i " +
                        "przynieść autentyczne spełnienie. Dlatego, choć tak wysoko ceni sobie " +
                        "niezależność, małżeństwo często przynosi mu poczucie bycia szczęśliwszym i " +
                        "bardziej zrównoważonym. Ma w sobie odwagę, by iść pod prąd. Jest człowiekiem " +
                        "postępu i promotorem tolerancji. Motywuje go dążenie do jakiejś zmiany w " +
                        "świecie. Symbolem Wodnika jest człowiek niosący dzban, co wskazuje na pewien " +
                        "element współczucia, którym obdarza innych ludzi, przy czym czyni to w " +
                        "racjonalny sposób - wnosi je do świata, ale nie tonie w nim. Zasiewa tym samym " +
                        "nowe ziarno w świadomości ludzi, rodzi nowe archetypy - bardziej odpowiednie do " +
                        "ery, która nadchodzi i które wyprzedzają ducha czasu.";
                break;

            case 5:
                text = "Okres poszukiwań i entuzjazmu:\n" +
                        "Egzystencja oferuje osobom możliwość uczenia się kontroli umysłu poprzez dostrojenie " +
                        "się do nadświadomości. Uczą się dzięki różnorodnym doświadczeniom, " +
                        "innym ludziom i zdobywanej wiedzy. Są dostrojone do dualności w życiu, " +
                        "akceptują jej istnienie i uczą się wznosić ponad płaszczyznę dualizmu w kierunku " +
                        "jedności. Przekazują tę wiedzę innym. Głównym celem jest synteza niezliczonych " +
                        "faktów w sensowną całość, którą można dzielić z innymi. Obecne jest " +
                        "poszukiwanie „bliźniaka\", który zaoferuje mentalne zrozumienie. Osoby muszą " +
                        "odnosić się na bieżąco do sytuacji i tworzyć. Są na misji. Choć mogą nie wiedzieć, " +
                        "co to za przygoda, wiedzą, że muszą być nieskrępowane w dokonaniu tego, co " +
                        "jest do zrobienia. Obciążające relacje będą postrzegane jako ograniczające dostęp " +
                        "do powietrza - wolności w dążeniu do celu. Osoby z wibracją 5 w dacie urodzenia " +
                        "podróżują przez życie, zdobywając ogromną ilość doświadczeń, za pomocą pięciu " +
                        "zmysłów, a przy tym pragną cieszyć się swobodą i niezachwianym poczuciem " +
                        "wolności. W związku z tym już od najmłodszych lat musi zaistnieć uwarunkowanie " +
                        "ku temu, by istota mogła zrealizować swój duchowy plan. \n" +
                        "Cykl formujący w wibracji 5:\n" +
                        "Osoby odbywają naukę realnej oceny sytuacji w celu mocnego ugruntowania się w " +
                        "rzeczywistości materialnej. W przypadku części osób istniało poczucie, że już w " +
                        "okresie dorastania trzeba było być tym, który sprowadzał na ziemię jednego z " +
                        "rodziców. Na jakimś poziomie mogły się one czuć bardziej stabilne i ugruntowane " +
                        "niż ich rodzic, w dużej mierze ojciec. Stanowiły jego środek ciężkości, ponieważ " +
                        "rodzic wiecznie miał jakieś swoje sprawy i trudno było przewidzieć, czego można " +
                        "się po nim spodziewać. W dorastającym dziecku budziła się więc potrzeba " +
                        "sprowadzenia wszystkiego na ziemię. Przy takiej nieprzewidywalności rodzica, " +
                        "osoba stała się zdeterminowana do tego stopnia, że zapragnęła mocno trzymać " +
                        "się rzeczy - tak mocno, jak to tylko możliwe, gdyż zarazem przeczuwała ich " +
                        "ulotność. Rodzic ten podświadomie kształtował tożsamość dziecka, oferując mu " +
                        "pewność siebie, podążanie własną ścieżką w swoim tempie i trzymanie się " +
                        "własnych wyborów."+
                        "Jako produkt uboczny wykształcił się również potężny upór tak wielki, że sam " +
                        "rodzic nie miał już żadnej możliwości wpłynięcia na swoje dziecko, by zmieniło " +
                        "zdanie. W ten sposób osoba odbyła naukę obrania własnego kursu i " +
                        "nieodstępowania z niego na krok pod jakimkolwiek naciskiem. Zmiana dla " +
                        "budowniczego wydaje się zagrażać całemu projektowi, dlatego stanowi tu " +
                        "największą przeszkodę do pokonania. W ten oto sposób, staje się ona lekcją. " +
                        "Życie będzie na tę zmianę naciskało, gdyż to właśnie poprzez nią osoba będzie " +
                        "mogła stać się bardziej solidnym człowiekiem. Jeśli by tego nie dokonała, nie " +
                        "zauważyłaby, kiedy jej poukładany świat zaczyna się rozpadać, bo albo byłaby " +
                        "zbytnio przekonana, że to, co zbudowała, będzie trwałe, albo zbyt " +
                        "zdeterminowana, by nie zmierzyć się z tym, co nieznane. Jednak po przekroczeniu " +
                        "progu zmiany staje się bardziej zdecydowana, niezależna i wytrwała niż " +
                        "kiedykolwiek wcześniej. Osobę cechuje silny fizyczny magnetyzm, który przyciąga " +
                        "partnera, i bogactwo materialne. W dzieciństwie warto wspierać artystyczne i " +
                        "muzyczne zdolności, gdyż w przeciwnym razie w późniejszym wieku pojawia się " +
                        "tendencja do zmagania się z ich wyrażeniem. Człowiek koncentruje się na " +
                        "wygodzie, bezpieczeństwie, harmonii i pięknie. Raczej przedkłada zapewnienie " +
                        "bytu swojej rodzinie nad rozwój osobisty. Daje poczucie bezpieczeństwa. W " +
                        "czasach kryzysu potrafi pocieszyć - chętnie udziela wówczas praktycznych, " +
                        "realistycznych i rzeczowych rad. Jest niezłomny, niezawodny, lojalny, miły i pełen " +
                        "współczucia. Często posiada talent do śpiewania i/lub muzyki instrumentalnej. " +
                        "Może być bardzo intuicyjny. Buduje i tworzy przy użyciu narzędzi. Jest obdarzony " +
                        "wytrzymałością fizyczną. Niełatwo przychodzi pozbywanie się dóbr osobistych, ani " +
                        "pozwalanie ludziom odejść. W związkach przejawia tendencję do posiadania, " +
                        "zawłaszczania drugiej osoby i w ten sam sposób - bycia przez nią posiadanym, " +
                        "mam, więc jestem\". Jest to częściowo spowodowane jego inercją (obojętnością, " +
                        "apatią, pasywnością), tendencją do bycia zależnym w relacjach. Nie lubi być " +
                        "poganiany i potrzebuje czasu na przyswojenie nowych idei. Może być uparty, " +
                        "zazdrosny, ekstrawagancki i zaborczy - wszystko to dyktowane jest strachem " +
                        "przed utratą Upartość sprawia, że obojętnie, ile by kłótni z nim nie stoczyć, nie " +
                        "doprowadzi się go do zmiany zdania. Naprawdę trzeba się postarać, aby go " +
                        "wyprowadzić z równowagi.\n" +
                        "Gniew gromadzi się w nim bardzo długo, ale kiedy w końcu wybucha, jego siła " +
                        "jest zdumiewająca. Potrafi wówczas rzucać przedmiotami, a sama złość kipi w nim " +
                        "jeszcze długi czas. Żywi urazy, przez co tłumi własny twórczy rozwój. Najczęściej " +
                        "komunikuje niezadowolenie pośrednio i biernie. Istnieje tendencja do gromadzenia " +
                        "i tycia. Osoba widzi szklankę do połowy pustą.";

                break;

            case 7:
                text = "CYKL W WIBRACJI 7 \n" +
                        "Okres rozwoju duchowego i intelektualnego \n" +
                        "I CYKL FORMUJACY W WIBRACJI 7 \n" +
                        "Wzrastanie z energią Lwa przywodzi różne rodzaje uwarunkowań nabywanych w " +
                        "procesie wychowania. Jednym z nich jest wzrastanie w domu, w którym " +
                        "przynajmniej na jednym z rodziców nic nie wywiera jakiegoś większego wrażenia w " +
                        "życiu. Dziecko pokłada więc wszelkie nadzieje i wkłada mnóstwo wysiłku, by " +
                        "zaimponować rodzicowi. W ten sposób rodzi się w nim potrzeba zwrócenia na " +
                        "siebie uwagi i uzyskania aprobaty. Przenosząc ten wzór w dorosłość, dwoi się i " +
                        "troi, by tym razem zaimponować partnerowi. Stanowi to jego motywację, a mimo " +
                        "że nie zyskuje uznania, nie wie, jak przerwać błędne koło. Co ciekawe, wywieranie " +
                        "wrażenia nie ma wiele wspólnego z postaciami stanowiącymi „publiczność\". " +
                        "Odbiór ich zaangażowania i troski jest przez osobę odczuwany jako " +
                        "„niewystarczający\". Innym rodzajem uwarunkowania jest wzrastanie w rodzinie, w " +
                        "której rodzic w żaden sposób nie stanowi barwnej osobowości w oczach swojego " +
                        "dziecka. Co więcej, może ono postrzegać swojego rodzica za postać nijaką i " +
                        "wręcz nudną w momencie, gdy zaczyna porównywać go ze sobą. W ten sposób " +
                        "rodzi się wzór porównywania siebie z innymi i wyszukiwania w innych wszelkich " +
                        "oznak bycia kimś mniej\" - mniej ekscytującym, silnym czy ciekawym. Rodzic " +
                        "pozostaje przy tym taki, jaki jest, zachowuje spokój i ani trochę nie próbuje " +
                        "wyeksponować siebie, a wręcz przeciwnie - pozwala swojemu dziecku przejąć " +
                        "kontrolę nad sytuacją, by mogło ono do woli wyrażać swoją osobowość. W ten " +
                        "sposób osoba uczy się stawać duszą towarzystwa, brylować w nim, dominować i " +
                        "ożywiać każdą imprezę, na której się znajdzie. W naturalny sposób będzie też " +
                        "oczekiwała, że towarzystwo zaangażuje się równie mocno. W jeszcze innej " +
                        "rodzinie dziecko zewsząd słyszy potwierdzenia, jak to dobrze jest być sobą. " +
                        "Otrzymuje przy tym wiele aprobaty od rodziców, którzy są jego największymi " +
                        "fanami, nieustannie je dopingują, chwalą, mówią, jakie jest wspaniałe, i oklaskują " +
                        "wszelkie starania. Chcą pokaz - dostają go. Tego typu zachęty odbierane z " +
                        "zewnątrz kształtują dalsze życie. Dlatego właśnie naturalnym oczekiwaniem będzie " +
                        "potrzeba aplauzu. Oczywiście, jeśli człowiek nie zachowa ostrożności i umiaru, " +
                        "jego głód może prowadzić do bardziej desperackich prób przypominania, że jest " +
                        "ważny, niezależnie od tego, czy ktoś w danym momencie skupia na nim uwagę, " +
                        "czy nie. Zdarza się, że rodzice przejawiają cechy narcystyczne, stąd też z pomocą " +
                        "swojego kreatywnego dziecka mogą zaspokajać potrzebę prezentowania się " +
                        "dobrze w towarzystwie innych ludzi. Nieprzebudzony człowiek przejawia potrzebę " +
                        "zdominowania środowiska ciężarem swojej osobowości. Widoczna jest " +
                        "niezdolność do wywierania trwałego wpływu. Odczuwa ogromną potrzebę uwagi. " +
                        "Szuka jej, pokazując swoje dobra materialne, na których opiera swoją samoocenę. " +
                        "Jego dom i dzieci są ważne, ponieważ odzwierciedlają to, co posiada - " +
                        "reprezentują też jego fizyczną ciągłość. Musi być podziwiany i błyszczeć. " +
                        "Postrzega innych jako tych, którzy gromadzą się wokół niego. Jest tak niepewny i " +
                        "niedojrzały, że nieustannie dąży do dominacji nad innymi i dyktuje swoje warunki. " +
                        "Potrzeba uznania i aprobaty, potwierdzania własnej wartości, a przy tym patrzenie " +
                        "z góry na ludzi są głównymi tematami do przepracowania. Człowiek będzie " +
                        "dojrzewał do tego, by nauczyć się właściwie wyrażać swoją energię, tj. " +
                        "przejmować stery tylko wtedy, gdy jest to konieczne i szukać odpowiedzi w sobie " +
                        "na tę nienasyconą potrzebę aprobaty. Budzący się człowiek dojrzewa do twórczej " +
                        "ekspresji siebie. Wciąż odciska piętno na swoim otoczeniu, ale zaczyna " +
                        "dostrzegać, że aby być skutecznym, potrzebny jest cel oraz że nie jest twórcą, a " +
                        "współtwórcą. Nadal jest przywiązany do osobowości i wierzy, że jego ego jest " +
                        "wykonawcą, twórcą, tym, przed którym inni ponoszą odpowiedzialność. Nie " +
                        "rozumie jeszcze, że ma działać jako świadome narzędzie twórczej Wyższej Woli. " +
                        "Musi więc przeorientować się z „ja\" na większą całość. Lekcja polega na tworzeniu " +
                        "relacji z grupą po to, by doszło do większej integracji i asymilacji osobowości z " +
                        "wolą jej członków. Są też osoby, które wyrażają znacznie bardziej skromne i " +
                        "pokorne podejście do wyrażania swojej osobowości. Mimo ogromnego talentu, " +
                        "uchodzą za jedne z najbardziej dostępnych osób. Źródłem ich skromności jest " +
                        "zazwyczaj wysokie poczucie własnej wartości i ogromny szacunek dla samego " +
                        "siebie - dobrze myślą o sobie i czują się w jakiś sposób zadowoleni z siebie. " +
                        "Potrafią śmiać się z siebie, gdyż nie traktują swojej osoby zbyt poważnie, a przy " +
                        "tym U przebudzonego człowieka pojawia się głęboka potrzeba poznania siebie, " +
                        "samoświadomości i rozwoju intelektu po to, by mógł rozpalać umysły innych. " +
                        "Kolejną rzeczą jest pragnienie przejęcia kontroli nad swoją osobowością i chęć " +
                        "zapanowania nad sobą. Emanuje wolą oświecenia i rządzenia. Potrafi inspirować " +
                        "grupę, której jest członkiem. Zaczyna odgrywać w niej centralną rolę, zachęcając ją " +
                        "do obrania spójnego celu i twórczego wyrażania, co pozwala grupie się rozwijać. " +
                        "Nie postrzega już siebie jako centrum, gdyż jest teraz ekspresją woli zbiorowej. " +
                        "Gdy jest świadomy własnego planu życia i tego, jak wpisuje się on w większy " +
                        "plan, można mówić, że jest przygotowany do przewodzenia jako świadoma " +
                        "realizacja Wyższej Woli. \n" +
                        "I Cykl Formujący może być trudny dla młodego człowieka, ponieważ w jakiś " +
                        "sposób wydaje się mu, że jest inny i nie pasuje do pewnej normy. Możliwe, że już " +
                        "na bardzo wczesnym etapie życia dostanie tego potwierdzenie. Okoliczności mogą " +
                        "uniemożliwiać osobie poczucie bliskości z rodziną czy choćby z jej częścią i w " +
                        "jakiejś mierze będzie ona stanowiła połączenie różnych osób, co daje efekt inny od " +
                        "zamierzonego. Jest tutaj potrzeba spędzania czasu sam na sam ze sobą, " +
                        "oddawania się modlitwie, medytacji, rozważaniom, prowadzeniu pamiętnika itp. " +
                        "Częstym motywem cyklu w wibracji 7 jest religia, w duchu której osoba jest " +
                        "wychowywana. Na dalszym etapie życia często od niej odstępuje, poszukując " +
                        "własnej duchowości. Niezależnie od orientacji duchowej, jaką podążają rodzice, " +
                        "osoba od najmłodszych lat zastanawia się nad głębokimi pytaniami dotyczącymi " +
                        "życia. Zdarza się, że na skutek odkrycia tajemnic rodzinnych zachodzi " +
                        "transformacja osobowości. Wszelkie wydarzenia mają na celu umożliwienie osobie " +
                        "głębsze zrozumienie i otwarcie na świadomość tajemnic życia. Następuje rozwój " +
                        "intuicji, uważności i wrażliwości. Ze względu na potrzebę zrozumienia i poznania, " +
                        "dużo czasu poświęca nauce, rozwija umiejętności w dziedzinie sztuki, nauk " +
                        "ścisłych i techniki.";
                break;
        }
        return text;
    }

    public String warunkiWWibracji(int id){
        String text = "";
        switch (id){
            case 1:
                text = "Zupełnie nowy początek i stanięcie na własnym gruncie, usamodzielnienie się, " +
                        "indywidualizacja i samorealizacja. Jest to okres wymagający dużej niezależności, " +
                        "zaradności, odwagi i inicjatywy. Wzrastamy i doskonalimy siebie. Egzystencja " +
                        "stwarza możliwość wykorzystania posiadanych talentów i umiejętności. Okres ten " +
                        "przynosi nowe oferty i niekonwencjonalne pomysły. Trzeba zachować " +
                        "elastyczność, być otwartym, ale też słuchać własnego głosu. To czas wzięcia " +
                        "spraw we własne ręce, zapanowania nad sobą, swoim życiem i objęcia " +
                        "prowadzenia w oparciu o dotychczasowe zdobycze. " +
                        "Rozwojowi podlegają umiejętności zarządzania i organizowania - ludźmi, firmą, " +
                        "przedsiębiorstwem, własną działalnością. Egzystencja stawia nas w obliczu takich " +
                        "zdarzeń, w których przychodzi nam dokonywać wyboru i podejmować decyzje. " +
                        "Celem jest krystalizacja naszej osobowości. Uczymy się autonomii oraz " +
                        "wprowadzania myśli w czyn. Zanim do tego miejsca jednak dotrzemy, mogą " +
                        "nastąpić zwroty w życiu zawodowym, rodzinnym bądź osobistym. " +
                        "Prawdopodobna jest niepewność i błądzenie, zanim znajdziemy to, co jest dla nas " +
                        "najlepsze i najbardziej potrzebne. " +
                        "Zaczynamy podejmować działania na wielu frontach, doświadczamy zmian, " +
                        "przyjmujemy nowe oferty pracy, zmieniamy miejsce zamieszkania, nawiązujemy " +
                        "znajomości i wchodzimy w nowe relacje. Jeśli nasze reakcje na zachodzące " +
                        "zmiany są negatywne, tkwimy w wątpliwościach i nie idziemy za impulsem, tracimy " +
                        "energię i popadamy w dezorientację. Wizja i wiara w wartość niesionych pragnień " +
                        "zwiększają szansę na sukces i przynoszą największe osiągnięcia. Znaczącą rolę w " +
                        "tym szczycie odgrywają mężczyźni. Można otrzymać od nich wsparcie bądź " +
                        "propozycję, która odmieni życie. W innych przypadkach wewnętrzna przemiana " +
                        "dokonuje się poprzez konflikt lub trudności w relacjach.";
                break;

            case 2:
                text = "W okresie tym stajemy się bardziej wrażliwi i emocjonalni. Następuje rozwój intuicji " +
                        "i wglądu. Egzystencja przynosi naukę cierpliwości, oddania się opiece sił wyższych " +
                        "i rozwoju wewnętrznej świadomości. Nie sprawdzają się tutaj działania zbyt " +
                        "bezpośrednie i konfrontacyjne. Nie pomagają też próby robienia czegoś na siłę ani " +
                        "forsowanie własnych żądań, praw, opinii czy pragnień. Teraz przede wszystkim " +
                        "ćwiczona jest sztuka odsunięcia potrzeb ego na rzecz zwrócenia się ku potrzebom " +
                        "drugiego człowieka. Uczymy się opanowania i zgody. Sprawdzi się dążenie do " +
                        "przywrócenia równowagi, opanowanie sztuki kompromisu i takt. Stając się " +
                        "wsparciem, odbywamy naukę poddania się i pokory. Odkrywamy, że proszenie o " +
                        "pomoc i zdanie się na nią to akt odwagi. Pojawia się w naszym życiu rola, która " +
                        "jest nie tylko satysfakcjonująca, ale przede wszystkim niezbędna dla naszego " +
                        "rozwoju. Najprawdopodobniej ktoś będzie potrzebował naszej uwagi i opieki. Jest " +
                        "to konieczne, byśmy mogli rozwinąć w sobie cnotę cierpliwości, troski, " +
                        "opiekuńczości i dbałości. Jako że 2 jest wibracją księżycową, wsparcie przychodzi " +
                        "ze strony kobiet. Jakość energii żeńskiej rozbudza w nas również wrażliwość na " +
                        "piękno i dobro. Jesteśmy bardziej emocjonalni i silnie przeżywamy zdarzenia. " +
                        "Stajemy się też bardziej podatni na życzliwość, serdeczność i wszelkie drobne akty " +
                        "dobrej woli.\n" +
                        "Dwójka pozwala nam także przypomnieć sobie, że nie można poznać siebie bez " +
                        "kontaktu z drugim człowiekiem, który daje nam informację zwrotną na temat naszej " +
                        "ciemnej, nierozpoznanej strony. Akceptacja i samopoznanie są warunkiem " +
                        "bliskości, autentyczności i szczerości w relacji z drugim człowiekiem. W szczycie o " +
                        "wibracji 2 nabieramy wdzięku, gracji i dobrego smaku, co czyni nas bardziej " +
                        "atrakcyjnymi. Emanujemy subtelną łagodnością i delikatnością, czułością i " +
                        "opiekuńczością. Wzmocniona emocjonalność i wrażliwość pozwala nam dostrzec " +
                        "dobro i piękno ukryte w nas samych i w naszym otoczeniu.";
                break;

            case 3:
                text = "To bardzo kreatywny okres. Odzywa się w nas różnorodność zainteresowań, " +
                        "rozbudzają pasje, życie staje się ciekawsze i bardziej przyjemne. Znacznemu " +
                        "wzmocnieniu podlega teraz dar ekspresji twórczej i artystycznej. Obejmuje on " +
                        "doskonalenie wyrażania w słowie i w piśmie. Wiek nie ma tu żadnego znaczenia, " +
                        "więc skoro mamy poczucie, że chcemy zrobić coś kreatywnego, nauczyć się " +
                        "czegoś nowego, to jest to idealny moment, aby wyjść naprzeciw przeznaczeniu. " +
                        "Warto poszerzać horyzonty. Wiele osób w szczycie o wibracji 3 poświęca się " +
                        "pracy literackiej, zakłada własne firmy, pisze książki, artykuły, prowadzi blogi. " +
                        "Wielu też chętnie spędza czas pośród książek, gromady dzieci, kochającego " +
                        "partnera, wiedzie intensywne życie towarzyskie i nawiązuje kontakty z " +
                        "otoczeniem. Trzy to najbardziej pozytywna wibracja, związana z dostatkiem i " +
                        "dobrobytem, więc jest tutaj ogromna szansa na uzyskanie nagród, zdobycie " +
                        "uznania czy awansu. Jest to również czas społeczny i emocjonalny. Zwracamy " +
                        "się ku grupom ludzi. Pozytywnym nastawieniem, pogodą ducha i wysoką " +
                        "jakością kontaktu przyciągamy przyjaciół i wielbicieli. Mamy możliwość " +
                        "inspirowania i motywowania ludzi. Celem jest wykorzystanie drzemiącego w nas " +
                        "potencjału, rozwinięcie umiejętności komunikowania i zaprezentowania jej, by " +
                        "służyła innym. Jednakże, przy zbyt wielu pomysłach i oddawaniu się wielu " +
                        "tematom naraz, może pojawiać się tendencja do rozpraszania uwagi i " +
                        "bezproduktywnego wydatkowania energii. Koniecznym jest więc zachowanie " +
                        "czujności, koncentracji i dyscypliny, gdyż to nie sama przyjemność, a twórcza " +
                        "praca jest kluczem do wykorzystania możliwości.";
                break;
            case 4:
                text = "Jest to okres oddania się pracy, stawiania fundamentów, tworzenia nowych " +
                        "struktur, ale również zdobywania nagród. Położony jest akcent na doskonalenie " +
                        "umiejętności organizacji i zarządzania, by nasze dzisiejsze działania stanowiły " +
                        "mocną i trwałą bazę pod przyszłe projekty. Aby wkładany wysiłek mógł przynieść " +
                        "miarodajne rezultaty, większa jest zdolność do wypełniania obowiązków. Należy " +
                        "skupić się na szczegółach i formalnościach. Ważna jest wizja praktycznego " +
                        "wykorzystania efektów naszej pracy. Okres ten jeśli dobrze wykorzystany, przynosi " +
                        "nam poczucie niezawodności, rzetelności i satysfakcji płynącej z wykonywanej " +
                        "pracy. Determinacja i wytrwałość przybliżają nas do sukcesu. Doświadczenia " +
                        "szczytu w wibracji 4 hartują naszego ducha, rozwijają wiele cech i umiejętności " +
                        "potrzebnych do radzenia sobie z rzeczywistością materialną. Uczymy się " +
                        "oszczędności, dociekliwości, dokładności, zdecydowania, realizmu w ocenie " +
                        "sytuacji i nie zniechęcania się, gdy coś idzie nie po naszej myśli. Niektóre sytuacje " +
                        "wstrząsają nami, byśmy przestali błądzić i odnaleźli swoją drogę. Jako że 4 mocno " +
                        "związana jest z wartościami materialnymi, trzeba pamiętać, że idą one w parze z " +
                        "poczuciem własnej wartości. Dla rozwoju duszy nie ma znaczenia, jak dużo i jak " +
                        "długo pracowaliśmy, lecz czego się nauczyliśmy. Nie jest dla niej ważne, jakie nam " +
                        "nadano znaczenie, ale jaką wartość nadaliśmy sobie i jakie jest nasze " +
                        "samopoczucie. Tu najważniejsza jest intencja, jaką się kierujemy - czy jest to " +
                        "wyścig o zapewnienie bytu, czy przychodzący pieniądz, staje się produktem " +
                        "ubocznym działalności prowadzonej z sercem. Wyzwaniem jest zachowanie " +
                        "elastyczności oraz zachowanie odpowiednich proporcji pomiędzy pracą i " +
                        "wypoczynkiem. Z tego powodu dla zbalansowania rutyny, konieczne jest zadbanie " +
                        "o elastyczność ciała i umysłu. Oddając się od czasu do czasu porywom " +
                        "spontanicznego oderwania się, regenerujemy nasze siły, podbudowując " +
                        "jednocześnie ducha działania";
                break;
            case 5:
                text = "Jest to okres, który przynosi doświadczanie zmian, wolności i ekspansji. Nie " +
                        "chcemy być krępowani więzami, nie pozwalamy mówić innym, co powinniśmy " +
                        "robić, a czego nie. Pragniemy być samowystarczalni. Pojawia się wiele " +
                        "możliwości odbywania podróży na mniejsze i większe odległości, poznawania " +
                        "nowych i ciekawych ludzi, zmiany pracy i środowiska, doświadczania wielu " +
                        "przygód, w tym egzotycznych, a więc krótko mówiąc - eksplorowania świata. " +
                        "Jest to zdecydowanie aktywny, dynamiczny i ekspansywny etap życia. Wnosi " +
                        "wiele korzystnych zmian, ale też może być to okres niepokoju, sytuacji " +
                        "zakłócających dotychczasowy porządek. Możemy czuć się nadmiernie " +
                        "pobudzeni i rozkojarzeni. W okresie tym doświadczamy życia za pomocą pięciu " +
                        "zmysłów, eksperymentujemy, sprawdzamy na sobie, ale też uczymy się głównie " +
                        "na własnych błędach, by wyciągnąć wnioski, co nam służy, a co nie. Naszym " +
                        "najlepszym i najbardziej właściwym nauczycielem jest Życie i Doświadczenie. " +
                        "Rozwijają się umiejętności w posługiwaniu się słowem, stąd łatwo przychodzi " +
                        "komunikowanie się w mowie i w piśmie, ale też skuteczne promowanie siebie. " +
                        "Warto tutaj kultywować zdolności werbalne i pisarskie, gdyż mogą się one " +
                        "okazać niezwykle korzystne w działalności reklamowej i handlowej. Przy tak " +
                        "wielu zachodzących na różnych poziomach zmianach, konieczne jest uziemianie " +
                        "się w konkretnej dyscyplinie, karierze lub relacji. Energia buntu prowadzi nas do " +
                        "duchowej przemiany i ewolucji. By znaleźć odpowiedzi na pytania, szukamy " +
                        "przewodnika duchowego i czynimy próby odnalezienia tajemnicy życia. Trzeba " +
                        "zaakceptować ograniczenia jako niezbędną podstawę wolności. " +
                        "Prawdziwe znaczenie, jakie niesie wolność, poznajemy, gdy dojrzewamy do " +
                        "miłości bezwarunkowej. To właśnie do jej odkrycia oraz do duchowej ewolucji " +
                        "prowadzą nas wszelkie doświadczenia tego okresu.";
                break;
            case 6:
                text = "Szczyt w wibracji 6 charakteryzuje się zaangażowaniem w sprawy rodziny, " +
                        "przyjaciół i środowiska. Stanowią one teraz centrum naszej uwagi. Wprawdzie " +
                        "mierzymy się z przyrostem obowiązków, ale potrafimy na wszystko patrzeć z " +
                        "perspektywy. Równowaga pozwala radzić sobie z problemami emocjonalnymi. " +
                        "Jesteśmy pełni miłości, bliskości i ciepła, ale pojawiają się wyzwania związane z " +
                        "bliskimi relacjami. Dzięki nim doświadczamy głębokiego poczucia bycia " +
                        "potrzebnym. Z kolei zwiększone poczucie współodczuwania sprawia, że stajemy " +
                        "się uzdrowicielami, niosąc bliskim dobre słowo i poradę. Ważne, by nie popadać w " +
                        "nadopiekuńczość i nie wyręczać innych w zadaniach, gdyż właśnie pozwolenie " +
                        "drugiemu człowiekowi, by wziął odpowiedzialność za swoje sprawy, jest kluczem " +
                        "do odkrycia autentycznego znaczenia, jakie ona niesie. Jest to również dobry " +
                        "okres na rozwój biznesu i spraw finansowych. Jako że wykazujemy zrównoważenie " +
                        "w swoim podejściu do spraw biznesowych, w naszym życiu pojawiają się osoby, " +
                        "które dzięki swym zasobom mogą pomóc w realizacji naszych celów. Może to " +
                        "oczywiście przynieść wiele korzyści. Z wibracją 6 związane są również sprawy " +
                        "zdrowotne, które teraz przyciągają naszą uwagę. Rozważamy wprowadzenie " +
                        "bardziej zbilansowanego stylu odżywiania, jesteśmy skorzy do podjęcia " +
                        "aktywności fizycznej i wyrobienia zdrowych nawyków. Ogólnie rzecz biorąc, to " +
                        "czas postępu i wzrostu jako Człowiek. Rozwój zachodzi na wielu różnych " +
                        "płaszczyznach - stajemy się istotą pełną miłości w rodzinie, życzliwym i oddanym " +
                        "pracownikiem oraz filarem społeczności, w której żyjemy.";
                break;

            case 7:
                text = "Jest to okres wewnętrznego rozwoju osobistego, rozwoju duchowego. Na " +
                        "pierwszy plan wysuwają się kwestie związane z głębszym znaczeniem życia. Aby " +
                        "dotrzeć do odpowiedzi o sens, Egzystencja nierzadko stawia nas w obliczu " +
                        "niełatwych sytuacji. Tu rozpuszczeniu ulega nasze ego. Przychodzi nam " +
                        "przewartościować to, do czego byliśmy przywiązani na planie fizycznym, by " +
                        "nawiązać kontakt z wymiarem duchowym. Potrzebujemy więcej czasu, aby pobyć " +
                        "sam na sam ze sobą i oddać się kontemplacji swojego wewnętrznego świata. " +
                        "Wzmocnieniu podlega zdolność koncentracji, by z zapałem i skupieniem móc " +
                        "podążać w kierunku rozwoju. Po niefortunnym okresie życia wchodzimy w okres " +
                        "zapowiadający odmianę, stajemy się dojrzalsi i mamy poczucie narodzin nowej " +
                        "osobowości. Zdarza się, że pod wpływem tej wibracji rezygnujemy z " +
                        "dotychczasowej działalności, szukamy bardziej niezależnego zajęcia, zmieniamy " +
                        "środowisko i przystępujemy do realizowania dawnych marzeń. Odczuwamy " +
                        "większą potrzebę nauki i zdobywania wiedzy w różnych formach - z książek, " +
                        "wglądu, refleksji nad sobą, medytacji, kontemplacji. W szczycie tym osiągamy " +
                        "najwyższy poziom rozwoju wewnętrznego. O wiele bardziej wrażliwa jest teraz " +
                        "intuicja. Dzięki niej nasza ścieżka staje się łatwiejsza i bardziej bezpośrednia, gdyż " +
                        "po prostu intuicyjnie wiemy, jaki krok wykonać. Największymi nagrodami tego " +
                        "szczytu są wartości duchowe. Tu poszerza się nasza świadomość, nawiązujemy " +
                        "kontakt z tym, co nie- widzialne, zdobywamy wyższy poziom wiedzy i mądrości. " +
                        "Głębokie zrozumie- nie jest podstawą miłości i szacunku do siebie. To nauka " +
                        "poczucia prawdziwego szczęścia, które odnajdujemy wewnątrz.";
                break;

            case 8:
                text = "W okresie tym znacznemu wzmocnieniu podlega nasz talent skutecznego radzenia sobie w biznesie i sprawach finansowych. Jako że jest to wibracja karmy (przyczyny i skutku), następuje czas wzrostu materialnego, ekspansji i nagród - pod warunkiem jednak, że działamy w zgodzie z uniwersalnymi prawami wszechświata. Jest to cykl zbierania plonów z tego, co posialiśmy. Zwiększone jest również nasze osobiste poczucie autorytetu, mocy i skuteczności, co jest wyczuwalne w świecie zewnętrznym. Kierujemy się zdrowym osądem i mamy wizję, co stanowi podstawę sukcesu finansowego. Jesteśmy w stanie zajmować się dużymi przedsięwzięciami i podejmować się prowadzenia działań na szeroką skalę. Przeszkody na drodze nie stanowią dla nas zagrożenia, a raczej postrzegane są jako wyzwanie. Ponieważ dostrzegamy możliwości osobiste i czujemy rosnące poczucie stabilizacji, jesteśmy w stanie wpływać na materię w niemal magiczny sposób. Mając jasną wizję tego, co pragniemy osiągnąć, i będąc zorientowanym na cel, zmierzamy do jego realizacji z zaufaniem. Głównym wyzwaniem w tym okresie jest utrzymanie w równowadze wartości świata materialnego i duchowego. Przy tak zwiększonym odczuwaniu osobistej mocy, mogą pojawiać się ogromne pokusy, by za priorytet uznać pomnażanie pieniędzy dla siebie i osiągnięcie jak najwyższej pozycji władzy. Kiedy ulegamy tej pokusie składając na ołtarzu pieniądze, które zaczynają przesłaniać cel, stajemy się niewolnikami. Gdy z pola widzenia znika cel działania dla dobra społeczności oraz gdy odstępujemy od kierowania się tym, co duchowe i co nam danej mocy w tym celu udzieliło, ściągamy na siebie poważną nierównowagę energetyczną, za którą przyjdzie nam zapłacić. Jeśli jednak wypracujemy zrównoważone podejście do pieniędzy i zachowamy odpowiednią perspektywę, może to być naprawdę satysfakcjonujący okres, zarówno materialnie, jak i duchowo.";
                break;

            case 9:
                text = "Jest to okres, w którym czujemy potrzebę utożsamienia się z jakimś większym " +
                        "projektem lub celem, który przyniesie zadowolenie nie tylko nam samym, ale " +
                        "przede wszystkim poprawi warunki życia innych. Tu satysfakcję osobistą czerpie " +
                        "się z faktu, że pomagamy wielu ludziom wspierać ich rodziny. Bardzo chętnie " +
                        "angażujemy się w działalność charytatywną czy filantropijną. Dzięki takiemu " +
                        "zaangażowaniu przychodzi jednocześnie poczucie sprawczości, bo oto dzięki " +
                        "możliwościom, jakie mamy i jakie wciąż stoją dla nas otworem, przyczyniamy się " +
                        "do poprawy bezpieczeństwa, kondycji, warunków, zdrowia i jakości życia wielu " +
                        "istot. Odczuwa się zwiększone poczucie odpowiedzialności społecznej i " +
                        "współczucia. Dążymy do tego, by pomagać tym, którym się w życiu mniej " +
                        "poszczęściło niż nam. Czujemy większe pokłady miłości w stosunku do wszelkiego " +
                        "stworzenia. To dobry czas na wzrost finansowy i postęp w sprawach biznesowych. " +
                        "Zycie stawia nas przed dużym wyzwaniem i musimy się mu całkowicie poddać. " +
                        "Szczyt ten związany jest również z rozwojem ogromnej wrażliwości na sztukę, " +
                        "taniec, muzykę, rytm - staje się więc okazją, by zaowocowała nasza twórczość i by " +
                        "podzielić się wszystkim, co osiągnęliśmy. Tutaj dusza może wyrażać się " +
                        "swobodnie. Przestrzeń pod wpływem wibracji 9 oczyszcza się z negatywnych ludzi " +
                        "i sytuacji. Od nas zależy, jaki zrobimy użytek z tych okoliczności. Warto pamiętać, " +
                        "że osoby działające w szczytnym celu, żyją w zgodzie ze sobą, odczuwają radość i " +
                        "robią to, czego pragnie nie ich ego, a dusza.";
                break;
        }
        return text;
    }

    public String rokWWibracji(int id){
        String text = "";
        switch (id){

            case 1:
                text = "Egzystencja oferuje wiele nowych początków. Mogą one obejmować zupełnie nowe bądź udoskonalone życie osobiste bądź bardziej wymagający okres związany z nowymi obowiązkami w pracy. Możemy zostać przeniesieni do innego działu, nadać nowy charakter naszej pracy, rozpocząć inny rodzaj pracy lub otworzyć własną firmę i rozpocząć działalność. Możemy też dokonać zmiany na płaszczyźnie fizycznej, geograficznej, przeprowadzając się do innego kraju, innej miejscowości czy wprowadzić się do nowego domu. Jest tutaj również możliwość rozpoczęcia szkoły, studiów czy w ogóle nauki w nowym obszarze poznania. Jak widać, jest to rok, który rozpoczyna cały nowy cykl wydarzeń w naszym życiu, więc trzeba być przygotowanym na wiele aktywności i zmian. Czas, by swoje marzenia, aspiracje, nadzieje i intencje przenieść na plan realizacji. Możemy odczuwać tę energię jako popychającą nas do inicjowania pewnych sytuacji i rozpoznać w sobie potrzebę zmiany życia, ale możemy też zdecydować się pozostać zakorzenionym w swojej obecnej sytuacji - tego typu reakcja nie jest rzadkością u osób bardziej konserwatywnych bądź opornych na zmiany. Jedynym problemem jest to, że opierając się im i zwlekając zbyt długo, możemy przegapić możliwości, które teraz nadają naszej drodze bardziej korzystny kierunek rozwoju. Warto przeanalizować swoje potrzeby i uczucia, aby rozpoznać, z czego wynikają ewentualne wątpliwości i w ten sposób nabrać pewności, co do zasadności naszej decyzji. Następna szansa na podążenie z duchem zmian i rozpoczęcie czegoś nowego może pojawić się dopiero za cztery lata. Obok intuicji, potrzeby serca, zdrowego rozsądku i pozytywnego nastawienia, popłynięcie na fali życia wydaje się być najbardziej korzystnym rozwiązaniem. Wymaga ona świeżego i innowacyjnego podejścia do wszelkich wyzwań, jakie życie stawia nam na drodze, byśmy mogli się rozwijać, podążając z duchem czasu. Odwaga, inicjatywa i zdecydowanie są kluczem do sukcesu.";
                break;

            case 2:
                text = "W latach o wibracji 2 wzmocniona jest nasza wrażliwość i podatność na " +
                        "reagowanie emocjonalne. Poruszane są tu wszelkiego rodzaju kwestie związane z " +
                        "relacjami - osobistymi, społecznymi i zawodowymi. Trzeba tutaj godzić uczucia, " +
                        "brać pod uwagę różne punkty widzenia oraz nadać kształt przyszłym planom. Jest " +
                        "to czas decyzji i przygotowania kierunku działania raczej niż kierowania się " +
                        "sentymentem. Nie ma też co próbować przyspieszać cokolwiek na siłę ani " +
                        "podejmować decyzji pochopnie, a za to płynąć spokojnie z falą wibracji 2, " +
                        "uzbrajając się w cierpliwość i dążąc do pokoju i porozumienia. Jest to rok " +
                        "rozeznania się, polegania na znakach i wskazówkach od życia, zasięgnięcia rady i " +
                        "nawiązywania współpracy. Szczególnie dobrze sprawdza się tutaj uzdrawianie " +
                        "holistyczne, oddanie medytacji, studiowanie tematu, planowa- nie i asymilacja " +
                        "energii życia. Opór i forsowanie powodują nierównowagę. Czas ten wymaga taktu i " +
                        "współpracy w relacjach, aby zapewnić harmonijny przepływ energii. W przypadku " +
                        "gdy nie przedyskutujemy ważnych kwestii, nie dążymy do zrozumienia drugiej " +
                        "strony, nie potrafimy wczuć się w jej położenie albo nie jesteśmy w stanie pogodzić " +
                        "różnic w sposobach postrzegania, może dojść do rozstania w związku osobistym " +
                        "lub zakończenia współpracy zawodowej. Obrazowo rzecz ujmując, to, co zostało " +
                        "zasiane w roku o wibracji 1, teraz się ukorzenia. Rok o wibracji 2 służy cierpliwej " +
                        "pielęgnacji ziarna i doglądania go - po to, by mogło wykiełkować w roku o wibracji " +
                        "3. Niektóre nasiona z jakichś powodów nie wykiełkują, innym być może nie " +
                        "poświęcimy wystarczającej dbałości - nie wesprą one nas tym samym w " +
                        "przyszłości. Nie należy się tego obawiać, a zamiast tego pamiętać, że wszechświat " +
                        "wciąż na bieżąco dostosowuje układy do najlepszych dla nas rozwiązań.";
                break;

            case 3:
                text = "Życie nabiera tempa, przyspieszając nasze działania. W poprzednim roku siły natury były spowolnione, a my praktycznie na każdym kroku mieliśmy okazję się przekonać, że wszelki ruch naprzód i dopięcie czegoś się opóźniało. Wibracje trójki są już zupełnie inne - odżywcze, otwarte i niosące powiew optymizmu. W miejsce oporu pojawiają się możliwości, wokół nas rozrasta się grono ludzi, nawiązujemy nowe kontakty, następuje przypływ sił i regeneracja. Pojawia się więcej okazji do spotkań towarzyskich, poszerzania grona znajomych, okazji do zabawy, radości, przyjemności i lekkości. Łatwo teraz przychodzi wyrażanie siebie - poprzez słowo pisane, mówione, ale też malowanie, śpiew, grę na instrumencie, rzemiosło itp. Doświadczamy więcej osobistej wolności. Napływają fale nadziei, optymizmu, rozkwita w nas radość i entuzjazm - pod warunkiem jednak, że otrząsnęliśmy się z wątpliwości, jakie przyniosły doświadczenia poprzedniego roku. Można nareszcie nabrać pewności siebie i odwagi i zrobić krok w kierunku odnowy i odrodzenia. Wiele drzwi się otwiera w roku o wibracji 3, a wraz z naszym poczuciem większej pewności siebie, łapiemy wiatr w żagle. Pojawiający się na naszej drodze ludzie są gotowi przyczyniać się do wzrostu dochodów. Warto zachować ostrożność, aby nie przesadzać, gdyż nadmierny entuzjazm i optymizm może wywoływać pośpiech i działania bez zastanowienia. Na innej fali doświadczeń i odczuć, jeśli w rok o wibracji 3 wchodzimy przygnębieni, pełni żalu do świata i niezadowoleni z siebie, możemy przegapić czekające tu dynamiczne możliwości, mające w swoim potencjale otworzyć nas na sukces i doprowadzić do jego realizacji. Dla wibracji 3 negatywne nastawienie, poczucie zniechęcenia, błędy popełniane w relacjach i nawykach, a przy tym brak wiary w dobro wszechświata stają się wręcz dysfunkcjonalne i pogrążające nas jeszcze głębiej w poczuciu niepomyślności. Trójka jest energią blasku, nadziei i entuzjazmu, więc Życie obiecuje nas teraz poprowadzić, jeśli tylko jesteśmy w rezonansie do otwartości oraz dostrojeni do różnorodności, obfitości i pozytywnego rozwoju, które ono oferuje.";
                break;

            case 5:
                text = "Rok o wibracji 5 jest jak powiew świeżego powietrza. Szykują się zmiany, " +
                        "podróże, wzrost, rozwój i ekspansja. To czas, kiedy gotowi jesteśmy uwolnić się " +
                        "od wszelkich obciążeń, ograniczeń i frustracji, których doświadczaliśmy w " +
                        "poprzednim roku. Przeszkody, opóźnienia i frustracje będą się powoli " +
                        "zmniejszać, aż ustąpią całkowicie. To energia wyzwalająca i zwykle towarzyszą " +
                        "jej przemieszczanie się, przeprowadzki, podróże, wędrówki, zmiana miejsca " +
                        "pracy lub zainteresowań. Obecna jest też tutaj tendencja do nawiązywania " +
                        "nowych znajomości, relacji czy ulegania zauroczeniu. Rok ten nie przynosi " +
                        "całkowitego wyciszenia, wręcz przeciwnie - może być gorączkowym okresem " +
                        "dla osób, które nie spodziewały się zmian, bądź dla których jakiekolwiek zmiany " +
                        "nie są mile widziane. Z kolei dla osób gotowych i otwartych na nowości, czas ten " +
                        "może być bardzo ekscytujący, jeśli chętnie je powitamy w swoim życiu. Oferuje " +
                        "on więcej wolności osobistej i możliwości wyrażania swojej indywidualności. " +
                        "Odbywa się to bez przeszkód i opóźnień. Kluczem jest płynąć na fali " +
                        "zmieniających się warunków i pozwolić starym połączeniom przejść na karty " +
                        "historii. Potraktować jako doświadczenia - mosty, które miały nas przeprowadzić " +
                        "do kolejnego punktu w ewolucji. Dobrze jest teraz być przedsiębiorczym, " +
                        "podejmować ryzyko i otworzyć się na nowe i niespodziewane. Nowy grunt " +
                        "zwykle nie jest łatwy, jeszcze na nim raczkujemy, stawiamy pierwsze kroki, ale w " +
                        "ten właśnie sposób Egzystencja otwiera drzwi dla naszego rozwoju. " +
                        "Dynamiczna, rewolucyjna i buntownicza energia 5 może doprowadzać nas do " +
                        "skrajności, dlatego ważne jest, by zachować ostrożność w emocjach, " +
                        "namiętnościach i spekulacjach. To jakby w kasyno pod wpływem chwili i " +
                        "przypływu entuzjazmu chcieć zaryzykować wszystko, stawiając w grze cały swój " +
                        "majątek. Dlatego trzeba nam tutaj zachować logikę i świadomość konsekwencji. " +
                        "To czas, by uwolnić przede wszystkim nawyki, uprzedzenia, stereotypy, sprawy, " +
                        "miejsca, postawy, środowisko bądź relacje, które po prostu straciły już na " +
                        "aktualności.";
                break;

            case 6:
                text = "W roku tym można się spodziewać, że życie zacznie nam zsyłać więcej " +
                        "zobowiązań - osobistych, emocjonalnych i finansowych - trzeba będzie wziąć je na " +
                        "swoje barki. To czas, w którym odczujemy potrzebę skorygowania jakiegoś braku " +
                        "równowagi w swoim życiu, aby chwycić się czegoś, zakotwiczyć, znaleźć " +
                        "bezpieczeństwo emocjonalne - dając, szukając i otrzymując miłość i uwagę. " +
                        "Sercem zwracamy się w kierunku domu i szukamy równowagi, harmonii, spokoju i " +
                        "piękna w swoim otoczeniu. Na planie fizycznym może się to wiązać z zakupem lub " +
                        "wynajmem domu, remontem, przebudową, zakupem mebli, malowaniem itp. Warto " +
                        "zadbać o miejsce, w którym przebywamy, żeby było ładne, estetyczne i świeże - " +
                        "by wprowadzić do niego nową energię, znaleźć w nim urok i ukojenie. Dobrze " +
                        "sprawdzą się orgonity, które przefiltrują energie, olejki eteryczne, które dodadzą " +
                        "zapachu i pobudzą zmysły, żywe zielone rośliny, odpowiednie kamienie. Często " +
                        "pod wpływem tej wibracji zakładamy lokaty czy rachunki oszczędnościowe na " +
                        "przyszłość. Mogą pojawić się zwiększone żądania dotyczące funduszy, darowizn, " +
                        "datków, składek, rachunków, kosztów szkolnych lub kieszonkowego dla dzieci. " +
                        "Szóstka reprezentuje spokój, harmonię, miłość do rodziny i społeczności, więc " +
                        "możliwe, że potrzebna będzie nasza pomoc w załagodzeniu konfliktu pomiędzy " +
                        "zwaśnionymi stronami. Możemy też chcieć nauczać, pocieszać lub doradzać " +
                        "innym. Na powierzchnię wysuwają się też zagadnienia związane ze zdrowiem, " +
                        "często związane z zębami, jeśli je w jakiś sposób zaniedbaliśmy. Koniecznym staje " +
                        "się troska o siebie i wprowadzenie zdrowej rutyny do swojego życia, w tym " +
                        "odpowiedniego odżywiania. Warto także odejść od rzeczy, które nam nie służą i " +
                        "sprawiają, że czujemy się za chwilę jeszcze gorzej. " +
                        "Poszukać alternatywnej lub profesjonalnej pomocy, aby uzyskać uzdrawiające " +
                        "rozwiązanie. Możemy też zostać wezwani do udzielenia pomocy osobie " +
                        "schorowanej lub członkom rodziny poprzez zapewnienie wsparcia zarówno " +
                        "emocjonalnego, jak i finansowego, krótko- lub długoterminowego. Pomagając " +
                        "innym, pomagamy sobie. Mając to na uwadze, rok ten może stać się jednym z " +
                        "najszczęśliwszych i najbardziej udanych okresów całego dziewięcioletniego cyklu.";
                break;

            case 7:
                text = "Życie nieco spowalnia tempa, może nie tyle w sferze zawodowej, co bardziej w " +
                        "sferze aktywności osobistej i zaangażowania towarzyskiego i społecznego. Mamy " +
                        "teraz mniej energii i nie wyrażamy takiego samego zainteresowania jak wcześniej, " +
                        "by iść, działać i być aktywnym. Wydarzenia w naszym życiu sprawią, że czujemy " +
                        "większą potrzebę zagłębienia się w swoje wnętrze, stajemy się więc bardziej " +
                        "introwertyczni i refleksyjni. Świat zewnętrzny jawi nam się obecnie zbyt " +
                        "dynamiczny, a w związku z tym mamy ochotę pobyć sam na sam ze sobą i nie " +
                        "rozpraszać energii. Jako że zmiana zaczyna zachodzić wewnętrznie, towarzyszy " +
                        "nam pewna tajemnicza aura. Może ona sprawiać, że częściej będziemy " +
                        "zapytywani, czy wszystko u nas w porządku, czy mamy się dobrze, czy może jest " +
                        "coś, co nam doskwiera. Oto Życie przy- prowadza nas do punktu, w którym " +
                        "zaczynamy przyglądać się wynikom naszych dotychczasowych starań i osiągnięć. " +
                        "Zaczynamy odczuwać potrzebę dokonania ponownej oceny swoich celów i zadań, " +
                        "a to zazwyczaj prowadzi do objęcia innego kierunku i zmiany dążeń. To rok, który " +
                        "dość często jest emocjonalnie i psychicznie ograniczający, zwłaszcza jeśli " +
                        "planowaliśmy większe osiągnięcia w sferze fizycznej i materialnej. Nadszedł czas, " +
                        "aby nieco wycofać się i dokonać refleksji nad tym, co osiągnęliśmy. Okiem realisty " +
                        "przychodzi nam spojrzeć na to, z jakiego punktu wyszliśmy, w ja - kim jesteśmy i " +
                        "dokąd tak naprawdę chcemy dalej podążać. Czas ten sprzyja rozwadze, " +
                        "spokojowi, cierpliwości, wyciszeniu i zagłębieniu się w siebie. Chętnie oddajemy " +
                        "się studiom, nauce, ale też kontemplacji i medytacji. Pojawia się zainteresowanie " +
                        "psychologią, rozwojem duchowym, naukami tajemnymi. Studiujemy dzieła " +
                        "filozofów i wielkich myślicieli. Nierzadko też szukamy pomocy w gabinetach " +
                        "psychoterapii czy ogólnie podejmujemy jakąś terapię dla zdrowia. Jest to czas " +
                        "nawiązania kontaktu ze swoją duszą, abyśmy mogli poznać i zrozumieć swoje " +
                        "miejsce i rolę w szerszym spektrum, w uniwersalnym planie rzeczy. Warto jest " +
                        "poddać się wszelkim metodom wyciszenia i relaksacji, odpocząć, zaplanować i " +
                        "cierpliwie przeczekać aniżeli próbować ponaglać, przy- spieszać czy wymuszać " +
                        "bieg wydarzeń. Obecne wyhamowanie służy kontemplacji swego istnienia, " +
                        "głębszemu poznaniu siebie i zrozumieniu innych ludzi. Wszystko po to, byśmy na " +
                        "nowo mogli wytyczyć swój przyszły kurs.";
                break;

            case 8:
                text = "Rok ten obfituje w plony naszych wysiłków. Zbieramy owoce tego, co posialiśmy i " +
                        "pielęgnowaliśmy w ciągu ostatnich siedmiu lat. Jeśli działaliśmy uczciwie, mieliśmy " +
                        "jasną wizję i byliśmy skoncentrowani na celu, wkładając prawdziwy wysiłek w " +
                        "swoje działania, projekty, naukę, pracę nad sobą lub związkiem, to ten rok przynosi " +
                        "zasłużony sukces i szczęście. Z kolei, jeśli jedynie dryfowaliśmy bądź pływaliśmy " +
                        "bez celu, determinacji lub kierunku, czas ten może przynieść frustrujące i pełne " +
                        "nerwowości chwile, wypełnione psychicznym obciążeniem lub poczuciem straty i " +
                        "zaprzepaszczonego potencjału. Rok w wibracji 8 jest czasem, który przynosi " +
                        "zapłatę proporcjonalną do intencji i włożonego wysiłku w realizację tego, co " +
                        "zamierzyliśmy. Jeśli byliśmy zorganizowani, efektywni, uczciwi i działaliśmy " +
                        "sprawiedliwie wobec innych, możemy spodziewać się awansu, nagrody, " +
                        "dodatkowej zapłaty za wysiłek, uznania i osiągnięcia. Rok będzie nadal wymagał " +
                        "wielkiego wysiłku, ale nagroda będzie tego warta. Z drugiej strony, egoizm, " +
                        "chciwość czy żądza władzy skutkują rozczarowaniem i stratą, gdyż wibracja 8 " +
                        "przynosi rozliczenie wobec uniwersalnych praw wszechświata. Możliwe też, że " +
                        "pragnęliśmy już zostawić za sobą pewne aspekty, poprawić jakość naszego życia i " +
                        "pójść dalej - jest ku temu dobry czas. W tym roku natura dostarcza siły i bodźca " +
                        "do wyzwolenia się ze starych struktur, które się zdezaktualizowały. Jeśli wahamy " +
                        "się lub czujemy niepewność, miejmy na uwadze, że oto możemy przegapić idealny " +
                        "moment na całkowity wypoczynek. Po latach pracy i oddawania czemuś swojej " +
                        "uwagi, nie jest to wprawdzie łatwa decyzja, ale z całą pewnością warta podjęcia.";
                break;

            case 9:
                text = "tekst do poprawy";
                break;
        }
        return text;
    }

    public String znakZodiaku(String znak){
        String text = "";
        String rahu;
        String ketu;
        switch (znak){

            case "Wodnik":
                rahu = "Waga";
                ketu = "Baran";
                text = "Węzeł północny RAHU (przyszłość) Byłaś w znaku zodiaku: "+rahu+"\n" +
                        "Węzeł południowy KETU (przeszłość) Byłaś w znaku zodiaku: "+ketu+"\n\n"+
                        "Człowiek z tym posadowieniem węzłów spędził wiele wcieleń, w których " +
                        "pierwszeństwo miało „ja\". Ma za sobą inkarnacje wojownika, stąd nosi w sobie " +
                        "ducha walki, potrzebę rywalizacji, zachowania czujności i strategicznego " +
                        "przeprowadzania działań. Celem dotąd było przetrwać za wszelką cenę, " +
                        "świadomość skierowana ku sobie, a zasadą „ja kontra ty\". Mógł sprawdzać się w " +
                        "zawodach opartych na rywalizacji bądź wymagających taktycznego i " +
                        "natychmiastowego działania, typu sportowiec, policjant, żołnierz czy strażak. W " +
                        "innym scenariuszu mógł przedwcześnie i tragicznie zakończyć swoje życie i nie " +
                        "mieć możliwości zdobycia doświadczenia na temat budowania relacji. Dziś ma w " +
                        "sobie całe pokłady aktywnej energii - jest niespokojny, niecierpliwy, ciągle w ruchu, " +
                        "z wewnętrznie zakorzenioną potrzebą konfrontacji. W głębi serca pragnie być z " +
                        "innymi, kochać i czuć się kochanym, lecz bez doświadczenia nie wie, jak tego " +
                        "dokonać. Stąd w tym życiu silny indywidualizm jest gruntem do budowania relacji " +
                        "partnerskich wypełnionych zgodą i równowagą. Nie będzie już ono polegało na " +
                        "przyjmowaniu, a na dawaniu. Ogromne poczucie pewności jest darem, który ma " +
                        "zostać przekazany innym. Priorytetowym zadaniem staje się nauka postawienia się " +
                        "w czyimś położeniu, zrozumienia drugiego człowieka oraz zwiększenie łagodności i " +
                        "wrażliwości nie na własne, a na jego potrzeby. Dopóki nie nauczy się dzielić, " +
                        "wszelkie starania blokowane są przeszkodami. W ego zadawane są bolesne ciosy. " +
                        "Pragnienia, po które chciałby sięgnąć, są mu odmawiane, a zamiast jemu - " +
                        "dawane innym ludziom. Prowadzi to do głębokiego gniewu, zazdrości i chęci walki, " +
                        "ale im więcej walczy, tym więcej traci. W relacjach z drugim człowiekiem miłość " +
                        "egoistyczna staje się wielką przeszkodą do przezwyciężenia - gdy próbuje coś dla " +
                        "siebie wygrać, wciąż przeżywa porażkę. Proces ten zachodzi, by powstrzymać " +
                        "człowieka przed trzymaniem się po- stawy „najpierw ja\". Główną regułą, na której " +
                        "mają opierać się jego relacje, jest uczciwość wobec siebie, partnera, danego słowa " +
                        "i przyjętych zasad. Celem jest doprowadzenie konfliktów do miejsca pokoju, w " +
                        "którym każda strona wygrywa zamiast kontynuować spiralę tarć i niesnasek. Aby " +
                        "umożliwić opanowanie tej lekcji, życie wzywa do sędziowania w sporach innych " +
                        "ludzi, dzięki którym uczy się obiektywnego spojrzenia na motywacje stron. Im " +
                        "bardziej jest w stanie skłonić innych do współpracy, tym lepiej poznaje reguły. " +
                        "Powoli zauważa, że zmieniło się jego otoczenie. W scenerii tej zniknęli wrogowie i " +
                        "nikt nie chce już z nim walczyć ani mu czegoś odebrać. Dookoła ma samych " +
                        "kompanów i przyjaciół, gdyż oś Waga - Baran daje możliwość nawiązania " +
                        "połączenia z wieloma ludźmi i budowania relacji opartych na miłości, pokoju i " +
                        "harmonii. Najprostsze rzeczy związane z dzieleniem się w relacji, wymianą miłości i " +
                        "niesieniem pomocy drugiemu, które są tak naturalne dla innych osób, tu stanowią " +
                        "zupełnie nowy obszar do odkrycia. " +
                        "Wczesne próby tworzenia związków nie udają się, człowiek popełnia w nich " +
                        "mnóstwo błędów, ale nie jest to zamierzone ani złośliwe. Popełnia je, bo nosi " +
                        "pamięć innego systemu zasad, który w tym życiu będzie próbował przepisać na " +
                        "nowo. Z czasem odkrywa, że ludzie są różni i niektórzy będą go kochali takim, jaki " +
                        "jest, a inni nie - i że to też jest w porządku i leży w naturze drugiej osoby, a nie w " +
                        "nim samym. Dlatego musi otworzyć się przed drugim człowiekiem i być sobą " +
                        "prawdziwym z głębi duszy. Poczuje się bezpiecznie, bo będzie wiedział, kto go " +
                        "prawdziwie kocha i akceptuje. W życiu ma wszelkie możliwości stworzenia " +
                        "szczęśliwego związku. Aby do tego doszło, przede wszystkim powinien z całą " +
                        "pokorą i zaangażowaniem poznać drugą osobę - kim ona autentycznie jest, a nie " +
                        "w jaki sposób spełni nasze własne potrzeby. Rozpoznać, jakie wartości, cele i " +
                        "ideały ma partner i czy są one podobne do naszych, by płynęło obopólne " +
                        "wsparcie. Oświecenie wynika tu ze zrozumienia, jaką słodycz niesie zwycięstwo, " +
                        "gdy jest ono osiągnięte u boku drugiego człowieka, a nie przeciwko niemu. " +
                        "Wyższe powołanie wzywa, by stać się wojownikiem w imię miłości, ale nie miłości " +
                        "dla własnej chwały, lecz miłości płynącej ze współpracy i harmonijnego " +
                        "współistnienia. Niezależnie od tego, na co osoba się zdecyduje, dzięki silnej " +
                        "determinacji jest w stanie to osiągnąć. Co prawda zawsze będzie chciała robić " +
                        "rzeczy po swojemu, ale teraz musi rozwinąć umiejętność przyjmowania " +
                        "perspektywy drugiej osoby i zauważyć, jak cenną wartość stanowi jej opinia i " +
                        "wkład. Trzeba najpierw zapytać łagodnie, co myśli lub czuje, na co miałaby ochotę, " +
                        "i dopiero wtedy przedstawić swój pomysł. W przeciwnym razie, gdy Rahu w " +
                        "Wadze sam wyjdzie z propozycją, druga osoba, chcąc mu sprawić przyjemność, " +
                        "przystanie na nią, ale ostatecznie nie będzie miała poczucia wysłuchania i " +
                        "poszanowania. W końcu któregoś dnia po prostu się wycofa. Rahu w Wadze musi " +
                        "pamiętać, że ma silną energię wzmacniającą. Wydatkując tę energię, nie traci jej, a " +
                        "przelewa na drugą osobę. Dzieląc się swoją determinacją, niezależnością, " +
                        "samodzielnością i poczuciem pewności, daje drugiemu człowiekowi atrybuty, " +
                        "których on potrzebuje. Jeśli więc pragnie prawdziwej nie- zależności w związku, " +
                        "musi zawsze starać się dawać więcej niż otrzymuje. Pojawia się wtedy poczucie " +
                        "mocy i możliwość doświadczania radości bycia wrażliwym i połączonym z drugą " +
                        "osobą. Kiedy jest gotowy na bycie kochanym, obdarza miłością drugiego.";

                break;

            case "Waga":
                rahu = "Baran";
                ketu = "Waga";
                text = "Węzeł północny RAHU (przyszłość) Byłaś w znaku zodiaku: "+rahu+"\n" +
                        "Węzeł południowy KETU (przeszłość) Byłaś w znaku zodiaku: "+ketu+"\n\n"+
                        "W poprzednim wcieleniu i dalej w tym życiu osoba wykonuje zajęcia, w których " +
                        "ważne jest rozumienie ścieżki myślowej innych osób. Ma przekazać ludziom " +
                        "informacje w taki sposób, w jaki są je w stanie przyjąć. Najczęściej wybiera zawód " +
                        "nauczyciela, pisarza, mówcy czy handlowca. Dar rozumienia drugiego człowieka " +
                        "pozwala jej rozmawiać z kimkolwiek i o czymkolwiek, a wymiana odbywa się w " +
                        "przyjaznej i pełnej akceptacji atmosferze. Aby była rozumiana, potrafi z łatwością " +
                        "dostrzec czyjś punkt widzenia i dostosować się do języka drugiej osoby. Nie " +
                        "wyraża jednak tego, co podpowiada jej intuicja, i tym samym traci kontakt z " +
                        "własną prawdą. Jej umysł pracuje na wysokich obrotach, stale analizując bieżące " +
                        "sprawy. Wiecznie otoczona ludźmi i skupiona na świecie zewnętrznym, odcięta jest " +
                        "od kontaktu z ciszą i duchową stroną życia. Wie, że potrzebuje czegoś, co da jej " +
                        "siłę i pewność siebie, ale pragnienie akceptacji zewnętrznej, poruszanie się w " +
                        "schematach myślowych i przeróżne wątpliwości nie sprzyjają sięgnięciu po własną " +
                        "moc. W którymś momencie Życie jednak zaprosi ją, by odważnie weszła na drogę " +
                        "rozwoju duchowego. Odkrycie i połączenie z własną duchowością jest " +
                        "priorytetowym zadaniem Rahu w Strzelcu. Ketu w Bliźniętach pozwala dostrzegać " +
                        "różne, nierzadko sprzeczne koncepcje. Kiedy próbuje wziąć coś na logikę, cała " +
                        "sprawa staje się tylko trudniejsza. Nie ułatwia to podjęcia jakiejkolwiek decyzji. Z " +
                        "jednej strony osoba czuje, który wybór jest właściwy, a z drugiej kwestionuje to " +
                        "odczucie. Każdą możliwość konsultuje z przyjaciółmi. Ci słyszą i wskazują " +
                        "wyraźnie, która opcja jest dla niej dobra, ale osoba i tak wszystko dalej rozważa i " +
                        "analizuje. W wyniku wewnętrznego konfliktu dochodzi do przekonania, że nie ma " +
                        "możliwości wygranej. Powoduje to tym głębszą niepewność, szczególnie że jej " +
                        "myśli krążą wokół straty - co straci, podejmując taką decyzję, a co, podejmując " +
                        "inną. Musi wiedzieć, że strata jest częścią większego zysku; aby czerpać korzyści " +
                        "z nie- zależności, musi uwolnić się z zależności; by rozpocząć nową pracę, trzeba " +
                        "zakończyć poprzednią. Najważniejszą kwestią dla Rahu w Strzelcu jest słuchać i " +
                        "podążać za intuicją - tym pierwszym odczuciem, zwanym wyższym „ja\" czy " +
                        "głosem serca. Ona jest tutaj najbardziej właściwą podpowiedzią. Osoba uczy się ją " +
                        "rozpoznawać, polegać na niej i pozwalać się jej prowadzić. Musi pamiętać, że na " +
                        "jej drodze zawsze stanie to, co jest jej pisane, więc słuchając intuicji, zawsze " +
                        "będzie na właściwej ścieżce. Niezwykle istotną sprawą jest również skupienie się " +
                        "na celu i na osobach, które będą towarzyszyć w jego osiągnięciu. Uwaga musi być " +
                        "skoncentrowana na korzyści - rozwoju, nowym środowisku i ludziach, do których " +
                        "pragnie dotrzeć. Gdy wreszcie podejmie decyzję płynącą prosto z serca, zaczyna " +
                        "odczuwać wsparcie wszechświata, który jakby tylko na to czekając, sprawnie " +
                        "kalibruje się do obranej przez nią ścieżki, otwiera ją i przynosi ułatwienia. Duchowa " +
                        "pomoc prowadzi ją do spełnienia marzeń i osiągnięcia celu, a logiczne myślenie " +
                        "przydaje się, by określić najlepszy dla tego sposób. Umiejętności i cechy, z którymi " +
                        "osoba przyszła w to wcielenie, są i pozostaną, chodzi jednak o to, by widziała w " +
                        "nich pozytywną wartość i tak je przekształcała, by jej służyły. Z całą pewnością " +
                        "należą do nich ciekawość, otwartość i potencjał ogromnej inteligencji. " +
                        "Odejść trzeba od nadmiernego myślenia i racjonalizowania wszystkiego, a w to " +
                        "miejsce skupić się na inspiracji i wierze. Rahu w Strzelcu potrzebuje jednej ścieżki, " +
                        "której będzie się trzymać, oraz majstersztyku - czegoś, co go ożywia, napawa " +
                        "entuzjazmem i nadaje życiu kierunek. Dla wzrostu duszy bardzo ważna jest " +
                        "prawdomówność i uczciwość. Gdy osiąga punkt szczerości ze sobą, wie, że jest " +
                        "na dobrej drodze. Automatycznie zaczyna też postrzegać innych w ten sam " +
                        "sposób. Nie musi podejmować prób przekonywania kogoś do własnego punktu " +
                        "widzenia, a w to miejsce jedynie otwarcie i szczerze wyrażać swoje zdanie - co " +
                        "myśli, co czuje, co przez niego przepływa. Zamiast cenzurować i dopasowywać " +
                        "słowa, musi wypowiadać te, które czuje intuicyjnie. Wtedy osoby, które nie " +
                        "rezonują - wycofują się, a w ich miejsce pojawiają się ludzie dostrojeni do naszej " +
                        "prawdy i dzielący te same duchowe wartości. Wygrana jest awansem, kolejnym " +
                        "stopniem ewolucji. Tak więc kiedy pojawia się jakiś pomysł i kiedy osoba " +
                        "intuicyjnie poczuje, że to jest to, co chciałaby robić, będzie jej towarzyszył " +
                        "entuzjazm. Jest to energia, której w pełni może zaufać i droga, którą ma podążać. " +
                        "W celu wzmocnienia głosu intuicji, zyskania wglądu i połączenia z prawdą, " +
                        "koniecznym jest spędzenie pewnej ilości czasu sam na sam ze sobą, a także " +
                        "obcowanie z naturą i zwierzętami. Tu bieżące sprawy tracą swoją ważność. Pośród " +
                        "przyrody osoba odnajduje siebie. Przynosi jej ona spokój umysłu i pomaga " +
                        "przypomnieć sobie, że istnieje plan o wiele szerszy niż ten, który dyktuje umysł. " +
                        "Zwierzęta z kolei mają kojące wibracje i uczą nas patrzeć na świat w prosty " +
                        "sposób. Gdy umysł odpoczywa, dostrajamy się do swobodnego przepływu życia " +
                        "w jego naturalnym rytmie. Bardzo ważnym elementem dla Rahu w Strzelcu są " +
                        "również podróże, odda- nie się przygodzie i eksploracja tego, co tajemnicze, " +
                        "odległe i tak różne od tego, co zna. Rzucając się w wir przygody i tak też traktując " +
                        "życie, osoba odkrywa nowe, niesamowite ścieżki, o których istnieniu nawet nie " +
                        "wiedziała. Kiedy idzie za głosem serca, czuje się swobodna, radosna i pełna " +
                        "energii. Wtedy dzieje się magia i cały wszechświat konspiruje na jej korzyść.";
                break;

            case "Byk":
                rahu = "Baran";
                ketu = "Waga";
                text = "Węzeł północny RAHU (przyszłość) Byłaś w znaku zodiaku: "+rahu+"\n" +
                        "Węzeł południowy KETU (przeszłość) Byłaś w znaku zodiaku: "+ketu+"\n\n" +
                        "W poprzednim wcieleniu, a także na wcześniejszych etapach obecnego życia, " +
                        "osoby te poświęcały dużo czasu innym ludziom. Pełniły rolę zakulisową, np. jako " +
                        "doradca czy asystent. Pozwalała im ona udzielać wsparcia innym ludziom, " +
                        "wzmacniając ich mocą i pozytywną energią. Ich życie polegało na ciągłym " +
                        "utrzymywaniu zgody, pokoju i harmonii. Dziś nadal są sympatycznymi, uprzejmymi, " +
                        "lubianymi i pełnymi uroku ludźmi. Otoczeni gronem przyjaciół, utrzymują kontakty " +
                        "ze znajomymi z wielu różnych środowisk, dbają o relacje. Nigdy tak naprawdę nie " +
                        "są sami: gdy jeden romans się kończy, następny czeka już za rogiem. Ich uwaga " +
                        "skupiona jest na tym, żeby nie tylko fizycznie dobrze wyglądać, być pożądanym, " +
                        "atrakcyjnym i pełnym uroku dla innych, ale także, by na poziomie osobowości czuć " +
                        "się pięknym i dobrym człowiekiem. Od początku wszystko jest nastawione na " +
                        "zakochanie się, dalej następuje koncentracja uwagi na osobie, którą się zauroczą, " +
                        "następnie na małżonku i dzieciach. Potrzebują innych ludzi, gdyż ci " +
                        "odzwierciedlają to, co w nich miłe i dobre. Z wdzięcznością dają innym, co sami " +
                        "mają najlepszego. W ten sposób dochodzą do punktu, w którym przestają myśleć " +
                        "o sobie i zatracają dostęp do swoich prawdziwych pragnień i tęsknot. " +
                        "Koncentrując się na innych i poświęcając im praktycznie całą uwagę, zauważają w " +
                        "końcu, że ani nie spotyka się to z jakimś wyjątkowym docenieniem, ani nie " +
                        "przynosi wymiernych korzyści z pokładanych wysiłków. Kochają i pragną " +
                        "doświadczać szczęścia, harmonii, uczciwości i wsparcia, a jednak dociera- ją do " +
                        "punktu, w którym mimo swej naprawdę hojnej natury, nie znajdują pełnego uznania " +
                        "i docenienia w oczach drugiego człowieka, w tym swojego partnera. Mogł długo " +
                        "pozostawać w pozornie szczęśliwym związku, ale pod fasadą miłości czują się " +
                        "głęboko niespełnieni. Dokuczliwe przeświadczenie, że czegoś im brakuje, ślad " +
                        "urazy wynikający z poczucia niedocenienia i swoista niekompletność stają się " +
                        "dzwoneczkiem nawołującym do dokonania pewnej korekty. Dotychczasowe " +
                        "inwestowanie uwagi w drugą osobę uniemożliwiało poznanie siebie, dotarcie do " +
                        "własnych potrzeb i pragnień oraz wykształcenie „ja\" jako istoty niezależnej i " +
                        "niepowtarzalnej. Osobom tym mogło towarzyszyć poczucie, że drugiemu " +
                        "człowiekowi należy się wszystko, co dla niego robią. Teraz muszą jednak " +
                        "pamiętać, by być przede wszystkim uczciwym wobec siebie i nie dawać ponad to, " +
                        "z czym same czują się komfortowo i co płynie z miejsca autentycznej satysfakcji. " +
                        "Życie w ten sposób przymusza je, by pozwoliły sobie na bycie sobą i zaczęły " +
                        "realizować te działania, które dla nich niosą prawdziwe znaczenie. Ich dusza aż " +
                        "wyrywa się, by podjąć działania z własnej woli. Mają tak wiele pasji, ambicji i " +
                        "pragnień, że gdy zaczynają słuchać tego palącego w nich głosu, są wreszcie w " +
                        "stanie uzyskać dostęp do wewnętrznego ognia.";
                        break;
        }
        return text;
    }

    public void getRest(String zodiak, Document document) {
        Paragraph space = new Paragraph(" ");

        Paragraph jeden = new Paragraph(new Phrase(20,"Twoj znak zodiaku: "+pdfCreator.znakZodiaku,
                pdfCreator.AlegreyaSans20Bold));
        jeden.setAlignment(Element.ALIGN_CENTER);

        Paragraph dwa = new Paragraph(new Phrase(20,"Trochę więcej informacji o tobie:",
                pdfCreator.AlegreyaSans20Bold));
        dwa.setAlignment(Element.ALIGN_CENTER);

        Paragraph trzy;

        Paragraph cztery = new Paragraph(new Phrase(20,"PODSTAWOWY CEL INKARNACJI",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph piec;

        Paragraph szesc = new Paragraph(new Phrase(20,"ODCHODZISZ OD",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph siedem;

        Paragraph osiem = new Paragraph(new Phrase(20,"UCZYSZ SIĘ",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph dziewiec;

        Paragraph jeden0 = new Paragraph(new Phrase(20,"MOTYWOWANA POPRZEZ",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph jeden1;

        Paragraph jeden2 = new Paragraph(new Phrase(20,"NIESIONE DARY",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph jeden3;

        Paragraph jeden4 = new Paragraph(new Phrase(20,"(+) POZYTYWNE CECHY CHARAKTERYSTYCZNE",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph jeden5;

        Paragraph jeden6 = new Paragraph(new Phrase(20,"(-) NEGATYWNE CECHY CHARAKTERYSTYCZNE:",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph jeden7;

        Paragraph jeden8;

        Paragraph jeden9;

        Paragraph dwa0;

        Paragraph dwa1;

        Paragraph dwa2 = new Paragraph(new Phrase(20,"Zakłócenie równowagi i związane z nią dolegliwości",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph dwa3 = new Paragraph(new Phrase(20,"Możliwe przejawienia:",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph dwa4;

        Paragraph dwa5;

        Paragraph dwa6;
        Paragraph dwa7;
        Paragraph dwa8;
        Paragraph dwa9;

        Paragraph trzy0 = new Paragraph(new Phrase(20,"DZIAŁANIA I TERAPIE WSPIERAJĄCE",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph trzy1;

        Paragraph trzy2 = new Paragraph(new Phrase(20,"NATUROTERAPIA:",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph trzy3;

        Paragraph trzy4;

        Paragraph trzy5;

        Paragraph trzy6;

        Paragraph trzy7;

        Paragraph trzy8;

        Paragraph trzy9 = new Paragraph(new Phrase(20,"PSYCHOSOMATYKA I UZDRAWIANIE POPRZEZ ŚWIADOMOŚĆ",
                pdfCreator.AlegreyaSans18Bold));

        Paragraph cztery0;


        switch (zodiak){
            case "Wodnik":
                trzy = new Paragraph(new Phrase(20,"WODNIK - JA WIEM",
                        pdfCreator.AlegreyaSans18Bold));

                piec = new Paragraph(new Phrase(20,"Inspirowanie innych swoją niekonwencjonalną filozofią życia oraz dzielenie się" +
                        "pełnym inwencji wglądem. Wyraziste dostrzeganie znaczenia grupy",
                        pdfCreator.AlegreyaSans18));

                siedem = new Paragraph(new Phrase(20,"Chłodnego dystansu i potrzeby aprobaty",
                        pdfCreator.AlegreyaSans18));

                dziewiec = new Paragraph(new Phrase(20,"Tworzenia właściwych relacji międzyludzkich",
                        pdfCreator.AlegreyaSans18));

                jeden1 = new Paragraph(new Phrase(20,"Gotowość do służenia innym",
                        pdfCreator.AlegreyaSans18));

                jeden3 = new Paragraph(new Phrase(20,"Gotowość do dzielenia się niekonwencjonalnymi pomysłami. Obiektywność przez\n" +
                        "wzgląd na widzenie obrazu. Przyjacielskość. Przekazywanie świadomości\n" +
                        "równości. Umiejętność podejmowania decyzji korzystnych dla grupy.\n" +
                        "Humanitaryzm. Aktywny udział w grupach. Równe traktowanie. Tworzenie sytuacji\n" +
                        "wygrana-wygrany. Zauważanie wyjątkowości innych ludzi",
                        pdfCreator.AlegreyaSans18));

                jeden5 = new Paragraph(new Phrase(20,"Wodnik przedstawiany jest " +
                        "jako człowiek niosący dzban wody - odnosi się to do wiedzy i przewodnictwa, " +
                        "które może zaoferować innym. Z natury przyjazny, intuicyjny, oryginalny, " +
                        "niekonwencjonalny i zorientowany na cele humanitarne. Ceni pracę, w której może " +
                        "przejawić talenty innowacyjności i niezależności w sposobie myśle- nia. Choć jest " +
                        "rzadko rozumiany, ma niebywałą zdolność przyciągania do siebie ludzi różnego " +
                        "pochodzenia i wywodzących się z różnorakich środowisk. Jest inny, ponieważ nie " +
                        "pasuje do znanych wzorców. Choć nosi w sobie ciepło, to jednak wydaje się być " +
                        "zdystansowany. Pozorna obojętność wynika z troski o kolektyw, a nie o " +
                        "poszczególne jednostki. Posiada determinację, wytrwałość i analityczny umysł " +
                        "naukowy. Potrafi wyciągać precyzyjne wnioski, ma wysoką zdolność koncentracji i " +
                        "przyswajania wielu informacji. Jest wizjonerem i idealistą, zdolnym do " +
                        "poprowadzenia ludzi w lepszym kierunku. Dobrze sobie radzi w relacjach z innymi, " +
                        "a ci obdarzają go zaufaniem. Jest łagodny i stara się żyć zgodnie z zasadą bratniej " +
                        "bądź siostrzanej miłości. W konfrontacji z nieznanym nie boi się stawiać pytań. " +
                        "Bardzo ważne są dla niego relacje przyjacielskie i grupowe. Nie zaprząta sobie " +
                        "głowy tym, co ludzie myślą, i na tej samej zasadzie pozwala im żyć po swojemu, " +
                        "bez poddawania ocenie jakichkolwiek zachowań. W miłości ważna jest dla niego " +
                        "nić porozumienia i komunikacji, dlatego wybiera towarzystwo osoby na " +
                        "odpowiednim poziomie intelektualnym. Choć ceni sobie niezależność, małżeństwo " +
                        "często przynosi mu poczucie bycia szczęśliwszym i bardziej zrównoważonym.",
                        pdfCreator.AlegreyaSans18));

                jeden7 = new Paragraph(new Phrase(20,"Może być nieobecny " +
                        "myślami, nieelastyczny i bardzo uparty. Na poziomie nieprzebudzonym rozprasza " +
                        "uwagę w wielu różnych kierunkach bez prawdziwego celu, a przy tym usiłuje " +
                        "szokować ludzi swoim zachowaniem. Gdy obejmuje stanowisko władzy, może być " +
                        "krytyczny i wymagający. Towarzyszą mu chłód i dystans, które raczej odpychają, " +
                        "niż przyciągają innych. Potrafi być nieprzewidywalny, ekscentryczny, nietaktowny i " +
                        "niecierpliwy. Jako że chciałby mieć wszystko natychmiast, dlatego woli działać " +
                        "sam, zamiast czekać i zdawać się na kogoś innego. Może nie zwracać uwagi na " +
                        "szczegóły. Swoje wysiłki humanitarne powinien ograniczać do takich, które jest w " +
                        "stanie doprowadzić do końca. Przejawia tendencję do pozwalania innym, by " +
                        "zabierali zbyt dużo jego czasu.",
                        pdfCreator.AlegreyaSans18));



                jeden9 = new Paragraph(new Phrase(20,"SYSTEMY CIAŁA I FUNKCJE ZARZĄDZANE PRZEZ ZNAK WODNIKA:",
                        pdfCreator.AlegreyaSans18Bold));

                dwa0 = new Paragraph(new Phrase(20,"kończyny dolne: golenie, łydki i kostki, kość podudzia, piszczel i kość strzałkowa, " +
                        "ścięgno Achillesa, sympatyczny układ nerwowy i obwodowy, układ naczyniowy " +
                        "(układ krążenia i eliminacyjny), zęby, impulsy elektryczne nerwów, czopki i pręciki " +
                        "w oku, dotlenianie komórek, piramidowy układ nerwowy i aktywny mechanizm " +
                        "transportu",
                        pdfCreator.AlegreyaSans18));

                dwa1 = new Paragraph(new Phrase(20,"OŚ WODNIK/LEW",
                        pdfCreator.AlegreyaSans18Bold));

                dwa4 = new Paragraph(new Phrase(20,"Zakłócenie równowagi i związane z nią dolegliwości",
                        pdfCreator.AlegreyaSans18));

                dwa5 = new Paragraph(new Phrase(20,"Możliwe przejawienia:",
                        pdfCreator.AlegreyaSans18Bold));

                dwa6 = new Paragraph(new Phrase(20,"żylaki i hemoroidy\n" +
                        "zatrucie krwi 0\n" +
                        "zaburzenia nerwowe spowodowane wysoką wrażliwością\n" +
                        "nadwrażliwość na bodźce i zaburzenia przetwarzania sensorycznego (jednym ze\n" +
                        "wskazań osłabienia systemu nerwowego jest ekstremalna wrażliwość skóry)\n" +
                        "zespół Aspergera i autyzm\n" +
                        "schizofrenia\n" +
                        "kwestie związane z adrenaliną i jej wpływem\n" +
                        "wypadki z uszkodzeniem kostek i kończyn dolnych\n" +
                        "zespół niespokojnych nóg, bóle nóg, siniaki retencja wody w nogach i kostkach\n" +
                        "odczucie, jak gdyby po skórze pełzały małe owady\n" +
                        "stagnacja i/lub zatruta krew\n" +
                        "nieregularna praca serca, na tle zaburzenia impulsów elektrycznych\n" +
                        "gazy w jelitach\n" +
                        "zimne poty spowodowane nadczynnością układu nerwowego\n" +
                        "zaburzenia widzenia, w tym daltonizm, zaburzenia widzenia obwodowego i\n" +
                        "centralnego oraz urazy siatkówki\n" +
                        "zaburzenia koordynacji i ogólna nieporadność\n" +
                        "motoryczna tiki nerwowe, tiki twarzy i mimowolne skurcze kończyn\n" +
                        "stwardnienie rozsiane i choroba Parkinsona neurastenia\n" +
                        "alkoholizm reumatyzm i gorączka reumatyczna\n" +
                        "przewlekły stres i napięcie we współczulnym układzie nerwowym prowadzące do\n" +
                        "problemów z krążeniem i powikłań: apopleksji, udaru mózgu, nadciśnienia itd.\n" +
                        "pesymizm\n" +
                        "zmienność nastrojów\n" +
                        "nadmierna emocjonalność\n" +
                        "nadwrażliwość emocjonalna",
                        pdfCreator.AlegreyaSans18));

                dwa7 = new Paragraph(new Phrase(20,"Wodnik reguluje pracę goleni, łydek i kostek, a także układu współczulnego i " +
                        "obwodowego układu naczyniowego. Mowa tu o obwodowym układzie " +
                        "naczyniowym i żylnym, kierującym krew z powrotem do serca, które jest pod " +
                        "władaniem Lwa. Występują tu rzadko spotykane dolegliwości, szczególnie " +
                        "związane z układem nerwowym. Jest zaangażowany w krążenie krwi i procesy " +
                        "utleniania w organizmie. Ze względu na działanie na jego przeciwstawny znak Lwa " +
                        "pojawiają się żylaki, dochodzi do skręcenia kostki, nieprawidłowości akcji serca i " +
                        "obrzęków. Zbyt mała ilość tlenu pozbawia komórki możliwości pracy z " +
                        "maksymalną wydajnością. Wodnik żywi wyjątkowe upodobanie do makaronu, " +
                        "ziemniaków i chleba. Tlen jest potrzebny do rozbicia pokarmów, które spożywamy, " +
                        "a ponieważ są to pokarmy bogate w skrobię, wymagają sporej ilości tlenu, by " +
                        "doszło do jej rozbicia i aby pokarmy te zostały strawione. W związku z tym Wodnik " +
                        "bardzo często po posiłku udaje się na drzemkę - niezależnie od wieku. Dlatego " +
                        "powinien stosować się do diety niskoskrobiowej i w ten sposób zachować ten w " +
                        "celu lepszego jego wykorzystania. Z kolei, aby wyeliminować dwutlenek węgla z " +
                        "organizmu, pomogą mu głębokie ćwiczenia oddechowe. Energia Wodnika wpływa " +
                        "na krążenie krwi, dlatego znak ten związany jest z jej zatruciem – toksemią " +
                        "wynikającą z zastojów w jelicie grubym przez wpływy znaku Skorpiona. Osłabienie " +
                        "wzroku wiąże się z ospałością w funkcjonowaniu jelita grubego. W ciężkich " +
                        "przypadkach może rozwinąć się jaskra i zaćma. Wodnik reguluje również rdzeń " +
                        "kręgowy chroniony przez kręgi kręgosłupa, a w związku z tym mogą pojawiać się " +
                        "dolegliwości nerwowe związane z kręgosłupem. Możliwe są dolegliwości związane " +
                        "z koordynacją mięśni, nerwów i mózgu, takie jak stwardnienie rozsiane, " +
                        "stwardnienie boczne i zapalenie miednicy. Melancholijny wpływ Saturna " +
                        "(tradycyjny władca Wodnika) prowadzi do zakrzepów, zatorów, utwardzania tętnic. " +
                        "Nerwowy wpływ Urana (współwładca Wodnika) destabilizuje układ nerwowy, " +
                        "endokrynny, krążenia, predysponuje do apopleksji, udarów, nagłych urazów " +
                        "struktur naczyniowych. Wodnik z temperamentem sangwinika wykazuje się " +
                        "pewnością siebie, gracją, opanowaniem, ale tu ze względu na władanie dwóch " +
                        "planet - Saturna i Urana - może być przy tym bardzo sztywny i wymagający (wpływ " +
                        "Saturna) oraz nerwowy i chaotyczny (wpływ Urana). Konflikty podprogowe i " +
                        "napięcie obciążają układ współczulny, zużywają tkanki nerwowe, powodują " +
                        "spazmodyczne dolegliwości nerwów. \n" +
                        "Przekonanie, którym może się żywić Wodnik dotyczące wyższości umysłu nad " +
                        "materią, prowadzi do nieprzywiązywania wagi do przestrzegania regularnego snu i " +
                        "wyrobienia zdrowych nawyków żywieniowych. \n" +
                        "Wodnik z silnym wpływem nieharmonijnych aspektów Saturna będzie oddawał się " +
                        "melancholii, może być lękliwy i niespokojny. Wodnik z silnym wpływem Urana " +
                        "może popadać w histerię, stawać się impulsywny, bezwzględny i bardzo " +
                        "emocjonalny. Wodnik jest naturalnie obdarzony silną wolą, jednak przy trudnych " +
                        "aspektach którejś z tych planet, skłonny jest otaczać się ekstremalnie mroczną i " +
                        "pesymistyczną aurą oraz rozwijać nadmierną wrażliwość i emocjonalność. " +
                        "Zmienne nastroje często prowadzą do złego stanu zdrowia i manifestują się w " +
                        "postaci nerwowości. Dzięki temu, że Wodnik wywodzi się z żywiołu powietrza, " +
                        "obdarza lotnością i wysokimi ambicjami, ale też możliwa jest tutaj skłonność do " +
                        "przesady. Jego ciało musi być napięte do granic możliwości, by zauważył w sobie " +
                        "siłę. Podda się dopiero wtedy, gdy znajdzie się w krytycznym stanie. Pozwoli " +
                        "wówczas lekarzowi/ uzdrowicielowi pomóc sobie na wszelkie możliwe sposob",
                        pdfCreator.AlegreyaSans18));

                dwa8 = new Paragraph(new Phrase(20,"ZDROWIE I DOBRE SAMOPOCZUCIE WODNIKA" ,
                        pdfCreator.AlegreyaSans18Bold));

                dwa9 = new Paragraph(new Phrase(20,"Konieczne jest osiągnięcie równowagi pomiędzy: WODNIK/LEW \n" +
                        "Analitycznym podejściem do życia a patrzeniem sercem \n" +
                        "Altruizmem a zdolnością do opieki nad innymi \n" +
                        "Neutralnością a współczuciem \n" +
                        "Sprzeciwianiem się intymnym relacjom a tęsknotą za nimi \n" +
                        "Chęcią wystąpienia z grupy a odwagą działania i przejawiania w niej swojego " +
                        "indywidualizmu \n" +
                        "Podejście do konfliktów: Wodnik ma tendencję do wznoszenia się ponad konflikt, " +
                        "jednak może pojawić się niechęć do osoby, która jest w niego zaangażowana. " +
                        "Konflikty są zazwyczaj rozwiązywane z wdziękiem. Wodnik może nie być " +
                        "elastyczny Działa z pozycji wiem\", bez względu na to, czy to, co wie, jest ważne " +
                        "dla osoby zaangażowanej w konflikt, czy też nie. Rzadkością jest przyznanie się, " +
                        "że się myli. Raczej przyjmie postawę typu przykro mi, wiem, że to boli\", choć tego " +
                        "nie werbalizuje. \n" +
                        "Żywiołem Wodnika jest POWIETRZE. \n" +
                        "Dlatego odzyskuje on swoje siły regularny kontakt z innymi znakami powietrza, tj. " +
                        "relacje z osobami o podobnych poglądach Bliźniętami i Wagą. zaangażowanie " +
                        "społeczne, które pozwala mu wyrażać własne idee pracę, która pozwala na " +
                        "innowacyjność, wolność i stymulację umysłową czyste, świeże powietrze, " +
                        "zwłaszcza górskie, które wpływa na niego uzdrawiająco Wodnik ma upodobanie " +
                        "do soli (sól symbolizuje mądrość), co może oznaczać tendencję do jaskry w " +
                        "połączeniu z odczuciem nacisku na powieki. Hatha- joga jest doskonała dla " +
                        "Wodnika ze względu na powinowactwo Urana ze skurczami. \n" +
                        "Konieczne są tu działania centrujące i uspokajające skołatane nerwy oraz toniki dla " +
                        "krwi, w celu poprawy krążenia i dotlenienia. Korzystnie wpływają na niego zioła " +
                        "usubtelniające, pomagające w nawiązywaniu kontaktów z innymi, zwłaszcza gdy " +
                        "utracona została miłość do ludzi. \n" +
                        "Zachodzi tu nauka altruistycznej postawy i inwestowanie w pojedyncze istoty " +
                        "podczas kreowania szerszej wizji, a także nauka eksperymentowania przy " +
                        "jednoczesnym zachowaniu życzliwej współpracy w grupie. Przekształcanie " +
                        "nieregularności w elektryczną iskrę innowacji i przyjęcie siły dojrzałości " +
                        "emocjonalnej zamiast negowania emocji rozwijają Wodnika i jego wnętrze. " +
                        "Towarzyszą: łatwość w relacjach oraz nauka dawania i brania. Poziom witalności " +
                        "Wodnika może ulegać częstym i nagłym zmianom. Znak ten strzeże energii " +
                        "elektrycznej ciała, więc Wodnik może być wrażliwy na pola elektromagnetyczne i " +
                        "zewnętrzne źródła stymulacji. Należy więc pamiętać o ograniczeniu skutków " +
                        "ekspozycji na linie energetyczne, komputer, telefon, wszelkie urządzenia " +
                        "wytwarzające pole elektromagnetyczne oraz środowiska, w których dochodzi do " +
                        "przeciążenia sensorycznego. Szczególnie korzystnie działają tutaj orgonity. Ze " +
                        "względu na wahania elektryczne Wodnik musi zwracać baczną uwagę na potrzeby " +
                        "swojego układu nerwowego i łagodzenie pracy serca. Zaniedbania tych układów " +
                        "zwiększają podatność na wypadki. Lepszej koordynacji pomiędzy tymi systemami " +
                        "służy nauka skupiania się na współpracy w relacjach, jak i na procesach " +
                        "zachodzących w ciele. Dolegliwością są też wiatry związane z gazami uwięzionymi " +
                        "w przewodzie pokarmowym. Można zapobiegawczo unikać nadmiaru produktów " +
                        "stymulujących w organizmie (np. warzyw kapustnych i krzyżowych). Wodnikowi " +
                        "bardziej służy pielęgnowanie swojego wnętrza aniżeli koncentrowanie się na celu " +
                        "zewnętrznym, jakim jest zmiana świata. Wtedy dopiero zaczyna doświadczać daru " +
                        "polegającego na wizjonerskim wglądzie i zauważa połączenia pomiędzy " +
                        "wszystkim, co istnieje.",
                        pdfCreator.AlegreyaSans18));

                trzy1 = new Paragraph(new Phrase(20,"DZIAŁANIA I TERAPIE WSPIERAJĄCE",
                        pdfCreator.AlegreyaSans18Bold));

                trzy3 = new Paragraph(new Phrase(20,"nowoczesna medycyna high-tech, leczenie bioenergetyczne, kinezjologia " +
                        "homeopatia, biorezonans, akupunktura \n" +
                        "medytacja, joga, magnetoterapia, dźwiękoterapia, ćwiczenia na świeżym " +
                        "powietrzu, podejście z emocjonalnym dystansem do spraw, praktykowanie " +
                        "wdzięczności, optymizm, uzdrowienie relacji z matką, podejście do swojej " +
                        "indywidualności ze zdrową dumą i pasją docenienie własnego " +
                        "niekonwencjonalnego myślenia",
                        pdfCreator.AlegreyaSans18));

                trzy4 = new Paragraph(new Phrase(20,"Zioła wiodące dla Wodnika:",
                        pdfCreator.AlegreyaSans18));

                trzy5 = new Paragraph(new Phrase(20,"lawenda, pieprz metystynowy, mięta pieprzowa, kakaowiec właściwy, mirra, " +
                        "żywokost lekarski, werbena pospolita, oczar wirginijski, okrężnica bagienna, " +
                        "jaśmin, rozmaryn",
                        pdfCreator.AlegreyaSans18));

                trzy6 = new Paragraph(new Phrase(20,"Remedia ziołowe dla Wagi:",
                        pdfCreator.AlegreyaSans18Bold));

                trzy7 = new Paragraph(new Phrase(20,"kocimiętka właściwa, lipa, czyściec lekarski, tłopian większy, " +
                        "owies zwyczajny, lawenda wąskolistna, werbena pospolita, męczennica cielista, " +
                        "tarczyca, kozłek lekarski, mniszek pospolity, fenkuł / koper włoski, serdecznik " +
                        "pospolity, pokrzywa zwyczajna, kasztanowiec zwyczajny, oczar wirginijski, melisa " +
                        "lekarska, wierzba biała",
                        pdfCreator.AlegreyaSans18));

                trzy8 = new Paragraph(new Phrase(20,"Esencje z kwiatów i minerałów:",
                        pdfCreator.AlegreyaSans18Bold));

                trzy9 = new Paragraph(new Phrase(20,"orzech włoski, śniedek baldaszkowaty, okrężnica " +
                        "bagienna, winorośl, lipa, werbena cytrynowa, melisa lekarska, krwawnik kwarc " +
                        "bezbarwny, lapis lazuli, granat, bursztyn, angelit.",
                        pdfCreator.AlegreyaSans18));

                cztery0 = new Paragraph(new Phrase(20,"Nastroje Wagi wahają się, co symbolizowane jest przez dwie szale. W jednym " +
                        "momencie osoba jest przepełniona optymizmem i szczęśliwa, a przy najmniejszym " +
                        "zaburzeniu psychicznym może popaść w stan pesymizmu i rozpaczy. Dobrze za to " +
                        "jest u niej rozwinięty idealizm. Dlatego, jeśli to możliwe, Waga nigdy nie powinna " +
                        "zniechęcać się w tym, co zrobiła, jeśli wychodziło to z serca, ponieważ porzucając " +
                        "swoje ideały, przechyla się na tę stronę skali, w której popada w najgłębsze " +
                        "rozczarowanie. To często powoduje zły stan zdrowia. Dlatego zadaniem Wagi jest " +
                        "kultywować w sobie równowagę. Waga często w życiu ma tendencję do bycia " +
                        "widzem, obserwatorem, który boi się działania, by nie popełnić błędu. Wierzy " +
                        "również, że niektórzy ludzie czy sytuacje ustawiają się przeciwko niej, więc często " +
                        "nie widzi sensu podejmowania działań ani walki. Chyba że w grę wchodzi relacja " +
                        "uczuciowa. " +
                        "Pełna bezstronność i wiara w obiektywizm mogą powstrzymać wagę od uznania, " +
                        "że droga mądrych relacji jest zbudowana na empatii i skutecznym ustanawianiu " +
                        "granic. Może łatwo złapać się na tym, że nagina swoje zasady przy próbach bycia " +
                        "sprawiedliwą, zapominając przy tym o własnym poczuciu tego, czego chce i kim " +
                        "chce być. Takie rozpraszanie energii i skupianie się na innych może prowadzić do " +
                        "nieuzasadnionej beztroski czy niedbałości, a dalej do niezdecydowania, braku " +
                        "koncentracji i stłumienia uczuć. Próby zadowolenia innych mogą zostać " +
                        "wykorzystane, a autonomia Wagi utracona, jeśli zagrożone jest jej poczucie " +
                        "miłości. Zbyt łatwo Waga wątpi, że zasługuje na to, by być kochaną tak samo, jak " +
                        "ona kocha innych. Kluczowe jest uświadomienie sobie, jak wyglądają zdrowe " +
                        "relacje, oderwanie się od tendencji do współzależności i rozwijanie " +
                        "bezwzględności osądu. Jej pragnienie uczciwości i dyplomacji może następnie " +
                        "przekształcić się w coś znacznie potężniejszego - w wielopłaszczyznową " +
                        "harmonię. Kiedy pojawia się nierównowaga w świecie zewnętrznym, nasze ciało " +
                        "zaczyna ją odzwierciedlać. Wysyła do nas sygnały w postaci problemów z nerkami " +
                        "i nadnerczami, u kobiet z jajnikami, a u mężczyzn z gruczołem prostaty. Tak " +
                        "jak funkcją nerek jest filtracja, tak samo metaforycznie można powiedzieć, że " +
                        "filtrują one wszelkie nieczystości naszej świadomości - postrzeganie siebie w " +
                        "relacji z drugim człowiekiem i przede wszystkim w relacji z sobą samym. Ich praca " +
                        "wskazuje nam na to, czy oszukujemy samych siebie, zwodzimy, łudzimy sic, " +
                        "tworzymy takie rodzaje związków, w których powielamy te same schematy " +
                        "niezrozumienia, zamiast wyciągać wnioski dla rozwoju i obopólnej korzyści. " +
                        "Oszukując samych siebie, oszukujemy naszego partnera, a nasze ciało, nasz " +
                        "wewnętrzny kosmos wskazuje nam nasze lekcje. Tu lekcją jest uczciwość, " +
                        "harmonia ze sobą i z drugim człowiekiem, bycie autentycznym, wiernym wobec " +
                        "własnych ideałów i jasnej wizji rozwoju. Nie o to chodzi, by za wszelką cenę dążyć " +
                        "do harmonii w relacji do otaczającego nas świata. Klucz leży w tym, by tę " +
                        "harmonię przywrócić sobie wewnętrznie, tj. będąc prawdziwym, autentycznym i " +
                        "całkowicie szczerym wobec siebie. Wtedy zgodnie z prawem rezonansu naprawia " +
                        "się nasz świat zewnętrzny. Waga pragnie tworzyć harmonijne relacje, wiedzieć, " +
                        "czego chcą inni ludzie i być traktowana we właściwy sposób. Uzdrowienie " +
                        "następuje z chwilą, gdy Waga zaczyna ożywiać towarzystwo innych ludzi swoim " +
                        "niezależnym punktem widzenia. Intuicyjnie wie, jak wprowadzić zasady harmonii, " +
                        "uczciwości i sprawiedliwości. Czyni to w sposób, który wymaga współpracy i " +
                        "jednocześnie nikogo nie uraza. Istotne jest, by Waga zamiast manipulować ludźmi " +
                        "dla ustanowienia sztucznej harmonii, komunikowała całą prawdę tego, czego " +
                        "doświadcza, a istniejącą harmonię bądź dysharmonię przyjmowała z akceptacją.",
                        pdfCreator.AlegreyaSans18));
                try{
                    document.add(jeden);
                    document.add(space);
                    document.add(dwa);
                    document.add(space);
                    document.add(trzy);
                    document.add(space);
                    document.add(cztery);
                    document.add(space);
                    document.add(piec);
                    document.add(space);
                    document.add(szesc);
                    document.add(space);
                    document.add(siedem);
                    document.add(space);
                    document.add(osiem);
                    document.add(space);
                    document.add(dziewiec);
                    document.add(space);
                    document.add(jeden0);
                    document.add(space);
                    document.add(jeden1);
                    document.add(space);
                    document.add(jeden2);
                    document.add(space);
                    document.add(jeden3);
                    document.add(space);
                    document.add(jeden4);
                    document.add(space);
                    document.add(jeden5);
                    document.add(space);
                    document.add(jeden6);
                    document.add(space);
                    document.add(jeden7);
                    document.add(space);

                    document.add(space);
                    document.add(jeden9);
                    document.add(space);
                    document.add(dwa0);
                    document.add(space);
                    document.add(dwa1);
                    document.add(space);
                    document.add(dwa2);
                    document.add(space);
                    document.add(dwa3);
                    document.add(space);
                    document.add(dwa4);
                    document.add(space);
                    document.add(dwa5);
                    document.add(space);
                    document.add(dwa6);
                    document.add(space);
                    document.add(dwa7);
                    document.add(space);
                    document.add(dwa8);
                    document.add(space);
                    document.add(dwa9);
                    document.add(space);
                    document.add(trzy0);
                    document.add(space);
                    document.add(trzy1);
                    document.add(space);
                    document.add(trzy2);
                    document.add(space);
                    document.add(trzy3);
                    document.add(space);
                    document.add(trzy4);
                    document.add(space);
                    document.add(trzy5);
                    document.add(space);
                    document.add(trzy6);
                    document.add(space);
                    document.add(trzy7);
                    document.add(space);
                    document.add(trzy8);
                    document.add(space);
                    document.add(trzy9);
                    document.add(space);
                    document.add(cztery0);

                } catch (DocumentException ex){
                    ex.printStackTrace();
                }

                break;


            case "Waga":
                trzy = new Paragraph(new Phrase(20,"WAGA- JA RÓWNOWAŻĘ",
                        pdfCreator.AlegreyaSans18Bold));

                piec = new Paragraph(new Phrase(20,"Odnalezienie bratniej duszy",
                        pdfCreator.AlegreyaSans18));

                siedem = new Paragraph(new Phrase(20,"Chęci odnoszenia zwycięstwa nad innymi",
                        pdfCreator.AlegreyaSans18));

                dziewiec = new Paragraph(new Phrase(20,"Dostrzegać właściwe wartości i dokonywać doskonałego osądu w postępowaniu " +
                        "wobec innych. Zrównoważyć polaryzację męskiej i żeńskiej energii. Osiągać " +
                        "równowagę woli, miłości i inteligencji",
                        pdfCreator.AlegreyaSans18));

                jeden1 = new Paragraph(new Phrase(20,"Pragnienie relacji, związku",
                        pdfCreator.AlegreyaSans18));

                jeden3 = new Paragraph(new Phrase(20,"Współpraca Dyplomacja i takt " +
                        "Bycie bardziej świadomym potrzeb innych ludzi " +
                        "Bezinteresowność: udzielanie wsparcia bez oczekiwania wzajemności " +
                        "Tworzenie sytuacji, „ja wygrywam i ty wygrywasz\" " +
                        "Dzielenie się " +
                        "Umiejętność widzenia rzeczy oczami innych i wczucia się w ich sytuację",
                        pdfCreator.AlegreyaSans18));

                jeden5 = new Paragraph(new Phrase(20,"Naturalnymi darami Raka są empatia, głębia emocjonalna, intuicja, Potrafi " +
                        "współpracować z innymi. Odchodzi od funkcjonowania w świadomości ,ja\" i " +
                        "wchodzi w świadomość my\". Posiada doskonały umysł typu wykonawczego. " +
                        "Lubi podróżować i poszerzać horyzonty. To dyplomata z krwi i kości. Waga 2 " +
                        "natury jest przyjazna, ekstrawertyczna, sprawiedliwa i zainteresowana " +
                        "życiem. Istnieje w niej silne poczucie sprawiedliwości i chęć czynienia dobra. " +
                        "Ma wyrafinowany wygląd i smak. Lubi otaczać się przedmiotami, które są " +
                        "miłe dla oka oraz przebywać w pięknych i spokojnych miejscach. " +
                        "Uśmiechem potrafi stopić serca ludzi. Najszczęśliwsza jest w pracy, w której " +
                        "obowiązują zasady partnerstwa i panuje przyjemna atmosfera. Docenia " +
                        "sztukę, nawet jeśli nie jest w niej utalentowana. Odznacza się naturalnym " +
                        "urokiem, intuicją i umiejętnościami społecznymi. Zazwyczaj jest spokojna, w " +
                        "miłości czuła i lojalna. Przebudzona może nie być zainteresowana " +
                        "małżeństwem, gdyż na tym etapie Waga „poślubiła samą siebie”.",
                        pdfCreator.AlegreyaSans18));

                jeden7 = new Paragraph(new Phrase(20,"Ponieważ uważa, że prawie niemożliwe jest zachowanie emocjonalnej stabilności " +
                        "w otoczeniu, w którym panuje dysharmonia, często zadowala się spokojem za " +
                        "wszelką cenę\". Może być niezdecydowana, zależna, leniwa, nieszczera i " +
                        "pobłażliwa. Ze względu na skłonność do bycia, zakochanym w miłości\", może " +
                        "śpieszyć się do małżeństwa, które ostatecznie przeradza się w trudny związek. " +
                        "Istnieje tendencja do odkładania spraw na później oraz martwienia się o sprawy " +
                        "zdrowotne. Dla świętego spokoju\" pozwala nierzadko drugiej osobie zdominować " +
                        "ją do punktu, w którym żyje jej życiem - może przez to stracić poczucie " +
                        "indywidualności i własnej wartości. Z drugiej strony jest w stanie świadomie " +
                        "zmienić energię relacji - równie łatwo przychodzi jej bycie ciepłą i łagodną, jak też " +
                        "obojętną i odległą Przechodzi przez życie,,,ważąc osoby na wadze\". Ponieważ we " +
                        "współmałżonku szuka idealnego partnera (bratniej duszy), może go osądzać, " +
                        "wierząc, że ,,trawa jest bardziej zielona gdzie indziej\". W swoich wysiłkach, aby " +
                        "odnieść zwycięstwo w relacji, może uciekać się do manipulacji.",
                        pdfCreator.AlegreyaSans18));

                jeden8 = new Paragraph(new Phrase(20,"Ascendentalna Waga na poziomie ziemskim widzi świat potencjalnych relacji i to " +
                        "one mają główne znaczenie dla rozwoju jej duszy. Jako że władcą znaku jest " +
                        "Wenus, muzyka i sztuka odgrywają również ważną rolę w jej życiu i twórczości. " +
                        "Ewoluuje od materializmu do głębszego zrozumienia sensu życia, dlatego " +
                        "poszukuje wiedzy w astrologii, numerologii, interesuje się zagadnieniami " +
                        "związanymi z obcy- mi cywilizacjami, podróżami astralnymi itp. W czasach kryzysu " +
                        "potrafi zachować spokój. Ceni sobie wypoczynek, poświęcając czas na " +
                        "kontemplację piękna przyrody i rozważanie problemów podczas relaksu. " +
                        "Narodziny ascendentalnej Wagi są dość harmonijne, poród zwykle przebiega " +
                        "łatwo, a matka jest spokojna i współpracująca. Przychodząc na świat w tak " +
                        "pokojowych warunkach, dziecko samo staje się symbolem pokoju i miłości w " +
                        "swoim środowisku. Od pierwszych dni jest traktowane w sposób, który sprawia, że " +
                        "czuje, że uszczęśliwia innych ludzi. Nawet jeśli wcześniej były jakieś zakłócenia " +
                        "pomiędzy rodzicami, pojawienie się dziecka Wagi balansuje wszelkie nie " +
                        "harmonijne aspekty. Jako niemowlę raczej nie płacze, by nie przysparzać rodzicom " +
                        "trosk ani nie budzić niepotrzebnego niepokoju. Tak uwarunkowane od pierwszych " +
                        "dni, kroczy przez życie pokojowo nastawione do świata i ludzi. Jej życie " +
                        "zawodowe, jak i osobiste musi być zrównoważone. Jest wrażliwa na opinie innych " +
                        "osób, na atmosferę towarzyską, społeczną, artystyczną i na aktualne trendy. " +
                        "Instynktownie chce zadowolić innych. Może być kreatywna, ale zazwyczaj " +
                        "najbardziej produktywna jest w partnerstwie lub w grupie, z którą pracuje, gdyż " +
                        "polega na inspiracji i zaufaniu, którym się ją darzy. Nieustannie myśli, rozważa " +
                        "wszystkie opcje, więcej analizuje niż podejmuje działań. Jest sprawiedliwa, w " +
                        "związku z tym nie przedkłada jednej osoby nad inną, nie czyni sobie faworytów " +
                        "wśród członków rodziny, znajomych czy partnerów w środowisku zawodowym. " +
                        "Chociaż pragnie prowadzić życie zrównoważone, to jednak przyciąga osoby i " +
                        "sytuacje, które tę równowagę zakłócają. Jest to lekcją Wagi, dzięki której może " +
                        "wykorzystać dar dyplomacji, wyprowadzić sprawy z chaosu i przywrócić zdrowy " +
                        "balans.",
                        pdfCreator.AlegreyaSans18));

                jeden9 = new Paragraph(new Phrase(20,"SYSTEMY CIAŁA ZARZĄDZANE PRZEZ ZNAK WAGĘ:",
                        pdfCreator.AlegreyaSans18Bold));

                dwa0 = new Paragraph(new Phrase(20,"nerki, które równoważą płyny i elektrolity (pompa sodowo-potasowa)\n" +
                        "dolna część pleców\n" +
                        "układ moczowo-płciowy hormony (np. estrogen)\n" +
                        "układ endokrynologiczny\n" +
                        "jajniki\n" +
                        "naczynia krwionośne\n" +
                        "równowaga kwasowo-zasadowa\n" +
                        "systemy destylacji i filtracji ciała\n" +
                        "postawa i kręgosłup lędźwiowy\n" +
                        "włosy, skóra i wszystkie estetyczne części ciała\n" +
                        "układ moczowo-płciowy, przez który człowiek podłącza się do swojego partnera",
                        pdfCreator.AlegreyaSans18));

                dwa1 = new Paragraph(new Phrase(20,"OŚ WAGA/BARAN",
                        pdfCreator.AlegreyaSans18Bold));

                dwa4 = new Paragraph(new Phrase(20,"bóle głowy i migreny\n" +
                        "wyczerpanie nadnerczy\n" +
                        "obciążenie oczu\n" +
                        "zaburzenia równowagi kwasowo-zasadowej\n" +
                        "zaburzenia pracy nerek\n" +
                        "kamienie nerkowe, kolka nerkowa i potrzeba dializowania\n" +
                        "cukrzyca i uzależnienie od cukru\n" +
                        "zakażenia dróg moczowych i zaburzenia równowagi układu moczowego, w tym\n" +
                        "bezmocz, ropnie i wrzody zapalenie moczowodów\n" +
                        "choroba Brighta\n" +
                        "dolegliwości skórne (np. egzema, AZS, łuszczyca)\n" +
                        "ból w dolnej części pleców\n" +
                        "żylaki i hemoroidy\n" +
                        "zaburzenia równowagi hormonalnej, w tym brak lub nadmiar estrogenów\n" +
                        "zakażenia przenoszone drogą płciową, zwłaszcza miejscowe zaburzenia jakości\n" +
                        "krwi\n" +
                        "przewlekła, wrodzona astma\n" +
                        "osłabienie układu oddechowego\n" +
                        "dolegliwości stawów (m.in. podagra)\n" +
                        "obrzęk i przyrost masy ciała, trudności w utracie wagi ogólne osłabienie i\n" +
                        "chroniczne zmęczenie\n" +
                        "napięcia w relacjach partnerskich\n" +
                        "konflikty z rodzicami\n" +
                        "zaburzenia równowagi energii męskiej i żeńskiej",
                        pdfCreator.AlegreyaSans18));

                dwa5 = new Paragraph(new Phrase(20,"ZDROWIE I DOBRE SAMOPOCZUCIE WAGI",
                        pdfCreator.AlegreyaSans18Bold));

                dwa6 = new Paragraph(new Phrase(20,"Konieczne jest osiągnięcie równowagi pomiędzy: WAGA/BARAN",
                        pdfCreator.AlegreyaSans18));

                dwa7 = new Paragraph(new Phrase(20,"Zależnością a niezależnością, Zamiłowaniem do spokoju za wszelką cenę a " +
                        "stawianiem na swoim, Zamiłowaniem do towarzystwa a poszukiwaniem " +
                        "tożsamości, Umiejętnością współpracy a umiejętnością rywalizacji",
                        pdfCreator.AlegreyaSans18));

                dwa8 = new Paragraph(new Phrase(20,"Podejście do konfliktów: Nieprzebudzona Waga przejawia tendencje do " +
                        "manipulowania drugą osobą, stosując wysublimowane techniki, np. " +
                        "uprzejmości. Druga osoba ma wówczas odczytać, że jakoby po jej stronie " +
                        "leży wina w danej sytuacji. Bo przecież jak można gniewać się na miłą " +
                        "Wagę? Jednak stara się wygrać konfrontację w sposób, który jedynie wydaje " +
                        "się pełen wdzięku. W rzeczywistości uczy się być szczerą wobec siebie i " +
                        "innych oraz sztuki kompromisu. Waga dąży do podejmowania decyzji " +
                        "poprzez partnerstwo z innymi, ale jeśli ta współpraca jest nieharmonijna, to " +
                        "cierpi na tym jej zdrowie. Nerki są najbardziej wrażliwym punktem w ciele " +
                        "fizycznym. Długotrwałe zaburzenia emocjonalne nakładają dodatkowe " +
                        "obciążenie na pracę nerek w postaci toksyn generowanych przez bodźce " +
                        "psychosomatyczne. Są one także rezerwuarem energii urodzeniowej i " +
                        "przechowują zasób naszych sił witalnych otrzymanych od rodzi ców. Na ich " +
                        "stan wpływają zatem w szczególności relacje z rodzicami, a w dalszej " +
                        "kolejności z rodzeństwem i partnerami. Lewa nerka przechowuje w sobie " +
                        "energie żeńską, z kolei prawa męską. Jeśli występuje zaburzenie pracy " +
                        "którejś z nich, osłabiona zostaje jej funkcja filtracyjna limfy i krwi i ubolewa " +
                        "na tym całe ciało (zwy- kle korespondująca z nią stroną). Uwalnianiem energii " +
                        "z nerek sterują nadnercza, a unia przeciwstawnych biegunów esencji witalnej " +
                        "zachodzi w punkcie centralnym, znajdującym się pomiędzy nerkami - w tzw. " +
                        "bramie Ming Men. i Nieodłącznym pragnieniem Wagi jest zgoda. " +
                        "Niepewność i dysharmonia mogą powodować narastanie presji " +
                        "emocjonalnej, która negatywnie wpłynie na funkcjonowanie nerek i pęcherza " +
                        "moczowego.",
                        pdfCreator.AlegreyaSans18));

                dwa9 = new Paragraph(new Phrase(20,"Żywioł POWIETRZA jest tutaj paliwem potrzebnym do prawdziwego " +
                        "odczuwania życia. Jest źródłem witalności i siły, dlatego Waga najbardziej " +
                        "energetyzuje się poprzez: regularną współpracę z ludźmi z żywiołem " +
                        "powietrza, tj. Bliźniętami i Wodnikiem, czerpanie mocy z rozrzedzonego i " +
                        "wysoce elektrycznego (zjonizowanego) powietrza gór. Najbardziej korzystne " +
                        "dla Wagi są wakacje w górach, jako że znajduje się wtedy w spokojnym, " +
                        "pięknym i rewitalizującym otoczeniu, związki z ludźmi o podobnym umyśle, " +
                        "zaangażowanie towarzyskie; rozrywkę, pracę i relacje, które pozwalają na " +
                        "intelektualną wolność, stymulację i ekspresję pomysłów.",
                        pdfCreator.AlegreyaSans18));

                trzy1 = new Paragraph(new Phrase(20,"akupunktura " +
                        "subtelne terapie energetyczne równoważące organizm " +
                        "dźwiękoterapia z użyciem instrumentów naturalnych i uzdrawiające wibracje " +
                        "ulubionej muzyki " +
                        "okłady z oleju rycynowego na nerki " +
                        "zabiegi upiększające i kosmetyczne masaże " +
                        "aromaterapia " +
                        "smaczne, prozdrowotne przysmaki " +
                        "przebywanie w uzdrowiskach " +
                        "całkowity odpoczynek i relaks w spokojnym, przyjemnym otoczeniu, w " +
                        "towarzystwie sympatycznych przyjaciół " +
                        "obcowanie z pięknem kwiatów, wspaniałymi dziełami sztuki, prowadzenie " +
                        "spokojnych rozmów z osobami o duchowej lub artystycznej naturze.",
                        pdfCreator.AlegreyaSans18));

                trzy3 = new Paragraph(new Phrase(20,"Zioła wiodące dla Wagi:",
                        pdfCreator.AlegreyaSans18Bold));

                trzy4 = new Paragraph(new Phrase(20,"damiana, fiotek trójbarwny, róża, buk, jaśmin, dzięgiel litwor / anielskie ziele, " +
                        "macierzanka tymianek, krwawnik pospolity, męczennica cielista, aspalat prosty / " +
                        "czerwonokrzew.",
                        pdfCreator.AlegreyaSans18));

                trzy5 = new Paragraph(new Phrase(20,"Remedia ziołowe dla Wagi:",
                        pdfCreator.AlegreyaSans18Bold));

                trzy6 = new Paragraph(new Phrase(20,"pokrzywa, nawłoć, łopian większy, dziewanna, pluskwica groniasta, berberys, " +
                        "witania ospała / indyjski żeń-szeń, żurawina wielkoowocowa, gorzknik kanadyjski.",
                        pdfCreator.AlegreyaSans18));

                trzy7 = new Paragraph(new Phrase(20,"Esencje z kwiatów i minerałów:",
                        pdfCreator.AlegreyaSans18Bold));

                trzy8 = new Paragraph(new Phrase(20,"centuria, czerwiec jednoroczny, cerato, ostrokrzew, rzepik, cykoria, werbena, " +
                        "wiciokrzew przewiercień, róża; kwarc różowy.",
                        pdfCreator.AlegreyaSans18));

                cztery0 = new Paragraph(new Phrase(20,"Nastroje Wagi wahają się, co symbolizowane jest przez dwie szale. W jednym " +
                        "momencie osoba jest przepełniona optymizmem i szczęśliwa, a przy najmniejszym " +
                        "zaburzeniu psychicznym może popaść w stan pesymizmu i rozpaczy. Dobrze za to " +
                        "jest u niej rozwinięty idealizm. Dlatego, jeśli to możliwe, Waga nigdy nie powinna " +
                        "zniechęcać się w tym, co zrobiła, jeśli wychodziło to z serca, ponieważ porzucając " +
                        "swoje ideały, przechyla się na tę stronę skali, w której popada w najgłębsze " +
                        "rozczarowanie. To często powoduje zły stan zdrowia. Dlatego zadaniem Wagi jest " +
                        "kultywować w sobie równowagę. Waga często w życiu ma tendencję do bycia " +
                        "widzem, obserwatorem, który boi się działania, by nie popełnić błędu. Wierzy " +
                        "również, że niektórzy ludzie czy sytuacje ustawiają się przeciwko niej, więc często " +
                        "nie widzi sensu podejmowania działań ani walki. Chyba że w grę wchodzi relacja " +
                        "uczuciowa. " +
                        "Pełna bezstronność i wiara w obiektywizm mogą powstrzymać wagę od uznania, " +
                        "że droga mądrych relacji jest zbudowana na empatii i skutecznym ustanawianiu " +
                        "granic. Może łatwo złapać się na tym, że nagina swoje zasady przy próbach bycia " +
                        "sprawiedliwą, zapominając przy tym o własnym poczuciu tego, czego chce i kim " +
                        "chce być. Takie rozpraszanie energii i skupianie się na innych może prowadzić do " +
                        "nieuzasadnionej beztroski czy niedbałości, a dalej do niezdecydowania, braku " +
                        "koncentracji i stłumienia uczuć. Próby zadowolenia innych mogą zostać " +
                        "wykorzystane, a autonomia Wagi utracona, jeśli zagrożone jest jej poczucie " +
                        "miłości. Zbyt łatwo Waga wątpi, że zasługuje na to, by być kochaną tak samo, jak " +
                        "ona kocha innych. Kluczowe jest uświadomienie sobie, jak wyglądają zdrowe " +
                        "relacje, oderwanie się od tendencji do współzależności i rozwijanie " +
                        "bezwzględności osądu. Jej pragnienie uczciwości i dyplomacji może następnie " +
                        "przekształcić się w coś znacznie potężniejszego - w wielopłaszczyznową " +
                        "harmonię. Kiedy pojawia się nierównowaga w świecie zewnętrznym, nasze ciało " +
                        "zaczyna ją odzwierciedlać. Wysyła do nas sygnały w postaci problemów z nerkami " +
                        "i nadnerczami, u kobiet z jajnikami, a u mężczyzn z gruczołem prostaty. Tak " +
                        "jak funkcją nerek jest filtracja, tak samo metaforycznie można powiedzieć, że " +
                        "filtrują one wszelkie nieczystości naszej świadomości - postrzeganie siebie w " +
                        "relacji z drugim człowiekiem i przede wszystkim w relacji z sobą samym. Ich praca " +
                        "wskazuje nam na to, czy oszukujemy samych siebie, zwodzimy, łudzimy sic, " +
                        "tworzymy takie rodzaje związków, w których powielamy te same schematy " +
                        "niezrozumienia, zamiast wyciągać wnioski dla rozwoju i obopólnej korzyści. " +
                        "Oszukując samych siebie, oszukujemy naszego partnera, a nasze ciało, nasz " +
                        "wewnętrzny kosmos wskazuje nam nasze lekcje. Tu lekcją jest uczciwość, " +
                        "harmonia ze sobą i z drugim człowiekiem, bycie autentycznym, wiernym wobec " +
                        "własnych ideałów i jasnej wizji rozwoju. Nie o to chodzi, by za wszelką cenę dążyć " +
                        "do harmonii w relacji do otaczającego nas świata. Klucz leży w tym, by tę " +
                        "harmonię przywrócić sobie wewnętrznie, tj. będąc prawdziwym, autentycznym i " +
                        "całkowicie szczerym wobec siebie. Wtedy zgodnie z prawem rezonansu naprawia " +
                        "się nasz świat zewnętrzny. Waga pragnie tworzyć harmonijne relacje, wiedzieć, " +
                        "czego chcą inni ludzie i być traktowana we właściwy sposób. Uzdrowienie " +
                        "następuje z chwilą, gdy Waga zaczyna ożywiać towarzystwo innych ludzi swoim " +
                        "niezależnym punktem widzenia. Intuicyjnie wie, jak wprowadzić zasady harmonii, " +
                        "uczciwości i sprawiedliwości. Czyni to w sposób, który wymaga współpracy i " +
                        "jednocześnie nikogo nie uraza. Istotne jest, by Waga zamiast manipulować ludźmi " +
                        "dla ustanowienia sztucznej harmonii, komunikowała całą prawdę tego, czego " +
                        "doświadcza, a istniejącą harmonię bądź dysharmonię przyjmowała z akceptacją.",
                        pdfCreator.AlegreyaSans18));
                try{
                    document.add(jeden);
                    document.add(space);
                    document.add(dwa);
                    document.add(space);
                    document.add(trzy);
                    document.add(space);
                    document.add(cztery);
                    document.add(space);
                    document.add(piec);
                    document.add(space);
                    document.add(szesc);
                    document.add(space);
                    document.add(siedem);
                    document.add(space);
                    document.add(osiem);
                    document.add(space);
                    document.add(dziewiec);
                    document.add(space);
                    document.add(jeden0);
                    document.add(space);
                    document.add(jeden1);
                    document.add(space);
                    document.add(jeden2);
                    document.add(space);
                    document.add(jeden3);
                    document.add(space);
                    document.add(jeden4);
                    document.add(space);
                    document.add(jeden5);
                    document.add(space);
                    document.add(jeden6);
                    document.add(space);
                    document.add(jeden7);
                    document.add(space);
                    document.add(jeden8);
                    document.add(space);
                    document.add(jeden9);
                    document.add(space);
                    document.add(dwa0);
                    document.add(space);
                    document.add(dwa1);
                    document.add(space);
                    document.add(dwa2);
                    document.add(space);
                    document.add(dwa3);
                    document.add(space);
                    document.add(dwa4);
                    document.add(space);
                    document.add(dwa5);
                    document.add(space);
                    document.add(dwa6);
                    document.add(space);
                    document.add(dwa7);
                    document.add(space);
                    document.add(dwa8);
                    document.add(space);
                    document.add(dwa9);
                    document.add(space);
                    document.add(trzy0);
                    document.add(space);
                    document.add(trzy1);
                    document.add(space);
                    document.add(trzy2);
                    document.add(space);
                    document.add(trzy3);
                    document.add(space);
                    document.add(trzy4);
                    document.add(space);
                    document.add(trzy5);
                    document.add(space);
                    document.add(trzy6);
                    document.add(space);
                    document.add(trzy7);
                    document.add(space);
                    document.add(trzy8);
                    document.add(space);
                    document.add(trzy9);
                    document.add(space);
                    document.add(cztery0);

                } catch (DocumentException ex){
                    ex.printStackTrace();
                }

                break;
            case "Byk":
                document.newPage();

                trzy = new Paragraph(new Phrase(20,"BYK - JA MAM",
                        pdfCreator.AlegreyaSans18Bold));



                piec = new Paragraph(new Phrase(20,"Ustanowienie poczucia prawdziwego sensu i wartości w życiu",
                        pdfCreator.AlegreyaSans18));



                siedem = new Paragraph(new Phrase(20,"Pasywności",
                        pdfCreator.AlegreyaSans18));


                dziewiec = new Paragraph(new Phrase(20,"Nie przywiązywać się do niczego",
                        pdfCreator.AlegreyaSans18));



                jeden1 = new Paragraph(new Phrase(20,"Pragnienie uzyskania praktycznych, przydatnych rezultatów",
                        pdfCreator.AlegreyaSans18));


                jeden3 = new Paragraph(new Phrase(20,"Lojalność\n" +
                        "Umiejętność zajęcia się sprawami jedna po drugiej Poczucie własnej wartości"+
                        "Cierpliwość\n" +
                        "Szacunek do własnych i cudzych potrzeb Wdzięczność\n" +
                        "Umiejętność wybaczenia\n" +
                        "Wytrwałość",
                        pdfCreator.AlegreyaSans18));

                jeden5 = new Paragraph(new Phrase(20,"Byka charakteryzuje silny fizyczny magnetyzm, który przyciąga partnera i " +
                        "bogactwo materialne. Ma on wiele artystycznych/muzycznych zdolności, które " +
                        "dobrze jest wspierać w dzieciństwie, gdyż w przeciwnym razie w późniejszym " +
                        "wieku mogą pojawiać się trudności z ich wyrażaniem. Byk koncentruje się na " +
                        "wygodzie, bezpieczeństwie, harmonii i pięknie. Daje poczucie bezpieczeństwa. W " +
                        "czasach kryzysu potrafi pocieszyć; chętnie udziela wówczas praktycznych, " +
                        "realistycznych i rzeczowych rad. Jest niezłomny, niezawodny i lojalny. Potrafi " +
                        "obdarzyć drugiego człowieka współczuciem. Często posiada talent do śpiewania i/ " +
                        "lub muzyki instrumentalnej. Może być bardzo intuicyjny. Buduje i tworzy przy " +
                        "użyciu narzędzi. Jest obdarzony wytrzymałością fizyczną. Jako priorytet obiera " +
                        "zapewnienie bytu swojej rodzinie i ten przedkłada nad rozwój osobisty.",
                        pdfCreator.AlegreyaSans18));

                jeden7 = new Paragraph(new Phrase(20,"Niełatwo przychodzi mu pozbywanie się dóbr osobistych oraz godzenie się z " +
                        "czyimś odejściem. Jego motto brzmi:,,Mam, więc jestem\". W związkach przejawia " +
                        "tendencję do posiadania, zawłaszczania drugiej osoby i w ten sam sposób też " +
                        "bycia przez nią posiadanym. Jest to częściowo spowodowane jego pasywnością i " +
                        "tendencją do bycia zależnym w relacjach. Nie lubi być poganiany i potrzebuje " +
                        "czasu na przyswojenie nowych idei. Może być uparty, zazdrosny, ekstrawagancki i " +
                        "zaborczy - wszystko to dyktowane jest strachem przed utratą czegoś lub kogoś. " +
                        "Upartość sprawia, że obojętnie, ile debat by z nim nie stoczyć, nie doprowadzi się " +
                        "go do zmiany zdania. Nie jest też łatwo wyprowadzić Byka z równowagi. Istnieje w " +
                        "nim tendencja do gromadzenia dóbr, tycia i pesymizmu - widzi szklankę do połowy " +
                        "pustą. Skłonność do gromadzenia przejawia się też w emocjach. Gniew narasta w " +
                        "nim bardzo długo, lecz kiedy w końcu wybucha, jego siła jest zdumiewająca: " +
                        "potrafi wówczas nawet rzucać przedmiotami, a sama złość gotuje się w nim " +
                        "jeszcze długi czas. Byk najczęściej komunikuje niezadowolenie pośrednio i biernie. " +
                        "Dopóki żywi urazę, tłumi własny twórczy rozwój.",
                        pdfCreator.AlegreyaSans18));

                jeden8 = new Paragraph(new Phrase(20,"Ascendentalny Byk na planie ziemskim widzi świat, który musi posiąść, a ziemię " +
                        "uczynić sobie poddaną. Jest on w stanie dostrzegać piękno we wszystkich " +
                        "rzeczach. Celem jest pomaganie innym w oglądaniu piękna i harmonii w naturze " +
                        "poprzez mowę, pieśń, obraz i inne artystyczne kreacje. Z ascendentem w Byku " +
                        "rodzi się wielu artystów i muzyków, gdyż osoby te są dostrojone do koloru, " +
                        "dźwięku i formy. Jego władcą jest Wenus, która reprezentuje miłość, luksus i " +
                        "wszystko co miłe. W życiu Byka oczywiście pojawiają się wyzwania i przeszkody " +
                        "do pokona- nia, ale ogólny ton jego życia jest przyjemny. Ascendentalny Byk " +
                        "bardzo często ma łatwe narodziny. Prawdopodobnie w związku z jego " +
                        "narodzinami, rodzicom towarzyszyło dużo zdrowego rozsądku. Narodziny " +
                        "noworodka zaplanowane są na określoną datę, dziecko jest cierpliwie " +
                        "wyczekiwane i powite w ustalonym terminie, bez robienia wielkiego szumu wokół " +
                        "narodzin. Tak więc od samego początku sposób, w jaki Byk przenika otoczenie, " +
                        "jest harmonijny, cierpliwy i rozsądny. Rodzice takiego dziecka doceniają fakt, że " +
                        "rodzi ono się w ich rodzinie i okazują mu to. Bardzo rzadko zdarza się, żeby w jakiś " +
                        "sposób czuło się niechciane lub niekochane. I choć takie przypadki istnieją, to " +
                        "jednak mając Wenus za swojego patrona, naprawdę można mówić o byciu " +
                        "wybrańcem - reprezentantem miłości danej i otrzymanej. Dorosły Byk nie lubi, gdy " +
                        "dochodzi do zmiany podjętej raz decyzji. Woli być dokładny, a nie szybki. Jego " +
                        "duchowość nie zawiera się w rozważaniach nad znaczeniem życia, a wyrażana jest " +
                        "w bardzo praktyczny sposób. Robi to, co lubi, chce cieszyć się tym, co robi, i " +
                        "docenia to, co ma. Jego zadaniem jest cierpliwie pielęgnować talenty własne i " +
                        "cudze oraz nadać materialną formę wszelkim pomysłom i twórczym impulsom. " +
                        "Raczej nie pójdzie w zaparte po to, co chce osiągnąć. Zamiast tego przyciągnie to, " +
                        "czego potrzebuje, lub poczeka, aż samo przyjdzie we właściwym czasie. " +
                        "I to jest kluczem do spełnienia jego przeznaczenia.",
                        pdfCreator.AlegreyaSans18));

                jeden9 = new Paragraph(new Phrase(20,"SYSTEMY CIAŁA ZARZĄDZANE PRZEZ ZNAK BYKA:",
                        pdfCreator.AlegreyaSans18Bold));


                break;


        }

    }
}



/*

 */
