package practice.votingapp;

public class VotingApp{
	private static int registeredUserCount=0;
	private static RegisteredUserData[] voterData=new RegisteredUserData[100];
	
	public VotingApp() {
		
	}
	
	public VotingApp(String id,String name,String age,String country) {
		int userAge=Integer.parseInt(age);
		//Check For User Age
		if(userAge>=18) {
			//Check for User Country
			if(country.equalsIgnoreCase("in")||country.equalsIgnoreCase("nri")) {
				
				RegisteredUserData obj=new RegisteredUserData(id,name,age,country);
				voterData[registeredUserCount]=obj;
				registeredUserCount++;
				System.out.println("User Successfully Registered");
			
			}
			else {
				System.out.println("Only people fron India and NRI can cast vote.\nCheck the country you enetered");
			}
		}
		else {
			System.out.println("You have to wait "+(18-userAge)+" more years to Cast a Vote and register Yourself");
		}
	}
	
	//This function check that user is registered or not or his/her data matches or not for vote Casting
	public int checkForRegistration(String checkId,String checkName,String checkAge,String checkCountry) {

		for(int i=0;i<registeredUserCount;i++) {
			
			if(voterData[i].getId().equalsIgnoreCase(checkId)) {
				
				if(voterData[i].getName().equalsIgnoreCase(checkName)) {
					
					if(voterData[i].getAge().equalsIgnoreCase(checkAge)) {
						
						if(voterData[i].getCountry().equalsIgnoreCase(checkCountry)) {
							
							if(voterData[i].isVoteCasted()) {
								System.out.println("You already have casted vote!!!!");
								return -1;
							}
							
							else {
								voterData[i].setVoteCasted(true);
								System.out.println("You details are Matched");
								return i;
							}
							
						}
						else if(i==registeredUserCount-1) {
							System.out.println("Maybe you are not registered or you entered wrong Country");
							return -1;
						}
						
					}
					else if(i==registeredUserCount-1) {
						System.out.println("Maybe you are not registered or  you entered wrong Age");
						return -1;
					}
					
				}
				else if(i==registeredUserCount-1) {
					System.out.println("Maybe you are not registered or you entered wrong Name");
					return -1;
				}
				
			}
			else if(i==registeredUserCount-1) {
				System.out.println("Maybe you are not registered or you entered wrong ID");
				return -1;
			}
		}
		return -1;
		
	}
	
	
	
	public void castVote(String userInput,int userData) {
		if(userInput.equals("1")) {
			voterData[userData].setPartyVoted("BJP");
		}
		else if(userInput.equals("2")) {
			voterData[userData].setPartyVoted("Congress");
		}
		else if(userInput.equals("3")) {
			voterData[userData].setPartyVoted("AAP");
		}
		else if(userInput.equals("4")) {
			voterData[userData].setPartyVoted("ShivSena");
		}
		else if(userInput.equals("5")) {
			voterData[userData].setPartyVoted("TMC");
		}
		System.out.println("You have Successfully Voted "+voterData[userData].getPartyVoted());
	}
	
	
}
