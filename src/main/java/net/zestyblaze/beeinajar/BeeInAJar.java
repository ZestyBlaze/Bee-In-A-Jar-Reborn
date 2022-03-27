package net.zestyblaze.beeinajar;

import net.fabricmc.api.ModInitializer;
import net.zestyblaze.beeinajar.registry.BIAJBlockInit;
import net.zestyblaze.beeinajar.registry.BIAJItemInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BeeInAJar implements ModInitializer {
	public static final String MODID = "beeinajar";
	public static final String MODNAME = "BeeInAJar";
	public static final Logger LOGGER = LogManager.getLogger(MODNAME);

	@Override
	public void onInitialize() {
		LOGGER.info("BeeInAJar is installed correctly, loading now! Thanks for installing! <3");
		BIAJBlockInit.registerBlocks();
		BIAJItemInit.registerItems();
	}
}
