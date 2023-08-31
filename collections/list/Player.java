package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Player {
	
	private String name;
	private int age;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player(String name,int age) {
		// TODO Auto-generated constructor stub
		setName(name);
		setAge(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> player=new ArrayList<Player>();
		
		player.add(new Player("Messi",38));
		player.add(new Player("Ronaldo",40));
		player.add(new Player("Neymar",30));
		
		System.out.println(player+"\n");
		
		for(Player p:player) {
			System.out.println(p.getName()+" "+p.getAge());
		}
		System.out.println();
		
		//forward
		ListIterator<Player> it_F=player.listIterator();   //no need to pass the size,if passed then no output will be given
		while(it_F.hasNext()){
			Player p=it_F.next();       
			//System.out.println(p);   //prints the object not the values
			System.out.println(p.getName()+" -> "+p.getAge());
		}
				
		//backward
		ListIterator<Player> it_B=player.listIterator(player.size());//mandatory to pass size,if not than no output will be given
		while(it_B.hasPrevious()){
			Player p=it_B.previous();       
			//System.out.println(p);   //prints the object not the values
			System.out.println(p.getName()+" -> "+p.getAge());
		}

	}

}
