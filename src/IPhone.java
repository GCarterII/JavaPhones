
public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return this.getRingTone();
	}
	@Override
	public String unlock() {
		return "Unlock it with your mug!";
	}
	@Override
	public void displayInfo() {
		System.out.print("Iphone " + this.getVerisonNumber() + " from " + this.getCarrier());
		
	}
	
}
