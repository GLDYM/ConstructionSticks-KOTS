package mrbysco.constructionstick.containers;

import mrbysco.constructionstick.ConstructionStick;
import mrbysco.constructionstick.containers.handlers.HandlerBundle;
import mrbysco.constructionstick.containers.handlers.HandlerCapability;
// import mrbysco.constructionstick.containers.handlers.HandlerDimensionsNet;
// import mrbysco.constructionstick.containers.handlers.HandlerNetTerminal;
import mrbysco.constructionstick.containers.handlers.HandlerPortableCell;
import mrbysco.constructionstick.containers.handlers.HandlerShulkerbox;
import mrbysco.constructionstick.containers.handlers.HandlerWirelessTerminal;
import net.neoforged.fml.ModList;
public class ContainerRegistrar {
	public static boolean isCuriosLoaded = ModList.get().isLoaded("curios");

	public static void register() {
		ConstructionStick.containerManager.register(new HandlerCapability());
		ConstructionStick.containerManager.register(new HandlerShulkerbox());
		ConstructionStick.containerManager.register(new HandlerBundle());

//        if(ModList.get().isLoaded("botania")) {
//            ConstructionStick.instance.containerManager.register(new HandlerBotania());
//            ConstructionStick.LOGGER.info("Botania integration added");
//        }

        if(isCuriosLoaded) {
            ConstructionStick.LOGGER.info("Curios integration added");
        }

        if(ModList.get().isLoaded("ae2")) {
            ConstructionStick.containerManager.register(new HandlerPortableCell());
            ConstructionStick.containerManager.register(new HandlerWirelessTerminal());
            ConstructionStick.LOGGER.info("Applied Energistics 2 integration added");
        }

        // if(ModList.get().isLoaded("toms_storage")) {
        //     ConstructionStick.instance.containerManager.register(new HandlerAdvWirelessTerminal());
        //     ConstructionStick.LOGGER.info("Tom's Simple Storage integration added");
        // }

        // if(ModList.get().isLoaded("refinedstorage")) {
        //     ConstructionStick.instance.containerManager.register(new HandlerWirelessGrid());
        //     ConstructionStick.LOGGER.info("Refined Storage integration added");
        // }

        // if(ModList.get().isLoaded("beyonddimensions")) {
        //     ConstructionStick.containerManager.register(new HandlerDimensionsNet());
        //     ConstructionStick.containerManager.register(new HandlerNetTerminal());
        //     ConstructionStick.LOGGER.info("Beyond Dimensions integration added");
        // }
	}
}
