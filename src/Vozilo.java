public  class Vozilo {
  private  String regBr;
  private String marka;
  private int godProizvodnje;

  public Vozilo(String marka, String regBr, int godProizvodnje) {
    this.marka = marka;
    this.regBr = regBr;
    this.godProizvodnje = godProizvodnje;
  }

  public Vozilo() {

  }

  public int getGodProizvodnje() {
    return godProizvodnje;
  }

  public String getMarka() {
    return marka;
  }

  public String getRegBr() {
    return regBr;
  }

  @Override
  public String toString() {
    return "Vozilo{" +
            "godProizvodnje=" + godProizvodnje +
            ", regBr='" + regBr + '\'' +
            ", marka='" + marka + '\'' +
            '}';
  }

  void učitajPodatke(){}
  void prikažiPodatke(){
    System.out.println("Vozilo "+marka +"\nRegistarskih Oznaka "+ regBr +"\nGodina Proizvodnje :"+ godProizvodnje);
  }

}
