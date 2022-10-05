import java.util.Scanner;

public class Hangman {
    private static char nextGuess(Scanner in) {
        char guess;
        String line;
        line = in.nextLine();
        guess = line.charAt(0);
        return guess;
    }
    
    private static void printHeader() {
        System.out.println("Jogo da Forca");
        System.out.println("=============");
        System.out.println();        
    }
    
    private static String returnWord(String secret) {
        String word = "";
        int i = 0;
        while (i < secret.length() ){
            word = word + "_";
            i++;
        }
        return word;
    }
    
    public static String returnCorret(String secret, String word, char guess) {
        return "";
    }
    
    public static void main(String[] args) {
        Scanner in;
        char guess;             // a letra que foi digitada
        String secret;          // a palavra que deve ser adivinhada
        String word;            // as letras que foram adivinhadas
        String wrongs;          // letras que foram tentadas e erradas
        
        printHeader();
        
        secret = "java";
        word   = returnWord(secret);
        
        wrongs = "";
        
        in = new Scanner(System.in);
       
        System.out.printf("Palavra:   %s\n", word);
        System.out.print( "Tentativa: ");
        guess = nextGuess(in);
        
        if (secret.contains("" + guess)) {
            word = returnCorret(secret, word, guess);
        } else {
            wrongs = wrongs + guess + " ";
        }
        System.out.printf("Erradas:   %s\n", wrongs);
        
        in.close();
    }
}