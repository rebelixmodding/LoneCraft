package com.github.rebelixmodding.lonecraft; 

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;

import com.github.rebelixmodding.lonecraft.proxies.CommonProxy;
import com.github.rebelixmodding.lonecraft.ClientPacketHandler;

//@author RebelixModdingTeam

//----------------------------------------------------------------------------------------
@NetworkMod(clientSideRequired=true,serverSideRequired=false, 
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"LoneCraft" }, packetHandler = ClientPacketHandler.class), 
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = ServerPacketHandler.class)) 
@Mod(modid="lonecraft",name="LoneCraft",version="1.0") 
public class LoneCraftMain { 
//----------------------------------------------------------------------------------------
@Instance("LoneCraftInstance") 
public static LoneCraftMain instance = new LoneCraftMain();
//----------------------------------------------------------------------------------------
@SidedProxy(clientSide = "com.github.rebelixmodding.lonecraft.proxies.ClientProxy", serverSide = "com.github.rebelixmodding.lonecraft.proxies.CommonProxy")
public static com.github.rebelixmodding.lonecraft.proxies.CommonProxy proxy;
//----------------------------------------------------------------------------------------
public static Block BlockSaphirOre;
public static int idBlockSaphirOre = 193;
//----------------------------------------------------------------------------------------
public static CreativeTabs tabLoneCraft = new CreativeTabs("tabLoneCraft"){
	public ItemStack getIconItemStack(){
		return new ItemStack(Block.oreDiamond);}
		public String getTranslatedTabLabel()
		{
		return "LoneCraft";
		}
	};
//----------------------------------------------------------------------------------------
@EventHandler
public static void preInit(FMLPreInitializationEvent event) {
	Configuration config = new Configuration(
			event.getSuggestedConfigurationFile());
			config.load();
	}
//----------------------------------------------------------------------------------------
@EventHandler
public static void load(FMLInitializationEvent event) {

}
//----------------------------------------------------------------------------------------
@EventHandler
public static void postInit(FMLPostInitializationEvent event) {

	}
}
