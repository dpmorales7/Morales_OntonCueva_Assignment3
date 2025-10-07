
import java.util.Random;
import java.util.ArrayList;

public class Dictionary {

	ArrayList<String> words;

	public Dictionary(ArrayList<String> list) {

		this.words = list;

	}

	public boolean isValidWord(String word) {

		for(int i = 0; i < this.words.size(); i++) {

			if(this.words.get(i).equals(word)) {

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
