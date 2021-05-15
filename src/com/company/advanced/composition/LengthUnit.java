package com.company.advanced.composition;

public enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

    double value;

    LengthUnit(double value) {
        this.value = value;
    }

    double convertToMeters() {
        return value;
    }
}
