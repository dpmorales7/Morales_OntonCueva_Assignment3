
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.List;
import java.util.Map;

public class WordleGame {

	int guessNum;
	
	String guess;
	String secretWord;

	HashMap guesses;

	boolean Validation;

	
	public WordleGame() {


		
	}
	

	
	public String MakeGuess() {

		Dictionary dic = new Dictionary();
		
		boolean not_valid = true;

		String word = "IIIII";

		while (not_valid){
			Scanner scan = new Scanner(System.in);


			System.out.println("Enter your guess: ");


			word = scan.nextLine();

			if(dic.isValidWord(word)){
				not_valid = false;
			}else{
				System.out.println("Word not in list.");
			}


		}

		Feedback feed = new Feedback(word,secretWord);

		this.guesses.put(word,feed.getPattern());

		this.Validation = feed.getValidation();

		this.guessNum ++;


		return word;

	}
	
	public String getSecretWord() {
		
		Dictionary dic = new Dictionary();

		return dic.getRandomWord();
		
	}

	public boolean isGameOver(){
		if (Validation || guessNum > 6){
			return true;
		}
		return false;
	}

	public void startGame(){
		this.guesses = new HashMap<String,String>();

		this.secretWord = getSecretWord();

		this.guessNum = 0;

		//this.guess = MakeGuess();



	}
	

	
	public static void main(String[] args) {
		WordleGame game = new WordleGame();
		game.startGame();
		System.out.println("Welcome to Wordle");
		System.out.println("Make a guess and you shall receive a corrisponding string as the pattern.");
		System.out.println("Each letter in the pattern will either be 'G','Y' or 'B");
		System.out.println("G = correct letter in correct spot");
		System.out.println("Y = correct letter in wrong spot");
		System.out.println("B = letter not in word");
		System.out.println("You have 6 guesses good luck!");
		while(!(game.isGameOver())){
			System.out.println("_________________________");
			game.MakeGuess();
			System.out.println("Number of guesses:" + game.guessNum);
			List<String> keyList = new ArrayList<>(game.guesses.keySet());
			List<String> valueList = new ArrayList<>(game.guesses.values());
			for(int i = 0; i < keyList.size();i++){
				System.out.println(keyList.get(i)+":"+valueList.get(i));
			}


		}

		System.out.println(game.secretWord+" was the secret word.");






	}
}

