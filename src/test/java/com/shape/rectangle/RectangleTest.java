package com.shape.rectangle;

import com.shapes.rectangle.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class RectangleTest {
    @Test
    void calculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(12, 2);

        assertEquals(24, rectangle.calculateArea());
    }

    @Test
    void calculatePerimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(10.5, 2);

        assertEquals(25, rectangle.calculatePerimeter());


    }
}
