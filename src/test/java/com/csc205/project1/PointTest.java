package com.csc205.project1;

import Project1.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void setPoint() {

        // Setup
        double expectedX = 5;
        double expectedY = 5;
        Point point = new Point(expectedX, expectedY);

        // Exercise
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }

    @Test
    void shiftX() {

        // Setup
        double expectedX = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.shiftX(1);
        double x = point.getX();

        // Assert
        assertEquals(expectedX, x);

    }

    @Test
    void shiftY() {

        // Setup
        double expectedY = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.shiftY(1);
        double y = point.getY();

        // Assert
        assertEquals(expectedY, y);
    }

    @Test
    void distance() {

        // Setup
        double expectedDistance = 5;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3,4);

        // Exercise

        double distance = point1.distance(point2);

        // Assert
        assertEquals(expectedDistance, distance);
    }

    @Test
    void rotate() {

        // Setup
        double expectedX = -5;
        double expectedY = 5;
        Point point = new Point(5, 5);

        // Exercise
        point.rotate(Math.PI / 2.0);
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }
}