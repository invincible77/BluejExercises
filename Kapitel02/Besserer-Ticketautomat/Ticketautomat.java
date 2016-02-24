/**
 * Die Klasse Ticketautomat modelliert einfache Ticketautomaten,
 * die Tickets zu einem Einheitspreis herausgeben.
 * Der Preis f�r die Tickets eines Automaten kann �ber den Konstruktor
 * festgelegt werden.
 * Ticketautomaten dieser Klasse pr�fen, ob sinnvolle Geldbetr�ge
 * eingeworfen werden, und drucken ein Ticket nur dann, wenn
 * ausreichend Geld eingeworfen wurde.
 *
 * @author David J. Barnes und Michael K�lling
 * @version 31.07.2011
 */
public class Ticketautomat
{
    // Der Preis eines Tickets dieses Automaten.
    private int preis;
    // Der Betrag, der bisher vom Automatenbenutzer eingeworfen wurde.
    private int bisherGezahlt;
    // Die Geldsumme, die bisher von diesem Automaten eingenommen wurde.
    private int gesamtsumme;

    /**
     * Erzeuge einen Automaten, der Tickets zum angegebenen Preis
     * (in Cent) ausgibt.
     */
    public Ticketautomat(int ticketpreis)
    {
        preis = ticketpreis;
        bisherGezahlt = 0;
        gesamtsumme = 0;
    }

    /**
     * Liefere den Preis eines Tickets dieses Automaten (in Cent).
     */
    public int gibPreis()
    {
        return preis;
    }

    /**
     * Liefere die H�he des Betrags, der f�r das n�chste Ticket bereits
     * eingeworfen wurde.
     */
    public int gibBisherGezahltenBetrag()
    {
        return bisherGezahlt;
    }

    /**
     * Nimm den angegebenen Betrag (in Cent) als Anzahlung f�r das 
     * n�chste Ticket. Pr�fe, ob der Betrag sinnvoll ist.
     */
    public void geldEinwerfen(int betrag)
    {
        if (betrag <= 0) {
            System.out.println("Bitte nur positive Betr�ge verwenden: "
                + betrag);
        }
        else 
        {
            this.bisherGezahlt += betrag;

        }
    }

    /**
     * Drucke ein Ticket, wenn gen�gend Geld eingeworfen wurde, und 
     * ziehe den Ticketpreis vom bisher gezahlten Betrag ab. Gib eine 
     * Fehlermeldung aus, falls noch Geld f�r ein Ticket fehlt.
     */
    public void ticketDrucken()
    {
        int nochZuZahlen =  preis - bisherGezahlt;
        
        if (nochZuZahlen <= 0) {
            
            // Den Ausdruck eines Tickets simulieren.
            System.out.println("##################");
            System.out.println("# Die BlueJ-Linie");
            System.out.println("# Ticket");
            System.out.println("# " + preis + " Cent.");
            System.out.println("##################");
            System.out.println();

            // Die Gesamtsumme um den Ticketpreis erh�hen.
            gesamtsumme = gesamtsumme + preis;
            // Den Preis von der bisherigen Bezahlung abziehen.
            bisherGezahlt = bisherGezahlt - preis;
            return;
        }

        System.out.println("Sie m�ssen noch mindestens " +
            (nochZuZahlen) +
            " Cent einwerfen.");

    }

    /**
     * Gib das Wechselgeld bzw. den bisher gezahlten Betrag zur�ck.
     * Setze den bisher gezahlten Betrag zur�ck auf 0.
     */
    public int wechselgeldAuszahlen()
    {
        int wechselgeld;
        wechselgeld = bisherGezahlt;
        bisherGezahlt = 0;
    
        
//         double anzahl = 5.0;
//         double gesamt = 1000.0;
//         double rabatt = 0.05;
//         double preis = 1000.0;
//         
//         double ersparnis = preis * rabatt;
//         double durchschnitt = gesamt / anzahl;
//         
        return wechselgeld;
    }
    
    public int entleeren()
    {
        int temp = gesamtsumme;
        gesamtsumme = 0;
        return temp;
        
    }
}
