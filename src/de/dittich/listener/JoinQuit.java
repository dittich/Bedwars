package de.dittich.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import de.dittich.api.LocationAPI;
import de.dittich.api.TablistAPI;
import de.dittich.bedwars.Bedwars;

public class JoinQuit implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		if(p.isOp()){
			e.setJoinMessage("§7> §4" + p.getDisplayName() + "§7hat das Spiel betreten!");
		}
		else if(p.hasPermission("Premium")){
			e.setJoinMessage("§7> §6" + p.getDisplayName() + "§7hat das Spiel betreten!");
		}
		else if(p.hasPermission("Youtube")){
			e.setJoinMessage("§7> §5" + p.getDisplayName() + "§7hat das Spiel betreten!");
		}
		else{
			e.setJoinMessage("§7> §2" + p.getDisplayName() + "§7hat das Spiel betreten!");
		}
		
		p.teleport(LocationAPI.getLocation("Lobby"));
		
		TablistAPI.sendTabTitle(p, "§8Du spielst auf §bBW"+Bukkit.getServerName()+"-4x4", "§7-----[ §bBedwars§7]-----");
		
		/*
		Bedwars.blau.add(e.getPlayer().getDisplayName());
		
		Bukkit.getScheduler().runTaskLater(Bedwars.plugin, new Runnable() {
			
			@Override
			public void run() {
				TeamInventory.openInventory(e.getPlayer());
			}
		}, 20);
		*/
	}
	
	@EventHandler
	public void onLogin(PlayerLoginEvent e){
		if(e.getResult().equals(Result.KICK_FULL)){
			e.setKickMessage(Bedwars.pr+"Der Server ist voll.");
		}
	}
	
}
