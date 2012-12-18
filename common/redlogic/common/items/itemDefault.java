package redlogic.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class itemDefault extends Item {

	public itemDefault(int par1) {
		super(par1);
		maxStackSize = 16;
        this.setCreativeTab(CreativeTabs.tabRedstone);
	}
	
	public String getTextureFile(){
		return "/redlogic/gfx/items/items.png";
	}

}
