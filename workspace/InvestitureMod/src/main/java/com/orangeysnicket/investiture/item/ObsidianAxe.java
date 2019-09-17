package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.item.ItemSword;

public class ObsidianAxe extends ItemSword {

    public ObsidianAxe(ToolMaterial material, String registryName, String unlocalizedName){
        super(material);
        setTranslationKey(Investiture.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(Investiture.investitureTab);
    }
}
