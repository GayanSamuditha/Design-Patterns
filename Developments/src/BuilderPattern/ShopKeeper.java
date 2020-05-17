package BuilderPattern;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:03 AM
 * In the below code I have created Shopkeeper class in which I have implemented takeOrder() method with
 * one argument as juiceType. In this method I defined that if customer orders orange juice then the
 * shopkeeper will make orange juice. Similarly for apple juice order.
 */

public class ShopKeeper {

    public static Juice takeOrder(String juiceType) {

        JuiceMaker juiceMaker = null;

        if (juiceType.equalsIgnoreCase("orange")) {
            juiceMaker = new OrangeJuice();
        } else if (juiceType.equalsIgnoreCase("apple")) {
            juiceMaker = new AppleJuice();
        } else {
            System.out.println("Sorry we don't take order for  " + juiceType);
        }
        return juiceMaker.makeJuice();
    }

}
