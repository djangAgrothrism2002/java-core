package oop.Record;

import java.util.*;



record PointTest(double x, double y) {
    // A custom constructor
    public PointTest() {
        this(0, 0);
    }
    
    // A method
    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }
    
    // A static field and method
    public static PointTest ORIGIN = new PointTest();
    
    public static double distance(PointTest p, PointTest q) {
        return Math.hypot(p.x - q.x, p.y - q.y);
    }
}

record PointTestInTime(double x, double y, Date when) { }

record RangeTest(int from, int to) {
    // A compact constructor
    public RangeTest {
        if (from > to) { // Swap the bounds
            int temp = from;
            from = to;
            to = temp;
        }
    }
}


public class RecordTest {
    public static void main(String[] args) {
        var p = new PointTest(3, 4);
        System.out.println("Coordinates of p: " + p.x() + " " + p.y());
        System.out.println("Distance from origin: " + p.distanceFromOrigin());
        
        // Same computation with static field and method
        System.out.println("Distance from origin: " + PointTest.distance(PointTest.ORIGIN, p));
        
        // A mutable record
        var pt = new PointTestInTime(3, 4, new Date());
        System.out.println("Before: " + pt);
        pt.when().setTime(0);
        System.out.println("After: " + pt);
        
        // Invoking a compact constructor
        var r = new RangeTest(4, 3);
        System.out.println("r: " + r);
    }
}