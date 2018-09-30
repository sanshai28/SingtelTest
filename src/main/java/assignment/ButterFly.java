package assignment;

public class ButterFly extends Animal implements Insect {

	private Insect state = new CaterpillarState();

    public boolean fly() { return state.fly(); }
    public void walk() {  }
    public boolean sound() { return state.sound(); }

    void transform() { state = new ButterflyState(); }

    private class ButterflyState implements Insect {
    	public boolean fly() { return true; }
    	public void walk() {  }
    	public boolean sound() { return false; } 
    }

    private class CaterpillarState implements Insect {
    	public boolean fly() { return false; }
    	public void walk() {  }
    	public boolean sound() { return true; }             
    }
}


