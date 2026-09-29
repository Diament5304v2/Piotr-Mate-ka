package com.example.mod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SUPER_BLOCK = Registry.register(
            Registries.BLOCK,
            Identifier.of(Mod.MOD_ID, "super_block"),
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK))
    );

    public static void initialize() {
        System.out.println("Załadowano Super Block!");
    }
}
