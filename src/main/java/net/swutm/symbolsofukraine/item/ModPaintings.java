package net.swutm.symbolsofukraine.item;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.symbolsofukraine.symbolsofukraine;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, symbolsofukraine.MOD_ID);

    public static final RegistryObject<PaintingVariant> BANDYRA = PAINTING_VARIANTS.register("bandyra",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> FLAG_UKRAINE = PAINTING_VARIANTS.register("flag_ukraine",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> GERB_UKRAINE = PAINTING_VARIANTS.register("gerb_ukraine",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> GORILKA = PAINTING_VARIANTS.register("gorilka",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> KALINA = PAINTING_VARIANTS.register("kalina",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> LELEKA = PAINTING_VARIANTS.register("leleka_21",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> MAK = PAINTING_VARIANTS.register("mak",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> PISANKA = PAINTING_VARIANTS.register("pisanka",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> PCHENICHA = PAINTING_VARIANTS.register("pshenicha",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> SEVCHENKA = PAINTING_VARIANTS.register("sevchenka",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> SV_IGOR = PAINTING_VARIANTS.register("sv_igor_21",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> VERBA = PAINTING_VARIANTS.register("verba",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> VISIVANKA = PAINTING_VARIANTS.register("visivanka",
            () -> new PaintingVariant(64, 64));

    public static final RegistryObject<PaintingVariant> GERB = PAINTING_VARIANTS.register("gerb",
            () -> new PaintingVariant(64, 64));
    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
