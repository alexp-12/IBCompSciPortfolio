package Project1.Code;

import java.util.Objects;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Math.abs(point.x- x) < 0.000001 &&
                Math.abs(point.y- y) < 0.000001;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    public double distanceFromOrigin(){
        return Math.sqrt(x*x+y*y);
    }

    public String getQuadrant(){

        if (x>0 && y>0){
            return "1";
        }
        else if (x<0 && y>0){
            return "2";
        }
        else if (x<0 && y<0){
            return "3";
        }
        else if (x>0 && y<0){
            return "4";
        }
        else if (x==0 || y==0){
            return "Axes";
        }
        else {
            return "null";
        }
    }

}