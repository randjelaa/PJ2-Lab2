package net.etfbl.pj2.test;
import net.etfbl.pj2.hotel.Hotel;


/** Klasa za test hotela
 * @author Andjela R.
 * @version 1.0
 */
public class TestHotel {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Hotel 1", "Adresa 1");

        System.out.println(h1.rezervacija(1, 2));
        System.out.println(h1.rezervacija(2, 2));
        System.out.println(h1.rezervacija(1, 4));
        System.out.println(h1.rezervacija(4, 1));
        System.out.println(h1.rezervacija(1, 2));

        for (int i=0; i<h1.niz.length; i++) {
            System.out.println(h1.niz[i].getBrsprata() + "  " +
                               h1.niz[i].getBrsobe() + "  " +
                               h1.niz[i].getZauzeta());
        }
    }
}
