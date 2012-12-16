package rsi.common.blocks;

import java.util.*;
import net.minecraft.src.*;

public class BlockBasalt extends Block
{
    public BlockBasalt(int blockID)
    {
        super(blockID, 0, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
    }
    
    public String getTextureFile()
    {
        return "";
    }

    public void getSubBlocks(int blockID, CreativeTabs tab, List blockList)
    {
        blockList.add(new ItemStack(blockID, 1, 0);
        blockList.add(new ItemStack(blockID, 1, 1);
        blockList.add(new ItemStack(blockID, 1, 2);
    }

    public int idDropped(int meta, Random random, int fortune)
    {
        return this.blockID;
    }

    public int damageDropped(int meta)
    {
        switch (meta)
        {
            case 0: return 1;
            case 1: return 1;
            case 2: return 2;
            default: return 0;
        }
    }

    public int idPicked(World world, int x, int y, int z)
    {
        return this.blockID;
    }
}
