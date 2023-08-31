package collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerSet {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Collection<String> player = new HashSet<String>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_03");
		
		System.out.println(player);
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		/*
		Set<String> player = new HashSet<String>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_03");
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		/*
		HashSet<String> player= new HashSet<String>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_03");
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		
		ArrayList<String> oldTeam = new ArrayList<String>();
		
		oldTeam.add("Player_01");
		oldTeam.add("Player_02");
		oldTeam.add("Player_03");
		oldTeam.add("Player_04");
		oldTeam.add("Player_03");
		
		System.out.println("Old Team : ");
		for(String player:oldTeam) {
			System.out.println(player);
		}
		
		HashSet<String> newTeam = new HashSet<String>(oldTeam);
		
		System.out.println("New Team : ");
		for(String player:newTeam) {
			System.out.println(player);
		}
		System.out.println("-----------------");
		Iterator<String> it =newTeam.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
	}

}
