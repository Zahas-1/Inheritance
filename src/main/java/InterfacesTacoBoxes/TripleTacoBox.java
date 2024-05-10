package InterfacesTacoBoxes;

/**
 * TripleTacoBox class represents a taco box that initially contains three tacos.
 * It implements the TacoBox interface.
 */
public class TripleTacoBox implements TacoBox {
    private int tacos;

    /**
     * Constructs a TripleTacoBox object with three tacos.
     */
    public TripleTacoBox(){
        this.tacos = 3;
    }

    /**
     * Retrieves the number of tacos remaining in the box.
     * @return the number of tacos remaining
     */
    @Override
    public int tacosRemaining(){
        return this.tacos;
    }

    /**
     * Simulates eating a taco from the box by decrementing the number of tacos.
     */
    @Override
    public void eat(){
        this.tacos -= 1;
    }
}
