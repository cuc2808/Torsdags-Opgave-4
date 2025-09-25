import java.util.Scanner;

public class GuessNumberGame {
    public static void main (String[] args) {
        // Velkomsthilsen til bruger (navn med som parameter)
        System.out.print("Indtast dit navn: ");
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        System.out.println("Hej "+input+". Velkommen til Guess the Number");
        // Program laver tilfældigt tal ml 1-100
        int numberToGuess = (int)(Math.random() * 100) + 1;


        /* Indtil bruger har gættet tallet:
            -bruger gætter på tal (indlæs int fra tastatur Scanner.nextInt())
            
program svarer om det er rigtigt eller forkert (evt. om tal er højere eller lavere end gæt)*/
      boolean guessed = false;

        // Evt. giv  bruger max 10 forsøg til at gætte.
        for (int attempt = 1; attempt <= 10; attempt++) {
            System.out.print("Forsøg " + attempt + " af 10. Gæt tallet (1-100): ");
            int guess = scanner.nextInt();
        //Her giver koden dig svar på om man har gættet rigtigt eller forkert med antal forsøg på
            if (guess == numberToGuess) {
                System.out.println("Tillykke " + input + "! Du gættede rigtigt på forsøg " + attempt + ".");
                guessed = true;
                break; // stop løkken
            } else if (guess < numberToGuess) {
                System.out.println("Tallet er HØJERE end " + guess);
            } else {
                System.out.println("Tallet er LAVERE end " + guess);
            }
        }

        // Evt. Afslut program med afslutningshilsen med antal brugte forsøg 
        if (!guessed) {
            System.out.println("Game over Tallet var: " + numberToGuess);
        }

        scanner.close();
    }
}
