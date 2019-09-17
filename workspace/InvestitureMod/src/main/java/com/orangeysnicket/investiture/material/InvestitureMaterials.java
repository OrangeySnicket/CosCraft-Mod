package com.orangeysnicket.investiture.material;

import com.orangeysnicket.investiture.Investiture;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class InvestitureMaterials {

	public static final ToolMaterial MATERIAL_GLASS = EnumHelper.addToolMaterial(Investiture.MODID + ":" + "material_glass", 0, 30, 7.0F, 6.0F, 0);
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial(Investiture.MODID + ":" + "material_obsidian", 0, 750, 7.0F, 4.0F, 0);
}
