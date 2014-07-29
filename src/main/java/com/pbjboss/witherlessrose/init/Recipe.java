package com.pbjboss.witherlessrose.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipe
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.witherlessRose), "xxx", "xyx", "xxx", 'x',Blocks.red_flower, 'y', Items.nether_star);
    }
}
