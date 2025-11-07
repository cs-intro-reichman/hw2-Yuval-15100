// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  
        String word = args[0].toUpperCase();    
        int numberOfRep = Integer.parseInt(args[1]);

        int NumberOfLetters = word.length();
        String anLetters = "AEFHILMNORSX";

        for (int i = 0; i < NumberOfLetters; i++) {
                
                char c = word.charAt(i);
                if (anLetters.indexOf(c)==-1) {
                 System.out.println("Give me a  " + word.charAt(i) + ": " + 
                word.charAt(i) + "!");
               } else {
                System.out.println("Give me an " + word.charAt(i) + ": " + 
                word.charAt(i) + "!");}
        }

        System.out.println("What does that spell?");
       
        for (int i = 0; i < numberOfRep; i++){
                System.out.println(word + "!!!");}

        }
}
