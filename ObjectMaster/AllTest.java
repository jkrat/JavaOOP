public class AllTest {

	public static void main(String[] args) {
//		Human john = new Human();
//		Wizard trevor = new Wizard();
//		System.out.println(john.getHealth());
//		trevor.fireball(john);
//		System.out.println(john.getHealth());
//		trevor.heal(john);
//		System.out.println(john.getHealth());
		
//		Human broh = new Human();
//		Ninja naruto = new Ninja();
//		naruto.steal(broh);
//		naruto.steal(broh);
//		naruto.runAway();
//		System.out.println(naruto.getHealth());
//		System.out.println(broh.getHealth());
		
		Human butch = new Human();
		Samurai fred = new Samurai();
		Samurai kris = new Samurai();
		Samurai kenny = new Samurai();
		fred.deathBlow(butch);
		fred.meditate();
		System.out.println(butch.getHealth());
		System.out.println(fred.getHealth());
		System.out.println("There are this many samurai: " + Samurai.howMany());
	}

}