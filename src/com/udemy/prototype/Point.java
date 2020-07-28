package com.udemy.prototype;

public class Point {

    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    public Line deepCopy(){
        return new Line(new Point(this.start.x, this.start.y), new Point(this.end.x, this.end.y));
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

class Demo{

    public static void main(String[] args) {



        Line line = new Line(new Point(1,2), new Point(3,4));
        Line line1 = line.deepCopy();

        System.out.println(line);
        System.out.println(line1);

        line1.start = new Point(5,6);

        System.out.println("\n");
        System.out.println(line);
        System.out.println(line1);

    }
}
