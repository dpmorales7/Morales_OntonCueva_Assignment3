
import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordleGame {
	
	ArrayList<String> words; 
	
	public WordleGame() {
		
		this.words = new ArrayList<>();
		
	}
	
	public void addWords() {
		
		String filePath = "words.txt";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			while((line = reader.readLine()) != null) {
					words.add(line);
				
			}
			reader.close();
		
		
		}catch (IOException e) {
			System.err.println("There was an error while reading file: "+e.getMessage());
			
			
		}
		
		System.out.println(words.size());
	}
	
	public String MakeGuess(String guess) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your guess: ");
		String word = scan.nextLine();
		
		return word;
		
	}
	
	public String getSecretWord() {
		
		Random rand = new Random();
		int number = rand.nextInt(8);
		
		String secret_word = words.get(number);
		
		return secret_word;
		
	}
	

	
	public static void main(String[] args) {
		
			
		WordleGame obj = new WordleGame();
			
		//Add words to the Arraylist
		obj.addWords();
		
			//
			
		
		
		
	}
}
