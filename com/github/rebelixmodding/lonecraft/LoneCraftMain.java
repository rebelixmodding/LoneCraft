package com.github.rebelixmodding.lonecraft; 

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
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
//@iLexiconn: Hi! This is a test comment :D
 
@NetworkMod(clientSideRequired=true,serverSideRequired=false, 
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"LoneCraft" }, packetHandler = ClientPacketHandler.class), 
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = ServerPacketHandler.class)) 
@Mod(modid="LoneCraft",name="LoneCraft",version="1.0") 
public class LoneCraftMain { 

@Instance("LoneCraftInstance") 
public static LoneCraftMain instance = new LoneCraftMain();

@SidedProxy(clientSide = "com.github.rebelixmodding.lonecraft.proxies.ClientProxy", serverSide = "com.github.rebelixmodding.lonecraft.proxies.CommonProxy")
public static com.github.rebelixmodding.lonecraft.proxies.CommonProxy proxy;

@PreInit
public void preInit(FMLPreInitializationEvent event) {
	
}

@Init
public void init(FMLInitializationEvent event) {
	
}

@PostInit
public static void postInit(FMLPostInitializationEvent event) {
	
}
}
