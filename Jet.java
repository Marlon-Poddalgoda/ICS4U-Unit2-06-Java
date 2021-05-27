/**
 * This is the class file is for the Jet Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-26
 */

public class Jet extends Airplane {
    // Class for jet

    // fields
    /**
    * Multiplier constant.
    */
    private static final int MULTIPLIER = 2;

    // constructor
    /**
    * This contructor creates a base jet.
    */
    public Jet() {
        super();
    }

    //setters
    /**
    * This setter sets the jet speed.
    * @param inputSpeed This is the inputted speed.
    */
    public void setSpeed(final int inputSpeed) {
        super.setSpeed(MULTIPLIER * inputSpeed);
    }

    // methods
    /**
    * This method accelerates the jet.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
