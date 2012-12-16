package rsi.common;

import rsi.common.blocks.*;
import rsi.common.items.itemDefault;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.*;

@Mod(modid = "RedstoneIntegration", name = "Redstone Integration", version = "0.1.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class RedstoneIntegration {
	
	public static Item glaze, formablers;

	public static VolcanoGenerator worldGen = new VolcanoGenerator();
	
	@SidedProxy(clientSide="rsi.client.ClientProxy", serverSide="rsi.common.CommonProxy")
	public static CommonProxy proxy;
    
    @PreInit
    public void preLoad(FMLPreInitializationEvent event)
    {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
        config.load();
        
        RedstoneIntegrationBlocks.loadConfig(config);
        
        config.save();
    }
	
	@Init
	public void load(FMLInitializationEvent event) {
        
        RedstoneIntegrationBlocks.initBlocks();
        RedstoneIntegrationRecipes.initRecipes();
        
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
