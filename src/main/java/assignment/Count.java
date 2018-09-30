package assignment;

public class Count {

	public static void main(String[] args) {
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new ButterFly(),
				new Cat()
				};
		
		countFly(animals);
		countWalk(animals);
		countSing(animals);
		countSwim(animals);
	}
	
	public static int countFly(Animal[] animals){
		int count = 0;
		for(int i=0 ;i<animals.length;i++){
			if(animals[i] instanceof FlyableAnimal) {
				count++;
				
			}
		}
		System.out.println("Flying Animals "+count);
		return count;
	}
	
	public static int countWalk(Animal[] animals){
		int count = 0;
		for(int i=0 ;i<animals.length;i++){
			if(animals[i] instanceof WalkableAnimal) {
				count++;
			}
		}
		System.out.println("Walking Animals "+count);
		return count;
	}
	
	public static int countSing(Animal[] animals){
		int count = 0;
		for(int i=0 ;i<animals.length;i++){
			if(animals[i] instanceof Bird) {
				count++;
			}
		}
		System.out.println("Singing Animals "+count);
		return count;
	}
	
	public static int countSwim(Animal[] animals){
		int count = 0;
		for(int i=0 ;i<animals.length;i++){
			if(animals[i] instanceof SwimmableAnimal) {
				count++;
			}
		}
		System.out.println("Swimming Animals "+count);
		return count;
	}
}
