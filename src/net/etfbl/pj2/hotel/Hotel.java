package net.etfbl.pj2.hotel;

/** Klasa za rad sa hotelima
 * @author Andjela R.
 * @version 1.0
 */
public class Hotel {
    //ovi atributi treba da budu privatni i da se napisu geteri i seteri
    public Soba niz[];
    public String naziv, adresa;

    public Hotel(String naziv, String adresa) {
        this.naziv=naziv;
        this.adresa=adresa;

        int k=0;
        niz = new Soba[20];
        for (int i=0; i<4; i++) {
            for (int j=0; j<5; j++) {
                niz[k] = new Soba();
                niz[k].setBrsprata(i);
                niz[k].setBrsobe(j);
                k++;
            }
        }
    }

    /** Metoda koja racuna i vraca broj slobodnih soba na zadatom spratu
     * @param brsprata broj sprata cije slobodne sobe racunamo
     * @return broj slobodnih soba
     */
    public int brSlobodnih(int brsprata) {
        int counter=0;
        for (int i=0; i<20; i++) {
            if (niz[i].getBrsprata()==brsprata) {
                if (niz[i].getZauzeta()==false) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /** Metoda za rezervaciju sobe
     * @param brsprata broj sprata na kojem se nalazi soba
     * @param brsobe broj sobe koju rezervisemo
     * @return potvrda o rezervaciji
     */
    public boolean rezervacija(int brsprata, int brsobe) {
        for (int i=0; i<20; i++) {
            if (niz[i].getBrsprata()==brsprata && 
                niz[i].getBrsobe()==brsobe && 
                niz[i].getZauzeta()==false) {
                niz[i].setZauzeta(true);
                return true;
            }
        }
        return false;
    }
}
