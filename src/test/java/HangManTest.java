import org.junit.*;
import static org.junit.Assert.*;

public class HangManTest {

  @Test
  public void getWord_getsRandomWordFromArray_word() {
    HangMan testHangMan = new HangMan();
    assertTrue(testHangMan.getWord() instanceof String);
  }

  @Test
  public void getWordProgress_convertsWordToUnderScores_____() {
    HangMan testHangMan = new HangMan();
    testHangMan.getWord();
    assertEquals("____", testHangMan.getWordProgess("word", 'z'));
  }

  @Test
  public void getWordProgess_displaysGuessedLetter_w___() {
    HangMan testHangMan = new HangMan();
    testHangMan.getWord();
    assertEquals("_o__", testHangMan.getWordProgess("word", 'o'));
  }

  @Test
  public void getWordProgess_doesNothingWhenGuessWrongLetter_____() {
    HangMan testHangMan = new HangMan();
    testHangMan.getWord();
    assertEquals("____", testHangMan.getWordProgess("word", 'i'));
  }

  @Test
  public void checkGuess_recognizesIfLetterHasBeenGuessed_true() {
    HangMan testHangMan = new HangMan();
    testHangMan.getWordProgess("word", 'i');
    assertTrue(testHangMan.getLettersGuess().get(0).equals('i'));
  }
}
