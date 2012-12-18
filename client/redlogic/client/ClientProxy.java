package redlogic.client;

import net.minecraftforge.client.MinecraftForgeClient;
import redlogic.common.CommonProxy;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture("/rsi/gfx/blocks/blocks.png");
	}
}
