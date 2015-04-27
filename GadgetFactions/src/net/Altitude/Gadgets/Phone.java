package net.Altitude.Gadgets;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Phone {

	public static void addPhone(Player p){
		@SuppressWarnings("deprecation")
		ItemStack i = new ItemStack(Material.THIN_GLASS, 1,(short) 0,(byte) 15);
		ItemMeta m = i.getItemMeta();
		m.setDisplayName(ChatColor.GREEN + "Phone");
		i.setItemMeta(m);
		
		p.getInventory().addItem(i);
	}
	
}
