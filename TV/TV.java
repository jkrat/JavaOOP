import java.util.ArrayList;

public abstract class TV {
    public String make;
    public String model;
    public double cost_dollars;
    public int lifespan_months;
    public boolean on;
    public String channel;
    public int size_inches;
    
    
    private ArrayList<String> subscription;
    protected int resolution;        
    private ArrayList<String> history;

    public void toggle() {
        on = !on;
    };
    public void changeChannel(String channel) {};            
}