package InterfacesTacoBoxes;

/**
 * TacoBox interface represents a box of tacos with methods to check the number of tacos remaining
 * and to eat a taco.
 */
public interface TacoBox {

    /**
     * Returns the number of tacos remaining in the box.
     * @return the number of tacos remaining
     */
    int tacosRemaining();

    /**
     * Simulates eating a taco from the box.
     */
    void eat();
}
