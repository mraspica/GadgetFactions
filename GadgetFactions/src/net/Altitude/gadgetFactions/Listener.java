package net.Altitude.gadgetFactions;

import net.Altitude.Gadgets.Phone;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class Listener implements org.bukkit.event.Listener{
	
	public Inventory pi;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Phone.addPhone(e.getPlayer());
	}
	
	@EventHandler
	public void onPhoneClick(PlayerInteractEvent e){
		Player p = e.getPlayer();
		if(p.getItemInHand().getItemMeta() != null){
			if(p.getItemInHand().getItemMeta().getDisplayName() != null){
				if(p.getItemInHand().getItemMeta().getDisplayName().contains("Phone")){
					pi = Bukkit.createInventory(null, 54, "Phone");
					for(int i = 0; i <= 8; i++){
						pi.setItem(54-9 + i, p.getInventory().getItem(i));
					}
					p.openInventory(pi);
				}
			}
		}
	}
	
	public void onIvnClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName() != null){
			if(e.getInventory().getName().contains("Phone")){
				e.setCancelled(true);
			}
		}
	}
}