package com.pbjboss.witherlessrose.block;

import com.pbjboss.witherlessrose.creativetab.CreativeTabWR;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class BlockHealer extends Block
{
    private boolean isActive = false;

    public BlockHealer()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabWR.tabWR);
    }

    @Override
    public void onBlockClicked(World p_149699_1_, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_)
    {
        if (this.isActive == false)
        {
            isActive = true;
        }
        else
        {
        isActive = false;
        }
    }


}
