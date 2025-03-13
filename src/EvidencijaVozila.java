import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// C:\Users\goran\Documents\Java-Algebra\modul-1\Parcijalni\test.txt
public class EvidencijaVozila {
    private List<Vozilo> evidencijaVozila = new ArrayList<>();

    public EvidencijaVozila() {
    }

    public List<Vozilo> getEvidencijaVozila() {
        return evidencijaVozila;
    }

    void dodajVozilo(Vozilo v) {
        this.evidencijaVozila.add(v);
    }
void ucitajPodatkeIzDatoteke(String datoteka){
      try(FileInputStream fis = new FileInputStream(datoteka);ObjectInputStream ois = new ObjectInputStream(fis)) {
          System.out.println( ois.readObject());

      } catch (IOException e) {
          throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
          throw new RuntimeException(e);
      }

}

    void spremiPodatkeUDatoteku(String datoteka) {
        try{
           FileOutputStream fos = new FileOutputStream(datoteka);
           ObjectOutputStream oos = new ObjectOutputStream(fos);
          for (Vozilo v : evidencijaVozila){
              oos.writeObject(v.prikažiPodatke());
          }
          oos.close();
          fos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
