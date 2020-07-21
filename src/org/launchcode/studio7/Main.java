package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD dvd1 = new DVD("dvd1");
        CD cd1 = new CD("cd1");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        dvd1.getInfo();
        dvd1.printHistoryFact();
        dvd1.spinDisc();

        cd1.getInfo();
        cd1.printHistoryFact();
        cd1.spinDisc();

    }
}
