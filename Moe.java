package RPSver2;

import java.util.Random;

public class Moe extends Player {
	private Random r;
	public Moe(){			//since Moe will always be Moe
		super("Moe");			//referring to abstract
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