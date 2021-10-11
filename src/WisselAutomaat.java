import java.util.Scanner;

public class WisselAutomaat {

    public static void main(String[] args) {
        System.out.println("Ik vind voor jou de combinatie aan centjes");
        System.out.println("dat overeenkomt met een bepaald bedrag.");
        System.out.println("Geef een bedrag tussen 0 en 100:");
        Scanner keyboard = new Scanner(System.in);
        int bedrag = keyboard.nextInt();
        int oorspBedrag = bedrag;
        int vijftigCentjes = bedrag / 50;
        bedrag = bedrag % 50;
        int twintigCentjes = bedrag / 20;
        bedrag = bedrag % 20;
        int tienCentjes = bedrag /10;
        bedrag = bedrag % 10;
        int vijfCentjes = bedrag /5;
        bedrag = bedrag % 5;
        int tweeCentjes = bedrag / 2;
        bedrag = bedrag % 2;
        int centjes = bedrag;

        System.out.println(oorspBedrag + " centje(s) bestaat uit:");
        System.out.println(vijftigCentjes + " centje(s) van 50 cent");
        System.out.println(twintigCentjes + " centje(s) van 20 cent");
        System.out.println(tienCentjes + " centje(s) van 10 cent");
        System.out.println(vijfCentjes + " centje(s) van 5 cent");
        System.out.println(tweeCentjes + " centje(s) van 2 cent");
        System.out.println(centjes + " centje(s)");
    }
}
