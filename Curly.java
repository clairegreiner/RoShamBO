package RPSver2;

import java.util.Random;

public class Curly extends Player {
	private Random r;
	public Curly(){
		super("Curly");			//referring to abstract
		r = new Random();
	}
			
	@Override
	public String play() {
		return moves [r.nextInt(moves.length)]; //moves.length allows for increasing the array
	}

	@Override
	public String player() {
		// TODO Auto-generated method stub
		return null;
	}
}
