package ba.unsa.etf.rpr;

public class Grad {
    private int id;
    private String naziv;
    private int brojStanovnika;
    private Drzava drzava;

    public Grad(){
        id = 0;
        naziv = "";
        brojStanovnika = 0;
        drzava = null;
    }

    public Grad(int id, String naziv, int brojStanovnika){
        this.setId(id);
        this.setNaziv(naziv);
        this.setBrojStanovnika(brojStanovnika);
        drzava = null;
    }

    @Override
    public String toString(){
        return getNaziv() + " (" + getDrzava().getNaziv() + ") - " + getBrojStanovnika() + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }
}