public class Vertegenwoordiger {
	private String naam;
	private double omzet;

	public Vertegenwoordiger() {
		naam = "";
		omzet = 0.0;
	}

	public Vertegenwoordiger(String naam, double omzet) {
		this.naam = naam;
		this.omzet = omzet;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getOmzet() {
		return omzet;
	}

	public void setOmzet(double omzet) {
		this.omzet = omzet;
	}

	@Override
	public String toString() {
		return "Vertegenwoordiger{" +
				"naam='" + naam + '\'' +
				", omzet=" + omzet +
				'}';
	}
}
