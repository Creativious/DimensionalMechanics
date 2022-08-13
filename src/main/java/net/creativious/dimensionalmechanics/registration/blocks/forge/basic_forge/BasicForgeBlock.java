package net.creativious.dimensionalmechanics.registration.blocks.forge.basic_forge;

import net.minecraft.block.Block;

public abstract class BasicForgeBlock extends Block {

    public BasicForgeBlockType basicForgeBlockType;

    public BasicForgeBlock(Settings settings) {
        super(settings);
    }

    public BasicForgeBlockType getBasicForgeBlockType() {
        return basicForgeBlockType;
    }
}
