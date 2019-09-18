package com.orangeysnicket.investiture.tabs;

import com.orangeysnicket.investiture.Investiture;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MetalTab extends CreativeTabs {

    public MetalTab() {
        super(Investiture.MODID + ".metals");

    }

    @SideOnly(Side.CLIENT)
    @Override
    @MethodsReturnNonnullByDefault
    public ItemStack createIcon () {
        return new ItemStack(Item.getByNameOrId("minecraft:iron_ingot"));
    }
}
