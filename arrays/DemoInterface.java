public class DemoInterface {
    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek(3,4);
        Cirkel cirkel = new Cirkel(6);
        printFiguur(rechthoek);
        printFiguur(cirkel);

    }

    public static void printFiguur(Meetbaar figuur){
        System.out.println("Omtrek:" + figuur.bepaalOmtrek());
        System.out.println("Oppervlakte: " + figuur.bepaalOpp());
    }

}
