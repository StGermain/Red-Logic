package rsi.common;

import java.util.Random;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class VolcanoGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
				IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX, chunkZ);
		if(b.biomeName.equals("Plains")||b.biomeName.equals("Extreme Hills")) {
			world.setBlock(chunkX+8, 80, chunkZ+7, 1552);
			world.setBlock(chunkX+7, 80, chunkZ+8, 1552);
			world.setBlock(chunkX+8, 80, chunkZ+8, 1552);
			world.setBlock(chunkX+7, 80, chunkZ+7, 1552);
		}
		if(b.biomeName.equals("Ocean")) {
			world.setBlock(chunkX+8, 80, chunkZ+8, 1552);
        }
	}
	
}
