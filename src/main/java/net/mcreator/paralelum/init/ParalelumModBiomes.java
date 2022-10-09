
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paralelum.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.paralelum.world.biome.BloodForestBiome;
import net.mcreator.paralelum.ParalelumMod;

public class ParalelumModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ParalelumMod.MODID);
	public static final RegistryObject<Biome> BLOOD_FOREST = REGISTRY.register("blood_forest", () -> BloodForestBiome.createBiome());
}
