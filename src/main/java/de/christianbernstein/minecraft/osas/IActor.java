package de.christianbernstein.minecraft.osas;

import lombok.NonNull;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Consumer;

/**
 * @author Christian Bernstein
 */
public interface IActor {

    void set(@NonNull int slot, ItemStack itemStack);

    void add(@NonNull ItemStack itemStack, Consumer<IActor> ifFull);

    void addWidget(@NonNull IWidget widget);

    @NonNull
    Inventory build();

    @NonNull
    Player getOwner(); 
}
