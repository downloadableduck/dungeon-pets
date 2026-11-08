package com.jeff.pets.dungon_pets.client;

import com.jeff.pets.client.addon.PetsModAddons;
import com.jeff.pets.client.addon.impl.PetSkin;
import com.jeff.pets.dungon_pets.DungeonPets;
import com.jeff.pets.dungon_pets.client.rendering.archillager.ArchIllagerRenderer;
import com.jeff.pets.dungon_pets.client.rendering.baby_duck.BabyDuckRenderer;
import com.jeff.pets.dungon_pets.client.rendering.baby_ghast.BabyGhastRenderer;
import com.jeff.pets.dungon_pets.client.rendering.baby_squid.BabySquidRenderer;
import com.jeff.pets.dungon_pets.client.rendering.cauldron.CauldronRenderer;
import com.jeff.pets.dungon_pets.client.rendering.cinnamon_ferret.CinnamonFerretRenderer;
import com.jeff.pets.dungon_pets.client.rendering.creeper.CreeperDungeonsRenderer;
import com.jeff.pets.dungon_pets.client.rendering.emperor_penguin.EmperorPenguinRenderer;
import com.jeff.pets.dungon_pets.client.rendering.enchanter.EnchanterRenderer;
import com.jeff.pets.dungon_pets.client.rendering.frozen_zombie.FrozenZombieRenderer;
import com.jeff.pets.dungon_pets.client.rendering.geomancer.GeomancerRenderer;
import com.jeff.pets.dungon_pets.client.rendering.gift_wrapper.GiftWrapperRenderer;
import com.jeff.pets.dungon_pets.client.rendering.gildsmith.GildsmithRenderer;
import com.jeff.pets.dungon_pets.client.rendering.glowing_mini_abomination.GlowingMiniAbominationRenderer;
import com.jeff.pets.dungon_pets.client.rendering.golden_parrot.GoldenParrotRenderer;
import com.jeff.pets.dungon_pets.client.rendering.heart_of_ender.HeartOfEnderRenderer;
import com.jeff.pets.dungon_pets.client.rendering.hedgehog.HedgehogRenderer;
import com.jeff.pets.dungon_pets.client.rendering.iceologer.IceologerRenderer;
import com.jeff.pets.dungon_pets.client.rendering.illager_royal_guard.IllagerRoyalGuardRenderer;
import com.jeff.pets.dungon_pets.client.rendering.jungle_zombie.JungleZombieRenderer;
import com.jeff.pets.dungon_pets.client.rendering.key.KeyRenderer;
import com.jeff.pets.dungon_pets.client.rendering.leapleaf.LeapleafRenderer;
import com.jeff.pets.dungon_pets.client.rendering.luxury_merchant.LuxuryMerchantRenderer;
import com.jeff.pets.dungon_pets.client.rendering.mole.MoleRenderer;
import com.jeff.pets.dungon_pets.client.rendering.nameless_one.NamelessOneRenderer;
import com.jeff.pets.dungon_pets.client.rendering.necromancer.NecromancerRenderer;
import com.jeff.pets.dungon_pets.client.rendering.phantom_familiar.PhantomFamiliarRenderer;
import com.jeff.pets.dungon_pets.client.rendering.raccoon_dungeons.RaccoonDungeonsRenderer;
import com.jeff.pets.dungon_pets.client.rendering.raven.RavenRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static com.jeff.pets.dungon_pets.DungeonPets.EMPEROR_PENGUIN;
import static com.jeff.pets.dungon_pets.DungeonPets.MOD_ID;

public class DungeonPetsClient {

    public static PetsModAddons ADDON = PetsModAddons.registerAddon(MOD_ID);

    public static String keyName = "";
    public static String keySkin = "diamond";
    public static String archIllagerName = "";
    public static String babyDuckName = "";
    public static String babySquidName = "";
    public static String cauldronName = "";
    public static String cinnamonFerretName = "";
    public static String creeperDungeonsName = "";
    public static String babyGhastName = "";
    public static String emperorPenguinName = "";
    public static String enchanterName = "";
    public static String frozenZombieName = "";
    public static String geomancerName = "";
    public static String giftWrapperName = "";
    public static String gildsmithName = "";
    public static String glowingMiniAbominationName = "";
    public static String goldenParrotName = "";
    public static String heartOfEnderName = "";
    public static String hedgehogName = "";
    public static String iceologerName = "";
    public static String illagerRoyalGuardName = "";
    public static String jungleZombieName = "";
    public static String leapleafName = "";
    public static String luxuryMerchantName = "";
    public static String moleName = "";
    public static String namelessOneName = "";
    public static String necromancerName = "";
    public static String phantomFamiliarName = "";
    public static String ravenName = "";
    public static String raccoonDungeonsName = "";

