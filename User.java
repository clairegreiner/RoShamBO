



package RPSver2;

import java.util.Scanner;
public class User extends Player {

    public User(String name) {
        super(name);
        
    }


    public int prompt = 0;
    public int min = 0;
    public int max= 0;
    int selection = 0;

    public String play () {
        for (int i = 0; i < moves.length; i++){ //grab more opponents if needed
            System.out.println((i + 1) + ") " + moves[i]);  //otherwise, memory addresses
        }
        int selection = promptForInt("Pick a move:", 1, moves.length);
        
        return moves[selection - 1];
    }
    
    public int promptForInt(String prompt, int min, int max) {   
        System.out.println(prompt);
        int returnValue = min - 1;
        boolean validValue = false;
        while(!validValue){
            try {
                Scanner sc = new Scanner(System.in);
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
    