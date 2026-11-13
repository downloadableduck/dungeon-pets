package com.jeff.pets.dungon_pets;

import com.jeff.pets.dungon_pets.impl.AttributeRegistrar;
import com.jeff.pets.dungon_pets.impl.Mace;
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

public final class DungeonPets {
    public static final String MOD_ID = "dungeon_pets";

    public static final Mace MACE = Registry.register(
            BuiltInRegistries.ITEM,
            Identifier.fromNamespaceAndPath(MOD_ID, "mace"),
            new Mace(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "mace")))));

    public static final ResourceKey<@NotNull EntityType<?>> KEY_KEY = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "key"));
    public static final ResourceKey<@NotNull EntityType<?>> BABY_DUCK_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_duck"));
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
                    .sized(2f, 1f)
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
                    .sized(2f, 2f)
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
                    .sized(4f, 4f)
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
                    .sized(5f, 6f)
                    .build(REDSTONE_MONSTROCITY_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ROYAL_PENGUIN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "royal_penguin")
    );
    public static final EntityType<@NotNull RoyalPenguin> ROYAL_PENGUIN = Registry.register(
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
    public static final EntityType<@NotNull SkeletonHorseman> SKELETON_HORSEMAN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "skeleton_horseman"),
            EntityType.Builder.of(SkeletonHorseman::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2f)
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
    public static final ResourceKey<@NotNull EntityType<?>> TOWER_GUARD_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "tower_guard")
    );
    public static final EntityType<@NotNull TowerGuard> TOWER_GUARD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "tower_guard"),
            EntityType.Builder.of(TowerGuard::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(TOWER_GUARD_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> TOWER_WRAITH_EY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "tower_wraith")
    );
    public static final EntityType<@NotNull TowerWraith> TOWER_WRAITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "tower_wraith"),
            EntityType.Builder.of(TowerWraith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(TOWER_WRAITH_EY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> UNIQUESMITH_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "uniquesmith")
    );
    public static final EntityType<@NotNull Uniquesmith> UNIQUESMITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "uniquesmith"),
            EntityType.Builder.of(Uniquesmith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2, 3f)
                    .build(UNIQUESMITH_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> VANGUARD_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "vanguard")
    );
    public static final EntityType<@NotNull Vanguard> VANGUARD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "vanguard"),
            EntityType.Builder.of(Vanguard::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(VANGUARD_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WHISPERER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "whisperer")
    );
    public static final EntityType<@NotNull Whisperer> WHISPERER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "whisperer"),
            EntityType.Builder.of(Whisperer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(WHISPERER_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WRAITH_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "wraith")
    );
    public static final EntityType<@NotNull Wraith> WRAITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wraith"),
            EntityType.Builder.of(Wraith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(WRAITH_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WRETCHED_WRAITH_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "wretched_wraith")
    );
    public static final EntityType<@NotNull WretchedWraith> WRETCHED_WRAITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wretched_wraith"),
            EntityType.Builder.of(WretchedWraith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2.5f)
                    .build(WRETCHED_WRAITH_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> BLACKSMITH_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "blacksmith_dungeons")
    );
    public static final EntityType<@NotNull BlacksmithDungeons> BLACKSMITH_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "blacksmith_dungeons"),
            EntityType.Builder.of(BlacksmithDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(BLACKSMITH_DUNGEONS_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> CLAM_CAT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "clam_cat")
    );
    public static final EntityType<@NotNull ClamCat> CLAM_CAT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "clam_cat"),
            EntityType.Builder.of(ClamCat::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 0.7f)
                    .build(CLAM_CAT_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ENCHANTSMITH_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "enchantsmith")
    );
    public static final EntityType<@NotNull Enchantsmith> ENCHANTSMITH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "enchantsmith"),
            EntityType.Builder.of(Enchantsmith::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ENCHANTSMITH_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> MYSTERY_MERCHANT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mystery_merchant")
    );
    public static final EntityType<@NotNull MysteryMerchant> MYSTERY_MERCHANT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mystery_merchant"),
            EntityType.Builder.of(MysteryMerchant::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(MYSTERY_MERCHANT_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> RUBY_BABY_TURTLE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ruby_baby_key")
    );
    public static final EntityType<@NotNull RubyBabyTurtle> RUBY_BABY_TURTLE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ruby_baby_turtle"),
            EntityType.Builder.of(RubyBabyTurtle::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 0.5f)
                    .build(RUBY_BABY_TURTLE_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> STONE_MINITROCITY_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "stone_minitrocity_key")
    );
    public static final EntityType<@NotNull StoneMinitrocity> STONE_MINITROCITY = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "stone_minitrocity"),
            EntityType.Builder.of(StoneMinitrocity::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(WRETCHED_WRAITH_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> VILLAGE_MERCHANT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "village_merchant")
    );
    public static final EntityType<@NotNull VillageMerchant> VILLAGE_MERCHANT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "village_merchant"),
            EntityType.Builder.of(VillageMerchant::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(VILLAGE_MERCHANT_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ZOMBIFIED_BABY_PIG_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "zombified_baby_pig")
    );
    public static final EntityType<@NotNull ZombifiedBabyPig> ZOMBIFIED_BABY_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "zombified_baby_pig"),
            EntityType.Builder.of(ZombifiedBabyPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(ZOMBIFIED_BABY_PIG_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WISP_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "wisp")
    );
    public static final EntityType<@NotNull Wisp> WISP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wisp"),
            EntityType.Builder.of(Wisp::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(WISP_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ANCIENT_GUARDIAN_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ancient_guardian")
    );
    public static final EntityType<@NotNull AncientGuardian> ANCIENT_GUARDIAN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ancient_guardian"),
            EntityType.Builder.of(AncientGuardian::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(8f, 8f)
                    .build(ANCIENT_GUARDIAN_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> CONJURED_SLIME_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "conjured_slime")
    );
    public static final EntityType<@NotNull ConjuredSlime> CONJURED_SLIME = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "conjured_slime"),
            EntityType.Builder.of(ConjuredSlime::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(3f, 3f)
                    .build(CONJURED_SLIME_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> MOUNTAINEER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mountaineer")
    );
    public static final EntityType<@NotNull Mountaineer> MOUNTAINEER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mountaineer"),
            EntityType.Builder.of(Mountaineer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(MOUNTAINEER_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> PIGLIN_MERCHANT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "piglin_merchant")
    );
    public static final EntityType<@NotNull PiglinMerchant> PIGLIN_MERCHANT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "piglin_merchant"),
            EntityType.Builder.of(PiglinMerchant::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(3f, 3f)
                    .build(PIGLIN_MERCHANT_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> SQUALL_GOLEM_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "squall_golem")
    );
    public static final EntityType<@NotNull SquallGolem> SQUALL_GOLEM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "squall_golem"),
            EntityType.Builder.of(SquallGolem::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(4f, 4f)
                    .build(SQUALL_GOLEM_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> VINDICATOR_CHEF_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "vindicator_chef")
    );
    public static final EntityType<@NotNull VindicatorChef> VINDICATOR_CHEF = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "vindicator_chef"),
            EntityType.Builder.of(VindicatorChef::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(VINDICATOR_CHEF_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> VINDICATOR_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "vindicator_dungeons")
    );
    public static final EntityType<@NotNull VindicatorDungeons> VINDICATOR_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "vindicator_dungeons"),
            EntityType.Builder.of(VindicatorDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(VINDICATOR_DUNGEONS_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WAVE_WHISPERER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "wave_whisperer")
    );
    public static final EntityType<@NotNull WaveWhisperer> WAVE_WHISPERER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wave_whisperer"),
            EntityType.Builder.of(WaveWhisperer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(WAVE_WHISPERER_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WILDFIRE_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "wildfire")
    );
    public static final EntityType<@NotNull Wildfire> WILDFIRE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wildfire"),
            EntityType.Builder.of(Wildfire::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 2.5f)
                    .build(WILDFIRE_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> WINDCALLER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "windcaller")
    );
    public static final EntityType<@NotNull WindCaller> WINDCALLER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "windcaller"),
            EntityType.Builder.of(WindCaller::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(WINDCALLER_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> BLASTLING_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "blastling")
    );
    public static final EntityType<@NotNull Blastling> BLASTLING = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "blastling"),
            EntityType.Builder.of(Blastling::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2.5f)
                    .build(BLASTLING_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> DROWNED_NECROMANCER_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "drowned_necromancer")
    );
    public static final EntityType<@NotNull DrownedNecromancer> DROWNED_NECROMANCER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "drowned_necromancer"),
            EntityType.Builder.of(DrownedNecromancer::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(DROWNED_NECROMANCER_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ENDERLING_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "enderling")
    );
    public static final EntityType<@NotNull Enderling> ENDERLING = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "enderling"),
            EntityType.Builder.of(Enderling::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ENDERLING_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> ENDERSENT_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "endersent")
    );
    public static final EntityType<@NotNull Endersent> ENDERSENT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "endersent"),
            EntityType.Builder.of(Endersent::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(2f, 6f)
                    .build(ENDERSENT_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> GUARDIAN_VEX_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "guardian_vex")
    );
    public static final EntityType<@NotNull GuardianVex> GUARDIAN_VEX = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "guardian_vex"),
            EntityType.Builder.of(GuardianVex::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(GUARDIAN_VEX_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> SNARELING_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "snareling")
    );
    public static final EntityType<@NotNull Snareling> SNARELING = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "snareling"),
            EntityType.Builder.of(Snareling::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(SNARELING_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> SOUL_WIZARD_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "soul_wizard")
    );
    public static final EntityType<@NotNull SoulWizard> SOUL_WIZARD = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "soul_wizard"),
            EntityType.Builder.of(SoulWizard::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 1f)
                    .build(SOUL_WIZARD_KEY)
    );
    public static final ResourceKey<@NotNull EntityType<?>> TEMPEST_GOLEM_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "tempest_golem")
    );
    public static final EntityType<@NotNull TempestGolem> TEMPEST_GOLEM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "tempest_golem"),
            EntityType.Builder.of(TempestGolem::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(4f, 4f)
                    .build(TEMPEST_GOLEM_KEY)
    );
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
    public static EntityType<@NotNull BabyDuck> BABY_DUCK = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "baby_duck"),
            EntityType.Builder.of(BabyDuck::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.5f, 0.5f)
                    .build(BABY_DUCK_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> ZOMBIE_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "zombie_dungeons")
    );
    public static final EntityType<@NotNull ZombieDungeons> ZOMBIE_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "zombie_dungeons"),
            EntityType.Builder.of(ZombieDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(ZOMBIE_DUNGEONS_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> PILLAGER_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pillager_dungeons")
    );
    public static final EntityType<@NotNull PillagerDungeons> PILLAGER_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pillager_dungeons"),
            EntityType.Builder.of(PillagerDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(PILLAGER_DUNGEONS_KEY)
    );

    public static final ResourceKey<@NotNull EntityType<?>> SKELETON_DUNGEONS_KEY = ResourceKey.create(
            Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "soul_wizard")
    );
    public static final EntityType<@NotNull SkeletonDungeons> SKELETON_DUNGEONS = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "skeleton_dungeons"),
            EntityType.Builder.of(SkeletonDungeons::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(1f, 2f)
                    .build(SKELETON_DUNGEONS_KEY)
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
        registrar.register(TOWER_GUARD, TowerGuard.createAttributes().build());
        registrar.register(TOWER_WRAITH, TowerWraith.createAttributes().build());
        registrar.register(UNIQUESMITH, Uniquesmith.createAttributes().build());
        registrar.register(VANGUARD, Vanguard.createAttributes().build());
        registrar.register(WHISPERER, Whisperer.createAttributes().build());
        registrar.register(WRAITH, Wraith.createAttributes().build());
        registrar.register(WRETCHED_WRAITH, WretchedWraith.createAttributes().build());
        registrar.register(BLACKSMITH_DUNGEONS, BlacksmithDungeons.createAttributes().build());
        registrar.register(CLAM_CAT, ClamCat.createAttributes().build());
        registrar.register(ENCHANTSMITH, Enchantsmith.createAttributes().build());
        registrar.register(MYSTERY_MERCHANT, MysteryMerchant.createAttributes().build());
        registrar.register(RUBY_BABY_TURTLE, RubyBabyTurtle.createAttributes().build());
        registrar.register(STONE_MINITROCITY, StoneMinitrocity.createAttributes().build());
        registrar.register(VILLAGE_MERCHANT, VillageMerchant.createAttributes().build());
        registrar.register(ZOMBIFIED_BABY_PIG, ZombifiedBabyPig.createAttributes().build());
        registrar.register(WISP, Wisp.createAttributes().build());
        registrar.register(ANCIENT_GUARDIAN, AncientGuardian.createAttributes().build());
        registrar.register(CONJURED_SLIME, ConjuredSlime.createAttributes().build());
        registrar.register(MOUNTAINEER, Mountaineer.createAttributes().build());
        registrar.register(PIGLIN_MERCHANT, PiglinMerchant.createAttributes().build());
        registrar.register(SQUALL_GOLEM, SquallGolem.createAttributes().build());
        registrar.register(VINDICATOR_CHEF, VindicatorChef.createAttributes().build());
        registrar.register(VINDICATOR_DUNGEONS, VindicatorDungeons.createAttributes().build());
        registrar.register(WAVE_WHISPERER, WaveWhisperer.createAttributes().build());
        registrar.register(WILDFIRE, Wildfire.createAttributes().build());
        registrar.register(WINDCALLER, WindCaller.createAttributes().build());
        registrar.register(BLASTLING, Blastling.createAttributes().build());
        registrar.register(DROWNED_NECROMANCER, DrownedNecromancer.createAttributes().build());
        registrar.register(ENDERLING, Enderling.createAttributes().build());
        registrar.register(ENDERSENT, Endersent.createAttributes().build());
        registrar.register(GUARDIAN_VEX, GuardianVex.createAttributes().build());
        registrar.register(SNARELING, Snareling.createAttributes().build());
        registrar.register(SOUL_WIZARD, SoulWizard.createAttributes().build());
        registrar.register(TEMPEST_GOLEM, TempestGolem.createAttributes().build());
        registrar.register(ZOMBIE_DUNGEONS, ZombieDungeons.createAttributes().build());
        registrar.register(PILLAGER_DUNGEONS, PillagerDungeons.createAttributes().build());
        registrar.register(SKELETON_DUNGEONS, SkeletonDungeons.createAttributes().build());
    }
}
