package Project1.Code;

public class LineSegment {
    private Point a;
    private Point b;

    public LineSegment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point[] subDivide(int subSegments){
        Point[] retVal = new Point[subSegments+1];
        retVal[0]=a;

        double xdiff=(b.x-a.x)/subSegments;
        double ydiff=(b.y-a.y)/subSegments;

        for (int i = 1; i < subSegments; i++) {
            Point p=new Point(a.x+xdiff*i,a.y+ydiff*i);
            retVal[i]=p;
        }
        retVal[subSegments]=b;

        return retVal;
    }

}
