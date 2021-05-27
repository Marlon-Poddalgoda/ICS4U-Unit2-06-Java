/**
 * This program creates an airplane and a jet instance using inheritance.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-26
 */

public final class FlyTest {
    private FlyTest() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method creates instances of an airplane and a jet.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, creates airplane and jet

        // basic info
        System.out.println("This program creates a biplane and "
                            + "a boeing jet instance.");
        System.out.println();

        // constants
        // speed of plane
        final int planeSpeed = 212;
        // speed of jet
        final int jetSpeed = 422;
        // jet multiplier
        final int boeingMin = 5000;
        // number of tests
        final int numOfTests = 4;
        // mulitplier
        final int multiplier = 2;

        // variables
        int counter = 0;

        // creating new biplane instance
        Airplane biplane = new Airplane();
        biplane.setSpeed(planeSpeed);
        System.out.println(biplane.getSpeed());

        // creating new jet instance
        Jet boeing = new Jet();
        boeing.setSpeed(jetSpeed);
        System.out.println(boeing.getSpeed());

        // loop for tests
        while (counter < numOfTests) {
            // accelerate jet
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            // if statement
            if (boeing.getSpeed() > boeingMin) {
                // biplane accelerate
                biplane.setSpeed(biplane.getSpeed() * multiplier);
            } else {
                // accelerate jet
                boeing.accelerate();
            }
            counter++;
        }

        // print final biplane speed
        System.out.println(biplane.getSpeed());
        System.out.println();
        System.out.println("Done.");
    }
}
