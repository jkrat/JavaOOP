public class Gorilla extends Mammal{
    public Gorilla() {};

	public void throwThings() {
		System.out.println("throwing things");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("eating bananas");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("climbing");
		energyLevel -= 10;
	}
}