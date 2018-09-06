public class Samuri extends Human {
	private static int totalSamuri = 0;
	
	public Samuri() {
		setHealth(200);
		totalSamuri++;
	}
	public void deathBlow(Human name) {
		name.setHealth(0);
		setHealth(getHealth()/2);
	}
	public void meditate() {
		setHealth(getHealth() + getHealth()/2);
	}
	public static int howMany() {
		return totalSamuri;
	}
}