    public static void clientInit() {
        EntityRenderers.register(DungeonPets.KEY, KeyRenderer::new);
        EntityRenderers.register(DungeonPets.ARCH_ILLAGER, ArchIllagerRenderer::new);
        EntityRenderers.register(DungeonPets.BABY_DUCK, BabyDuckRenderer::new);
        EntityRenderers.register(DungeonPets.BABY_SQUID, BabySquidRenderer::new);
        EntityRenderers.register(DungeonPets.CAULDRON, CauldronRenderer::new);
        EntityRenderers.register(DungeonPets.CINNAMON_FERRET, CinnamonFerretRenderer::new);
        EntityRenderers.register(DungeonPets.CREEPER_DUNGEONS, CreeperDungeonsRenderer::new);
        EntityRenderers.register(DungeonPets.BABY_GHAST, BabyGhastRenderer::new);
        EntityRenderers.register(DungeonPets.EMPEROR_PENGUIN, EmperorPenguinRenderer::new);
        EntityRenderers.register(DungeonPets.ENCHANTER, EnchanterRenderer::new);
        EntityRenderers.register(DungeonPets.FROZEN_ZOMBIE, FrozenZombieRenderer::new);
        EntityRenderers.register(DungeonPets.GEOMANCER, GeomancerRenderer::new);
        EntityRenderers.register(DungeonPets.GIFT_WRAPPER, GiftWrapperRenderer::new);
        EntityRenderers.register(DungeonPets.GILDSMITH, GildsmithRenderer::new);
        EntityRenderers.register(DungeonPets.GLOWING_MINI_ABOMINATION, GlowingMiniAbominationRenderer::new);
        EntityRenderers.register(DungeonPets.GOLDEN_PARROT, GoldenParrotRenderer::new);
        EntityRenderers.register(DungeonPets.HEART_OF_ENDER, HeartOfEnderRenderer::new);
        EntityRenderers.register(DungeonPets.HEDGEHOG, HedgehogRenderer::new);
        EntityRenderers.register(DungeonPets.ICEOLOGER, IceologerRenderer::new);
        EntityRenderers.register(DungeonPets.ILLAGER_ROYAL_GUARD, IllagerRoyalGuardRenderer::new);
        EntityRenderers.register(DungeonPets.JUNGLE_ZOMBIE, JungleZombieRenderer::new);
        EntityRenderers.register(DungeonPets.LEAPLEAF, LeapleafRenderer::new);
        EntityRenderers.register(DungeonPets.LUXURY_MERCHANT, LuxuryMerchantRenderer::new);
        EntityRenderers.register(DungeonPets.MOLE, MoleRenderer::new);
        EntityRenderers.register(DungeonPets.NAMELESS_ONE, NamelessOneRenderer::new);
        EntityRenderers.register(DungeonPets.NECROMANCER, NecromancerRenderer::new);
        EntityRenderers.register(DungeonPets.PHANTOM_FAMILIAR, PhantomFamiliarRenderer::new);
        EntityRenderers.register(DungeonPets.RAVEN, RavenRenderer::new);
        EntityRenderers.register(DungeonPets.RACCOON_DUNGEONS, RaccoonDungeonsRenderer::new);
        try {
            ADDON.addPet(DungeonPets.KEY, "key", DungeonPetsClient.class.getDeclaredField("keyName"), Optional.of(new PetSkin(List.of("gold", "diamond"), DungeonPetsClient.class.getDeclaredField("keySkin"))));
            ADDON.addPet(DungeonPets.ARCH_ILLAGER, "arch_illager", DungeonPetsClient.class.getDeclaredField("archIllagerName"), Optional.empty());
            ADDON.addPet(DungeonPets.BABY_DUCK, "baby_duck", DungeonPetsClient.class.getDeclaredField("babyDuckName"), Optional.empty());
            ADDON.addPet(DungeonPets.BABY_SQUID, "baby_squid", DungeonPetsClient.class.getDeclaredField("babySquidName"), Optional.empty());
            ADDON.addPet(DungeonPets.CAULDRON, "cauldron", DungeonPetsClient.class.getDeclaredField("cauldronName"), Optional.empty());
            ADDON.addPet(DungeonPets.CINNAMON_FERRET, "cinnamon_ferret", DungeonPetsClient.class.getDeclaredField("cinnamonFerretName"), Optional.empty());
            ADDON.addPet(DungeonPets.CREEPER_DUNGEONS, "creeper_(dungeons)", DungeonPetsClient.class.getDeclaredField("creeperDungeonsName"), Optional.empty());
            ADDON.addPet(DungeonPets.BABY_GHAST, "baby_ghast", DungeonPetsClient.class.getDeclaredField("babyGhastName"), Optional.empty());
            ADDON.addPet(EMPEROR_PENGUIN, "emperor_penguin", DungeonPetsClient.class.getDeclaredField("emperorPenguinName"), Optional.empty());
            ADDON.addPet(DungeonPets.ENCHANTER, "enchanter", DungeonPetsClient.class.getDeclaredField("enchanterName"), Optional.empty());
            ADDON.addPet(DungeonPets.FROZEN_ZOMBIE, "frozen_zombie", DungeonPetsClient.class.getDeclaredField("frozenZombieName"), Optional.empty());
            ADDON.addPet(DungeonPets.GEOMANCER, "geomancer", DungeonPetsClient.class.getDeclaredField("geomancerName"), Optional.empty());
            ADDON.addPet(DungeonPets.GIFT_WRAPPER, "gift_wrapper", DungeonPetsClient.class.getDeclaredField("giftWrapperName"), Optional.empty());
            ADDON.addPet(DungeonPets.GILDSMITH, "gildsmith", DungeonPetsClient.class.getDeclaredField("gildsmithName"), Optional.empty());
            ADDON.addPet(DungeonPets.GLOWING_MINI_ABOMINATION, "glowing_mini_abomination", DungeonPetsClient.class.getDeclaredField("glowingMiniAbominationName"), Optional.empty());
            ADDON.addPet(DungeonPets.GOLDEN_PARROT, "golden_parrot", DungeonPetsClient.class.getDeclaredField("goldenParrotName"), Optional.empty());
            ADDON.addPet(DungeonPets.HEART_OF_ENDER, "heart_of_ender", DungeonPetsClient.class.getDeclaredField("heartOfEnderName"), Optional.empty());
            ADDON.addPet(DungeonPets.HEDGEHOG, "hedgehog", DungeonPetsClient.class.getDeclaredField("hedgehogName"), Optional.empty());
            ADDON.addPet(DungeonPets.ICEOLOGER, "iceologer", DungeonPetsClient.class.getDeclaredField("iceologerName"), Optional.empty());
            ADDON.addPet(DungeonPets.ILLAGER_ROYAL_GUARD, "illager_royal_guard", DungeonPetsClient.class.getDeclaredField("illagerRoyalGuardName"), Optional.empty());
            ADDON.addPet(DungeonPets.JUNGLE_ZOMBIE, "jungle_zombie", DungeonPetsClient.class.getDeclaredField("jungleZombieName"), Optional.empty());
            ADDON.addPet(DungeonPets.LEAPLEAF, "leapleaf", DungeonPetsClient.class.getDeclaredField("leapleafName"), Optional.empty());
            ADDON.addPet(DungeonPets.LUXURY_MERCHANT, "luxury_merchant", DungeonPetsClient.class.getDeclaredField("luxuryMerchantName"), Optional.empty());
            ADDON.addPet(DungeonPets.MOLE, "mole", DungeonPetsClient.class.getDeclaredField("moleName"), Optional.empty());
            ADDON.addPet(DungeonPets.NAMELESS_ONE, "nameless_one", DungeonPetsClient.class.getDeclaredField("namelessOneName"), Optional.empty());
            ADDON.addPet(DungeonPets.NECROMANCER, "necromancer", DungeonPetsClient.class.getDeclaredField("necromancerName"), Optional.empty());
            ADDON.addPet(DungeonPets.PHANTOM_FAMILIAR, "phantom_familiar", DungeonPetsClient.class.getDeclaredField("phantomFamiliarName"), Optional.empty());
            ADDON.addPet(DungeonPets.RAVEN, "raven", DungeonPetsClient.class.getDeclaredField("ravenName"), Optional.empty());
            ADDON.addPet(DungeonPets.RACCOON_DUNGEONS, "raccoon_(dungeons)", DungeonPetsClient.class.getDeclaredField("raccoonDungeonsName"), Optional.empty());
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
