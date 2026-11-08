package com.jeff.pets.dungon_pets;

import com.geckolib.animatable.client.GeoRenderProvider;
import com.geckolib.renderer.GeoItemRenderer;
import com.google.common.base.Suppliers;
import com.jeff.pets.dungon_pets.impl.AttributeRegistrar;
import com.jeff.pets.dungon_pets.impl.Mace;
import com.jeff.pets.dungon_pets.mob.DungeonsGroundPet;
import com.jeff.pets.dungon_pets.mob.pets.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.crypto.Mac;
import javax.print.attribute.standard.MediaSize;
import java.util.function.Supplier;

public final class DungeonPets {
    public static final String MOD_ID = "dungeon_pets";

    public static final Mace MACE = Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "mace"),
            new Mace(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "mace")))));

    public static final ResourceKey<@NotNull EntityType<?>> KEY_KEY = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "key"));
    public static EntityType<@NotNull Key> KEY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "key"),
            EntityType.Builder.of(Key::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(KEY_KEY)
    );

    public static ResourceKey<@NotNull EntityType<?>> ARCH_ILLAGER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "archillager")
    );
    public static EntityType<@NotNull ArchIllager> ARCH_ILLAGER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "archillager"),
            EntityType.Builder.of(ArchIllager::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(ARCH_ILLAGER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> BABY_DUCK_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_duck"));

    public static EntityType<@NotNull BabyDuck> BABY_DUCK = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_duck"),
            EntityType.Builder.of(BabyDuck::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(BABY_DUCK_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> BABY_SQUID_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "baby_squid")
    );
    public static final EntityType<@NotNull BabySquid> BABY_SQUID = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_squid"),
            EntityType.Builder.of(BabySquid::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(BABY_SQUID_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> CAULDRON_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "cauldron")
    );
    public static final EntityType<@NotNull Cauldron> CAULDRON = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "cauldron"),
            EntityType.Builder.of(Cauldron::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2.5f, 2.5f)
                    .build(CAULDRON_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> CINNAMON_FERRET_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "cinnamon_ferret")
    );
    public static final EntityType<@NotNull CinnamonFerret> CINNAMON_FERRET = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "cinnamon_ferret"),
            EntityType.Builder.of(CinnamonFerret::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(CINNAMON_FERRET_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> CREEPER_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "creeper_dungeons")
    );
    public static final EntityType<@NotNull CreeperDungeons> CREEPER_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "creeper_dungeons"),
            EntityType.Builder.of(CreeperDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1, 2)
                    .build(CREEPER_DUNGEONS_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> BABY_GHAST_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "baby_ghast")
    );
    public static final EntityType<@NotNull BabyGhast> BABY_GHAST = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_ghast"),
            EntityType.Builder.of(BabyGhast::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(BABY_GHAST_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> EMPEROR_PENGUIN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "emperor_penguin")
    );
    public static final EntityType<@NotNull EmperorPenguin> EMPEROR_PENGUIN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "emperor_penguin"),
            EntityType.Builder.of(EmperorPenguin::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(EMPEROR_PENGUIN_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> ENCHANTER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "enchanter")
    );
    public static final EntityType<@NotNull Enchanter> ENCHANTER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "enchanter"),
            EntityType.Builder.of(Enchanter::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ENCHANTER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> FROZEN_ZOMBIE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "frozen_zombie")
    );
    public static final EntityType<@NotNull FrozenZombie> FROZEN_ZOMBIE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "frozen_zombie"),
            EntityType.Builder.of(FrozenZombie::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(FROZEN_ZOMBIE_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> GEOMANCER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "geomancer")
    );
    public static final EntityType<@NotNull Geomancer> GEOMANCER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "geomancer"),
            EntityType.Builder.of(Geomancer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(GEOMANCER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> GIFT_WRAPPER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "gift_wrapper")
    );
    public static final EntityType<@NotNull GiftWrapper> GIFT_WRAPPER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "gift_wrapper"),
            EntityType.Builder.of(GiftWrapper::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(GIFT_WRAPPER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> GILDSMITH_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "gildsmith")
    );
    public static final EntityType<@NotNull Gildsmith> GILDSMITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "gildsmith"),
            EntityType.Builder.of(Gildsmith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 4f)
                    .build(GILDSMITH_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> GLOWING_MINI_ABOMINATION_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "glowing_mini_abomination")
    );
    public static final EntityType<@NotNull GlowingMiniAbomination> GLOWING_MINI_ABOMINATION = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "glowing_mini_abomination"),
            EntityType.Builder.of(GlowingMiniAbomination::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 1f)
                    .build(GLOWING_MINI_ABOMINATION_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> GOLDEN_PARROT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "golden_parrot")
    );
    public static final EntityType<@NotNull GoldenParrot> GOLDEN_PARROT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "golden_parrot"),
            EntityType.Builder.of(GoldenParrot::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(GOLDEN_PARROT_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> HEART_OF_ENDER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "heart_of_ender")
    );
    public static final EntityType<@NotNull HeartOfEnder> HEART_OF_ENDER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "heart_of_ender"),
            EntityType.Builder.of(HeartOfEnder::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(8f, 5f)
                    .build(HEART_OF_ENDER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> HEDGEHOG_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "hedgehog")
    );
    public static final EntityType<@NotNull Hedgehog> HEDGEHOG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "hedgehog"),
            EntityType.Builder.of(Hedgehog::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(HEDGEHOG_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> ICEOLOGER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "iceologer")
    );
    public static final EntityType<@NotNull Iceologer> ICEOLOGER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "iceologer"),
            EntityType.Builder.of(Iceologer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ICEOLOGER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> ILLAGER_ROYAL_GUARD_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "illager_royal_guard")
    );
    public static final EntityType<@NotNull IllagerRoyalGuard> ILLAGER_ROYAL_GUARD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "illager_royal_guard"),
            EntityType.Builder.of(IllagerRoyalGuard::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ILLAGER_ROYAL_GUARD_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> JUNGLE_ZOMBIE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "jungle_zombie")
    );
    public static final EntityType<@NotNull JungleZombie> JUNGLE_ZOMBIE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "jungle_zombie"),
            EntityType.Builder.of(JungleZombie::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(JUNGLE_ZOMBIE_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> LEAPLEAF_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "leapleaf")
    );
    public static final EntityType<@NotNull Leapleaf> LEAPLEAF = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "leapleaf"),
            EntityType.Builder.of(Leapleaf::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 3f)
                    .build(LEAPLEAF_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> LUXURY_MERCHANT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "luxury_merchant")
    );
    public static final EntityType<@NotNull LuxuryMerchant> LUXURY_MERCHANT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "luxury_merchant"),
            EntityType.Builder.of(LuxuryMerchant::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(LUXURY_MERCHANT_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> MOLE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mole")
    );
    public static final EntityType<@NotNull Mole> MOLE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mole"),
            EntityType.Builder.of(Mole::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(MOLE_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> NAMELESS_ONE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "nameless_one")
    );
    public static final EntityType<@NotNull NamelessOne> NAMELESS_ONE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "nameless_one"),
            EntityType.Builder.of(NamelessOne::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(NAMELESS_ONE_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> NECROMANCER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "necromancer")
    );
    public static final EntityType<@NotNull Necromancer> NECROMANCER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "necromancer"),
            EntityType.Builder.of(Necromancer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(NECROMANCER_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> PHANTOM_FAMILIAR_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "phantom_familiar")
    );
    public static final EntityType<@NotNull PhantomFamiliar> PHANTOM_FAMILIAR = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "phantom_familiar"),
            EntityType.Builder.of(PhantomFamiliar::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1.5f, 0.5f)
                    .build(PHANTOM_FAMILIAR_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> RACCOON_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "raccoon_dungeons")
    );
    public static final EntityType<@NotNull RaccoonDungeons> RACCOON_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "raccoon_dungeons"),
            EntityType.Builder.of(RaccoonDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(RACCOON_DUNGEONS_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> RAVEN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "raven")
    );
    public static final EntityType<@NotNull Raven> RAVEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "raven"),
            EntityType.Builder.of(Raven::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(RAVEN_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> RED_PANDA_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "red_panda")
    );
    public static final EntityType<@NotNull RedPanda> RED_PANDA = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "red_panda"),
            EntityType.Builder.of(RedPanda::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(RED_PANDA_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> REDSTONE_CUBE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "redstone_cube")
    );
    public static final EntityType<@NotNull RedstoneCube> REDSTONE_CUBE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "redstone_cube"),
            EntityType.Builder.of(RedstoneCube::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(REDSTONE_CUBE_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> REDSTONE_GOLEM_KKEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "redstone_golem")
    );
    public static final EntityType<@NotNull RedstoneGolem> REDSTONE_GOLEM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "redstone_golem"),
            EntityType.Builder.of(RedstoneGolem::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(REDSTONE_GOLEM_KKEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> REDSTONE_MINITROCITY_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "redstone_minitrocity")
    );
    public static final EntityType<@NotNull RedstoneMinitrocity> REDSTONE_MINITROCITY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "redstone_minitrocity"),
            EntityType.Builder.of(RedstoneMinitrocity::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(REDSTONE_MINITROCITY_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> REDSTONE_MONSTROCITY_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "redstone_monstrocity")
    );
    public static final EntityType<@NotNull RedstoneMonstrocity> REDSTONE_MONSTROCITY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "redstone_monstrocity"),
            EntityType.Builder.of(RedstoneMonstrocity::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(5f, 8f)
                    .build(REDSTONE_MONSTROCITY_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> ROYAL_PENGUIN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "royal_penguin")
    );
    public static final EntityType<@NotNull RedstoneCube> ROYAL_PENGUIN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "royal_penguin"),
            EntityType.Builder.of(RoyalPenguin::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(ROYAL_PENGUIN_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> SABLE_FERRET_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "sable_ferret")
    );
    public static final EntityType<@NotNull SableFerret> SABLE_FERRET = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "sable_ferret"),
            EntityType.Builder.of(SableFerret::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(SABLE_FERRET_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> SKELETON_HORSEMAN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "skeleton_horseman")
    );
    public static final EntityType<@NotNull RedstoneCube> SKELETON_HORSEMAN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "redstone_cube"),
            EntityType.Builder.of(RedstoneCube::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(3f, 2f)
                    .build(SKELETON_HORSEMAN_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> SKUNK_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "skunk")
    );
    public static final EntityType<@NotNull Skunk> SKUNK = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "skunk"),
            EntityType.Builder.of(Skunk::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(SKUNK_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> TOUCAN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "toucan")
    );
    public static final EntityType<@NotNull Toucan> TOUCAN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "toucan"),
            EntityType.Builder.of(Toucan::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(TOUCAN_KEY)
    );

    public static void init() {
    }

    public static void initAttributes(AttributeRegistrar registrar) {
        registrar.register(KEY, Key.createAttributes().build());
        registrar.register(ARCH_ILLAGER, ArchIllager.createAttributes().build());
        registrar.register(BABY_DUCK, BabyDuck.createAttributes().build());
        registrar.register(BABY_SQUID, BabySquid.createAttributes().build());
        registrar.register(CAULDRON, Cauldron.createAttributes().build());
        registrar.register(CINNAMON_FERRET, CinnamonFerret.createAttributes().build());
        registrar.register(CREEPER_DUNGEONS, CreeperDungeons.createAttributes().build());
        registrar.register(BABY_GHAST, BabyGhast.createAttributes().build());
        registrar.register(EMPEROR_PENGUIN, EmperorPenguin.createAttributes().build());
        registrar.register(ENCHANTER, Enchanter.createAttributes().build());
        registrar.register(FROZEN_ZOMBIE, FrozenZombie.createAttributes().build());
        registrar.register(GEOMANCER, Geomancer.createAttributes().build());
        registrar.register(GIFT_WRAPPER, GiftWrapper.createAttributes().build());
        registrar.register(GILDSMITH, Gildsmith.createAttributes().build());
        registrar.register(GLOWING_MINI_ABOMINATION, GlowingMiniAbomination.createAttributes().build());
        registrar.register(GOLDEN_PARROT, GoldenParrot.createAttributes().build());
        registrar.register(HEART_OF_ENDER, HeartOfEnder.createAttributes().build());
        registrar.register(HEDGEHOG, Hedgehog.createAttributes().build());
        registrar.register(ICEOLOGER, Iceologer.createAttributes().build());
        registrar.register(ILLAGER_ROYAL_GUARD, IllagerRoyalGuard.createAttributes().build());
        registrar.register(JUNGLE_ZOMBIE, JungleZombie.createAttributes().build());
        registrar.register(LEAPLEAF, Leapleaf.createAttributes().build());
        registrar.register(LUXURY_MERCHANT, LuxuryMerchant.createAttributes().build());
        registrar.register(MOLE, Mole.createAttributes().build());
        registrar.register(NAMELESS_ONE, NamelessOne.createAttributes().build());
        registrar.register(NECROMANCER, Necromancer.createAttributes().build());
        registrar.register(PHANTOM_FAMILIAR, PhantomFamiliar.createAttributes().build());
        registrar.register(RAVEN, Raven.createAttributes().build());
        registrar.register(RACCOON_DUNGEONS, RaccoonDungeons.createAttributes().build());
        registrar.register(RED_PANDA, RedPanda.createAttributes().build());
        registrar.register(REDSTONE_CUBE, RedstoneCube.createAttributes().build());
        registrar.register(REDSTONE_GOLEM, RedstoneGolem.createAttributes().build());
        registrar.register(REDSTONE_MINITROCITY, RedstoneMinitrocity.createAttributes().build());
        registrar.register(REDSTONE_MONSTROCITY, RedstoneMonstrocity.createAttributes().build());
        registrar.register(ROYAL_PENGUIN, RoyalPenguin.createAttributes().build());
        registrar.register(SABLE_FERRET, SableFerret.createAttributes().build());
        registrar.register(SKELETON_HORSEMAN, SkeletonHorseman.createAttributes().build());
        registrar.register(SKUNK, Skunk.createAttributes().build());
        registrar.register(TOUCAN, Toucan.createAttributes().build());
    }
}
