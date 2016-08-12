package RPSver2;

public class Larry extends Player {
	public Larry(){
		super("Larry");
	}
	
	
	@Override
	public String play() {
		return moves[0];  //Larry is not very bright
	}

	@Override
	public String player() {
		// TODO Auto-generated method stub
		return null;
	}
}
