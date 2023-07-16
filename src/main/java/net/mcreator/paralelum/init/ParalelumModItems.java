
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paralelum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.paralelum.item.Id30299302993ERRORErrorErrorErrorIncorrectVarItem;
import net.mcreator.paralelum.item.CrawlerItem;
import net.mcreator.paralelum.item.CrawlerFangItem;
import net.mcreator.paralelum.item.BloodiamondSwordItem;
import net.mcreator.paralelum.item.BloodiamondShovelItem;
import net.mcreator.paralelum.item.BloodiamondPickaxeItem;
import net.mcreator.paralelum.item.BloodiamondItem;
import net.mcreator.paralelum.item.BloodiamondHoeItem;
import net.mcreator.paralelum.item.BloodiamondAxeItem;
import net.mcreator.paralelum.ParalelumMod;

public class ParalelumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ParalelumMod.MODID);
	public static final RegistryObject<Item> PARALELIC_PEDESTAL = block(ParalelumModBlocks.PARALELIC_PEDESTAL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_WOOD = block(ParalelumModBlocks.BLOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_LOG = block(ParalelumModBlocks.BLOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_PLANKS = block(ParalelumModBlocks.BLOOD_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_LEAVES = block(ParalelumModBlocks.BLOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLOOD_STAIRS = block(ParalelumModBlocks.BLOOD_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_SLAB = block(ParalelumModBlocks.BLOOD_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOOD_FENCE = block(ParalelumModBlocks.BLOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLOOD_FENCE_GATE = block(ParalelumModBlocks.BLOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BLOOD_PRESSURE_PLATE = block(ParalelumModBlocks.BLOOD_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BLOOD_BUTTON = block(ParalelumModBlocks.BLOOD_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CRAWLER_FANG = REGISTRY.register("crawler_fang", () -> new CrawlerFangItem());
	public static final RegistryObject<Item> BLOOD_CRAWLER_SPAWN_EGG = REGISTRY.register("blood_crawler_spawn_egg",
			() -> new ForgeSpawnEggItem(ParalelumModEntities.BLOOD_CRAWLER, -65536, -10092544, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BLOODIAMOND = REGISTRY.register("bloodiamond", () -> new BloodiamondItem());
	public static final RegistryObject<Item> BLOODIAMOND_ORE = block(ParalelumModBlocks.BLOODIAMOND_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOODIAMOND_BLOCK = block(ParalelumModBlocks.BLOODIAMOND_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLOODIAMOND_PICKAXE = REGISTRY.register("bloodiamond_pickaxe", () -> new BloodiamondPickaxeItem());
	public static final RegistryObject<Item> BLOODIAMOND_AXE = REGISTRY.register("bloodiamond_axe", () -> new BloodiamondAxeItem());
	public static final RegistryObject<Item> BLOODIAMOND_SWORD = REGISTRY.register("bloodiamond_sword", () -> new BloodiamondSwordItem());
	public static final RegistryObject<Item> BLOODIAMOND_SHOVEL = REGISTRY.register("bloodiamond_shovel", () -> new BloodiamondShovelItem());
	public static final RegistryObject<Item> BLOODIAMOND_HOE = REGISTRY.register("bloodiamond_hoe", () -> new BloodiamondHoeItem());
	public static final RegistryObject<Item> CRAWLER_HELMET = REGISTRY.register("crawler_helmet", () -> new CrawlerItem.Helmet());
	public static final RegistryObject<Item> CRAWLER_CHESTPLATE = REGISTRY.register("crawler_chestplate", () -> new CrawlerItem.Chestplate());
	public static final RegistryObject<Item> CRAWLER_LEGGINGS = REGISTRY.register("crawler_leggings", () -> new CrawlerItem.Leggings());
	public static final RegistryObject<Item> CRAWLER_BOOTS = REGISTRY.register("crawler_boots", () -> new CrawlerItem.Boots());
	public static final RegistryObject<Item> PARALELIC_PEDESTAL_ACTIVE = block(ParalelumModBlocks.PARALELIC_PEDESTAL_ACTIVE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ID_30299302993_ERROR_ERROR_ERROR_ERROR_INCORRECT_VAR = REGISTRY.register("id_30299302993_error_error_error_error_incorrect_var", () -> new Id30299302993ERRORErrorErrorErrorIncorrectVarItem());
	public static final RegistryObject<Item> CORRUPTED_WOOD = block(ParalelumModBlocks.CORRUPTED_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_LOG = block(ParalelumModBlocks.CORRUPTED_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_PLANKS = block(ParalelumModBlocks.CORRUPTED_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_LEAVES = block(ParalelumModBlocks.CORRUPTED_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CORRUPTED_STAIRS = block(ParalelumModBlocks.CORRUPTED_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_SLAB = block(ParalelumModBlocks.CORRUPTED_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_FENCE = block(ParalelumModBlocks.CORRUPTED_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> CORRUPTED_FENCE_GATE = block(ParalelumModBlocks.CORRUPTED_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CORRUPTED_PRESSURE_PLATE = block(ParalelumModBlocks.CORRUPTED_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> CORRUPTED_BUTTON = block(ParalelumModBlocks.CORRUPTED_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
