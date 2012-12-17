package rsi.common.blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;
import rsi.common.blocks.blockDefault;

public class blockBasalt extends blockDefault {
	public blockBasalt(int id, int texture) {
		super(id, texture);
	}

	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return 1551;
	}
}
