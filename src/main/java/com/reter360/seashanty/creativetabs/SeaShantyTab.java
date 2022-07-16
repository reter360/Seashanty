package com.reter360.seashanty.creativetabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class SeaShantyTab extends CreativeTabs {
    public SeaShantyTab(){super("SeaShanty");
    this.setBackgroundImageName("seashanty.png"); }

    @Override
    public ItemStack getTabIconItem() { return new ItemStack(Items.APPLE); }
        //apple is the item icon: https://www.youtube.com/watch?v=b6IlacpXBdE
}
