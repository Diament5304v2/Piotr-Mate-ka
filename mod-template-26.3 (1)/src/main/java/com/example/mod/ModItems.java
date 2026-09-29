package com.example.mod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SUPER_BLOCK = Registry.register(
            Registries.ITEM,
            Identifier.of(Mod.MOD_ID, "super_block"),
            new BlockItem(ModBlocks.SUPER_BLOCK, new Item.Settings())
    );

    public static void initialize() {
        System.out.println("Załadowano itemy!");
    }
}
