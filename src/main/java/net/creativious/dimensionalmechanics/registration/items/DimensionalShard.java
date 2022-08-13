package net.creativious.dimensionalmechanics.registration.items;

import net.creativious.dimensionalmechanics.registration.RegistrationManager;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DimensionalShard extends Item {
    public DimensionalShard() {
        super(new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    }
}
