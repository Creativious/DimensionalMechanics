package net.creativious.dimensionalmechanics.registration.blocks.ores;

import net.creativious.dimensionalmechanics.registration.ModBlock;
import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;

public class DimensionalShardOre extends ModBlock{

    public DimensionalShardOre() {
        super(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(10).luminance(8).drops(new Identifier("dimensionalmechanics:blocks/block_drops/dimensional_shard_ore")), new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).fireproof());

    }


    @Override
    protected void dropExperienceWhenMined(ServerWorld world, BlockPos pos, ItemStack tool, IntProvider experience) {
        if (!world.isClient()) {

        }
        super.dropExperienceWhenMined(world, pos, tool, experience);
    }
}
