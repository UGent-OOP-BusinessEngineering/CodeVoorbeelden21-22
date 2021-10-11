import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println ("Geef twee gehele getallen in");
        System.out.println ("gescheiden door één of meerdere spaties");
        int n1, n2;
        n1 = in.nextInt();
        n2 = in.nextInt();

        System.out.println ("Je gaf de volgende getallen in: " + n1 + " en " + n2);
        System.out.println ("Geef nu twee kommagetallen in.");
        double d1, d2;

        d1 = in.nextDouble();
        d2 = in.nextDouble();

        System.out.println ("Je gaf de volgende getallen in:  " + d1 + " en " + d2);
        System.out.println ("Geef nu twee woorden in");
        String s1, s2;

        s1 = in.next();
        s2 = in.next();

        System.out.println ("Je gaf de volgende woorden in: " + "\"" + s1 + "\" en \"" + s2 + "\"");


        System.out.println ("Geef nu een lijn tekst in");
        String s3 = in.nextLine();

        System.out.println ("Je gaf de volgende tekst in: \"" + s3 + "\"");
    }
}
