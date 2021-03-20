package com.company.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits(peg)) {
            System.out.println("Round peg fits in round hole");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (hole.fits(smallPegAdapter)) {
            System.out.println("Square fits in round hole");
        }

        if (!hole.fits(largePegAdapter)) {
            System.out.println("Square does not fits in round hole");
        }

    }
}
