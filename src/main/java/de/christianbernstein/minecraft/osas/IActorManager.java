package de.christianbernstein.minecraft.osas;

import lombok.NonNull;
import org.bukkit.inventory.Inventory;

import java.util.UUID;

/**
 * @author Christian Bernstein
 */
public interface IActorManager {

    void add(@NonNull final Inventory inventory);

    void removeOf(@NonNull final UUID uuid);

    Inventory of(@NonNull final UUID uuid);
}
