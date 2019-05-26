package com.ijd710.scpextrazones.tabs;

import com.ijd710.scpextrazones.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SCPExtraZonesTab extends CreativeTabs
{
 public SCPExtraZonesTab(String label) 
 {
	 super ("scpextrazonestab");
	  }
 public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLUESTONE);}
	
	
}

