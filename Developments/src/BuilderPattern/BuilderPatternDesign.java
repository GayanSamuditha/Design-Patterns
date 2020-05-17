package BuilderPattern;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:02 AM
 * In the below code I have created BuilderPatternDesign class in which I have implemented main() method.
 * Inside this main() method I have created Juice class object such as orange and apple and called takeOrder()
 * method of Shopkeeper class.
 */


public class BuilderPatternDesign {

    public static void main(String[] args) {

        Juice orange = ShopKeeper.takeOrder("orange");
        System.out.println(orange);

        Juice apple = ShopKeeper.takeOrder("apple");
        System.out.println(apple);

    }
}
