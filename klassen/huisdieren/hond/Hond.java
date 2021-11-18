package huisdieren.hond;

import java.util.Scanner;

public class Hond {
    private String naam;
    private String ras;
    private int leeftijd;
    private static int aantalHonden = 0;

    public Hond(){
        aantalHonden++;
    }

    public Hond(String naam, String ras, int leeftijd) {
        this.naam = naam;
        this.ras = ras;
        this.leeftijd = leeftijd;
        aantalHonden++;
    }

    public static int getAantalHonden() {
        return aantalHonden;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }



    public void veranderLeeftijd(int leeftijd){
        leeftijd = this.leeftijd + leeftijd ;
    }


    public String printHond(){
        String result = "Naam:" + naam;
        result += "\nRas:" + ras;
        result += "\nLeeftijd:" + leeftijd;
        result += "\nLeeftijd in mensenjaren " + leeftijdInMensenJaren();
        return result;
    }

    private int leeftijdInMensenJaren(){
        int leeftijdmensen = 0;
        if(leeftijd <= 2)
            leeftijdmensen = leeftijd * 11;
        else
            leeftijdmensen = 22 + ((leeftijd-2) * 5);
        return leeftijdmensen;
    }

    public static void main(String[] args) {
        Hond hond1 = maakHond();
        System.out.println(hond1.printHond());
        //pol.printHond();
        //int nieuweLeeftijd = 5;
        //hond1.veranderLeeftijd(nieuweLeeftijd);
        //System.out.println(nieuweLeeftijd);

        Hond hond2 = maakHond();
        System.out.println(hond2.printHond());

        System.out.println("Aantal honden:" + Hond.getAantalHonden());
        //pol.printHond();

        //System.out.println("Leeftijd billie in mensenjaren: " + billie.leeftijdInMensenJaren());
    }

    public static Hond maakHond(){
        Scanner input = new Scanner(System.in);
        System.out.println("Naam huisdieren.hond.Hond:");
        String naam = input.nextLine();
        System.out.println("Ras hond");
        String ras = input.nextLine();
        System.out.println("Leeftijd?");
        int leeftijd = input.nextInt();
        Hond hond = new Hond(naam, ras, leeftijd);
        return hond;
    }
}
