package Project1.Tests;

import Project1.Code.LineSegment;
import Project1.Code.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineSegmentTest {

    @Test
    public void subDivide() {

        Point a = new Point(1,1);
        Point b = new Point(5,5);
        LineSegment LineSegment = new LineSegment(a,b);
        Point[] actual = LineSegment.subDivide(4);
        Point[] expected = new Point[5];
        expected[0]=a;
        expected[1]= new Point(2,2);
        expected[2]= new Point(3,3);
        expected[3]= new Point(4,4);
        expected[4]=b;
        assertArrayEquals(expected,actual);
    }

    @Test
    public void subDivide2() {

        Point a = new Point(-3 ,-5);
        Point b = new Point(4,6);
        LineSegment LineSegment = new LineSegment(a,b);
        Point[] actual = LineSegment.subDivide(3);
        Point[] expected = new Point[4];
        expected[0]=a;
        expected[1]= new Point(-2.0/3,-4.0/3);
        expected[2]= new Point(5.0/3,7.0/3);
        expected[3]=b;
        assertArrayEquals(expected,actual);
    }
}