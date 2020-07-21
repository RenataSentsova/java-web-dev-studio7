package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private static String capacity = "700MB";
    private static String dataTransferRate = "1.6MB/sec";

    public CD (String name) {
        super(name);
    }

    public String getCapacity() {
        return capacity;
    }

    public String getDataTransferRate() {
        return dataTransferRate;
    }

    @Override
    public void getInfo() {
        System.out.println("\nCD");
        System.out.println("Name: " + getLabelName());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Data transfer rate: " + getDataTransferRate());
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void printHistoryFact() {
        System.out.println("The CD, or Compact Disc, was introduced by the Philips company in 1979.");
    }

}
