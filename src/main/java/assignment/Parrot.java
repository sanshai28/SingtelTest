package assignment;

public class Parrot extends Bird implements FlyableAnimal {

	public Parrot() {

		// TODO Auto-generated constructor stub
	}

	public String sing(Dog dog) {
		String sing = "Woof, woof";
		System.out.println(sing);
		return sing;
	}
	
	public String sing(Cat cat) {
		String sing = "Meow";
		System.out.println(sing);
		return sing;
	}
	
	public String sing(Rooster rooster) {
		if(rooster == null) {
			rooster = new Rooster();
		}
		return rooster.sing();
	}

	public void fly() {
		System.out.println("I am flying");

	}

}
