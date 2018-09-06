public class HumanTest {

	public static void main(String[] args) {
		Human jim = new Human();
		Human tim = new Human();
		jim.attack(tim);
		System.out.println(tim.getHealth());
	}

}