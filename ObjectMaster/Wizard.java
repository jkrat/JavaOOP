public class Wizard extends Human{
	public Wizard() {
		setHealth(50);
		setIntelligence(8);
	}
	public void heal(Human h) {
		System.out.println("You're lucky I'm a wizard!");
		h.setHealth(h.getHealth() + this.getIntelligence());
	}
	public void fireball(Human h) {
		System.out.println("You shall not pass!");
		h.setHealth(h.getHealth() - this.getIntelligence() * 3);
	}
}