import java.io.Serializable;

public  class Vozilo implements Serializable {
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


  void učitajPodatke(){}
  String prikažiPodatke(){
    return "Vozilo "+marka +"\nRegistarskih Oznaka "+ regBr +"\nGodina Proizvodnje :"+ godProizvodnje;
  }

  @Override
  public String toString() {
    return marka+godProizvodnje+regBr;
  }
}
