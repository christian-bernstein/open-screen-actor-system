package de.christianbernstein.minecraft.osas.actors;

import de.christianbernstein.minecraft.osas.IActor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Christian Bernstein
 */
@RequiredArgsConstructor
public abstract class AbstractInventoryActor implements IActor {

    @Getter
    private final Player owner;

    private final List<ItemStack> state = new ArrayList<>();

    @Override
    public void set(@NonNull int slot, @NonNull ItemStack itemStack, @NonNull String action) {

    }

    @Override
    public void add(@NonNull ItemStack itemStack, Consumer<IActor> ifFull) {

    }

    @Override
    public @NonNull int calcFreeSlots() {
        return 0;
    }

    @Override
    public @NonNull InventoryType getInventoryType() {
        return null;
    }

    @Override
    public @NonNull boolean onComplete() {
        return true;
    }

    @Override
    public @NonNull Inventory compile() {
        return null;
    }
}
