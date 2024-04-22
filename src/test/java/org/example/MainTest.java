package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    public void testCircle() {
        Circle circle = new Circle("Circle", 5);
        assertEquals("Circle", circle.getName());
        assertEquals(78.53981633974483, circle.area(), 0.0001);
        assertEquals(31.41592653589793, circle.perimeter(), 0.0001);
    }

    @Test
    public void testSquare() {
        Square square = new Square("Square", 4);
        assertEquals("Square", square.getName());
        assertEquals(16.0, square.area(), 0.0001);
        assertEquals(16.0, square.perimeter(), 0.0001);
    }

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        assertEquals("Triangle", triangle.getName());
        assertEquals(6.0, triangle.area(), 0.0001);
        assertEquals(12.0, triangle.perimeter(), 0.0001);
    }

    @Test
    public void testRedColor() {
        Red red = new Red();
        assertEquals("Red", red.name);
    }

    @Test
    public void testBlueColor() {
        Blue blue = new Blue();
        assertEquals("Blue", blue.name);
    }

    @Test
    public void testGreenColor() {
        Green green = new Green();
        assertEquals("Green", green.name);
    }
}

