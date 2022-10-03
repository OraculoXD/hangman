import java.util.Scanner;

public class Hangman{
    private static char nextGuess(Scanner sc){
        char guess;
        String line;
        guess = sc.next().charAt(0);
        
        line = sc.nextLine();
        return guess;
    }
    
    private static void printHeader(){
        System.out.println("Jogo da Forca");
        System.out.println("=============");
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc;
        char guess;
        String secret;
        String word;
        String wrongs;
        
        printHeader();
                
        secret = "hangman";
        word   = "_______";
        wrongs  = "";
        
        sc = new Scanner(System.in);
        
        System.out.printf("Palavra:   %s\n", word);
        System.out.printf("Tentativa: ");
        guess = nextGuess(sc);
        
        System.out.println(guess);
        
        if (secret.contains("" + guess)) {
            
        } else {
            wrongs = wrongs + guess + " ";
        }
        System.out.printf("Erradas:   %s\n", wrongs);
        
        sc.close();
    }
}