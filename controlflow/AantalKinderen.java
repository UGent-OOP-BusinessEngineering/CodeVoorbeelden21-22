import java.util.Scanner;

public class AantalKinderen {
    public static void main(String[] args) {
        int aantalKinderen;
        System.out.print ("Aantal babies: ");
        Scanner keyboard = new Scanner (System.in);
        aantalKinderen = keyboard.nextInt ();
        switch (aantalKinderen){
            case 1:
                System.out.println("Proficiat");
                break;
            case 2:
                System.out.println("Proficiat een tweeling !!");
                break;
            case 3:
                System.out.println("Proficiat een drieling");
                break;
            case 4: System.out.println("Wow, 4 kinderern??");
            default:
                System.out.println("Ik geloof je niet");
        }





    }
}
