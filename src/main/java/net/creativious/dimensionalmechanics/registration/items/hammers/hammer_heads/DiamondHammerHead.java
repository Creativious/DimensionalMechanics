package net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads;

import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DiamondHammerHead extends Item {
    public DiamondHammerHead() {
        // 515 durability per piece of diamond used, worth 11330 durability for the head
        super(new FabricItemSettings().group(ItemGroup.MISC));
    }
}
