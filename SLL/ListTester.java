public class ListTester {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove(4);
        sll.remove(2);
        sll.printValues();
    }
}