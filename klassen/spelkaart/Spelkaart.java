package spelkaart;

public class Spelkaart {
    private int getal;
    private String beeld;
    private SpelkaartKleur kleur;

    public Spelkaart(SpelkaartKleur kleur, int getal) {
        this.kleur = kleur;
        this.getal = getal;
    }

    public Spelkaart(SpelkaartKleur kleur, String beeld) {
        this.kleur = kleur;
        this.beeld = beeld;
    }
}
