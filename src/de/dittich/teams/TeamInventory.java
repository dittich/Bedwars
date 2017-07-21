package de.dittich.teams;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

import de.dittich.api.ItemCreator;
import de.dittich.bedwars.Bedwars;

public class TeamInventory implements Listener{
	
	public static void openInventory(Player p){
		
		Inventory inv = Bukkit.createInventory(null, 27, "§3Waehle dein §fTeam:");
		
		ArrayList<String> rot = new ArrayList<String>();
		ArrayList<String> gelb = new ArrayList<String>();
		ArrayList<String> gruen = new ArrayList<String>();
		ArrayList<String> blau = new ArrayList<String>();
		
		for(String s : Bedwars.rot){
			rot.add("§7↦§4 " + s);
		}
		
		for(String s : Bedwars.gelb){
			gelb.add("§7↦§e " + s);
		}
		
		for(String s : Bedwars.gruen){
			gruen.add("§7↦§a " + s);
		}
		
		for(String s : Bedwars.blau){
			blau.add("§7↦§9 " + s);
		}
		
		inv.setItem(1, ItemCreator.createItemWithMaterial(Material.WOOL, 14, 1, "§4Rotes Team", rot));
		inv.setItem(3, ItemCreator.createItemWithMaterial(Material.WOOL, 4, 1, "§eGelbes Team", gelb));
		inv.setItem(5, ItemCreator.createItemWithMaterial(Material.WOOL, 13, 1, "§aGruenes Team", gruen));
		inv.setItem(7, ItemCreator.createItemWithMaterial(Material.WOOL, 11, 1, "§9Blaues Team", blau));
		
		p.openInventory(inv);
	}
	
}
