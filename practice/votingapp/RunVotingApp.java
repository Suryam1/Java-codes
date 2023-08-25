package practice.votingapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunVotingApp {
	
	private String id,name,age,country;
	
	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getAge() {
		return age;
	}

	private void setAge(String age) {
		this.age = age;
	}

	private String getCountry() {
		return country;
	}

	private void setCountry(String country) {
		this.country = country;
	}

	public RunVotingApp() {
		// TODO Auto-generated constructor stub
	}
	
	public void runCode() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the operation you need to perfrom :-\n1. Register User\n2. Cast vote\n3. Exit Program");
		String choice=input.nextLine();
		while(!(choice.equals("3"))) {
			
			String regex1="[0-9]+";				//Regex Check For Only Numbers
			String regex2="^[a-zA-Z]*$";		//Regex Check For Only Alphabets
			
			//Code to Implement Regex
			Pattern numberPattern=Pattern.compile(regex1);	
			Pattern alphabetsPattern=Pattern.compile(regex2);
			
			//Taking Input for ID
			System.out.print("Enter your ID* : ");
			setId(input.nextLine().trim());
			
			//Code of Regex
			Matcher m=numberPattern.matcher(id);
			
			//Check for Id
			if(!(getId().equalsIgnoreCase(""))&&m.matches()) {
				
				//Taking Input for Name
				System.out.print("Enter your Name* : ");
				setName(input.nextLine().trim());
				
				//Code for regex
				m=alphabetsPattern.matcher(name);
				
				//Check for Name
				if(!(getName().equalsIgnoreCase(""))&&m.matches()) {
					
					//Take Input for Age
					System.out.print("Enter your Age (Only People above or 18 can register or cast vote)* : ");
					setAge(input.nextLine().trim());
					
					//Code for regex
					m=numberPattern.matcher(age);
					
					//Check for Age
					if(!(getAge().equalsIgnoreCase(""))&&m.matches()) {
						
						//Taking Input for Country
						System.out.print("Enter your Country* :- \nFor Indian type IN\nFor Non-Indian type NRI\n");
						setCountry(input.nextLine().trim());
						
						//Code for regex
						m=alphabetsPattern.matcher(country);
						
						//Check for Country
						if(!(getCountry().equalsIgnoreCase(""))&&m.matches()) {
							
							//To register User
							if(choice.equals("1")) {
								
								VotingApp newUser=new VotingApp(id,name,age,country);
							
							}
							
							//To cast Vote
							else if(choice.equals("2")) {
								
								VotingApp user=new VotingApp();
								int result=user.checkForRegistration(id,name,age,country);
								
								if(result!=-1) {
									
									System.out.println("Enter operation you need to Perform :- \n1. To vote BJP\n2. To vote Congress\n3. To vote AAP\n4. To vote Shivsena\n5. To vote TMC");
									String userInput=input.nextLine();
									user.castVote(userInput,result);
									System.out.println("Thanks for casting vote");
								
								}
								else {
									
									System.out.println("You cant cast vote!!!!");
								
								}
							}
							
							
						//Else cases for above If cases
							
						}
						else {
							System.out.println("Country cant be empty or Country can contain only alphabets.");
						}
					}
					else {
						System.out.println("Age cant be empty or Age can only contain numbers");
					}
					
				}
				else {
					System.out.println("Name cant be empty or Name can only contain alphabets");
				}
			}
			else {
				System.out.println("ID cant be empty or ID can only contain numbers");
			}
			
			System.out.println("Enter the operation you need to perfrom :-\n1. Register User\n2. Cast vote\n3. Exit Program");
			choice=input.nextLine();
//			System.out.println(!(choice.equals("3")));
		}
	}

}
