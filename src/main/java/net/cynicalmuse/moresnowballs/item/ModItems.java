package net.cynicalmuse.moresnowballs.item;

import net.cynicalmuse.moresnowballs.MoreSnowballs;
import net.cynicalmuse.moresnowballs.item.custom.SuperSnowballItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item SUPER_SNOWBALL = registerItem("super_snowball", new SuperSnowballItem(new Item.Settings()));
    //public static final Item SNOW_BRICK = registerItem("snow_brick", new SnowBrickItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreSnowballs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreSnowballs.LOGGER.info("Register Mod Items for " + MoreSnowballs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            fabricItemGroupEntries.add(SUPER_SNOWBALL);
        });
    }
}
