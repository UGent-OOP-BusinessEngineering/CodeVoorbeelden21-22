package spelkaart;

public enum SpelkaartKleur {
    SCHOPPEN("zwart"), KLAVERS("zwart"), HARTEN("rood"), RUITEN("rood");

    private String kleur;

    SpelkaartKleur(String kleur) {
        this.kleur = kleur;
    }
}
