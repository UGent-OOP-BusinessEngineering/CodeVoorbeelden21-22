// https://dodona.ugent.be/nl/courses/770/series/8631/activities/765664865

import java.time.LocalDate;

public abstract class Persoon {
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

    public void writeOutput(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Naam: " + naam + ", Voornaam: " + voornaam + ", woonplaats:" + woonplaats ;
    }

    public boolean equals(Persoon x){
        return this.naam.equals(x.naam) && this.voornaam.equals(x.voornaam)
                && this.geboorteDatum.equals(x.geboorteDatum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoon persoon = (Persoon) o;

        if (naam != null ? !naam.equals(persoon.naam) : persoon.naam != null) return false;
        if (voornaam != null ? !voornaam.equals(persoon.voornaam) : persoon.voornaam != null) return false;
        return geboorteDatum != null ? geboorteDatum.equals(persoon.geboorteDatum) : persoon.geboorteDatum == null;
    }

    @Override
    public int hashCode() {
        int result = naam != null ? naam.hashCode() : 0;
        result = 31 * result + (voornaam != null ? voornaam.hashCode() : 0);
        result = 31 * result + (geboorteDatum != null ? geboorteDatum.hashCode() : 0);
        return result;
    }
}
