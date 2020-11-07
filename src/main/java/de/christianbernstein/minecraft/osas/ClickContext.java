package de.christianbernstein.minecraft.osas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;

/**
 * @author Christian Bernstein
 */
@AllArgsConstructor
public class ClickContext implements IClickContext {

    @Getter
    private final InventoryAction action;

    @Getter
    private final ClickType type;

    @Getter
    private final int slot;

}
