package net.etfbl.pj2.test;
import net.etfbl.pj2.brojevi.VrsteBrojeva;

/** Klasa za test brojeva
 * @author Andjela R.
 * @version 1.0
 */
public class TestBrojevi {
    public static void main(String[] args) {
        VrsteBrojeva vb1 = new VrsteBrojeva();
        VrsteBrojeva vb2 = new VrsteBrojeva(2, 10);

        vb1.prostBroj();
        vb1.faktorijel();
        vb1.savrsenBroj();
        vb1.armstrongovBroj();

        System.out.println();

        vb2.prostBroj();
        vb2.faktorijel();
        vb2.savrsenBroj();
        vb2.armstrongovBroj();
    }
}
