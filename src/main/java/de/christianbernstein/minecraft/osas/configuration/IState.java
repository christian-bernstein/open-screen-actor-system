package de.christianbernstein.minecraft.osas.configuration;

import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * @author Christian Bernstein
 */
public interface IState extends Iterable<ItemGroup> {

    List<ItemStack> getSimplified();

    List<ItemGroup> getGroups();

    IState add(@NonNull ItemGroup group);
}
