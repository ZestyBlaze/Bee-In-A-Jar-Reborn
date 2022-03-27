package net.zestyblaze.beeinajar.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.zestyblaze.beeinajar.BeeInAJar;
import net.zestyblaze.beeinajar.item.JarItem;

public class BIAJItemInit {
    public static Item JAR = new JarItem(BIAJBlockInit.JAR_BLOCK, new FabricItemSettings().group(CreativeModeTab.TAB_MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new ResourceLocation(BeeInAJar.MODID, "jar"), JAR);
        Registry.register(Registry.ITEM, new ResourceLocation(BeeInAJar.MODID, "bee_in_a_jar"), new BlockItem(BIAJBlockInit.BEE_IN_A_JAR, new FabricItemSettings().group(CreativeModeTab.TAB_MISC)));
    }
}
