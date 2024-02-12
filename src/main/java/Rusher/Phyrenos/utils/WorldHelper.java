package Rusher.Phyrenos.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;

import static org.rusherhack.client.api.Globals.mc;

public class WorldHelper {
    public static Block getBlock(BlockPos pos) {
        try {
            if(mc.player == null)
                return null;
            return mc.player.level().getBlockState(pos).getBlock();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
