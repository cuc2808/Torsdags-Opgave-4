import java.util.Scanner;
import java.util.ArrayList;

class GameMenu{
	
	ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	public void displayMenu(){

	for(String action: actions){
	System.out.println(action);	
		}
	}
	public String promtUser(){
		
		System.out.println("Type a number to choose an action.");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();
		return choice;
	}

	/*public String getAction(){

	}*/


}