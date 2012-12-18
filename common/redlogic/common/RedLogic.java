package redlogic.common;

import net.minecraft.src.Item;
import redlogic.common.items.itemDefault;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "StGermain_RedLogic", name = "Red Logic", version = "0.1.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class RedLogic {
	
	public static Item glaze, formablers;
	
	
	@SidedProxy(clientSide="redlogic.client.ClientProxy", serverSide="redlogic.common.CommonProxy")
	public static CommonProxy proxy;
	
	@Init
	public void load(FMLInitializationEvent event) {
		
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
