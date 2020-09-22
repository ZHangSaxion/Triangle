package nl.saxion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A test to detect whether the Triangle class has correct functions.
 * @author Ziru Hang 486545
 */
public class TriangleTest {

    /**
     *  To test whether the class can recognize the input is not a triangle.
     */
    @Test
    public void testNotTriangle(){
        Triangle notATriangle = new Triangle(1,2,4);
        assertEquals("not a triangle", notATriangle.getTypeBySides());
    }

    /**
     *  To test whether the class can recognize a equilateral triangle.
     */
    @Test
    public void testEquilateral(){
        Triangle equilateral = new Triangle(1,1,1);
        assertEquals("Equilateral", equilateral.getTypeBySides());
    }

    /**
     *  To test whether the class can recognize a isosceles triangle.
     */
    @Test
    public void testIsosceles(){
        Triangle isosceles = new Triangle(1, 2, 2);
        assertEquals("Isosceles", isosceles.getTypeBySides());
    }

    /**
     *  To test whether the class can recognize a scalene triangle
     */
    @Test
    public void testScalene(){
        Triangle scalene = new Triangle(2,3,4);
        assertEquals("Scalene", scalene.getTypeBySides());
    }
}