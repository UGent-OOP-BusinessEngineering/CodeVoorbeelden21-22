import java.util.Scanner;

public class Zichtrekening {
    public static final double BOETE = 8.00;
    public static final double INTEREST = 0.02; // 2% annually

    public static void main(String[] args) {

        System.out.print("Saldo van je zichtrekening in €:");
        Scanner keyboard = new Scanner(System.in);
        double balance = keyboard.nextDouble();
        System.out.println("Huidig saldo €:" + balance);

        if(balance > 0){
            balance = balance + (balance * INTEREST)/12;
        }
        else {
            balance = balance + BOETE;
        }

        // indien saldo > 0 ==> interest toevoegen, anders boete

        System.out.print("Na aanpassing voor 1 maand");
        System.out.println("van interest of boete,");
        System.out.println("is je nieuwe saldo €" + balance);
    }
}
