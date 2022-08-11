package net.creativious.dimensionalmechanics.registration;

import net.creativious.dimensionalmechanics.DimensionalMechanics;
import net.creativious.dimensionalmechanics.registration.blocks.ores.DimensionalShardOre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class RegistrationManager {

    public static final HashMap<Identifier, Item> ITEMS = new HashMap<>();
    public static final HashMap<Identifier, ModBlock> BLOCKS = new HashMap<>();
    public static final HashMap<Identifier, TagKey<?>> TAGS = new HashMap<>();

    public static final ModBlock DIMENSIONAL_SHARE_ORE = BLOCKS.put(new Identifier(DimensionalMechanics.MOD_ID, "dimensional_shard_ore"), new DimensionalShardOre());

    public static void init() {
        handleRegistration();
    }


    /**
     * handleRegistration()
     *
     * Blocks are registered then Items are registered
     *
     * In that order as Block registration creates additional items
     */
    private static void handleRegistration() {
        BLOCKS.forEach((RegistrationManager::registerBlock));
        ITEMS.forEach((RegistrationManager::registerItem));
    }


    private static void registerBlock(Identifier identifier, ModBlock modBlock) {
        Registry.register(Registry.BLOCK, identifier, modBlock);
        if (modBlock.containsItem) {
            Registry.register(Registry.ITEM, identifier, modBlock.item);
        }
    }


    private static void registerTag() {

    }

    private static void registerItem(Identifier identifier, Item item) {
        Registry.register(Registry.ITEM, identifier, item);
    }



}
