package net.creativious.dimensionalmechanics.registration;

import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup extends ItemGroup {

    public ItemStack icon = new ItemStack(Blocks.BARRIER);


    public ModItemGroup(Identifier identifier) {
        super(ItemGroup.GROUPS.length -1, String.format("%s.%s", identifier.getNamespace(), identifier.getPath()));

    }

    @Override
    public ItemStack createIcon() {
        return this.icon;
    }

    @Override
    public ItemStack getIcon() {
        return this.icon;
    }

    public ModItemGroup setIcon(Item item) {
        this.icon = new ItemStack(item);
        return this;
    }

    public ModItemGroup setIcon(ItemStack itemStack) {
        this.icon = itemStack;
        return this;
    }


}
