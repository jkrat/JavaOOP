public class AllTest {

	public static void main(String[] args) {
		// Human jim = new Human();
		// Wizard tim = new Wizard();
		// System.out.println(jim.getHealth());
		// tim.fireball(jim);
		// System.out.println(jim.getHealth());
		// tim.heal(jim);
		// System.out.println(jim.getHealth());
		
		// Human jimmy = new Human();
		// Ninja timmy = new Ninja();
		// timmy.steal(jimmy);
		// timmy.steal(jimmy);
		// timmy.runAway();
		// System.out.println(timmy.getHealth());
		// System.out.println(jimmy.getHealth());
		
		Human a = new Human();
		Samuri b = new Samuri();
		Samuri c = new Samuri();
		Samuri d = new Samuri();
		b.deathBlow(a);
		b.meditate();
		System.out.println(a.getHealth());
		System.out.println(b.getHealth());
		System.out.println("There are this many samuri: " + Samuri.howMany());
	}

}