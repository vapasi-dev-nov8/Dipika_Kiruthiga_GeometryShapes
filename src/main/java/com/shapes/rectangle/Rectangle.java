package com.shapes.rectangle;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea()
    {

        return length * width;

    }

    public double calculatePerimeter()
    {
        return 2 *(length+width);

    }
}
