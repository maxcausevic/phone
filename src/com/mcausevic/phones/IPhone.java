package com.mcausevic.phones;


public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "ring, ring, ring";
        // your code here
    }
    @Override
    public String unlock() {
		return "unlock";
        // your code here
    }
    @Override
    public void displayInfo() {
    	System.out.println("Iphone" + this.getVersionNumber() + "from" + this.getCarrier());            
    }
}


