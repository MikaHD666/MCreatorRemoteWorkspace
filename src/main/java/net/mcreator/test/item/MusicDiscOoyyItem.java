
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.test.TestModElements;

@TestModElements.ModElement.Tag
public class MusicDiscOoyyItem extends TestModElements.ModElement {
	@ObjectHolder("test:music_disc_ooyy")
	public static final Item block = null;
	public MusicDiscOoyyItem(TestModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TestModElements.sounds.get(new ResourceLocation("test:come2gether")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music_disc_ooyy");
		}
	}
}
