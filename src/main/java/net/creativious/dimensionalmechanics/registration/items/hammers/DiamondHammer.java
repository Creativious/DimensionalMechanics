package net.creativious.dimensionalmechanics.registration.items.hammers;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;

public class DiamondHammer extends HammerItem implements IHammer{

    public DiamondHammer() {
        super(ToolMaterials.DIAMOND, new FabricItemSettings().maxCount(1).maxDamage(11345).group(ItemGroup.TOOLS), 10, -3.5F);

    }
}
