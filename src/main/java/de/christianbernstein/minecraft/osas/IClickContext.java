package de.christianbernstein.minecraft.osas;

import lombok.NonNull;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;

/**
 * @author Christian Bernstein
 */
public interface IClickContext {

    @NonNull
    InventoryAction getAction();

    @NonNull
    ClickType getType();

    @NonNull
    int getSlot();

}
