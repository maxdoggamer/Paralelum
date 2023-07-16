
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
import net.mcreator.paralelum.block.CorruptedWoodBlock;
import net.mcreator.paralelum.block.CorruptedStairsBlock;
import net.mcreator.paralelum.block.CorruptedSlabBlock;
import net.mcreator.paralelum.block.CorruptedPressurePlateBlock;
import net.mcreator.paralelum.block.CorruptedPlanksBlock;
import net.mcreator.paralelum.block.CorruptedLogBlock;
import net.mcreator.paralelum.block.CorruptedLeavesBlock;
import net.mcreator.paralelum.block.CorruptedFenceGateBlock;
import net.mcreator.paralelum.block.CorruptedFenceBlock;
import net.mcreator.paralelum.block.CorruptedButtonBlock;
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
	public static final RegistryObject<Block> PARALELIC_PEDESTAL_ACTIVE = REGISTRY.register("paralelic_pedestal_active", () -> new ParalelicPedestalActiveBlock());
	public static final RegistryObject<Block> CORRUPTED_WOOD = REGISTRY.register("corrupted_wood", () -> new CorruptedWoodBlock());
	public static final RegistryObject<Block> CORRUPTED_LOG = REGISTRY.register("corrupted_log", () -> new CorruptedLogBlock());
	public static final RegistryObject<Block> CORRUPTED_PLANKS = REGISTRY.register("corrupted_planks", () -> new CorruptedPlanksBlock());
	public static final RegistryObject<Block> CORRUPTED_LEAVES = REGISTRY.register("corrupted_leaves", () -> new CorruptedLeavesBlock());
	public static final RegistryObject<Block> CORRUPTED_STAIRS = REGISTRY.register("corrupted_stairs", () -> new CorruptedStairsBlock());
	public static final RegistryObject<Block> CORRUPTED_SLAB = REGISTRY.register("corrupted_slab", () -> new CorruptedSlabBlock());
	public static final RegistryObject<Block> CORRUPTED_FENCE = REGISTRY.register("corrupted_fence", () -> new CorruptedFenceBlock());
	public static final RegistryObject<Block> CORRUPTED_FENCE_GATE = REGISTRY.register("corrupted_fence_gate", () -> new CorruptedFenceGateBlock());
	public static final RegistryObject<Block> CORRUPTED_PRESSURE_PLATE = REGISTRY.register("corrupted_pressure_plate", () -> new CorruptedPressurePlateBlock());
	public static final RegistryObject<Block> CORRUPTED_BUTTON = REGISTRY.register("corrupted_button", () -> new CorruptedButtonBlock());
}
