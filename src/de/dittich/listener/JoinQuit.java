package de.dittich.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import de.dittich.bedwars.Bedwars;
import de.dittich.teams.TeamInventory;

public class JoinQuit implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Bukkit.getScheduler().runTaskLater(Bedwars.plugin, new Runnable() {
			
			@Override
			public void run() {
				TeamInventory.openInventory(e.getPlayer());
			}
		}, 20);
	}
	
}
