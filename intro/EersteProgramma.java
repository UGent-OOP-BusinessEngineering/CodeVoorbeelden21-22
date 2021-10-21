import java.util.Scanner;

public class EersteProgramma {
    public static void main(String[] args) {
        System.out.println("Hallo iedereen");
        System.out.println("Geef twee getallen lijn per lijn");
        System.out.println("en ik zal ze optellen voor jou");

        Scanner input = new Scanner(System.in);

        int getal1 = input.nextInt();
        int getal2 = input.nextInt();

        int sum = getal1 + getal2;

        System.out.println("Het resultaat is " + sum);

    }
}
