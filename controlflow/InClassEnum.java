public class InClassEnum {
    enum MovieRating {A,B,C,E};

    public static void main(String[] args) {
        MovieRating rating = MovieRating.E;

        switch (rating){
            case E:
                System.out.println("Je moet deze film zien");
                break;
            case A:
                System.out.println("Film is goed maar niet super");
                break;
            case B:
                System.out.println("Niet de moeite");
                break;
            default:
                System.out.println("Er klopt iets niet");
                break;

        }

        for(MovieRating a: MovieRating.values()){
            System.out.println(a.name());
        }

    }
}
