public class Sharp extends TV implements IHighRes {
    public Sharp(String model, double ordinary_cost_dollars, int advertised_lifespan_months, int advertised_size_inches, int resolution) {
        this.make = "Sharp";
        this.model = model;
        this.cost_dollars = 2*ordinary_cost_dollars;
        this.lifespan_months = advertised_lifespan_months/2;
        this.on = false;
        this.channel = "300";
        this.size_inches = advertised_size_inches;
        this.resolution= resolution;
    }
    public void improveQuality() {
        this.resolution += 100;
    }
}