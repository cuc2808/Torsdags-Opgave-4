import java.util.ArrayList;

class Team{
	
	private ArrayList<String> teamPlayerNames = new ArrayList<>();

	private String teamName;

	private int teamRank;

	private String player;

	public Team(String teamName /*, int teamRank, String player*/){

		this.teamName = teamName;

		/*this.teamRank = teamRank;

		this.player = player;*/

	}
	public int setRank(int rank){
		this.teamRank = rank;
		return this.teamRank;
	}
	public String toString(){
		return "\nHold: " + this.teamName + ", Rank: " + this.teamRank + "\n Spillere:" + teamPlayerNames;

	}
	public void addPlayer(String playerName){
		teamPlayerNames.add(playerName);
	}
}