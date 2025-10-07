
import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;

public class WordleGame {
	
	ArrayList<String> words; 
	
	public WordleGame() {
		
		this.words = new ArrayList<>();
		
	}
	
	public ArrayList<String> addWords() {
		
		try {
			File file = new File("words.txt");
			Scanner input = new Scanner(file);

			while(input.hasNextLine()) {

				String line = input.nextLine();
				this.words.add(line);
				
			}
			
			input.close();
		
		
		} catch (Exception e) {

			System.out.println("There was an error while reading file");
			
		}
		
		return this.words;
		//System.out.println(words.size());
	}
	
	public String MakeGuess(String guess) {
		
		Dictionary dic = new Dictionary();
		String secret_word = dic.getRandomWord();

		
	}
	
	public String getSecretWord() {
		
		Dictionary dic = new Dictionary();
		String secret_word = dic.getRandomWord();

		return secret_word;
		
	}
	

	
	public static void main(String[] args) {
		
			
		WordleGame obj = new WordleGame();
			
		//Add words to the Arraylist
		obj.addWords();
		
			//
			
		
		
		
	}
}
