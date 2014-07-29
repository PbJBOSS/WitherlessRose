package com.pbjboss.witherlessrose.block;

import com.pbjboss.witherlessrose.creativetab.CreativeTabWR;
import com.pbjboss.witherlessrose.tileentity.TileEntityPractice;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPractice extends Block implements ITileEntityProvider
{

    protected BlockPractice(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    public BlockPractice()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabWR.tabWR);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityPractice();
    }
}
