package draft;

import java.util.*;

public class PlayerManager { //Begin PlayerManager class

	//Create ArrayList
	private static ArrayList <Player> PLAYER_LIST = new ArrayList<Player>();
	//Create PlayerManager method
	public PlayerManager() {
		createPlayers();
	}
	//List of players and statistics and add to ArrayList
	public static void createPlayers() {
		Player tbrady = new Player("Tom Brady", "QB", 40, "6FT 4IN", "225 LBS", 0, "Michigan", "19th Season", "San Mateo, CA", "New England Patriots");
		Player khunt = new Player("Kareem Hunt", "RB", 22, "5FT 10IN", "216LBS", 0, "Toledo", "2nd Season", "Elyria, OH", "Kansas City Chiefs");
		Player abrown = new Player("Antonio Brown", "WR", 29, "5FT 10IN", "181LBS", 0, "Central Michigan", "9th Season", "Miami, FL", "Pittsburgh Steelers");
		Player pbrown = new Player("Preston Brown", "LB", 25, "6FT 1IN", "251LBS", 0, "Louisville", "5th Season", "Cincinnati, Oh", "Cincinnati Bengals");
		Player cjones = new Player("Chandler Jones", "LB", 28, "6FT 5IN", "265LBS", 0, "Syracuse", "7th Season", "Rochester, NY", "Arizona Cardinals");
		Player kbyard = new Player("Kevin Byard", "S", 24, "5FT 11IN", "212LBS", 0, "Middle Tennessee", "3rd Season", "Lithonia, GA", "Tennessee Titans");
		
		PLAYER_LIST.add(tbrady);
		PLAYER_LIST.add(khunt);
		PLAYER_LIST.add(abrown);
		PLAYER_LIST.add(pbrown);
		PLAYER_LIST.add(cjones);
		PLAYER_LIST.add(kbyard);
		
	}
	//create toString method
	public String toString() {
		String playerList = "";
		for(Player player : PLAYER_LIST)
			playerList += (player.name + " " + "\n");
		return playerList; 
	}
	//Add main method and test string, getter, and setter
	public static void main(String[] args) {
		PlayerManager test = new PlayerManager();
		System.out.println("String Test:\n\nThe players I've selected so far include: \n" + test.toString());
		System.out.println("Getter Test:\nTom Brady is " + PlayerManager.PLAYER_LIST.get(0).getAge() + " years old. He is currently in his " + PlayerManager.PLAYER_LIST.get(0).getExperience());
	
		PlayerManager.PLAYER_LIST.get(2).setName("Kareem Hunt");
		PlayerManager.PLAYER_LIST.get(2).setPosition("RB");
		PlayerManager.PLAYER_LIST.get(2).setCurrentTeam("Kansas City Chiefs");
		System.out.println("\nSetter Test:\n" + PlayerManager.PLAYER_LIST.get(2).getName() + " is currently a " + PlayerManager.PLAYER_LIST.get(2).getPosition() + " for the " + PlayerManager.PLAYER_LIST.get(2).getCurrentTeam() + ".");
		
	}
}
