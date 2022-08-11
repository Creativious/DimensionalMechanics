package net.creativious.dimensionalmechanics.registration.blocks.ores;

import net.creativious.dimensionalmechanics.registration.ModBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DimensionalShardOre extends ModBlock{

    public DimensionalShardOre() {
        super(FabricBlockSettings.of(Material.STONE).requiresTool(), new FabricItemSettings().group(ItemGroup.MISC));

    }



}
