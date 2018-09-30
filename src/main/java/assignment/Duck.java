package assignment;

public class Duck  extends Bird implements SwimmableAnimal,FlyableAnimal {

	

	
	
	public String sing() {
		String sing = "Quack, quack";
		System.out.println(sing);
		return sing;
	}


	
	public Duck(){
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		
	}

	public void swim() {
		System.out.println("I am swimming");
		
	}



	public void fly() {
		System.out.println("I am flying");
		
	}

}
