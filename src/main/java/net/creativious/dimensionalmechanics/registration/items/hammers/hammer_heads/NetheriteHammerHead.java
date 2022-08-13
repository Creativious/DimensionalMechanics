package net.creativious.dimensionalmechanics.registration.items.hammers.hammer_heads;

import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class NetheriteHammerHead extends Item {
    public NetheriteHammerHead() {
        // 11330 * 1.3x = 14729 for the head
        super(new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    }
}
