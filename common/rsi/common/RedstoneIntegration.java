package rsi.common;

import rsi.common.blocks.blockBasalt;
import rsi.common.blocks.blockBasaltBricks;
import rsi.common.blocks.blockBasaltCobble;
import rsi.common.blocks.blockMarble;
import rsi.common.blocks.blockMarbleBricks;
import rsi.common.items.itemDefault;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "StGermain_RedstoneIntegration", name = "Redstone Integration", version = "0.1.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class RedstoneIntegration {
	
	public static Block basalt, basaltcobble, basaltbricks, marble, marblebricks, repeater, timer, counter;
	public static Item glaze, formablers;
	
	public static VolcanoGenerator worldGen = new VolcanoGenerator();
	
	@SidedProxy(clientSide="rsi.client.ClientProxy", serverSide="rsi.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) {
		basaltcobble = new blockBasaltCobble(1551, 0)
			.setBlockName("stg_basaltcobble")
			.setResistance(4500);
		GameRegistry.registerBlock(basaltcobble);
		LanguageRegistry.addName(basaltcobble, "Basalt Cobble");
		
		basalt = new blockBasalt(1552, 1)
			.setBlockName("stg_basalt")
			.setResistance(4500);
		GameRegistry.registerBlock(basalt);
		LanguageRegistry.addName(basalt, "Basalt");
		
		basaltbricks = new blockBasaltBricks(1553, 2)
			.setBlockName("stg_basaltbricks")
			.setResistance(4500);
		GameRegistry.registerBlock(basaltbricks);
		LanguageRegistry.addName(basaltbricks, "Basalt Bricks");
		
		marble = new blockMarble(1554, 3)
			.setBlockName("stg_marble")
			.setResistance(50);
		GameRegistry.registerBlock(marble);
		LanguageRegistry.addName(marble, "Marble");
		
		marblebricks = new blockMarbleBricks(1555, 4)
			.setBlockName("stg_marblebricks")
			.setResistance(50);
		GameRegistry.registerBlock(marblebricks);
		LanguageRegistry.addName(marblebricks, "Marble");
		
		glaze = new itemDefault(4099)
			.setItemName("stg_glaze")
			.setIconIndex(1);
		LanguageRegistry.addName(glaze, "Glaze");
		
		formablers = new itemDefault(4100)
			.setItemName("stg_frs")
			.setIconIndex(2);
		LanguageRegistry.addName(formablers, "Formable Redstone");
		
		//GameRegistry.registerWorldGenerator(worldGen);
	}
}
