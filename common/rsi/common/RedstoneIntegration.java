package rsi.common;

import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "StGermain_RedstoneIntegration", name = "Redstone Integration", version = "0.0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class RedstoneIntegration {
	
	public static Block basalt, basaltcobble, basaltbricks, marble, marblebricks;
	
	public static VolcanoGenerator worldGen = new VolcanoGenerator();
	
	@SidedProxy(clientSide="rsi.client.ClientProxy", serverSide="rsi.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) {
		basaltcobble = new blockBasaltCobble(1551, 0)
			.setBlockName("Basalt Cobble")
			.setResistance(4500);
		GameRegistry.registerBlock(basaltcobble);
		LanguageRegistry.addName(basaltcobble, "Basalt Cobble");
		
		basalt = new blockBasalt(1552, 1)
			.setBlockName("Basalt")
			.setResistance(4500);
		GameRegistry.registerBlock(basalt);
		LanguageRegistry.addName(basalt, "Basalt");
		
		basaltbricks = new blockBasaltBricks(1553, 2)
			.setBlockName("Basalt Bricks")
			.setResistance(4500);
		GameRegistry.registerBlock(basaltbricks);
		LanguageRegistry.addName(basaltbricks, "Basalt Bricks");
		
		marble = new blockMarble(1554, 3)
			.setBlockName("Marble")
			.setResistance(50);
		GameRegistry.registerBlock(marble);
		LanguageRegistry.addName(marble, "Marble");
		
		marblebricks = new blockMarbleBricks(1555, 4)
		.setBlockName("Marble Bricks")
			.setResistance(50);
		GameRegistry.registerBlock(marblebricks);
		LanguageRegistry.addName(marblebricks, "Marble");
		
		GameRegistry.registerWorldGenerator(worldGen);
	}
}
