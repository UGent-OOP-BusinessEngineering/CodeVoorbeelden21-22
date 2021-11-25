
/**
 *
 * @author fgailly
 */
public class InterestTabel {

    public static final int  RIJEN = 10;
    public static final int KOLOMMEN = 6;

    public static double startbedrag = 1000;


    public static void main (String [] args)
    {
        int[][] table = new int[RIJEN][KOLOMMEN];
        for (int row = 0 ; row < RIJEN ; row++)
            for (int column = 0; column < KOLOMMEN; column++)
                table [row] [column] =
                        getBalance (startbedrag, row + 1, (5 + 0.5 * column));
        System.out.println ("Balances for Various Interest Rates " +
                "Compounded Annually");
        System.out.println ("(Rounded to Whole Dollar Amounts)");
        System.out.println ();
        System.out.println ("Years\t5.00%\t5.50%\t6.00%\t6.50%\t7.00%\t7.50%");
        showTable(table);
    }

    private static void showTable(int[][] tabel) {
        for(int rij = 0; rij < RIJEN; rij++){
            System.out.print(rij + 1 + "\t\t");
            for(int kolom = 0; kolom < KOLOMMEN; kolom++)
                System.out.print(tabel[rij][kolom] + "\t");
            System.out.println();
        }
    }



    /**
     * Returns the balance in an account after a given number of years
     * and interest rate with an initial balance of startBalance.
     * Interest is compounded annually. The balance is rounded
     * to a whole number.
     */

    public static int getBalance (double startBalance, int years, double rate)
    {
        double runningBalance = startBalance;
        for (int count = 1 ; count <= years ; count++)
            runningBalance = runningBalance * (1 + rate / 100);
        return (int) (Math.round (runningBalance));
    }
}

