package net.creativious.dimensionalmechanics.registration;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public abstract class ModBlock extends Block{

    public Item item;

    public boolean containsItem;

    public ModBlock(AbstractBlock.Settings blockSettings, Item.Settings itemSettings) {
        super(blockSettings);
        this.item = new BlockItem(this, itemSettings);
        this.containsItem = true;
    }

    public ModBlock(AbstractBlock.Settings blockSettings) {
        super(blockSettings);
        this.containsItem = false;
    }
}