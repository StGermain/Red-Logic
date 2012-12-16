package rsi.common;

import rsi.common.blocks.BlockBasalt;
import rsi.common.blocks.BlockMarble;
import rsi.common.blocks.ItemBlockBasalt;
import rsi.common.blocks.ItemBlockMarble;
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
	
	public static Block basalt, marble, repeater, timer, counter;
	public static Item glaze, formablers;
	
	public static int basaltID = 1551;
	public static int marbleID = 1552;
	
	public static VolcanoGenerator worldGen = new VolcanoGenerator();
	
	@SidedProxy(clientSide="rsi.client.ClientProxy", serverSide="rsi.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) {
		basalt = new BlockBasalt(basaltID, 0).setHardness(5.0F).setResistance(4500.0F).setBlockName("basalt");
		marble = new BlockMarble(marbleID, 0).setHardness(3.0F).setResistance(50.0F).setBlockName("marble");
		
		Item.itemsList[basaltID] = new ItemBlockBasalt(basaltID).setItemName("basalt");
		Item.itemsList[marbleID] = new ItemBlockMarble(marbleID).setItemName("marble");
		
		LanguageRegistry.instance().addStringLocalization("tile.basalt.basalt.name", "Basalt");
		LanguageRegistry.instance().addStringLocalization("tile.basalt.cobble.name", "Basalt Cobble");
		LanguageRegistry.instance().addStringLocalization("tile.basalt.bricks.name", "Basalt Bricks");
		
		LanguageRegistry.instance().addStringLocalization("tile.marble.marble.name", "Marble");
		LanguageRegistry.instance().addStringLocalization("tile.marble.bricks.name", "Marble Bricks");

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
