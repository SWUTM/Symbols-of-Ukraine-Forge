package net.swutm.symbolsofukraine;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.swutm.symbolsofukraine.item.ModPaintings;
import org.slf4j.Logger;

@Mod(symbolsofukraine.MOD_ID)
public class symbolsofukraine
{
    public static final String MOD_ID = "symbolsofukraine";
    private static final Logger LOGGER = LogUtils.getLogger();

    public symbolsofukraine()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModPaintings.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }
    }

