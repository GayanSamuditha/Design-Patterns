package BuilderPattern;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:04 AM
 * In this below code I have created Juice class in which I have declared five private variables namely water,
 * fruit, sugar, icecube, juicename. Also we have implemented set() and get() methods for this variables.
 * For example, getwater() and setWater() methods.
 */

public class Juice {

    private int water;
    private int fruit;
    private int sugar;
    private int icecube;
    private String juicename;


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getFruit() {
        return fruit;
    }

    public void setFruit(int fruit) {
        this.fruit = fruit;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getIcecube() {
        return icecube;
    }

    public void setIcecube(int icecube) {
        this.icecube = icecube;
    }

    public String getJuicename() {
        return juicename;
    }

    public void setJuicename(String juicename) {
        this.juicename = juicename;
    }

    public String toString() {
        return "Cold" + juicename + "!!!!  [" + water + " ml of water, " + fruit + "as a fruit, " + sugar +
                " gm of sugar, " + icecube + " ml of " + juicename + "]\n";
    }


}
