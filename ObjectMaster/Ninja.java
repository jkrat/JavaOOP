public class Ninja extends Human {
	public Ninja() {
		setStealth(10);
	}
	public void steal(Human h) {
		h.setHealth(h.getHealth() - getStealth());
		this.setHealth(getHealth() + getStealth());
	}
	public void runAway() {
		setHealth(getHealth() - 10);
	}
}