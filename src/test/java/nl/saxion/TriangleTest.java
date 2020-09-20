package nl.saxion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testNotTriangle(){
        Triangle notATriangle = new Triangle(1,2,4);
        assertEquals("not a triangle", notATriangle.getTypeBySides());
    }
    @Test
    public void testEquilateral(){
        Triangle equilateral = new Triangle(1,1,1);
        assertEquals("Equilateral", equilateral.getTypeBySides());
    }    @Test
    public void testIsosceles(){
        Triangle isosceles = new Triangle(1, 2, 2);
        assertEquals("Isosceles", isosceles.getTypeBySides());
    }    @Test
    public void testScalene(){
        Triangle scalene = new Triangle(2,3,4);
        assertEquals("Scalene", scalene.getTypeBySides());
    }
}