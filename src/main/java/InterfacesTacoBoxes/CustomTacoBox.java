package InterfacesTacoBoxes;

/**
 * CustomTacoBox class represents a custom taco box that implements the TacoBox interface.
 */
public class CustomTacoBox implements TacoBox {

    private int tacos; // Number of tacos in the box

    /**
     * Constructor for CustomTacoBox class.
     * @param tacos the initial number of tacos in the box
     */
    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    /**
     * Returns the number of tacos remaining in the box.
     * @return the number of tacos remaining
     */
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    /**
     * Simulates eating a taco from the box by decrementing the taco count.
     */
    @Override
    public void eat() {
        this.tacos -= 1;
    }
}
