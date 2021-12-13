public class DemoPoly {
    public static void main(String[] args) {
        Persoon[] personen = new Persoon[4];
        personen[0] = new Persoon("De Smet", "Fred","Gent", 1985, 4,12);
        personen[1] = new Student("Jannsens","Paul","Lokeren",1990, 3,15, "123456");
        personen[2] = new BachelorStudent("Depuyt", "Liesbeth", "Temse", 1991, 11, 12, "6789", 2);
        personen[3] = new Persoon("De groot", "Katrien", "Leuven", 1988, 10, 20);

        for(int i =0 ; i < personen.length; i++)
            personen[i].writeOutput();
    }
}
