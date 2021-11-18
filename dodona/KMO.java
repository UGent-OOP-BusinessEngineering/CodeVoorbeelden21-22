// https://dodona.ugent.be/nl/courses/770/series/8633/activities/851828376
/*
 * Copyright (c) 2019. All rights reserved.
 *
 * @author Frederik Gailly
 */
import java.util.Scanner;

public class KMO {
    enum GrootteCategorie {KO,MO,GO,NP};


    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(System.in)) {
            String antwoord = "";
            do {
                // Read nr of employees
                System.out.println("Aantal werknemers?");
                final String werknemersStr = scanner.nextLine();
                final int werknemers = Integer.parseInt(werknemersStr);

                // Read revenue
                System.out.println("Jaaromzet (in 1.000 euro)?");
                final String jaaromzetStr = scanner.nextLine();
                final double jaarOmzet = Double.parseDouble(jaaromzetStr);

                // Read the balans total
                System.out.println("Jaarlijks balanstotaal (in 1.000 euro)?");
                final String balanstotaalStr = scanner.nextLine();
                final double balansTotaal = Double.parseDouble(balanstotaalStr);

                // Read ownership non-KMO
                System.out.println("Voor hoeveel procent is het bedrijf in handen van niet-KMO onderneming?");
                final int aandeel = Integer.parseInt(scanner.nextLine());

                // KMO or not

                GrootteCategorie grootteCategorie = GrootteCategorie.NP;

                if(werknemers < 50 && (jaarOmzet <= 10000 || balansTotaal <= 10000 ) && aandeel <= 25)
                    grootteCategorie  = GrootteCategorie.KO;
                else if (werknemers < 250 && (jaarOmzet <= 50000 || balansTotaal <= 43000 ) && aandeel <= 25)
                    grootteCategorie = GrootteCategorie.MO;
                else if (werknemers > 250 && (jaarOmzet > 50000 && balansTotaal > 43000 ) && aandeel <= 25)
                    grootteCategorie = GrootteCategorie.GO;

                if(grootteCategorie.equals(GrootteCategorie.KO) || grootteCategorie.equals(GrootteCategorie.MO))
                    System.out.println("Het bedrijf is EEN KMO");
                else
                    System.out.println("Het bedrijf is GEEN KMO");
                // Read the amount of people.
                System.out.println("Wens je nog een bedrijf te analyseren?");
                antwoord = scanner.nextLine();
            }while(antwoord.toLowerCase().equals("ja"));
        }

    }

}

