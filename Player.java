package RPSver2;

public abstract class Player {
	protected static String playerName;
	protected String[] moves = { "Rock", "Paper", "Scissors" };
	
	public Player(String name) {
		this.playerName = name;
	}
	
	public abstract String play ();
	
	public String getName(){
		return playerName;
	}

	public String player() {
		// TODO Auto-generated method stub
		return null;
	}
}
