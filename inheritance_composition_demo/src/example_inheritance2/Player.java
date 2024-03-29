package example_inheritance2;

public class Player extends Person{

	private String teamName;
	private String position;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name, String teamName, String position) {
		super(id, name);
		this.teamName = teamName;
		this.position = position;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void printPlayer() {
		System.out.println("Player details are::: ");
		super.printPerson();
		System.out.println("Team Name is "+teamName);
		System.out.println("Player Position is "+position);
	}
	
}
