package com.ijd710.scpextrazones.init;

import java.util.ArrayList;
import java.util.List;

import com.ijd710.scpextrazones.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ADMIN_BOTTOM = new BlockBase("admin_bottom", Material.IRON);
	
	public static final Block ADMIN_TOP = new BlockBase("admin_top", Material.IRON);
	
	public static final Block MAINTAIN_BOTTOM = new BlockBase("maintain_bottom", Material.IRON);
	
	public static final Block MAINTAIN_TOP = new BlockBase("maintain_top", Material.IRON);
	
	public static final Block ENTRANCE_BOTTOM = new BlockBase("entrance_bottom", Material.IRON);
	
	public static final Block ENTRANCE_TOP = new BlockBase("entrance_top", Material.IRON);
	
	public static final Block MIDDLE_WALL = new BlockBase("middle_wall", Material.IRON);
}
