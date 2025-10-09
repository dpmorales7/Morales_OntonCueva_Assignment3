public class Feedback_Bug {
    String guess;
    String pattern;
    boolean Validation;

    public Feedback_Bug(String guess, String secretWord) {
        this.guess = guess;

        this.pattern = getPattern(guess, secretWord);

        this.Validation = isCorrect(pattern);
    }

    public static String getPattern(String guess, String secretWord) {

        char[] letters = new char[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (guess.charAt(i) == secretWord.charAt(j)) {

                    letters[i] = 'Y';

                }

            }
        }

        for (int k = 0; k < 5; k++) {
            if (guess.charAt(k) == secretWord.charAt(k)) {
                letters[k] = 'G';

            }

        }

        for (int l = 0; l < 5; l++) {

            if (letters[l] == '\0') {
                letters[l] = 'B';

            }
        }

        String colorChars = new String(letters);

        return colorChars;

    }

    public static boolean isCorrect(String pattern) {

        if (pattern.equals("GGGGG")) {
            return true;
        }

        return false;

    }

    public String getGuess() {
        return guess;
    }

    public String getPattern() {
        return pattern;
    }

    public boolean getValidation() {
        return Validation;
    }
}
