import java.util.Scanner;

public class Valuta {
    private long euro;
    private long centen;

    public void set(long newEuros) {
        if (newEuros < 0) {
            System.out.println(
                    "Error: Negative bedragen zijn niet toegelaten.");
            System.exit(0);
        } else {
            euro = newEuros;
            centen = 0;
        }
    }

    public void set(double nieuwBedrag) {
        if (nieuwBedrag < 0) {
            System.out.println(
                    "Error: Negative bedragen zijn niet toegelaten.");
            System.exit(0);
        } else {
            long bedragInCenten = Math.round(nieuwBedrag * 100);
            euro = bedragInCenten / 100;
            centen = bedragInCenten % 100;
            }
    }

    public void set(Valuta valutaObject) {
        this.euro = valutaObject.euro;
        this.centen = valutaObject.centen;
    }


    public void set(String valuataString) {
        String euroString;
        String centenString;

        //Delete '€' if any:
        if (valuataString.charAt(0) == '€') {
            valuataString = valuataString.substring(1);
        }

        valuataString = valuataString.trim();
        //Locate decimal point:

        int kommaLocatie = valuataString.indexOf(",");
        if (kommaLocatie < 0) //If no decimal point
            {
                centen = 0;
                euro = Long.parseLong(valuataString);
            } else //String has a decimal point.
            {
                euroString = valuataString.substring(0, kommaLocatie);
                centenString = valuataString.substring(kommaLocatie + 1);
                //one digit in cents means tenths of a dollar
                if (centenString.length() <= 1) {
                    centenString = centenString + "0";
                }
                // convert to numeric
                euro = Long.parseLong(euroString);
                centen = Long.parseLong(centenString);
                if ((euro < 0) || (centen < 0) || (centen > 99)) {
                    System.out.println(
                            "Error: Ongeldige weergave valuta");
                    System.exit(0);
                }
            }
        }

        public void readInput() {
            System.out.println("Geef bedrag:");
            Scanner keyboard = new Scanner(System.in);
            String amount = keyboard.nextLine();
            set(amount.trim());
        }

        /**
         * Does not go to the next line after displaying money.
         */
        public void writeOutput() {
            System.out.print("€" + euro);
            if (centen < 10) {
                System.out.print(".0" + centen);
            } else {
                System.out.print("." + centen);
            }
        }

        /**
         * Returns n times the calling object.
         */
        public Valuta times(int n) {
            Valuta product = new Valuta();
            product.centen = n * centen;
            long overgedragenEuros = product.centen / 100;
            product.centen= product.centen % 100;
            product.euro = n * euro + overgedragenEuros;
            return product;
        }

        /**
         * Returns the sum of the calling object and the argument.
         */
        public Valuta add(Valuta otherAmount) {
            Valuta sum = new Valuta();
            sum.centen = this.centen + otherAmount.centen;
            long overgedragenEuros = sum.centen / 100;
            sum.centen = sum.centen % 100;
            sum.euro = this.euro
                    + otherAmount.euro + overgedragenEuros;
            return sum;
        }
}

