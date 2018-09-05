
public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("flying");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("eating humans");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("attacking");
		energyLevel -= 100;
	}
}