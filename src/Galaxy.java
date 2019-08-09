
public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return this.getRingTone();
	}
	@Override
	public String unlock() {
		return "face, finger, or pin";
	}
	@Override
	public void displayInfo() {
		System.out.println("Galaxuy " + this.getVerisonNumber() + " from " + this.getCarrier());
		
	}
	
}
