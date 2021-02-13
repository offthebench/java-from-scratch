package com.company.designpatterns.creational.prototype;

public class Square extends Shape {

    public int width;
    public int height;

    public Square() {

    }

    public Square(Square target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        if (width != square.width) return false;
        return height == square.height;
    }
}
