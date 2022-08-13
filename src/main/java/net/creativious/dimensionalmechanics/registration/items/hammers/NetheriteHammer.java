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

public class NetheriteHammer extends HammerItem implements IHammer{


    public NetheriteHammer() {
        super(ToolMaterials.NETHERITE, new FabricItemSettings().maxCount(1).maxDamage(14729+15).group(ItemGroup.TOOLS).fireproof(), 11, -3.75F);

    }
}
