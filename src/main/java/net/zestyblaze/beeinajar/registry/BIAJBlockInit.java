package net.zestyblaze.beeinajar.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.zestyblaze.beeinajar.BeeInAJar;
import net.zestyblaze.beeinajar.block.BeeInAJarBlock;

public class BIAJBlockInit {
    public static Block BEE_IN_A_JAR = new BeeInAJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS));
    public static Block JAR_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.GLASS));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new ResourceLocation(BeeInAJar.MODID, "jar"), JAR_BLOCK);
        Registry.register(Registry.BLOCK, new ResourceLocation(BeeInAJar.MODID, "bee_in_a_jar"), BEE_IN_A_JAR);
    }
}
