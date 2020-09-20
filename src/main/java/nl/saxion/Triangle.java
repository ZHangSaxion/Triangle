package nl.saxion;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    private boolean isTriangle(){
        return sideA > 0 && sideB > 0 && sideC > 0
                && (sideA < (sideB + sideC)) && (sideB < (sideA + sideC)) && (sideC < (sideA + sideB));
    }

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
