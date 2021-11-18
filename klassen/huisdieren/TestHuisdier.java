package huisdieren;

public class TestHuisdier {
    public static void main(String[] args) {
        Huisdier zola = new Huisdier("zola", 9, 4.5);
        Huisdier billie = new Huisdier("Billie",6, 5.0);


        // EERSTE GEVOLG
        billie = zola;
        billie.setLeeftijd(23);

        System.out.println("Leeftijd billie: " + billie.getLeeftijd());
        System.out.println("Leeftijd zola: " + zola.getLeeftijd());

        // TWEEDE
        Huisdier zola2 = new Huisdier("zola",9,4.5);


        System.out.println(zola == zola2);
        System.out.println(zola.equals(zola2));

        // DERDE

        Huisdier.leefijdPlus1(zola);

        int x = 5;
        Huisdier.plus1(x);


    }
}
