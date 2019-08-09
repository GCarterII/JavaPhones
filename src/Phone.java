
public abstract class Phone {
	private String verisonNumber;
	private int batteryPrecentage;
	private String carrier;
	private String ringTone;
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.verisonNumber = versionNumber;
		this.batteryPrecentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	public abstract void displayInfo();

	public String getVerisonNumber() {
		return verisonNumber;
	}

	public void setVerisonNumber(String verisonNumber) {
		this.verisonNumber = verisonNumber;
	}

	public int getBatteryPrecentage() {
		return batteryPrecentage;
	}

	public void setBatteryPrecentage(int batteryPrecentage) {
		this.batteryPrecentage = batteryPrecentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}

}
