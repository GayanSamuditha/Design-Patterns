package BuilderPattern;

/**
 * @author Gayan Samuditha
 * @created 17/05/2020 - 9:04 AM
 *
 * In the below code I have created an abstract class known as JuiceMaker. In this abstract class
 * I have declared Juice class variable as juice and implemented set() and get() methods for this variable.
 * Also I have created template method that creates Juice object and returns Juice and I have defined several
 * abstract methods such as setJuiceName(), setWater(), setFruit(), setSugar(), setIceCube(), createJuice().
 */

public abstract class JuiceMaker {

    private Juice juice;

    public Juice getJuice() {
        return juice;
    }

    public void setJuice(Juice juice) {
        this.juice = juice;
    }

    public final Juice makeJuice() {
        Juice juice = createJuice();
        setJuice(juice);
        setJuiceType();
        setWater();
        setFruit();
        setSugar();
        setIceCube();
        return juice;
    }

    abstract void setJuiceType();

    abstract void setWater();

    abstract void setFruit();

    abstract void setSugar();

    abstract void setIceCube();

    abstract Juice createJuice();



}
