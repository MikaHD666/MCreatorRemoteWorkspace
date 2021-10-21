package net.mcreator.test.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;

import net.mcreator.test.world.ButtonPressedGameRule;
import net.mcreator.test.TestMod;

import java.util.Map;

public class MagicWandBrokeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TestMod.LOGGER.warn("Failed to load dependency itemstack for procedure MagicWandBroke!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TestMod.LOGGER.warn("Failed to load dependency world for procedure MagicWandBroke!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((itemstack)).getDamage()) == 0)) {
			if (world instanceof World) {
				((World) world).getGameRules().get(ButtonPressedGameRule.gamerule).set((false), ((World) world).getServer());
			}
		}
	}
}
