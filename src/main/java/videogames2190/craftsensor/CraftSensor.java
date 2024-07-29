package videogames2190.craftsensor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeBuilder;

import turniplabs.halplibe.util.RecipeEntrypoint;


public class CraftSensor implements ModInitializer, RecipeEntrypoint {
    public static final String MOD_ID = "craftsensor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Craftable Sensors initialized.");
    }

	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("SQS","QRQ","SQS")
			.addInput('S', "minecraft:cobblestones")
			.addInput('R', Block.blockRedstone)
			.addInput('Q', Item.quartz)
			.create("motionSensor", Block.motionsensorIdle.getDefaultStack());
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);

	}
}
