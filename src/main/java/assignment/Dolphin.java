package assignment;

public class Dolphin extends Animal implements SwimmableAnimal{

	
	
	public Dolphin(){}

	public void swim() {
		System.out.println("I am swimming");
		
	}
	
	public boolean ableToWalk(){return false;}

}
