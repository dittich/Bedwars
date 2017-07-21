package de.dittich.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import de.dittich.bedwars.Bedwars;

public class LocationAPI {
	
	static Bedwars pl = Bedwars.plugin;
	
	public static void setLovation(String locationName, Player p){
		pl.getConfig().set(locationName+".X", p.getLocation().getBlockX());
		pl.getConfig().set(locationName+".Y", p.getLocation().getBlockY());
		pl.getConfig().set(locationName+".Z", p.getLocation().getBlockZ());
		pl.getConfig().set(locationName+".Yaw", p.getLocation().getYaw());
		pl.getConfig().set(locationName+".Pitch", p.getLocation().getPitch());
		pl.getConfig().set(locationName+".World", p.getWorld().getName());
		
		pl.saveConfig();
	}
	
	public static Location getLocation(String LocationName){
		double x = pl.getConfig().getDouble(LocationName+".X");
		double y = pl.getConfig().getDouble(LocationName+".Y");
		double z = pl.getConfig().getDouble(LocationName+".Z");
		//double yaw = pl.getConfig().getDouble(LocationName+".Yaw");
		//double pitch = pl.getConfig().getDouble(LocationName+".Pitch");
		String world = pl.getConfig().getString(LocationName+".World");
		World w = Bukkit.getWorld(world);
		Location l = new Location(w,x,y,z);
		return l;
	}
}
