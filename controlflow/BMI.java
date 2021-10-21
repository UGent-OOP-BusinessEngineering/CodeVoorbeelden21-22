import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double lengte, gewicht, BMI;
        System.out.println("Geef je gewicht in KG.");
        gewicht = keyboard.nextDouble();
        System.out.println("Je lengte in m");
        lengte = keyboard.nextDouble();


        // Compute BMI and output health category
        BMI = gewicht / (lengte * lengte);
        System.out.println("Je BMI is " + BMI);

        System.out.print("Je risico category is  " ); //print dus output komt op 1 lijn
        if(BMI < 18.5)
            System.out.println("Ondergewicht");

        //ondergewicht (<18.5), normaal (< 25), overgewicht (<30), obesitas


    }
}
