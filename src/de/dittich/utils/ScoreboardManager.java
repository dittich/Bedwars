package de.dittich.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import de.dittich.bedwars.Bedwars;

public class ScoreboardManager {
	
	public static void setScoreboard(Player p){
		
		org.bukkit.scoreboard.ScoreboardManager sm = Bukkit.getScoreboardManager();
		Scoreboard s = sm.getNewScoreboard();
		
		Objective o = s.registerNewObjective("Teams", "dummy");
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		o.setDisplayName("§f<<§3Respawn§f>>");
		
		p.setScoreboard(s);
	}
	
	public static void UpdateScoreboard(Player p){
		Scoreboard s = p.getScoreboard();
		Objective o = s.getObjective("Teams");
		if(GameManager.isState(GameManager.GAME)){
			
			if(Bedwars.canRespawnRot == true){
				o.getScore("§2✔§7| Rot").setScore(Bedwars.rot.size());
			}
			else{
				if(Bedwars.rot.size() != 0){
					o.getScore("§4✘§7| Rot").setScore(Bedwars.rot.size());
				}
				else{
					//Wenn keine Spieler im entsprechenden Team sind, bliebt die Zeile leer.
				}
			}
			
			if(Bedwars.canRespawnGelb == true){
				o.getScore("§2✔§7| Gelb").setScore(Bedwars.gelb.size());
			}
			else{
				if(Bedwars.rot.size() != 0){
					o.getScore("§4✘§7| Gelb").setScore(Bedwars.gelb.size());
				}
				else{
					//Wenn keine Spieler im entsprechenden Team sind, bliebt die Zeile leer.
				}
			}
			
			if(Bedwars.canRespawnGruen == true){
				o.getScore("§2✔§7| Gruen").setScore(Bedwars.gruen.size());
			}
			else{
				if(Bedwars.rot.size() != 0){
					o.getScore("§4✘§7| Gruen").setScore(Bedwars.gruen.size());
				}
				else{
					//Wenn keine Spieler im entsprechenden Team sind, bliebt die Zeile leer.
				}
			}
			
			if(Bedwars.canRespawnBlau == true){
				o.getScore("§2✔§7| Blau").setScore(Bedwars.blau.size());
			}
			else{
				if(Bedwars.rot.size() != 0){
					o.getScore("§4✘§7| Blau").setScore(Bedwars.blau.size());
				}
				else{
					//Wenn keine Spieler im entsprechenden Team sind, bliebt die Zeile leer.
				}
			}
			p.setScoreboard(s);
		}
		else if(GameManager.isState(GameManager.LOBBY)){
			
		}
	}
}
