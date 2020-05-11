package FactoryPattern.LogisticsExample.Transport;

/**
 * @author Gayan Samuditha
 * @created 11/05/2020 - 8:40 PM
 */
public class SeaTransport implements Transport {

    @Override
    public void load() {
        System.out.println("Loaded ship with freight");
    }

    @Override
    public void drive() {
        System.out.println("Ship has set Sail");
    }
}
