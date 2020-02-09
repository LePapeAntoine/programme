package fr.antoine.programme;

public class Player {
	private double attack;
	private double health;
	private String name;
	
	public Player(String name, double attack, double health) {
		this.name =name;
		this.health= health;
		this.attack= attack;
				
	}
	
	public String showPlayer(){
		String text;
		text=this.name + this.health + this.attack;
		return text;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
