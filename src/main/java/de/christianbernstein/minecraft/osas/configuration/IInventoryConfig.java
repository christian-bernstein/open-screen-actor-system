package de.christianbernstein.minecraft.osas.configuration;

import lombok.NonNull;
import org.bukkit.event.inventory.InventoryType;

/**
 * @author Christian Bernstein
 */
public interface IInventoryConfig {

    LocalizedString getTitle();

    InventoryType getType();

    Meta getMeta();

    ItemStackWrapper getItemStack(@NonNull String id);



    // getX(x)
    // A simple way to set the value if it is absent, with auto saving in background

    @NonNull
    LocalizedString getTitleOr(final String title);

    @NonNull
    InventoryType getTypeOr(final InventoryType type);

    @NonNull
    Meta getMeta(final Meta meta);

    @NonNull
    ItemStackWrapper getItemStackOr(@NonNull String id, final ItemStackWrapper itemStackWrapper);


}
