package Obj.Practice;

public class MayICopyYou {
	public String name;
	
	public MayICopyYou(String name) {
		this.name=name;
	}
	
	public MayICopyYou(MayICopyYou obj) {
		this.name=obj.name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayICopyYou obj=new MayICopyYou("TIM");
		MayICopyYou objC=new MayICopyYou(obj);
				
	}

}
