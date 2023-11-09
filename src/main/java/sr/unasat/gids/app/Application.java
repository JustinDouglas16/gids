package sr.unasat.gids.app;

import sr.unasat.gids.entities.Adres;
import sr.unasat.gids.repositories.AdresRepository;

public class Application {
    public static void main(String[] args) {
        Adres adres = new Adres(2, "Hindilaan");
        AdresRepository adresRepository = new AdresRepository();
        adresRepository.insertOneRecord(adres);
    }
}
