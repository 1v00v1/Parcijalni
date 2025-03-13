public class Motocikl extends Vozilo{
    private String tipMotora;

    public Motocikl(String marka, String regBr, int godProizvodnje, String tipMotora) {
        super(marka, regBr, godProizvodnje);
        this.tipMotora = tipMotora;
    }

    @Override
    void prikažiPodatke() {
        super.prikažiPodatke();
        System.out.println("Tip Motora"+tipMotora);
    }
}
