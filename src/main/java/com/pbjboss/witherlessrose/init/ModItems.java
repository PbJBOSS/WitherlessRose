package com.pbjboss.witherlessrose.init;

import com.pbjboss.witherlessrose.item.ItemWitherlessRose;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{

    public static Item witherlessRose;

    public static void init()
    {
        witherlessRose = new ItemWitherlessRose();

        GameRegistry.registerItem(witherlessRose, "witherlessRose");


    }
}
