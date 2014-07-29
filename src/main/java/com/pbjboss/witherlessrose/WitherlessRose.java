package com.pbjboss.witherlessrose;

import com.pbjboss.witherlessrose.init.ModBlocks;
import com.pbjboss.witherlessrose.init.ModItems;
import com.pbjboss.witherlessrose.init.Recipe;
import com.pbjboss.witherlessrose.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.logging.log4j.Level;

@Mod(modid=Reference.MOD_ID,name=Reference.MOD_NAME,version = "1.7.10-1.0.0")
public class WitherlessRose
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        OreDictionary.registerOre("flower", Blocks.red_flower);
        OreDictionary.registerOre("flower", Blocks.yellow_flower);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        ModItems.init();

        ModBlocks.init();

        Recipe.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {


        /**for (String oreNames : OreDictionary.getOreNames())
        {
            FMLLog.log(Level.INFO, Reference.MOD_NAME, String.valueOf(oreNames));
        }**/
    }
}
