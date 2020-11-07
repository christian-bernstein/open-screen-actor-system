package de.christianbernstein.minecraft.osas;

import lombok.NonNull;

/**
 * @author Christian Bernstein
 */
public interface IActionHandler {

    @NonNull
    DragResult handle(@NonNull final IClickContext context);

}
