package com.mcausevic.phones;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "ring, ring, ring";
    }
    @Override
    public String unlock() {
        return "unlock";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy" + this.getVersionNumber() + "from" + this.getCarrier());           
    }
}

