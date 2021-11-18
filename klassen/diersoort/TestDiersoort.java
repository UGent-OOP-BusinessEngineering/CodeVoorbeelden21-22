package diersoort;
import java.util.Scanner;

public class TestDiersoort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String naam;
        System.out.println("Naam:");
        naam = input.nextLine();
        System.out.println("Populatie:");
        int populatie = input.nextInt();
        System.out.println("Groei:");
        double groei = input.nextDouble();
        Diersoort klingon = new Diersoort(naam, populatie, groei);

        System.out.println("Klingon populatie binnen 10 jaar: " + klingon.getPopulatie(10));
        System.out.println("Klingon populatie binnen 30 jaar: " + klingon.getPopulatie(30));
    }
}
