public class Motocikl extends Vozilo{
    private String tipMotora;

    public Motocikl(String marka, String regBr, int godProizvodnje, String svojstvoMotora) {
        super(marka, regBr, godProizvodnje);
        this.tipMotora = svojstvoMotora;
    }

    @Override
    void prikažiPodatke() {
        super.prikažiPodatke();
        System.out.printf("\nTip motora: %s",this.tipMotora);
    }
}
