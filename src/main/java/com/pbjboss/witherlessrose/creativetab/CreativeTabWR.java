package com.pbjboss.witherlessrose.creativetab;

import com.pbjboss.witherlessrose.init.ModItems;
import com.pbjboss.witherlessrose.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabWR
{
    public static CreativeTabs tabWR = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.witherlessRose;
        }
    };
}
