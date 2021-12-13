public class Cirkel implements Meetbaar{
    private double straal;

    public Cirkel(double straal) {
        this.straal = straal;
    }

    @Override
    public double bepaalOmtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double bepaalOpp() {
        return Math.PI * straal *straal;
    }
}
