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
		BiomeGenBase b = world.getBiomeGenForCoords(chunkX*16, chunkZ*16);
		int randDefault = 0; //Default chance 1/-1 = No chance
		int yHeightBase = 0;
		if(b.biomeName.equals("Ocean")) {
			Random randGenny = new Random();
			int randChance = randGenny.nextInt(80); //check if it generates
			int xBase = 0;
			if(randChance < 1) {
				int yHeight = 80 - randGenny.nextInt(20);
				int yBase = 10 + randGenny.nextInt(20);
				while(yHeight > yBase) {
					world.setBlock(chunkX*16 + 8, yHeight, chunkZ*16 + 8, Block.lavaStill.blockID);
					yHeight-=1;
				}
			}
		}
		if(b.biomeName.equals("Ice Mountains")||b.biomeName.equals("Extreme Hills")) {
			Random randGenny = new Random();
			int randChance = randGenny.nextInt(80); //check if it generates
			if(randChance < 1) {
				int yHeight = 140 - randGenny.nextInt(20);
				int yBase = 10 + randGenny.nextInt(20);
				while(yHeight > yBase) {
					world.setBlock(chunkX*16 + 8, yHeight, chunkZ*16 + 8, Block.lavaStill.blockID);
					yHeight-=1;
				}
			}
		}
	}
	
}
