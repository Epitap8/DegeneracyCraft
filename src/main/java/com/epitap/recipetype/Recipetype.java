package com.epitap.recipetype;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nullable;

public class Recipetype<T> implements IForgeRegistryEntry<Recipetype<?>> {
    @Override
    public Recipetype<?> setRegistryName(ResourceLocation name) {
        return null;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName() {
        return null;
    }

    @Override
    public Class<Recipetype<?>> getRegistryType() {
        return null;
    }


}
