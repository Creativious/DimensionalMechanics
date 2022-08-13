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

public class IronHammer extends HammerItem implements IHammer{

    public IronHammer() {
        super(ToolMaterials.IRON, new FabricItemSettings().maxCount(1).maxDamage(1760+15).group(ItemGroup.TOOLS), 8, -3.25F);
    }
}
