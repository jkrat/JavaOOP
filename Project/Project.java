public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {};

    public Project(String name) {
        this.name = name;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        initialCost = cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setInitalCost(double initialCost) {
        this.initialCost = initialCost;
    }
    public double getInitalCost() {
        return initialCost;
    }
    public String elevatorPitch() {
        String output = this.name + " ($" + this.initialCost + ") : " + this.description;
        return output;
    }
}