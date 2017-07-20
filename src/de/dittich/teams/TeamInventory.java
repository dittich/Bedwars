package de.dittich.teams;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import de.dittich.api.ItemCreator;

public class TeamInventory implements Listener{
	
	public static void openInventory(Player p){
		Inventory inv = Bukkit.createInventory(null, 27, "§3Waehle dein §fTeam:");
		
		inv.setItem(1, ItemCreator.createItemWithMaterial(Material.WOOL, 14, 1, "", null));
		inv.setItem(3, ItemCreator.createItemWithMaterial(Material.WOOL, 4, 1, "", null));
		inv.setItem(5, ItemCreator.createItemWithMaterial(Material.WOOL, 13, 1, "", null));
		inv.setItem(7, ItemCreator.createItemWithMaterial(Material.WOOL, 11, 1, "", null));
		
		p.openInventory(inv);
	}
	
}
