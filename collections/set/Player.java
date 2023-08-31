package collections.set;

import java.util.Objects;

public class Player {

	private int id;
	private String name;
	private int age;
	private String location;
	private int goals;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

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

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}

	public Player(int id,String name,int age,String location,int goals) {
		// TODO Auto-generated constructor stub
		setId(id);
		setName(name);
		setAge(age);
		setLocation(location);
		setGoals(goals);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null || getClass()!=o.getClass())return false;
		Player player = (Player) o;
		return id==player.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return "\n"+ "Player { "+"id = "+getId()+" name = "+getName()+" age = "+getAge()+" location = "+getLocation()+" goals = "+getGoals()+" } \n";
	}

}
