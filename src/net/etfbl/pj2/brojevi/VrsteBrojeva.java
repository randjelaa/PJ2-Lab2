package net.etfbl.pj2.brojevi;

/** Klasa za rad sa brojevima
 * @author Andjela R.
 * @version 1.0
 */
public class VrsteBrojeva {
    int intervalOd;
    int intervalDo;

    public VrsteBrojeva() {
        intervalOd=1;
        intervalDo=100;
    }

    public VrsteBrojeva(int iod, int ido) {
        intervalOd=iod;
        intervalDo=ido;
    }

    /** Metoda za pronalazenje i ispis prostih brojeva na zadatom intervalu */
    public void prostBroj() {
        for (int i=intervalOd; i<intervalDo; i++) {
            boolean flag=true;
            for (int j=2; j<i; j++) {
                if (i%j==0) flag=false;
            }
            if (flag==true && i!=1) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    /** Metoda za racunanje i ispis faktorijela brojeva koji pripadaju zadatom intervalu */
    public void faktorijel() {
        for (int i=intervalOd; i<intervalDo; i++) {
            long res=1;
            for (int j=1; j<=i; j++) {
                res*=j;
            }
            System.out.print(res + "  ");
        }
        System.out.println();
    }

    /** Metoda za pronalazenje i ispis savrsenih brojeva na zadatom intervalu */
    public void savrsenBroj() {
        for (int i=intervalOd; i<intervalDo; i++) {
            int sum=0;
            for (int j=1; j<=i/2; j++) {
                if (i%j==0) {
                    sum+=j;
                }
            }
            if (sum==i) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    /** Metoda za pronalazenje i ispis Armstrongovih brojeva na zadatom intervalu */
    public void armstrongovBroj() {
        for (int i=intervalOd; i<intervalDo; i++) {
            int pom=i;
            int sum=0;
            while (pom!=0) {
                int cif=pom%10;
                sum+=cif*cif*cif;
                pom/=10;
            }
            if (sum==i) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    //public static void main(String[] args) {
        //VrsteBrojeva a = new VrsteBrojeva(1, 380);
        //a.prostBroj();
        //a.faktorijel();
        //a.savrsenBroj();
        //a.armstrongovBroj();
    //}
}
