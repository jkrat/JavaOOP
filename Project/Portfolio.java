import java.util.ArrayList;

public class Portfolio{
    private ArrayList<Project> projects;
    
    public Portfolio(){
        projects = new ArrayList<Project>();
    }

    public void addProj(Project proj){
        projects.add(proj);
    }

    public String getPortfolioCost(){
        double total = 0;
        for (Project x : projects){
            total += x.getInitalCost();
        }
        String output = "Total cost: $" + total;
        return output;
    }

    public void showPortfolio(){
        for (Project x : projects){
            System.out.println(x.elevatorPitch());
        }
        System.out.println(getPortfolioCost());
    }

}