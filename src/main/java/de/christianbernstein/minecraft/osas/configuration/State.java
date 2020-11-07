package de.christianbernstein.minecraft.osas.configuration;

import de.christianbernstein.minecraft.osas.configuration.IState;
import de.christianbernstein.minecraft.osas.configuration.ItemGroup;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Christian Bernstein
 */
public class State implements IState {

    @Getter
    private final List<ItemGroup> groups = new ArrayList<>();

    @Override
    public List<ItemStack> getSimplified() {
        final List<ItemStack> stacks = new ArrayList<>();
        this.groups.forEach(group -> {
            group.getSlots().forEach(slot -> {
               stacks.set(slot, group.getStack().toItemStack());
            });
        });
        return stacks;
    }

    @Override
    public IState add(@NonNull ItemGroup group) {
        this.getGroups().add(group);
        return this;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<ItemGroup> iterator() {
        return this.getGroups().iterator();
    }
}
