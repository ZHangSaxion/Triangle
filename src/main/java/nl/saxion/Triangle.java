package nl.saxion;

/**
 * A class to detect what the type is of a triangle based on its sides.
 * @author Ziru Hang 486545
 */

/*
 * Log of SonarLint
 * Analysing 'TriangleTest.java'...
 * Analysing 'Triangle.java'...
 * Found 0 issues
 *
 * adding this comment for assignment 2
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     *  To create a new triangle based on input side lengths.
     * @param a, b, c are the length in double of three sides.
     */
    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    /**
     * To detect whether the input triangle is a valid triangle.
     * @return true when the input sides can create a triangle, false when not.
     */
    private boolean isTriangle(){
        return sideA > 0 && sideB > 0 && sideC > 0
                && (sideA < (sideB + sideC)) && (sideB < (sideA + sideC)) && (sideC < (sideA + sideB));
    }

    /**
     * To return the type of triangle or it is not a triangle.
     * @return the type of this triangle (or not a triangle) in string.
     */
    public String getTypeBySides() {
        if (isTriangle()) {
            if (sideA == sideB && sideA == sideC)
                return "Equilateral";
            else if (sideA == sideB || sideA == sideC || sideB == sideC)
                return "Isosceles";
            else
                return "Scalene";

        }
        return "not a triangle";
    }
}
