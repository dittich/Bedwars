package de.dittich.api;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemCreator {
	
	public static ItemStack createItemWithID(int id, int subid, int amount, String displayName, ArrayList<String> lore){
		ItemStack is = new ItemStack(id, amount, (short)subid);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(displayName);
		im.setLore(lore);
		is.setItemMeta(im);
		return is;
	}
	
	public static ItemStack createItemWithMaterial(Material m, int subid, int amount, String displayName, ArrayList<String> lore){
		ItemStack is = new ItemStack(m, amount, (short)subid);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(displayName);
		im.setLore(lore);
		is.setItemMeta(im);
		return is;
	}
}
