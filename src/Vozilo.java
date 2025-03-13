public  class Vozilo {
  private  String regBr;
  private String marka;
  private int godProizvodnje;

  public Vozilo(String marka, String regBr, int godProizvodnje) {
    this.marka = marka;
    this.regBr = regBr;
    this.godProizvodnje = godProizvodnje;
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

  void učitajPodatke(){}
  void prikažiPodatke(){
    System.out.printf("\nVozilo marke %s\nRegistarskih oznaka: %s\nGodina proizvodnje: %d",
            this.marka,this.regBr,this.godProizvodnje);
  }
}
