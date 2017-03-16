import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    boolean programRunning = true;
    while (programRunning) {
      HangMan hangMan = new HangMan();
      String wordToGuess = hangMan.getWord();
      System.out.println(hangMan.getDisplayWord());

      while (!wordToGuess.equals(hangMan.getDisplayWord())) {
        System.out.println("Guess a letter. You've already guessed " + hangMan.getLettersGuess().toString());
        Character guessLetter = myScanner.next().charAt(0);
        System.out.println(hangMan.getWordProgess(wordToGuess, guessLetter));
      }

      System.out.println("You won! Play Again? (Y or N)");
      String playAgain = myScanner.next().toUpperCase();
      if (playAgain.equals("N")) {
        programRunning = false;
      } else {
        programRunning = true;
      }
    }
  }
}
