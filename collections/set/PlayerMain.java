package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Player> player=new HashSet<>();
		
		player.add(new Player(101,"Carl",25,"Scotland",5));
		player.add(new Player(104,"John",34,"Wales",8));
		player.add(new Player(105,"Steve",26,"Northern Ireland",4));
		player.add(new Player(102,"Arthur",30,"Northern Ireland",6));
		player.add(new Player(102,"Phillip",25,"England",5));
		
		System.out.println(player); //using toString() method that we override
		
		Iterator<Player> it = player.iterator();
		while(it.hasNext()) {
			Player p=it.next();
			System.out.println(p);
		}
	}

}
