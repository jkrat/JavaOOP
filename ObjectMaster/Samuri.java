public class Samurai extends Human {
	private static int totalSamurai = 0;
	
	public Samurai() {
		setHealth(200);
		totalSamurai++;
	}
	public void deathBlow(Human h) {
		h.setHealth(0);
		setHealth(getHealth()/2);
	}
	public void meditate() {
		setHealth(getHealth() + getHealth()/2);
	}
	public static int howMany() {
		return totalSamurai;
	}
}