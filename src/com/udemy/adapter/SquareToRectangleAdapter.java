package com.udemy.adapter;


class SquareToRectangleAdapter implements Rectangle {

    int side;

    public SquareToRectangleAdapter(Square square)
    {
       this.side = square.side;
    }

    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getHeight() {
        return side;
    }
}


class Square{
    public int side;

    public Square(int side)
    {
        this.side = side;
    }
}

interface Rectangle {
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class Demo {

    public static void main(String[] args) {


        Square square = new Square(2);


        SquareToRectangleAdapter squareToRectangleAdapter = new SquareToRectangleAdapter(square);

        squareToRectangleAdapter.getArea();

    }










}

