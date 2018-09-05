public class SLL {
    public Node head;
    public SLL() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public void remove(int value) {
        if(head != null) {
            if(value == head.value) {
                head = head.next;
                head.next = null;
            } else {
                Node runner = head;
                Node prev = head;
                while(runner.next != null) {
                    runner = runner.next;
                    if (value == runner.value) {
                        prev.next = runner.next;
                        runner.next = null;
                        break;
                    }
                    prev = runner;
                }
            }
        }
    }
    public void printValues() {
        if(head != null) {
            Node runner = head;
            while(runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }
}