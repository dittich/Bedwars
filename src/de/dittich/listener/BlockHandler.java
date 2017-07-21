package de.dittich.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import de.dittich.api.LocationAPI;
import de.dittich.bedwars.Bedwars;
import de.dittich.utils.GameManager;

public class BlockHandler {
	
	@EventHandler
	public void anBlock(BlockPlaceEvent e){
		Player p = e.getPlayer();
		if(GameManager.isState(GameManager.LOBBY)){
			if(Bedwars.build.contains(p)){
				e.setCancelled(false);
			}
			else{
				e.setCancelled(true);
			}
		}
		else{
			e.setCancelled(false);
			
			//MapReseter
		}
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		Player p = e.getPlayer();
		if(GameManager.isState(GameManager.LOBBY)){
			if(Bedwars.build.contains(p)){
				e.setCancelled(false);
			}
			else{
				e.setCancelled(true);
			}
		}
		else{
			if(e.getBlock().getType() == Material.GLOWSTONE || 
					e.getBlock().getType() == Material.GLASS ||
					e.getBlock().getType() == Material.IRON_BLOCK ||
					e.getBlock().getType() == Material.CHEST ||
					e.getBlock().getType() == Material.NOTE_BLOCK ||
					e.getBlock().getType() == Material.SANDSTONE ||
					e.getBlock().getType() == Material.ENDER_STONE
					){
				if(e.getBlock().getType() == Material.NOTE_BLOCK){
					if(e.getBlock().getLocation().equals(LocationAPI.getLocation("Bett.Rot"))){
						if(Bedwars.rot.contains(p)){
							p.sendMessage(Bedwars.pr+"Du kannst nicht dein eigenes Bett abbauen.");
							e.setCancelled(true);
							return;
						}
						Bedwars.canRespawnRot = false;
						Bukkit.broadcastMessage(Bedwars.pr+"Das Bett von Team Rot wurde abgebaut.");
						e.getBlock().getDrops().clear();
						for(Player p1 : Bukkit.getOnlinePlayers()){
							p1.playSound(p1.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 10, 10);
						}
					}
					else if(e.getBlock().getLocation().equals(LocationAPI.getLocation("Bett.Gelb"))){
						if(Bedwars.gelb.contains(p)){
							p.sendMessage(Bedwars.pr+"Du kannst nicht dein eigenes Bett abbauen.");
							e.setCancelled(true);
							return;
						}
						Bedwars.canRespawnGelb = false;
						Bukkit.broadcastMessage(Bedwars.pr+"Das Bett von Team Gelb wurde abgebaut.");
						e.getBlock().getDrops().clear();
						for(Player p1 : Bukkit.getOnlinePlayers()){
							p1.playSound(p1.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 10, 10);
						}
					}
					else if(e.getBlock().getLocation().equals(LocationAPI.getLocation("Bett.Gruen"))){
						if(Bedwars.gruen.contains(p)){
							p.sendMessage(Bedwars.pr+"Du kannst nicht dein eigenes Bett abbauen.");
							e.setCancelled(true);
							return;
						}
						Bedwars.canRespawnGruen = false;
						Bukkit.broadcastMessage(Bedwars.pr+"Das Bett von Team Gruen wurde abgebaut.");
						e.getBlock().getDrops().clear();
						for(Player p1 : Bukkit.getOnlinePlayers()){
							p1.playSound(p1.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 10, 10);
						}
					}
					else if(e.getBlock().getLocation().equals(LocationAPI.getLocation("Bett.Blau"))){
						if(Bedwars.blau.contains(p)){
							p.sendMessage(Bedwars.pr+"Du kannst nicht dein eigenes Bett abbauen.");
							e.setCancelled(true);
							return;
						}
						Bedwars.canRespawnBlau = false;
						Bukkit.broadcastMessage(Bedwars.pr+"Das Bett von Team Blau wurde abgebaut.");
						e.getBlock().getDrops().clear();
						for(Player p1 : Bukkit.getOnlinePlayers()){
							p1.playSound(p1.getLocation(), Sound.ENTITY_ENDERDRAGON_GROWL, 10, 10);
						}
					}
				}
			}
			else{
				e.setCancelled(true);
			}
		}
	}
}
