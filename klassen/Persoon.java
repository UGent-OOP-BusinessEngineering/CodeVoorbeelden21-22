// https://dodona.ugent.be/nl/courses/770/series/8631/activities/765664865

import java.time.LocalDate;

public class Persoon {
    private String naam;
    private String voornaam;
    private String woonplaats;
    private LocalDate geboorteDatum;

    public Persoon(String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte ) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.woonplaats = woonplaats;
        this.geboorteDatum = LocalDate.of(jaarGeboorte, maandGeboorte, dagGeboorte);
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public boolean isOuderDan(Persoon otherPersoon){
        return true;
    }

    public boolean isJongerDan(Persoon otherPersoonb){
        return true;
    }

    public boolean wonenInZelfdeStad(Persoon otherPersoon){
        return true;
    }

}
