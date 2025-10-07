
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
		
		System.out.println(words.size());
		return this.words;
	}
	
	public String MakeGuess(String guess) {

		Dictionary dic = new Dictionary(this.words);
		
		boolean not_valid = true;

		while (not_valid){
			Scanner scan = new Scanner(System.in);


			System.out.println("Enter your guess: ");


			String word = scan.nextLine();

			if(dic.isValidWord(word)){
				not_valid = false;
			}else{
				System.out.println("Word not in list.");
			}


		}


		return word;
	}
	
	public String getSecretWord() {
		
		Dictionary dic = new Dictionary(this.words);
		String secret_word = dic.getRandomWord();

		return secret_word;
		
	}
	

	
	public static void main(String[] args) {
		
			
		WordleGame obj = new WordleGame();
			
		//Add words to the Arraylist
		ArrayList<String> test = obj.addWords();
		
			//
			
		
		
		
	}
}

