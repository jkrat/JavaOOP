public class Ninja extends Human {
	public Ninja() {
		setStealth(10);
	}
	public void steal(Human name) {
		name.setHealth(name.getHealth() - getStealth());
		this.setHealth(getHealth() + getStealth());
	}
	public void runAway() {
		setHealth(getHealth() - 10);
	}
}