//package FactoryPattern;
//
//import FactoryPattern.LogisticsExample.CreateLogistics;
//import FactoryPattern.LogisticsExample.Transport.Transport;
//
///**
// * @author Gayan Samuditha
// * @created 11/05/2020 - 6:14 PM
// */
//
//
//public class LogisticsDriver {
//
//    public static void main(String[] args) {
//
//        CreateLogistics cl = new CreateLogistics();
//        System.out.println("Handling Land Logistics");
//
//        Transport truck = cl.createTransport("LAND");
//        truck.load();
//        truck.drive();
//        System.out.println("Handling Sea Logistics");
//
//        Transport ship = cl.createTransport("SEA");
//        ship.load();
//        ship.drive();
//
//    }
//}
