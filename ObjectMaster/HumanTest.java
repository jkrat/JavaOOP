
public class HumanTest {

	public static void main(String[] args) {
		Human joey = new Human();
		Human bobby = new Human();
		joey.attack(bobby);
		System.out.println(bobby.getHealth());
	}

}