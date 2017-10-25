package org.tw.solid;

public class OpenClosedPrinciple {
    public Double calculate(Shape shape) {
        return shape.calculateArea();
    }
}

interface Shape {
    public Double calculateArea();
}

class Circle implements Shape {
    double radius;

    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double height;
    double width;

    public Double calculateArea() {
        return height * width;
    }
}