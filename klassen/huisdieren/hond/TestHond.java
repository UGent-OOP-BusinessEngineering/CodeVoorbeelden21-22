package huisdieren.hond;

import huisdieren.hond.Hond;

import java.util.Scanner;

public class TestHond {
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
