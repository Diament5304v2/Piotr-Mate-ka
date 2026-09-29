package com.example.mod;

import net.fabricmc.api.ModInitializer;

public class Mod implements ModInitializer {

    public static final String MOD_ID = "mod";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.initialize();
    }
}
