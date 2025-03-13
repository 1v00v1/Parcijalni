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


    void spremiPodatkeUDatoteku(String datoteka) {
        try(FileWriter fw = new FileWriter(datoteka)){
            evidencijaVozila.forEach(vozilo -> {
                try {
                   fw.write(vozilo.prikažiPodatke());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
