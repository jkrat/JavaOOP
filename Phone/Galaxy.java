public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() {
        String output = ("Galaxy says " + getRingTone());
        return output;
    }
    
    public String unlock() {
        return "Unlocking via finger print";
    }
    
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());          
    }
}