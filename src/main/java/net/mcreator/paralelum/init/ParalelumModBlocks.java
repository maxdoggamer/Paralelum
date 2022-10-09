
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paralelum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.paralelum.block.ParalelicPedestalBlock;
import net.mcreator.paralelum.block.ParalelicPedestalActiveBlock;
import net.mcreator.paralelum.block.BloodiamondOreBlock;
import net.mcreator.paralelum.block.BloodiamondBlockBlock;
import net.mcreator.paralelum.block.BloodWoodBlock;
import net.mcreator.paralelum.block.BloodStairsBlock;
import net.mcreator.paralelum.block.BloodSlabBlock;
import net.mcreator.paralelum.block.BloodPressurePlateBlock;
import net.mcreator.paralelum.block.BloodPlanksBlock;
import net.mcreator.paralelum.block.BloodLogBlock;
import net.mcreator.paralelum.block.BloodLeavesBlock;
import net.mcreator.paralelum.block.BloodFenceGateBlock;
import net.mcreator.paralelum.block.BloodFenceBlock;
import net.mcreator.paralelum.block.BloodButtonBlock;
import net.mcreator.paralelum.ParalelumMod;

public class ParalelumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ParalelumMod.MODID);
	public static final RegistryObject<Block> PARALELIC_PEDESTAL = REGISTRY.register("paralelic_pedestal", () -> new ParalelicPedestalBlock());
	public static final RegistryObject<Block> BLOOD_WOOD = REGISTRY.register("blood_wood", () -> new BloodWoodBlock());
	public static final RegistryObject<Block> BLOOD_LOG = REGISTRY.register("blood_log", () -> new BloodLogBlock());
	public static final RegistryObject<Block> BLOOD_PLANKS = REGISTRY.register("blood_planks", () -> new BloodPlanksBlock());
	public static final RegistryObject<Block> BLOOD_LEAVES = REGISTRY.register("blood_leaves", () -> new BloodLeavesBlock());
	public static final RegistryObject<Block> BLOOD_STAIRS = REGISTRY.register("blood_stairs", () -> new BloodStairsBlock());
	public static final RegistryObject<Block> BLOOD_SLAB = REGISTRY.register("blood_slab", () -> new BloodSlabBlock());
	public static final RegistryObject<Block> BLOOD_FENCE = REGISTRY.register("blood_fence", () -> new BloodFenceBlock());
	public static final RegistryObject<Block> BLOOD_FENCE_GATE = REGISTRY.register("blood_fence_gate", () -> new BloodFenceGateBlock());
	public static final RegistryObject<Block> BLOOD_PRESSURE_PLATE = REGISTRY.register("blood_pressure_plate", () -> new BloodPressurePlateBlock());
	public static final RegistryObject<Block> BLOOD_BUTTON = REGISTRY.register("blood_button", () -> new BloodButtonBlock());
	public static final RegistryObject<Block> BLOODIAMOND_ORE = REGISTRY.register("bloodiamond_ore", () -> new BloodiamondOreBlock());
	public static final RegistryObject<Block> BLOODIAMOND_BLOCK = REGISTRY.register("bloodiamond_block", () -> new BloodiamondBlockBlock());
	public static final RegistryObject<Block> PARALELIC_PEDESTAL_ACTIVE = REGISTRY.register("paralelic_pedestal_active",
			() -> new ParalelicPedestalActiveBlock());
}
