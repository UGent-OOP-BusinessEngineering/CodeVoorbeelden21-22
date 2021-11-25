import java.util.Scanner;

public class Verkooprapport {
    private double hoogsteOmzet;
    private double gemiddeldeOmzet;
    private Vertegenwoordiger[] vertegenwoordigers;

    private int aantalVertegenwoordigers;

    public Verkooprapport(int aantalVertegenwoordigers) {
        this.aantalVertegenwoordigers = aantalVertegenwoordigers;
        vertegenwoordigers = new Vertegenwoordiger[aantalVertegenwoordigers];
    }

    public void bepaalHoogsteOmzet(){
        double hoogsteOmzet = 0;
        for(int i =0; i < aantalVertegenwoordigers; i++){
            if(vertegenwoordigers[i].getOmzet() > hoogsteOmzet)
                hoogsteOmzet = vertegenwoordigers[i].getOmzet();
        }
        this.hoogsteOmzet = hoogsteOmzet;
    }

    public void bepaalGemiddeldeOmzet(){
        double som = 0;
        for(int i =0; i < aantalVertegenwoordigers; i++){
            som += vertegenwoordigers[i].getOmzet();
        }
        this.hoogsteOmzet = som / aantalVertegenwoordigers;

    }

    public void toevoegenVertegenwoordiger(String naam, double omzet, int index){
        vertegenwoordigers[index] = new Vertegenwoordiger(naam, omzet);
    }

    public Vertegenwoordiger[] getVertegenwoordigers() {
        return vertegenwoordigers;
    }

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Aantal vertegenwoordigers:");
        int size = keyb.nextInt();
        Verkooprapport verkoop = new Verkooprapport(size);
        for(int i = 0; i < size; i++){
            System.out.println("Naam vertegenwoordiger " + i + ":");
            String naam = keyb.next();
            System.out.println("Omzet vertegenwoordiger " + i + ":");
            double omzet = keyb.nextDouble();
            verkoop.toevoegenVertegenwoordiger(naam, omzet, i);
        }
        verkoop.bepaalGemiddeldeOmzet();
        verkoop.bepaalHoogsteOmzet();

    }
}
