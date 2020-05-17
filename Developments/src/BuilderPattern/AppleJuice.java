package BuilderPattern;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:03 AM
 * In the below code I have created AppleJuice class which extends JuiceMaker abstract class.
 * In this class I implemented the abstract classes that are defined in the JuiceMaker class.
 * For example, setWater(), setFruit(), setSugar(), setIceCube(), setJuiceType().
 */

public class AppleJuice extends JuiceMaker {

    Juice createJuice() {
        return new Juice();
    }

    public void setWater() {
        System.out.println("Step 1 : Adding water into the juicer");
        getJuice().setWater(50);
    }

    public void setFruit() {
        System.out.println("Step 2 : Adding fruit into the juicer");
        getJuice().setFruit(6);
    }

    void setSugar() {
        System.out.println("Step 3 : Adding sugar into the juicer");
        getJuice().setSugar(20);
    }

    void setIceCube() {
        System.out.println("Step 4 : Adding 7 to 8 numbers of ice cubes into the juicer");
        getJuice().setIcecube(8);
    }

    void setJuiceType() {
        System.out.println("apple");
        getJuice().setJuicename("apple");
    }

}
