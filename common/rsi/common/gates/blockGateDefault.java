package rsi.common.gates;

import net.minecraft.src.BlockDirectional;
import net.minecraft.src.Material;

public class blockGateDefault extends BlockDirectional {

	private final boolean isPowered;
	
	protected blockGateDefault(int par1, boolean par2) {
		super(par1, 6, Material.circuits);
		this.isPowered = par2;
		// TODO Auto-generated constructor stub
	}

}
