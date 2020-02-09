package fr.antoine.programme;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		char reponse = ' ';
		
		do {
			System.out.println("Entrer nom Joueur : ");
			names.add(sc.nextLine());
			do{
			    System.out.println("Voulez-vous réessayer ? (O/N)");
			    reponse = sc.nextLine().charAt(0);
			  }while(reponse != 'O' && reponse != 'N');
			        
			}while (reponse == 'O');
		
		ArrayList<Player> players = new ArrayList<>();
		for(String name : names) {
			Player player = new Player(name, 10, 50);
			players.add(player);
		}
		
		for(Player player : players) {
			System.out.println(player.showPlayer());
		}
	}
}

