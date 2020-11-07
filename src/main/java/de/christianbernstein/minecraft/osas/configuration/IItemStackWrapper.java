package de.christianbernstein.minecraft.osas.configuration;

import lombok.NonNull;
import org.bukkit.Material;

import java.util.List;
import java.util.Locale;

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
    boolean isgGlowing();

    void setTitle(@NonNull Locale locale, @NonNull String title);

    void setLore(@NonNull List<String> lore);

    void setMaterial(@NonNull Material material);

    void setAmount(@NonNull int amount);

    void setGlowing(@NonNull boolean glowing);
}
