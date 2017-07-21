package de.dittich.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import de.dittich.utils.GameManager;

public class FoodHandler {

	@EventHandler
	public void onFood(FoodLevelChangeEvent e){
		if(GameManager.isState(GameManager.LOBBY) || GameManager.isState(GameManager.Restart)) e.setCancelled(true);
	}
}
