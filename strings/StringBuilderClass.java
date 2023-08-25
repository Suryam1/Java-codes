package strings;

public class StringBuilderClass {

	public StringBuilderClass() {
		// TODO Auto-generated constructor stub
		StringBuilder str=new StringBuilder("Solar System");
		
		System.out.println(str);
		
		//Default Capacity is 16
		System.out.println(str.capacity()); //16+length
		
		System.out.println(str.length());	//Length
		
		str.insert(0, "Living ");
		
		System.out.println(str.capacity()); //16+length
		
		System.out.println(str.length());
		
		System.out.println(str);
		
		str.insert(0, "Our Universe : The ");	//16 + length
		
		System.out.println(str.capacity());
		
		System.out.println(str.length());
		
		System.out.println(str);
		
		//METHODS
		System.out.println(str.charAt(0));
		
		str.insert(0, 'T');
		System.out.println(str);
		
		str.insert(1, "he ");
		System.out.println(str);
		
		str.delete(3, 9);
		System.out.println(str);

		str.deleteCharAt(3);
		System.out.println(str);
		
		str.append('X');
		System.out.println(str);
		
		str.append(" Our Universe");
		System.out.println(str);
		
		str.delete(9,10);
		System.out.println(str);
		
		str.insert(3, " Solar ");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
	}

}
