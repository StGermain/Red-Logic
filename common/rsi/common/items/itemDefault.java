package rsi.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class itemDefault extends Item {

	public itemDefault(int par1) {
		super(par1);
		maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabRedstone);
	}
	
	public String getTextureFile(){
		return "/rsi/gfx/items/items.png";
	}

}