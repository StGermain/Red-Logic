package rsi.common.blocks;

import net.minecraft.src;

public class ItemBlockMarble extends ItemBlock
{
    public ItemBlockMarble(int itemID)
    {
        super(itemID);
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
            case 0: return getItemName() + ".marble";
            case 1: return getItemName() + ".bricks";
            default: return getItemName() + ".marble";
        }
    }
}
