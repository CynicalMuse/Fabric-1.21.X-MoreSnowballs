package net.cynicalmuse.moresnowballs;

import net.cynicalmuse.moresnowballs.entity.ModEntities;
import net.cynicalmuse.moresnowballs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreSnowballs implements ModInitializer {
	public static final String MOD_ID = "moresnowballs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModItems.registerModItems();
        ModEntities.registerModEntities();

	}
}