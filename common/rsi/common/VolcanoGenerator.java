package rsi.common;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.Block;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class VolcanoGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
		if(b.biomeName.equals("Ocean")) {
			Random randGenny = new Random();
			int yHeight = 80 - randGenny.nextInt(20);
			int yBase = 10 + randGenny.nextInt(20);
			while(yHeight > yBase) {
				world.setBlock(chunkX*16 + 8, yHeight, chunkZ*16 + 8, Block.lavaStill.blockID);
				yHeight-=1;
			}
        }
	}
	
}
