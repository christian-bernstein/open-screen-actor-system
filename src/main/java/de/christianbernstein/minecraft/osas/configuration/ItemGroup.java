package de.christianbernstein.minecraft.osas.configuration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @author Christian Bernstein
 */
@RequiredArgsConstructor
public class ItemGroup {

    @Getter
    private final ItemStackWrapper stack;

    @Getter
    private final List<Integer> slots;

}
