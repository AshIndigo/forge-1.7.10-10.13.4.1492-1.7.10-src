/*
package com.ashindigo.utils;

import com.ashindigo.alloycraft.AlloyItem;
import com.ashindigo.alloycraft.AlloycraftItems;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Spare2 {
	
	 @Override
	    public boolean matches (InventoryCrafting inventory, World world) {

	        int iron = 0;
	        int gold = 0;
	        ItemStack mainStack = null;

	        for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {

	            ItemStack currentStack = inventory.getStackInSlot(slot);

	            if (currentStack != null && currentStack.getItem() instanceof AlloyItem) {

	                AlloyItem powder = (AlloyItem) currentStack.getItem();

	                if (currentStack.stackTagCompound != null) {

	                    if (mainStack != null)
	                        return false;

	                    else {

	                        mainStack = currentStack;
	                    }
	                }

	                if (currentStack.stackTagCompound != null)
	                    iron++;
	            }
	        }

	        return mainStack != null && iron > 0;
	    }

	    @Override
	    public ItemStack getCraftingResult (InventoryCrafting inventory) {

	        int iron = 0;
	        int gold = 0;
	        ItemStack mainStack = null;

	        for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {

	            ItemStack currentStack = inventory.getStackInSlot(slot);

	            if (currentStack != null && currentStack.getItem() instanceof AlloyItem) {

	            	AlloyItem powder = (AlloyItem) currentStack.getItem();

	                if (currentStack.stackTagCompound != null) {

	                    if (mainStack != null)
	                        return null;

	                    else {

	                        mainStack = currentStack;
	                    }
	                }

	                if (currentStack.stackTagCompound != null)
	                    iron++;
	            }
	        }

	        if (mainStack != null && iron >= 1) {

	            ItemStack output = new ItemStack(AlloycraftItems.alloy, 1);

	            {
	            	try{
	            output.stackTagCompound.setInteger("???", 1);
	            	}
	            catch(NullPointerException e){
	            	
	            }
	            return output;
	        }
	        }
			return null;
	    }

	    @Override
	    public int getRecipeSize () {

	        return 9;
	    }

	    @Override
	    public ItemStack getRecipeOutput () {

	        return null;
	    }

	}

}
*/