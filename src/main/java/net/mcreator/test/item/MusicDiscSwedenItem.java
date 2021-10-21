
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.test.TestModElements;

@TestModElements.ModElement.Tag
public class MusicDiscSwedenItem extends TestModElements.ModElement {
	@ObjectHolder("test:music_disc_sweden")
	public static final Item block = null;
	public MusicDiscSwedenItem(TestModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TestModElements.sounds.get(new ResourceLocation("test:sweden")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music_disc_sweden");
		}
	}
}
