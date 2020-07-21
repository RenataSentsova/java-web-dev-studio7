package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private static String capacity = "4.7GB";
    private static String dataTransferRate = "11MB/sec";

    public DVD (String name) {
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
        System.out.println("\nDVD");
        System.out.println("Name: " + getLabelName());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Data transfer rate: " + getDataTransferRate());
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void printHistoryFact() {
        System.out.println("The DVD, or Digital Video Disc, was invented by Philips, " +
                "Sony, Toshiba and Panasonic in 1995.");
    }

}
