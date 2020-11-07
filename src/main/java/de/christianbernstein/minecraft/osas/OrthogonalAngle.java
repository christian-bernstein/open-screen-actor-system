package de.christianbernstein.minecraft.osas;

import lombok.Getter;

/**
 * @author Christian Bernstein
 */
public enum OrthogonalAngle {

    ANGLE_0(0.0),
    ANGLE_90(90.0),
    ANGLE_180(180.0),
    ANGLE_270(270.0);

    @Getter
    private final double value;

    OrthogonalAngle(double d) {
        value = d;
    }
}
