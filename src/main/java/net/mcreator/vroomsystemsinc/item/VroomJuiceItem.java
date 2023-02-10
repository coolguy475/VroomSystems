
package net.mcreator.vroomsystemsinc.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.vroomsystemsinc.init.VroomSystemsIncModFluids;

import java.util.List;

public class VroomJuiceItem extends BucketItem {
	public VroomJuiceItem() {
		super(VroomSystemsIncModFluids.VROOM_JUICE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Vroom Systems Inc Presents: Vroom Juice"));
		list.add(new TextComponent("Vroom Juice is specially designed to push entities extremely fast!"));
	}
}
