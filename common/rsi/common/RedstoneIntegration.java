package rsi.common;

import rsi.common.blocks.*;
import rsi.common.items.itemDefault;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = "RedstoneIntegration", name = "Redstone Integration", version = "0.1.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class RedstoneIntegration {
	
	public static Item glaze, formablers;
	
	public static int basaltID = 1551;
	public static int marbleID = 1552;
	
	public static VolcanoGenerator worldGen = new VolcanoGenerator();
	
	@SidedProxy(clientSide="rsi.client.ClientProxy", serverSide="rsi.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) {
        
        RedstoneIntegrationBlocks.initBlocks();
        
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
