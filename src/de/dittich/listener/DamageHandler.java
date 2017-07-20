package de.dittich.listener;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import de.dittich.utils.GameManager;
import de.dittich.utils.Methods;

public class DamageHandler implements Listener{
	
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e){
		
		if(e.getEntity() instanceof Player){
			Player p = (Player)e.getEntity();
			
			if(GameManager.isState(GameManager.LOBBY)){
				e.setCancelled(true);
			}
			else if(GameManager.isState(GameManager.GAME)){
				if(e.getDamager() instanceof Player){
					Player d = (Player)e.getDamager();
					String TeamP = Methods.getExactTeam(p);
					String TeamD = Methods.getExactTeam(d);
					if(TeamD.equalsIgnoreCase(TeamP)){
						e.setCancelled(true);
					}
					else{
						e.setCancelled(false);
					}
				}
				
				if(e.getDamager() instanceof Arrow){
					Arrow a = (Arrow)e.getDamager();
					Player d = (Player) a.getShooter();
					String TeamP = Methods.getExactTeam(p);
					String TeamD = Methods.getExactTeam(d);
					if(TeamD.equalsIgnoreCase(TeamP)){
						e.setCancelled(true);
					}
					else{
						e.setCancelled(false);
					}
				}
			}
		}
	}
	
	public void onDamageVillager(EntityDamageEvent e){
		if(GameManager.isState(GameManager.LOBBY)){
			e.setCancelled(true);
		}
		else if(GameManager.isState(GameManager.GAME)){
			if(e.getEntity() instanceof Villager){
				e.setCancelled(true);
			}
		}
	}
}
