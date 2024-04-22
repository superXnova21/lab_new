package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String getName() {
        return name;
    }
}

class Circle extends Shape {
    private float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private float sideLength;

    public Square(String name, float sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}

class Triangle extends Shape {
    private float side1;
    private float side2;
    private float side3;

    public Triangle(String name, float side1, float side2, float side3) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Color {
    String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("Color: " + name);
    }
}

class Red extends Color {
    public Red() {
        super("Red");
    }
}

class Blue extends Color {
    public Blue() {
        super("Blue");
    }
}

class Green extends Color {
    public Green() {
        super("Green");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5);
        Shape square = new Square("Square", 5);
        Shape triangle = new Triangle("Triangle", 3, 4, 5);

        System.out.println(circle.getName() + " Area: " + circle.area() + " Perimeter: " + circle.perimeter());
        System.out.println(square.getName() + " Area: " + square.area() + " Perimeter: " + square.perimeter());
        System.out.println(triangle.getName() + " Area: " + triangle.area() + " Perimeter: " + triangle.perimeter());

        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();

        red.showColor();
        blue.showColor();
        green.showColor();
    }
}