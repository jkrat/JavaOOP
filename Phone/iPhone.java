public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
   
    public String ring() {
        String output = ("iPhone says " + getRingTone());
        return output;
    }
    
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    
    public void displayInfo() {
        System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier());           
    }
}