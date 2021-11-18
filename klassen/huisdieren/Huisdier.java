package huisdieren;

/**
 * Dit is een klasse voor het opslaan van huisdieren
 */


public class Huisdier {
    private String naam; // Hier komt de naam van mijn huisdier
    private int leeftijd;
    private double gewicht;

    public Huisdier(String naam, int leeftijd, double gewicht){
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
    }



    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public boolean equals(Huisdier huisdier){
        return naam.equals(huisdier.naam) && leeftijd == huisdier.leeftijd;
    }

    public static void leefijdPlus1(Huisdier huisdier){
        huisdier.setLeeftijd(huisdier.getLeeftijd() + 1);
    }

    public static void plus1(int getal){
        getal = getal + 1;
    }

}
