package com.pbjboss.witherlessrose.init;

import com.pbjboss.witherlessrose.block.BlockPractice;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block blockPractice;


    public static void init()
    {
        blockPractice = new BlockPractice();

        GameRegistry.registerBlock(blockPractice, "practice");
    }
}
