import java.io.File;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Dictionary_Bug {
    ArrayList<String> words;
    String secretWord;

    public Dictionary_Bug() {

        this.words = addWords();

        this.secretWord = getRandomWord();

    }

    public ArrayList<String> addWords() {
        ArrayList<String> contents = new ArrayList<>();
        try {
            File file = new File("words.txt");
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {

                String line = input.nextLine();
                contents.add(line);

            }

            input.close();

        } catch (Exception e) {

            System.out.println("There was an error while reading file");

        }

        return contents;
    }

    public boolean isValidWord(String word) {

        for (int i = 0; i <= this.words.size(); i++) { // BUG 10: off-by-one — causes IndexOutOfBoundsException

            if (this.words.get(i).equals(word)) {

                return true;
            }

        }

        return false;

    }

    public String getRandomWord() {

        Random rand = new Random();
        int index = rand.nextInt(this.words.size());

        String random_word = this.words.get(index);

        return random_word;

    }


}
