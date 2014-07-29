package com.pbjboss.witherlessrose.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.ListIterator;

public class TileEntityPractice extends TileEntity
{

    private double par2 = 5;
    private World world;

    private String[] playerList;

    private boolean playerInRange()
    {

        return this.worldObj.getClosestPlayer((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D, 5D) != null;
    }

    @Override
    public void updateEntity()
    {
        world.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
        if (this.playerInRange())
        {
            if (!this.worldObj.isRemote)
            {
                ArrayList<EntityPlayerMP> allP = new ArrayList<EntityPlayerMP>();
                ListIterator itl;

                for (int i = 0; i<MinecraftServer.getServer().worldServers.length; i++)
                {
                    itl = MinecraftServer.getServer().worldServers[i].playerEntities.listIterator();
                    while (itl.hasNext()) allP.add((EntityPlayerMP)itl.next());

                    for (int x = 0; x < allP.size(); x++)
                    {
                        EntityPlayerMP playerMP = allP.get(x);
                        playerMP.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 2));
                    }
                }
            }
        }
    }

    public void readFromNBT(NBTTagCompound nbtTagCompound)
    {
        super.readFromNBT(nbtTagCompound);
    }


    @Override
    public void writeToNBT(NBTTagCompound nbtTagCompound)
    {
        super.writeToNBT(nbtTagCompound);
    }
}
