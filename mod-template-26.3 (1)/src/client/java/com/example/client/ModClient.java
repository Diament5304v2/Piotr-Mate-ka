package com.example.mymod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Mod implements ModInitializer {

    public static final String MOD_ID = "mymod";

    public static final Block SUPER_BLOCK = Registry.register(
            Registries.BLOCK,
            Identifier.of(MOD_ID, "super_block"),
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK))
    );

    @Override
    public void onInitialize() {
        System.out.println("Super Block załadowany!");
    }
}
