package de.dittich.utils;

import org.bukkit.entity.Player;

import de.dittich.bedwars.Bedwars;

public class Methods {
	
	public static String getTeam(Player p){
		
		String s;
		
		if(Bedwars.rot.contains(p.getName())){
			s = "§7⇨§4 Rot";
		}
		else if(Bedwars.gelb.contains(p.getName())){
			s = "§7⇨§e Gelb";
		}
		else if(Bedwars.gruen.contains(p.getName())){
			s = "§7⇨§a Gruen";
		}
		else if(Bedwars.blau.contains(p.getName())){
			s = "§7⇨§9 Blau";
		}
		else{
			s = "§7⇨§c Kein Team";
		}
		
		return s;
	}
	
	public static String getExactTeam(Player p){
		
		String s;
		
		if(Bedwars.rot.contains(p.getName())){
			s = "Rot";
		}
		else if(Bedwars.gelb.contains(p.getName())){
			s = "Gelb";
		}
		else if(Bedwars.gruen.contains(p.getName())){
			s = "Gruen";
		}
		else if(Bedwars.blau.contains(p.getName())){
			s = "Blau";
		}
		else{
			s = "Kein Team";
		}
		
		return s;
	}
	
	public static void clearFromArray(Player p){
		Bedwars.rot.remove(p.getName());
		Bedwars.gelb.remove(p.getName());
		Bedwars.gruen.remove(p.getName());
		Bedwars.blau.remove(p.getName());
	}
	
}
