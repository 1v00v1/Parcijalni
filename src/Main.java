import java.io.IOException;
import java.util.List;
//C:\Users\goran\Documents\Java-Algebra\modul-1\Parcijalni\test.txt
public class Main {
    public static void main(String[] args) throws IOException {

EvidencijaVozila evidencijaVozila = new EvidencijaVozila();
evidencijaVozila.dodajVozilo(new Automobil("as","asdsa",2222,4));
evidencijaVozila.dodajVozilo(new Automobil("aasdadsadsas","12312",2222,44));
evidencijaVozila.ucitajPodatkeIzDatoteke("C:\\Users\\goran\\Documents\\Java-Algebra\\modul-1\\Parcijalni\\test.txt");

    }

}