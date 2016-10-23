package item30;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlanetTest {

    @Test
    public void testSurfaceWeight() throws Exception {
        double earthWeight = 175;
        double earthMass = earthWeight / Planet.EARTH.getSurfaceGravity();
        for(Planet planet: Planet.values()) {
            System.out.printf("Wight on %s is %f%n", planet.toString(), planet.surfaceWeight(earthMass));
        }
    }
}