import javax.swing.*;

public class JOptionDemo {
    public static void main(String[] args) {
        String appelString = JOptionPane.showInputDialog("Aantal appels?");
        int appelAantal = Integer.parseInt(appelString);

        String appelsienString = JOptionPane.showInputDialog("Aantal appelsienen?");
        int appelsienAantal = Integer.parseInt(appelsienString);

        int fruitTotaal = appelAantal + appelsienAantal;
        JOptionPane.showMessageDialog(null, "Het aantal stukken fruit bedraagt " + fruitTotaal);

        System.exit(0);
    }
}
