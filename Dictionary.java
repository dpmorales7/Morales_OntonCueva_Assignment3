
import java.util.Random;

public class Dictionary {

	public boolean isValidWord(String word) {

		for(int i = 0; i < this.words.size(); i++) {

			if(this.words.get(i) == word) {

				return true;
			}

			return false;

		}

	}

	public String getRandomWord() {

		Random rand = new Random();
		int index = rand.nextInt(this.words.size());

		String random_word = this.words.get(index);

		return random_word;

	}

}
