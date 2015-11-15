package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.AlloycraftMain;
import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.UtilsContainer;
import com.ashindigo.utils.UtilsGui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case AlloycraftMain.guiIDForge:
				if (entity instanceof ForgeTileEntity) {
					return new UtilsContainer(player.inventory, (ForgeTileEntity) entity);
				}
				return null;		
		
			}
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case AlloycraftMain.guiIDForge:
				if (entity instanceof ForgeTileEntity) {
					return new UtilsGui(new ForgeContainer(player.inventory, new ForgeTileEntity(40)), "wow", AlloycraftMain.modid, 176, 166, (ForgeTileEntity) entity, player.inventory, "Cool beans");
				}
				
				return null;
			}
		}
		
		return null;
	}
}
