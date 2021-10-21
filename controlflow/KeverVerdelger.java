import java.util.Scanner;

public class KeverVerdelger {
    public static final double GROWTH_RATE = 0.95; //95% per week
    public static final double ONE_BUG_VOLUME = 0.002; //cubic feet
    // constant door static final
    /**
     * @param args the command line arguments
     */
    public static void main (String [] args){
        System.out.println ("Geef volume huis in m3");
        Scanner keyboard = new Scanner (System.in);
        double houseVolume = keyboard.nextDouble ();
        System.out.println ("\nSchat aantal kevers");
        System.out.print ("in huis: ");

        int startPopulation = keyboard.nextInt (); // hier begint algoritme

        int countWeeks = 0; // belangrijk dat je deze buiten de while loop declareert & initialiseert zodat je ze onder de while loop ook kan oproepen.
        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOLUME;
        double newBugs, newBugVolume;

        while(totalBugVolume < houseVolume){
            newBugs = population * GROWTH_RATE;
            newBugVolume = newBugs * ONE_BUG_VOLUME;
            population = population + newBugs;
            totalBugVolume = totalBugVolume + newBugVolume;
            countWeeks++;
        }


        System.out.println ("\nBeginnende met een startpopulatie aan kevers van " + startPopulation);
        System.out.println ("en een huis met een volume van " + houseVolume +
                " m3 zal na,");
        System.out.println (countWeeks + " weken,");
        System.out.println ("het huis volledig gevuld zijn met " +
                (int) population + " kevers.");
        System.out.println ("Dit komt overeen met een volume van " +
                (int) totalBugVolume + " m3.");
        System.out.println ("Ik zou toch maar een verdelger bellen");
    }
}
