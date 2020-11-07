package de.christianbernstein.minecraft.osas.configuration;

import lombok.NonNull;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * @author Christian Bernstein
 */
public interface IItemStackWrapper {

    @NonNull
    LocalizedString getTitle();

    @NonNull
    List<LocalizedString> getLore();

    @NonNull
    Material getMaterial();

    @NonNull
    int getAmount();

    @NonNull
    boolean isGlowing();

    @NonNull
    Meta getMeta();

    void setTitle(@NonNull LocalizedString title);

    void setLore(@NonNull List<LocalizedString> lore);

    void setMaterial(@NonNull Material material);

    void setAmount(@NonNull int amount);

    void setGlowing(@NonNull boolean glowing);

    void setMeta(@NonNull Meta meta);

    @NonNull
    ItemStack toItemStack();
}
