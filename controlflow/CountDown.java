import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        // Aftellen vanaf bepaald getal
        int getal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Geef een getal:");
        getal = input.nextInt();

        /*
        while(getal > 0){
            System.out.println(getal);
            getal = getal -1;
        }
        */

        for(int i = getal; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Start !!!!");
    }
}
