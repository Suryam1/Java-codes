package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Playlist {

	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Collection<String> player = new ArrayList<>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		
		System.out.println(player);
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		/*
		List<String> player = new ArrayList<>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		
		System.out.println(player);
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		
		/*
		ArrayList<String> player = new ArrayList<String>();		//Both are valid
		//ArrayList<String> player = new ArrayList<>();
		
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		
		System.out.println(player);
		
		for(String name:player) {
			System.out.println(name);
		}
		*/
		
		
		ArrayList<String> oldTeam = new ArrayList<String>();
		
		oldTeam.add("Player_01");
		oldTeam.add("Player_02");
		oldTeam.add("Player_03");
		oldTeam.add("Player_04");
		oldTeam.add("Player_05");
		
		ArrayList<String> newTeam = new ArrayList<String>(oldTeam);
		
		newTeam.add("Player_06");
		
		
		for(String name:newTeam) {
			System.out.println(name);
		}
		System.out.println("------------------");
		
		
		Iterator<String> teamIterator = newTeam.iterator();
		
		while(teamIterator.hasNext()) {
			String player=teamIterator.next();
			System.out.println(player);
		}
		
		
		ListIterator<String> teamListIterator = newTeam.listIterator(newTeam.size());
		
		
		
	}

}
