package com.ashindigo.alloycraft.items;

import java.util.List;

import com.ashindigo.utils.UtilsItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class AlloyItem extends UtilsItem {
	
	public ItemStack itemStack;
	ItemStack itemstack;
	World world;
	EntityPlayer player;
	List list;
	
	public AlloyItem(String modid, String name){
		setUnlocalizedName(modid + "_" + name);
		setCreativeTab(CreativeTabs.tabMisc);
		setTextureName(modid + ":" + name);
		UtilsItem.listitem.add(name);
		maxStackSize = 1;
		UtilsItem.MODID = modid;
		UtilsItem.itemlists.add(this);
}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int metadata, boolean bool)
	{
	        if (itemstack.getTagCompound() == null)
	        {
	            itemstack.setTagCompound(new NBTTagCompound());
	            itemstack.getTagCompound().setInteger("Durability", 0);
	            itemstack.getTagCompound().setInteger("Enchantability", 0);
	            itemstack.getTagCompound().setInteger("???", 0);
	            itemStack = itemstack;   
	        }
	        
	}
	
	@Override
	public void onCreated(ItemStack itemstack, World world, EntityPlayer player){
	{
	        if (itemstack.getTagCompound() == null)
	        {
	            itemstack.setTagCompound(new NBTTagCompound());
	            itemstack.getTagCompound().setInteger("Durability", 0);
	            itemstack.getTagCompound().setInteger("Enchantability", 0);
	            itemstack.getTagCompound().setInteger("???", 0);
	            itemStack = itemstack;
	            
	        }
	        System.out.println(itemStack.getTagCompound().getInteger("???"));
	}
	        
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
		String thing = Integer.toString(itemStack.getTagCompound().getInteger("???"));
		String thing1 = EnumChatFormatting.RED + "???: " + EnumChatFormatting.GRAY;
		par3List.add(thing1 + thing);
		String durability = Integer.toString(itemStack.getTagCompound().getInteger("Durability"));
		String durability1 = EnumChatFormatting.GREEN + "Durability: " + EnumChatFormatting.GRAY;
		par3List.add(durability1 + durability);
		String enchantability = Integer.toString(itemStack.getTagCompound().getInteger("Enchantability"));
		String enchantability1 = EnumChatFormatting.BLUE + "Enchantability: " + EnumChatFormatting.GRAY;
		par3List.add(enchantability1 + enchantability);
	
		}
    }
	