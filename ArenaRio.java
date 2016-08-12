package RPSver2;

import java.util.Scanner;

public class ArenaRio {
	
	
	static Scanner sc;  //called from a static method
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Player[] opponents = {new Larry(), new Moe(), new Curly()};
		String opponentPrompt = "Welcome to the Roshambo arena! Please choose your opponent. "
				+ "0 to exit:";
		
		for (int i = 0; i < opponents.length; i++){ //grab more opponents if needed
			System.out.println((i + 1) + ") " + opponents[i].getName());  //otherwise, memory addresses
		}
		int selection = promptForInt(opponentPrompt, 0, opponents.length);
		
		if (selection == 0) {
			System.out.println("Thanks for playing!");
			return; // end of main
		}
		
		Player opponent = opponents[selection - 1]; //to get 0, 1, 2
										//referencing the original array
		System.out.println("Your opponent is " + opponent.getName());
		Player user = new user
	}
	
	public static String promptForString(String prompt) { //courtesy the character generator
		System.out.println(prompt);
		return sc.nextLine();
	}

	public static int promptForInt(String prompt, int min, int max) {   //from the batting avg
		System.out.println(prompt);
		int returnValue = min - 1;
		boolean validValue = false;
		while(!validValue){
			try {
				returnValue = Integer.valueOf(sc.nextLine());
				if(returnValue >= min && returnValue <= max){
					validValue = true;
				}
				else { 
					System.out.println("Must be between " + min + " and " + max + ". Try again. ");
				}
				
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Must be a whole number. Try again.");
			}
		}
		return returnValue;
	}
	
	
}
