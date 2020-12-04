import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationsTest {

    @Test
    void areaOfRectangle() {
        assertEquals(50, Equations.areaOfRectangle(5, 10));
    }

    @Test
    void areaOfTriangle() {
        assertEquals(2.0,Equations.areaOfTriangle(2,2));
    }

    @Test
    void circumferenceOfSphere() {
        assertEquals(6.283185307179586,Equations.circumferenceOfSphere(1));
    }
}