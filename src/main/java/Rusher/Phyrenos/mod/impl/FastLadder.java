package Rusher.Phyrenos.mod.impl;

import Rusher.Phyrenos.mod.modmanager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.phys.Vec3;

import static Rusher.Phyrenos.utils.WorldHelper.getBlock;

public class FastLadder extends modmanager {

    public static void SppedLadder(Float speed) {

        if(isOnLadder()) {
            assert mc.player != null;
            if (mc.player.horizontalCollision) {
                mc.player.setDeltaMovement(new Vec3(0, speed ,0));
            }
        }


    }
    private static boolean isOnLadder() {
        assert mc.player != null;
        Block FeetBlockPos = getBlock(mc.player.blockPosition());
        Block HeadBlockPos = getBlock(mc.player.blockPosition().above());
        return FeetBlockPos instanceof LadderBlock || HeadBlockPos instanceof LadderBlock;
    }
}
