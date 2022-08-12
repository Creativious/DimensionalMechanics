package net.creativious.dimensionalmechanics;

import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.item.ItemGroup;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DimensionalMechanics implements ModInitializer {

    // https://misode.github.io helps with data generation
    public static final String MOD_ID = "dimensionalmechanics";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // init stuff
//        ((ItemGroupExtensions) ItemGroup.BUILDING_BLOCKS).fabric_expandArray();
//        ((ItemGroupExtensions) ItemGroup.BUILDING_BLOCKS).fabric_expandArray();
        RegistrationManager.init();
    }
}
