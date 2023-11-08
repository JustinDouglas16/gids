package sr.unasat.gids.entities;

public class Adres {
    private int id;
    private String personAdres;

    public Adres(int id, String personAdres) {
        this.id = id;
        this.personAdres = personAdres;
    }

    public Adres(String personAdres) {
        this.personAdres = personAdres;
    }

    public int getId() {
        return id;
    }

    public String getPersonAdres() {
        return personAdres;
    }
}
