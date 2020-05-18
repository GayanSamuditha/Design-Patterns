package ChainOfResponsibilityPattern;

/**
 * @author Gayan Samuditha
 * @created 18/05/2020 - 9:35 AM
 */

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);

}
