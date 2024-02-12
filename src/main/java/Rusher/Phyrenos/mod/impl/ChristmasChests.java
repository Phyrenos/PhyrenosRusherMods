package Rusher.Phyrenos.mod.impl;

import Rusher.Phyrenos.mod.modmanager;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.ChestBlockEntity;

import java.lang.reflect.Field;

public class ChristmasChests extends modmanager {

    public static void christmaschests() throws NoSuchFieldException, IllegalAccessException {
        final BlockEntityRenderer<ChestBlockEntity> renderer = mc.getBlockEntityRenderDispatcher().getRenderer(new ChestBlockEntity(BlockPos.ZERO, null));
        final Field field = ChestRenderer.class.getDeclaredField("field_4365");
        field.setAccessible(true);
        field.set(renderer, true);
    }

}
