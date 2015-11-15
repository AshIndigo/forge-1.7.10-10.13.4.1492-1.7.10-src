/*
package com.ashindigo.alloycraft.lib;

import com.ashindigo.alloycraft.AlloyItem;
import com.ashindigo.alloycraft.AlloycraftItems;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class RecipeHandler implements IRecipe {

	private int alloyint;
	private int ironint;

	@Override
	public boolean matches(InventoryCrafting inventory, World world) {
		for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {
			 ItemStack currentStack = inventory.getStackInSlot(slot);
	            if (currentStack != null && currentStack.getItem() instanceof AlloyItem) {
	            	alloyint = 1;
	            	//System.out.println(alloyint);
	            	currentStack = null;
	            	for (int slot2 = 0; slot2 < inventory.getSizeInventory(); slot2++) {
	            		currentStack = new ItemStack (Items.iron_ingot);
	            	if(currentStack != null && currentStack.getItem() == Items.iron_ingot){
	            		ironint = 1;
	            		//System.out.println(ironint);
	            	}
	            	try{
	            	if(alloyint == 1 && ironint == 1){
	            		//System.out.println("Cool");
	            		currentStack = new ItemStack(AlloycraftItems.alloy);
	            		if(currentStack.stackTagCompound.getInteger("???") != 0){
	            			System.out.println("WOW!");
	            		int thing = currentStack.stackTagCompound.getInteger("???") + 5;
	            		int durability = currentStack.stackTagCompound.getInteger("Durability") + 5;
	            		int enchantability = currentStack.stackTagCompound.getInteger("Enchantability") + 5;
	            		}
	            		else{
	            			System.out.println("wow");
	            		}
	            	}
	            	}
	            	catch(NullPointerException e){
	            		
	            	}
	            	}
	            }
		}
		return false;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting invcraft) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/