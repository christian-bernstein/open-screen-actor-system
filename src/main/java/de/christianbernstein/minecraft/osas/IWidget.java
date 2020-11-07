package de.christianbernstein.minecraft.osas;

import lombok.NonNull;

/**
 * @author Christian Bernstein
 */
public interface IWidget {

    @NonNull
    Vec2D<Integer> getOrigin();

    void render(@NonNull final IActor actor);

}
