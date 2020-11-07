package de.christianbernstein.minecraft.osas;

import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.function.Supplier;

/**
 * todo add support for {@link Vec2D.OrthogonalLine2D}
 *
 * @author Christian Bernstein
 */
public interface IActorStateContext {

    List<ItemStack> getSimpleState(@NonNull int width);

    @SuppressWarnings("unchecked")
    IActorStateContext set(@NonNull final ItemStack itemStack, @NonNull Vec2D<Integer>... vec2D);

    IActorStateContext fill(@NonNull final ItemStack itemStack, @NonNull Vec2D<Integer> pos1, @NonNull Vec2D<Integer> pos2);

    IActorStateContext fill(@NonNull final Supplier<ItemStack> itemStackSupplier, final ItemStack fillEmptyItemStack, @NonNull Vec2D<Integer> pos1, @NonNull Vec2D<Integer> pos2);

    IActorStateContext remove(@NonNull final Vec2D<Integer> vec2D);

}
