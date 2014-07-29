package com.pbjboss.witherlessrose.item;

import com.pbjboss.witherlessrose.creativetab.CreativeTabWR;
import com.pbjboss.witherlessrose.init.ModItems;
import com.pbjboss.witherlessrose.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Collection;

public class ItemWitherlessRose extends ItemWR
{
    public ItemWitherlessRose()
    {
        super();
        this.setUnlocalizedName("witherlessRose");
        this.setMaxStackSize(1);
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean flag) {
        if (entity instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer) entity;

            Collection<Potion> potions = player.getActivePotionEffects();
            if (player.inventory.hasItem(ModItems.witherlessRose) || player.inventory != null)
            {
                player.removePotionEffect(20);

                while (potions.contains(Potion.wither))
                {
                    player.addPotionEffect(new PotionEffect(10, 5));
                }

            }
        }
    }

}
