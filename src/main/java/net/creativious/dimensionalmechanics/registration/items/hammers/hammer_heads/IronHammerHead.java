package net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads;

import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class IronHammerHead extends Item {
    public IronHammerHead() {
        // 80 durability per piece of iron used, worth 1760 durability for the head
        super(new FabricItemSettings().group(ItemGroup.MISC));
    }
}
