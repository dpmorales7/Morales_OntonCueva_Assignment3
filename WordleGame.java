
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;

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

		System.out.println(guessNum);

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
		while(!(game.isGameOver())){
			game.MakeGuess();
			System.out.println(game.guesses);
			System.out.println(game.secretWord);
		}

		System.out.println(game.guess);
		System.out.println(game.secretWord);
		System.out.println(game.guesses);
		System.out.println(game.Validation);






	}
}

