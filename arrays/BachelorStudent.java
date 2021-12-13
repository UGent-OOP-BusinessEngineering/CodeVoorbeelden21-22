public class BachelorStudent extends Student {
    private int jaar;

    public BachelorStudent(String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte, String studentenNummer, int jaar) {
        super(naam, voornaam, woonplaats, jaarGeboorte, maandGeboorte, dagGeboorte, studentenNummer);
        this.jaar = jaar;
    }

    public void writeOutput(){
        System.out.println("Naam: " + super.getNaam() + ", voornaam: " + super.getVoornaam()
                + ", studentennummer:" + super.getStudentenNummer() + ", Bachelor");
    }
}
