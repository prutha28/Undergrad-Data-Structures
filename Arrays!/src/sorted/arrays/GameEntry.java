package sorted.arrays;

public class GameEntry {

	private String name ;	// Name of the person who has scored.
	private int score ;		// Score of the person.

	public GameEntry( String name, int score){
		this.name = name ;
		this.score = score ;
	}

	// Getters for private instance variables.
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("Name : %s Score : %3d", this.name, this.score ) ;
	}


}
