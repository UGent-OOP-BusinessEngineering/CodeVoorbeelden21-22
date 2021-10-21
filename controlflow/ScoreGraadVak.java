import java.util.Scanner;

public class ScoreGraadVak {
    public static void main(String[] args) {
        int score;
        String grade ="";
        System.out.println("Geef je score: ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt();

        //Grootste, grote, onderscheiding, voldoening, ...

        if(score > 850)
            grade = "Grootste onderscheiding";
        else if(score > 750)
            grade = "grote onderscheiding";
        else if(score > 675)
            grade = "onderscheiding";
        else if(score > 500)
            grade = "voldoening";
        else
            grade = "onvoldoende";


        System.out.println("Score = " + score);
        System.out.println("Graad = " + grade);

    }
}
