import java.util.ArrayList;
public class LG extends TV implements IHighRes, ISmart {
    public LG(String model, double ordinary_cost_dollars, int advertised_lifespan_months, int advertised_size_inches, int resolution) {
        this.make = "LG";
        this.model = model;
        this.cost_dollars = 1.5*ordinary_cost_dollars;
        this.lifespan_months = advertised_lifespan_months/2;
        this.on = false;
        this.channel = "300";
        this.size_inches = advertised_size_inches;
        this.resolution= resolution;
    }
    public void improveQuality() {
        this.resolution += 100;

    }
    public void browse(String site) {

    }
    public void spy(ArrayList<String> history) {

    }
    public void connect(String SSID, String password) {
        System.out.println("Securely Connecting to "+SSID+" with password " + password);
        
    } 

}