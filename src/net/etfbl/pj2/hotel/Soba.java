package net.etfbl.pj2.hotel;

/** Klasa za rad sa sobama
 * @author Andjela R.
 * @version 1.0
 */
public class Soba {
    private int brsprata, brsobe, brkreveta;
    private boolean klima, TV, tel, net, zauzeta;
    private String opis;

    public Soba() {
        brsprata=1;
        brkreveta=2;
        klima=false;
        TV=true;
        tel=false;
        net=false;
        zauzeta=false;
    }

    public Soba(int brsprata, int brsobe, int brkreveta, boolean klima,
         boolean TV, boolean tel, boolean net, boolean zauzeta, String opis) {
            this.brsprata=brsprata;
            this.brsobe=brsobe;
            this.brkreveta=brkreveta;
            this.klima=klima;
            this.TV=TV;
            this.tel=tel;
            this.net=net;
            this.zauzeta=zauzeta;
            this.opis=opis;
         }

    public int getBrsprata() {
        return this.brsprata;
    }

    public void setBrsprata(int brsprata) {
        this.brsprata=brsprata;
    }

    public int getBrsobe() {
        return this.brsobe;
    }

    public void setBrsobe(int brsobe) {
        this.brsobe=brsobe;
    }

    public int getBrkreveta() {
        return this.brkreveta;
    }

    public void setBrkreveta(int brkreveta) {
        this.brkreveta=brkreveta;
    }

    public boolean getKlima() {
        return this.klima;
    }

    public void setKlima(boolean klima) {
        this.klima=klima;
    }

    public boolean getTV() {
        return this.TV;
    }

    public void setTV(boolean TV) {
        this.TV=TV;
    }

    public boolean getTel() {
        return this.tel;
    }

    public void setTel(boolean tel) {
        this.tel=tel;
    }

    public boolean getNet() {
        return this.net;
    }

    public void setNet(boolean net) {
        this.net=net;
    }

    public boolean getZauzeta() {
        return this.zauzeta;
    }

    public void setZauzeta(boolean zauzeta) {
        this.zauzeta=zauzeta;
    }

    public String getOpis() {
        return this.opis;
    }

    public void setOpis(String opis) {
        this.opis=opis;
    }
}
