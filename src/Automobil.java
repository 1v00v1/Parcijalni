public class Automobil extends Vozilo{
    int brVrata;

    public Automobil(String marka, String regBr, int godProizvodnje, int brVrata) {
        super(marka, regBr, godProizvodnje);
        this.brVrata = brVrata;
    }

    @Override
    String prikažiPodatke() {
        return super.prikažiPodatke()+"\nBroj vrata "+brVrata;
    }
}
