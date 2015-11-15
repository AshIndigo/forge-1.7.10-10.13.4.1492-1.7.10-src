package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.tileentites.ForgeTileEntity;
import com.ashindigo.utils.UtilsContainer;
import com.ashindigo.utils.UtilsSlot;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ForgeContainer extends UtilsContainer {

	static UtilsContainer container;
	public static int Nslots = 40;

	public ForgeContainer(InventoryPlayer invPlayer, ForgeTileEntity teforge) {
		super(invPlayer, teforge);
		
		this.addSlotToContainer(new Slot(teforge, 0, 45, 17));
		this.addSlotToContainer(new Slot(teforge, 1, 45, 49));
		this.addSlotToContainer(new Slot(teforge, 2, 8, 56));
		this.addSlotToContainer(new UtilsSlot(invPlayer.player, teforge, 3, 113, 33));
	}
	}
