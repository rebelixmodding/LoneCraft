package com.github.rebelixmodding.proxies;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import com.github.rebelixmodding.LoneCraftMain;

public class CommonProxy implements IGuiHandler{ 
public void registerRenderInformation() 
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { 
return null;
}
public void registerTiles(){ 
}
public void registerBlocks(){ 
}
public void addNames(){ 
}
public void addRecipes(){ 
}
}