package com.ashindigo.utils;

import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class UtilsContainer extends Container {
	
	public int nslot = 40;
	public InventoryPlayer InvPlayer;
	UtilsTileEntity TEforge;

	public UtilsContainer(InventoryPlayer invPlayer, UtilsTileEntity teforge) {
		
		//Inventory
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 9; j++) {
						this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
					}
				}
				
				//ActionBar
				for(int i = 0; i < 9; i++) {
					this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
				}
	}
	public UtilsContainer() {
		
	}

	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {

		return true;
	}

}
