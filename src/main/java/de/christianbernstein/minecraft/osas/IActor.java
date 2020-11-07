package de.christianbernstein.minecraft.osas;

import lombok.NonNull;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

/**
 * @author Christian Bernstein
 */
public interface IActor {

    void set(@NonNull int slot, @NonNull ItemStack itemStack, @NonNull String action);

    void add(@NonNull ItemStack itemStack, Consumer<IActor> ifFull);

    @NonNull
    int calcFreeSlots();

    @NonNull
    InventoryType getInventoryType();

    @NonNull
    Player getOwner();

    @NonNull
    boolean onComplete();

    @NonNull
    Inventory compile();

}
