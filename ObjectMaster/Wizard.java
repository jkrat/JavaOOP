public class Wizard extends Human{
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	public void heal(Human name) {
		System.out.println("healing");
		name.setHealth(name.getHealth() + this.getIntelligence());
	}
	public void fireball(Human name) {
		System.out.println("fireball");
		name.setHealth(name.getHealth() - this.getIntelligence() * 3);
	}
}