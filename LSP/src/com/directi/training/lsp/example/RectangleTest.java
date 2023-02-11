package com.directi.training.lsp.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RectangleTest
{
    @Test
    public void testSetWidth_Rectangle()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testSetWidth_Square()
    {
        Rectangle rectangle = new Square();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        assertEquals(5, rectangle.getWidth());
        assertEquals(20, rectangle.getArea());
    }
}