package net.zestyblaze.beeinajar.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.zestyblaze.beeinajar.registry.BIAJBlockInit;

public class BIAJClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(BIAJBlockInit.JAR_BLOCK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BIAJBlockInit.BEE_IN_A_JAR, RenderType.cutout());
    }
}
