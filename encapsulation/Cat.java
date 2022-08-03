package encapsulation;

public class Cat {
	private int mood = 50;
	private int hungry = 50;
	private int energy = 50;
	
	
	
	public int getMood() {
		return mood;
	}

	public int getHungry() {
		return hungry;
	}

	public int getEnergy() {
		return energy;
	}

	public void sleep() {
		System.out.println("Sleep ...");
		energy++;
		hungry++;
	}
	
	public void play() {
		System.out.println("Play ...");
		mood++;
		energy--;
		meow();
	}
	
	public void feed() {
		System.out.println("Feed ...");
		mood++;
		hungry--;
		meow();
	}
	
	private void meow() {
		System.out.println("Meow (=^.^=)");
	}
	
}
