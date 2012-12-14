package rsi.common.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class blockDefault extends Block {
	public blockDefault(int id, int texture) {
		super(id, texture, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock)
			.setHardness(2F)
			.setStepSound(Block.soundStoneFootstep);
	}
	
	public String getTextureFile(){
		return "/rsi/gfx/blocks/blocks.png";
	}
}

