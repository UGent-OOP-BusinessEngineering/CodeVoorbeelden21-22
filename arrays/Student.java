public class Student extends Persoon  {
    private String studentenNummer;

    public String getStudentenNummer() {
        return studentenNummer;
    }

    public Student(String naam, String voornaam, String woonplaats, int jaarGeboorte, int maandGeboorte, int dagGeboorte, String studentenNummer) {
        super(naam, voornaam, woonplaats, jaarGeboorte, maandGeboorte, dagGeboorte);
        this.studentenNummer = studentenNummer;
    }

    public void writeOutput(){
        System.out.println(this.toString());
    }

    public String toString(){
        return super.toString() + ", studentennummer: " + studentenNummer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return studentenNummer != null ? studentenNummer.equals(student.studentenNummer) : student.studentenNummer == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (studentenNummer != null ? studentenNummer.hashCode() : 0);
        return result;
    }
}
