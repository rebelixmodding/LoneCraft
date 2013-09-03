package com.github.rebelixmodding.lonecraft; 

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;

import com.github.rebelixmodding.lonecraft.blocks.BlockSapphirOre;
import com.github.rebelixmodding.lonecraft.items.*;
import com.github.rebelixmodding.lonecraft.blocks.*;
import com.github.rebelixmodding.lonecraft.proxies.*;
import com.github.rebelixmodding.lonecraft.*;

//@author RebelixModdingTeam

//----------------------------------------------------------------------------------------
@NetworkMod(clientSideRequired=true,serverSideRequired=false, 
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"LoneCraft" }, packetHandler = ClientPacketHandler.class), 
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = ServerPacketHandler.class)) 
@Mod(modid="lonecraft",name="LoneCraft",version="1.0") 
public class LoneCraftMain { 
@Instance("LoneCraftInstance") 
public static LoneCraftMain instance = new LoneCraftMain();
@SidedProxy(clientSide = "com.github.rebelixmodding.lonecraft.proxies.ClientProxy", serverSide = "com.github.rebelixmodding.lonecraft.proxies.CommonProxy")
public static com.github.rebelixmodding.lonecraft.proxies.CommonProxy proxy;
//----------------------------------------------------------------------------------------

// Sapphir Ore

public static Block BlockSapphirOre;
public static int idBlockSapphirOre;

//Sapphir
public static Item ItemSapphir;
public static int idItemSapphir;



// CreativeTab LoneCraft
/**
 * Creates the creative tab "lonecraft".
 */
public static CreativeTabs tabLoneCraft = new CreativeTabs("tabLoneCraft"){
	public ItemStack getIconItemStack(){
		return new ItemStack(BlockSapphirOre);}
		public String getTranslatedTabLabel()
		{
		return "LoneCraft";
		}
	};

	
	@EventHandler
public static void preInit(FMLPreInitializationEvent event) {
	//Config
	Configuration config = new Configuration(
	 event.getSuggestedConfigurationFile());
	 		config.load();
	idItemSapphir = config.getItem("idItemSapphir", 5001).getInt();
	idBlockSapphirOre = config.getBlock("idBlockSapphirOre", 4001).getInt();
	 		
	 		config.save();
	}

	
	@EventHandler
public static void load(FMLInitializationEvent event) {
	//Saphir Ore
	BlockSapphirOre = new BlockSapphirOre(idBlockSapphirOre, Material.rock);
	MinecraftForge.setBlockHarvestLevel(BlockSapphirOre, "pickaxe", 2);
	LanguageRegistry.addName(BlockSapphirOre, "Saphir Ore");
	GameRegistry.registerBlock(BlockSapphirOre, "Saphir Ore");
	//Saphir
	ItemSapphir = new ItemSapphir(idItemSapphir);
	LanguageRegistry.addName(ItemSapphir, "Sapphir");
	GameRegistry.registerItem(ItemSapphir, "itemSapphir", "lonecraft");
	//OreGenerator
	GameRegistry.registerWorldGenerator(new OreGenerator());
}
//----------------------------------------------------------------------------------------


	
	@EventHandler
public static void postInit(FMLPostInitializationEvent event) {

	}
}
