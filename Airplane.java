/**
 * This is the class file is for the Airplane Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-26
 */

public class Airplane {
    // Class for airplane

    // fields
    /**
    * Current speed.
    */
    private int speed;

    // constructor
    /**
    * This contructor creates a base airplane.
    */
    public Airplane() {
        this.speed = 0; // starts at 0 km/h
    }

    // Getters
    /**
    * This getter returns the current speed.
    * @return speed This is the speed value.
    */
    public int getSpeed() {
        return this.speed;
    }

    //setters
    /**
    * This setter sets the current speed.
    * @param inputSpeed This is the inputted speed.
    */
    public void setSpeed(final int inputSpeed) {
        this.speed = inputSpeed;
    }
}
