package com.orangeysnicket.investiture.tabs;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DecoTab extends CreativeTabs {

    public DecoTab() {
        super(Investiture.MODID + ".decor");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Item.getByNameOrId("minecraft:gold_ingot"));
    }
}
