public class StringDemo {
    public static void main(String[] args) {
        String sentence = "Text processing is hard!";
        // position substring hard

        int position = sentence.indexOf("hard");

        // change sentence to Text processing is easy

        sentence  = sentence.substring(0,position);
        sentence = sentence + "easy!";
        System.out.println(sentence);
    }
}
