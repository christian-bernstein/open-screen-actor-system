package de.christianbernstein.minecraft.osas.render;

import de.christianbernstein.minecraft.osas.Vec2D;
import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.function.Supplier;

/**
 * todo add support for {@link Vec2D.OrthogonalLine2D}
 *
 * @author Christian Bernstein
 */
public interface IStateModifier {

    List<ItemStack> getSimpleState(@NonNull int width);

    @SuppressWarnings("unchecked")
    IStateModifier set(@NonNull final ItemStack itemStack, @NonNull final Vec2D<Integer>... vec2D);

    IStateModifier fill(@NonNull final ItemStack itemStack, @NonNull final Vec2D<Integer> pos1, @NonNull final Vec2D<Integer> pos2);

    IStateModifier fill(@NonNull final Supplier<ItemStack> itemStackSupplier, final ItemStack fillEmptyItemStack,
                        @NonNull final Vec2D<Integer> pos1, @NonNull final Vec2D<Integer> pos2);

    IStateModifier remove(@NonNull final Vec2D<Integer> vec2D);

}
