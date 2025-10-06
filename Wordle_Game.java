
import java.util.HashMap;
public class Wordle_Game {
	
	
	public static void main(String[] args) {
		
		String guess = "fairy";
		
		String secretWord = "fairy";
		
		HashMap map = getPatter(guess,secretWord);
		System.out.println(map.get(guess));
		
	}
	
	
	public static String startGame(HashMap guesses) {
		String secretWord = "blank";//getSecretWord();
		
		guesses.clear();
		
		return secretWord;
	 
		
	}
	
	public static HashMap getPatter(String guess, String secretWord) {
		
		HashMap<String, String> guesses = new HashMap<>();
		
		String colors = compare(guess,secretWord);
		
		guesses.put(guess, colors);
		
		
		
		
		
		
		
		
		return guesses;
		
	}
	
	
	public static String compare(String guess, String secretWord) {
		
		char[] letters = new char[5];
		
		for(int i = 0; i <5;i++) {
			for(int j = 0; j<5; j++) {
				
				if(guess.charAt(i) == secretWord.charAt(j)) {
					
					letters[i] = 'Y';
					
				}
			
				
			}
		}
		
		for(int k = 0; k < 5; k++) {
			if (guess.charAt(k) == secretWord.charAt(k)) {
				letters[k] = 'G';
				
			}
	
		}
		
		for(int l = 0; l < 5; l++) {
			
			if (letters[l] == '\0') {
				letters[l] = 'B';
				
			}
		}
		
		String colorChars = new String(letters);
		
		
		return colorChars ;
		
		
	}
	
	
}
