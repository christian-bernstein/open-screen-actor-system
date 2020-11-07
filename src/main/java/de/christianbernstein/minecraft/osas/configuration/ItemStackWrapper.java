package de.christianbernstein.minecraft.osas.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * @author Christian Bernstein
 */
@AllArgsConstructor
public class ItemStackWrapper implements IItemStackWrapper {

    @Setter
    @Getter
    private LocalizedString title;

    @Setter
    @Getter
    private List<LocalizedString> lore;

    @Setter
    @Getter
    private Material material;

    @Setter
    @Getter
    private int amount;

    @Setter
    @Getter
    private boolean glowing;

    @Setter
    @Getter
    private Meta meta;

    // todo implement!
    @Override
    public @NonNull ItemStack toItemStack() {
        throw new UnsupportedOperationException("not implemented!");
    }
}
