package net.creativious.dimensionalmechanics.registration;

import net.creativious.dimensionalmechanics.DimensionalMechanics;
import net.creativious.dimensionalmechanics.registration.blocks.ores.DimensionalShardOre;
import net.creativious.dimensionalmechanics.registration.items.DimensionalShard;
import net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads.DiamondHammerHead;
import net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads.IronHammerHead;
import net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads.NetheriteHammerHead;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;

public class RegistrationManager {

    public static final HashMap<Identifier, Item> ITEMS = new HashMap<>();
    public static final HashMap<Identifier, ModBlock> BLOCKS = new HashMap<>();
    public static final HashMap<Identifier, TagKey<?>> TAGS = new HashMap<>();

    public static final ModBlock DIMENSIONAL_SHARE_ORE = BLOCKS.put(new Identifier(DimensionalMechanics.MOD_ID, "dimensional_shard_ore"), new DimensionalShardOre());
    public static final Item DIMENSIONAL_SHARD = ITEMS.put(new Identifier(DimensionalMechanics.MOD_ID, "dimensional_shard"), new DimensionalShard());
    public static final Item IRON_HAMMER_HEAD = ITEMS.put(new Identifier(DimensionalMechanics.MOD_ID, "iron_hammer_head"), new IronHammerHead());
    public static final Item DIAMOND_HAMMER_HEAD = ITEMS.put(new Identifier(DimensionalMechanics.MOD_ID, "diamond_hammer_head"), new DiamondHammerHead());
    public static final Item NETHERITE_HAMMER_HEAD = ITEMS.put(new Identifier(DimensionalMechanics.MOD_ID, "netherite_hammer_head"), new NetheriteHammerHead());

//    public static final ModItemGroup DIMENSIONAL_MECHANICS_MATERIALS = new ModItemGroup(new Identifier(DimensionalMechanics.MOD_ID, "dimensional_mechanics_materials"));
//
//    public static final ModItemGroup DIMENSIONAL_MECHANICS_TOOLS = new ModItemGroup(new Identifier(DimensionalMechanics.MOD_ID, "dimensional_mechanics_tools"));
    public static void init() {
//        ((ItemGroupExtensions) ItemGroup.BUILDING_BLOCKS).fabric_expandArray();
        handleRegistration();
//        DIMENSIONAL_MECHANICS_MATERIALS.setIcon(DIMENSIONAL_SHARD);
//        DIMENSIONAL_MECHANICS_TOOLS.setIcon(NETHERITE_HAMMER_HEAD);
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
