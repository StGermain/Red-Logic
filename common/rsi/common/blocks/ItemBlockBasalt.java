package rsi.common.blocks;

import net.minecraft.src.*;

public class ItemBlockBasalt extends ItemBlock
{
    public ItemBlockBasalt(int itemID)
    {
        super(itemID-256);
        setHasSubtypes(true);
    }

    public int getMetadata(int meta)
    {
        return meta;
    }
    
    public String getItemNameIS(ItemStack itemstack)
    {
        switch (itemstack.getItemDamage())
        {
            case 0: return getItemName() + ".basalt";
            case 1: return getItemName() + ".cobble";
            case 2: return getItemName() + ".bricks";
            default: return getItemName() + ".basalt";
        }
    }
}
