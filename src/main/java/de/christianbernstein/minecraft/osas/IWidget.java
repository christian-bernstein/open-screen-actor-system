package de.christianbernstein.minecraft.osas;

import lombok.NonNull;

/**
 * @author Christian Bernstein
 */
public interface IWidget {

    void render(@NonNull final IActor actor, @NonNull final Vec2D<Integer> translation);

}
