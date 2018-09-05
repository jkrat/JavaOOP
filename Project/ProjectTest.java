
public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project("Jim", "descrip");
        p1.setInitalCost(200.00);

        Project p2 = new Project("next", "doing the next thing");
        p2.setInitalCost(100.00);

        Project p3 = new Project("last", "do the last thing", 150.00);

        Portfolio port = new Portfolio();
        port.addProj(p1);
        port.addProj(p2);
        port.addProj(p3);
        port.showPortfolio();

        String output = p1.elevatorPitch();
        String output2 = p2.elevatorPitch();
        String output3 = p3.elevatorPitch();

        // System.out.println(output);
        // System.out.println(output2);
        // System.out.println(output3);
    }
}