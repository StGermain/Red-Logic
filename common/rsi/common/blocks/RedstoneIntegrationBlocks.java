package rsi.common.blocks;

import net.minecraft.src;

public class RedstoneIntegrationBlocks
{
    public static Block basalt, marble, repeater, timer, counter;
    
    public static void initBlocks()
    {
        basalt = new BlockBasalt(basaltID, 0).setHardness(2.0F).setResistance(4500.0F).setBlockName("basalt");
		marble = new BlockMarble(marbleID, 0).setHardness(2.0F).setResistance(50.0F).setBlockName("marble");
		
		Item.itemsList[basaltID] = new ItemBlockBasalt(basaltID).setItemName("basalt");
		Item.itemsList[marbleID] = new ItemBlockMarble(marbleID).setItemName("marble");
		
		LanguageRegistry.instance().addStringLocalization("tile.basalt.basalt.name", "Basalt");
		LanguageRegistry.instance().addStringLocalization("tile.basalt.cobble.name", "Basalt Cobble");
		LanguageRegistry.instance().addStringLocalization("tile.basalt.bricks.name", "Basalt Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.marble.marble.name", "Marble");
		LanguageRegistry.instance().addStringLocalization("tile.marble.bricks.name", "Marble Bricks");
    }
}