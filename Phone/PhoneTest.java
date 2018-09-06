public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring Ring Ring!");
        iPhone iphoneTen = new iPhone("X", 100, "AT&T", "Zing!");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.ring());

        iphoneTen.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.ring());
    }
}