package com.company.advanced.interfaces;

/*
        navigationInterface
            -calculateDistance
            -getFee
            -drawMap

        NavigateByCar, NavigateByWalking, NavigateByCycle, NavigateByCab


        GmapApp gmapp = new GmapApp();
        gmapp.calculateDistance()
        gmapp.getFee()
        gmapp.drawMap()
 */

public interface Shape {
    double area();
    void draw();
}
