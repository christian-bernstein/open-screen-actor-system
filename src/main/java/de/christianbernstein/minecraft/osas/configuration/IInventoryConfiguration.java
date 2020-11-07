package de.christianbernstein.minecraft.osas.configuration;

import lombok.NonNull;
import org.bukkit.event.inventory.InventoryType;

import java.util.Locale;

/**
 * @author Christian Bernstein
 */
public interface IInventoryConfiguration {

    @NonNull
    InventoryType getType();

    @NonNull
    String getTitleOr(final Locale locale, final String title);

}
