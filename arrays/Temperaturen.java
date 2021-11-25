import java.util.Scanner;

public class Temperaturen {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // 1- Inlezen van temperaturen via Scanner object
        System.out.println ("Hoeveel temperaturen heb je?");
        int size = keyboard.nextInt ();

        double[] temperaturen = new double[size];

        System.out.println ("Geef de waarden van de " + size + " temperaturen:");
        double som = 0;
        for (int index = 0 ; index < temperaturen.length ; index++)
        {
            temperaturen[index] = keyboard.nextDouble();
            som += temperaturen[index];
        }

        // weergeven van het gemiddelde
        System.out.println ("De gemiddelde temperatuur is  " + som/size);

        // weergeven van de temperaturen en hun verhouding tot het gemiddelde
        System.out.println ("De temperaturen zijn: ");
        for (int index = 0 ; index < size ; index++)
        {
            System.out.println("Temp " + index + "= " + temperaturen[index] );
        }

        System.out.println ("Prettige week");
    }

}
