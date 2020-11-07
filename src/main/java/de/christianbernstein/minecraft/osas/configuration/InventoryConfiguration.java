package de.christianbernstein.minecraft.osas.configuration;

import de.christianbernstein.minecraft.osas.IActor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.event.inventory.InventoryType;

/**
 * @author Christian Bernstein
 */
@Builder
public class InventoryConfiguration {

    @Getter
    @NonNull
    private final InventoryType type;

    @Getter
    @NonNull
    private final Class<? extends IActor> actorClass;


}
