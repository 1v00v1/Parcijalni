public class Automobil extends Vozilo{
    int brVrata;

    public Automobil(String marka, String regBr, int godProizvodnje, int brVrata) {
        super(marka, regBr, godProizvodnje);
        this.brVrata = brVrata;
    }

    @Override
    void prikažiPodatke() {
        super.prikažiPodatke();
        System.out.println("\nBroj Vrata "+brVrata);
    }


}
