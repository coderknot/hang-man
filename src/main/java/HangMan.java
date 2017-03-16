import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class HangMan {

  private String[] mWordArray;
  private String mWord;
  private List<Character> mLettersGuess;
  private String mDisplayWord;

  public HangMan() {
    mWordArray = new String[] {"word", "umbrella", "dinosaur", "treacle", "coffee", "baby", "celery", "chocolate"};
    mWord = "";
    mLettersGuess = new ArrayList<Character>();
  }

  public String getWord() {
    Random myRandom = new Random();
    mWord = mWordArray[myRandom.nextInt(mWordArray.length)];
    mDisplayWord = "";

    for(int i = 0; i < mWord.length(); i++) {
      mDisplayWord = mDisplayWord.concat("_");
    }

    return mWord;
  }

  public String getWordProgess(String originalWord, Character userGuess) {
    // String display = displayWord;

    if (!checkGuess(userGuess)) {
      mLettersGuess.add(userGuess);
    }

    for (int i = 0; i < originalWord.length(); i++) {
      if (userGuess.equals(originalWord.charAt(i))) {
        mDisplayWord = mDisplayWord.substring(0, i) + userGuess + mDisplayWord.substring(i + 1, mDisplayWord.length());
      }
    }
    return mDisplayWord;
  }

  public boolean checkGuess(Character guessChar) {
    for (int i = 0; i < mLettersGuess.size(); i++) {
      if (mLettersGuess.get(i).equals(guessChar)) {
        return true;
      }
    }
    return false;
  }

  public List<Character> getLettersGuess() {
    return mLettersGuess;
  }

  public String getDisplayWord() {
    return mDisplayWord;
  }
}
