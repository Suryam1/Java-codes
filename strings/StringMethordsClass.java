package strings;

public class StringMethordsClass {

	public StringMethordsClass() {
		// TODO Auto-generated constructor stub
		String str=new String("Solar System");
		
		System.out.println(str);
		
		//METHORDS
		
		System.out.println(str.charAt(0));				//Gives Character at a given Index
		
		System.out.println(str.length());				//Gives Length of String
		
		System.out.println(str.toLowerCase());			//Convert String into LowerCase
		
		System.out.println(str.toUpperCase());			//Covert String into UpperCase
		
		String str2=new String("Our Universe");
		
		str=str.concat((" "+str2));						//Concatenate two Strings
		
		System.out.println(str);						
		
		System.out.println(str.isEmpty());				//Check if String is Empty or Not
		
		System.out.println(str.substring(6));			//Create a Substring of Given String from given Index
		
		System.out.println(str.substring(6,12));		//Create an Substring og Given String between that range
		
		System.out.println(str.startsWith("Solar"));	//Check if String is Start with Given String or Not
		
		System.out.println(str.endsWith("Universs"));	//Check if String is End with Given String or Not
		
		System.out.println(str.contains(str2));			//Check if String Contain given String or Not
		
		
		StringBuffer strBuffer=new StringBuffer(str);	//These methods are only in StringBuffer Class
		
		strBuffer.reverse();							//Used to reverse the String
		
		System.out.println(strBuffer);
		
		strBuffer.reverse();
		
		System.out.println(strBuffer);
		
		strBuffer.append(str2);							//Used to append given String in String at the end
		
		System.out.println(strBuffer);
		
		strBuffer.delete(25, 37);						//Used to delete from String between a given Index
		
		System.out.println(strBuffer);
		
		strBuffer.setCharAt(24, 'S');					//Used to setCharacter at any Particular Index
		
		System.out.println(strBuffer);
		
		strBuffer.deleteCharAt(24);						//Used to delete Character at any Particular Index
		
		System.out.println(strBuffer);
		
		strBuffer.insert(24, 'e');						//Used to insert at any particular Index
		
		System.out.println(strBuffer);
		
		
		
		
		String str3=new String("    Our World     ");
		
		System.out.println(str3);
		
		System.out.println(str3.trim());				//Used to remove Spaces from Start and End from String
		
		String str4=new String("ABCDABCDABCD");
		
		str4=str4.replace("A", "E");					//Used to replace a given Character with another Character
		
		System.out.println(str4);
		System.out.println("---------------------------------------");
	
	}

}
