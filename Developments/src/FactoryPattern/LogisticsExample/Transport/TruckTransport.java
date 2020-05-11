package FactoryPattern.LogisticsExample.Transport;

/**
 * @author Gayan Samuditha
 * @created 11/05/2020 - 8:39 PM
 */

public class TruckTransport implements Transport {
    @Override
    public void load() {
        System.out.println("Loaded Truck with freight");
    }

    @Override
    public void drive() {
        System.out.println("Truck has hit the road");
    }

}

