package sr.unasat.gids.app;

import sr.unasat.gids.entities.Adres;
import sr.unasat.gids.repositories.AdresRepository;

public class Application {
    public static void main(String[] args) {
//        System.out.println("hello");

        Adres adres = new Adres(1, "Hindilaan");
        AdresRepository adresRepository = new AdresRepository();
        adresRepository.insertOneRecord(adres);
    }
}
