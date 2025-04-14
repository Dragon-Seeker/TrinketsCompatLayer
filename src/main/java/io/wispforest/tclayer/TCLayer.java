package io.wispforest.tclayer;

import io.wispforest.tclayer.compat.config.TCLayerConfig;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TCLayer implements ModInitializer {

    public static final TagKey<Item> ALL_TRINKET_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of("tclayer", "all_trinket_items"));

    public final static TCLayerConfig CONFIG = TCLayerConfig.createAndLoad();

    @Override
    public void onInitialize() {}
}
