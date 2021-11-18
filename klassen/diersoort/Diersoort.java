package diersoort;

import java.util.Scanner;

public class Diersoort {
    private String naam;
    private int populatie;
    private double groei;

    public Diersoort(String naam, int populatie, double groei) {
        this.naam = naam;
        this.populatie = populatie;
        this.groei = groei;
    }

    public Diersoort(String naam, int populatie) {
        this(naam, populatie, 0.0);
    }

    public Diersoort(String naam, double groei) {
        this(naam, 0, groei);
    }

    public Diersoort() {
        this("",0, 0.0);
    }


    public String getNaam() {
        return naam;
    }

    public int getPopulatie() {
        return populatie;
    }

    public double getGroei() {
        return groei;
    }

    public void setPopulatie(int populatie) {
        this.populatie = populatie;
    }

    public void setGroei(double groei) {
        this.groei = groei;
    }



    public double getPopulatie(int jaren){

        double nieuwPopulatie = this.populatie;
        int count = jaren;
        while(count > 0 && nieuwPopulatie > 0){
            nieuwPopulatie = nieuwPopulatie + nieuwPopulatie * groei;
            count--;
        }
       return nieuwPopulatie;
    }

    public static void main(String[] args) {

        Integer x = 5;

        Scanner input = new Scanner(System.in);
        String naam;
        System.out.println("Naam:");
        naam = input.nextLine();
        System.out.println("Populatie:");
        int populatie = input.nextInt();
        System.out.println("Groei:");
        double groei = input.nextDouble();
        Diersoort klingon = new Diersoort(naam, populatie, groei);

        System.out.println("Klingon populatie binnen 10 jaar: " + klingon.getPopulatie(10));
        System.out.println("Klingon populatie binnen 30 jaar: " + klingon.getPopulatie(30));
    }
}
