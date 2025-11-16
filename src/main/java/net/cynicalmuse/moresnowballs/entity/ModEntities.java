package net.cynicalmuse.moresnowballs.entity;

import net.cynicalmuse.moresnowballs.MoreSnowballs;
import net.cynicalmuse.moresnowballs.entity.custom.SuperSnowballEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SuperSnowballEntity> SUPER_SNOWBALL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MoreSnowballs.MOD_ID, "super_snowball"),
            EntityType.Builder.<SuperSnowballEntity>create(SuperSnowballEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f).build());

    public static void registerModEntities() {
        MoreSnowballs.LOGGER.info("Register Mod Entities for " + MoreSnowballs.MOD_ID);
    }
}
