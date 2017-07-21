package de.dittich.teams;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import de.dittich.bedwars.Bedwars;
import de.dittich.utils.Methods;

public class TeamListener implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent e){
		
		 Player p = (Player) e.getWhoClicked();
		 
		 try{
			 if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§4Rotes Team")){
				 e.setCancelled(true);
				 
				 if(Bedwars.rot.size()==0){
					 if(Bukkit.getOnlinePlayers().size()>=4){
						 Methods.clearFromArray(p);
						 Bedwars.rot.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §4Rot"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
				 if(Bedwars.rot.size()==1){
					 if(Bukkit.getOnlinePlayers().size()>=8){
						 Methods.clearFromArray(p);
						 Bedwars.rot.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §4Rot"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
			 }
			 else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eGelbes Team")){
				 e.setCancelled(true);
				 
				 if(Bedwars.gelb.size()==0){
					 if(Bukkit.getOnlinePlayers().size()>=4){
						 Methods.clearFromArray(p);
						 Bedwars.gelb.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §eGelb"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
				 if(Bedwars.gelb.size()==1){
					 if(Bukkit.getOnlinePlayers().size()>=8){
						 Methods.clearFromArray(p);
						 Bedwars.gelb.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §eGelb"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
			 }
			 else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aGruenes Team")){
				 e.setCancelled(true);
				 
				 if(Bedwars.gruen.size()==0){
					 if(Bukkit.getOnlinePlayers().size()>=4){
						 Methods.clearFromArray(p);
						 Bedwars.gruen.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §aGruen"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
				 if(Bedwars.gruen.size()==1){
					 if(Bukkit.getOnlinePlayers().size()>=8){
						 Methods.clearFromArray(p);
						 Bedwars.gruen.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §aGruen"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
			 }
			 else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Blaues Team")){
				 e.setCancelled(true);
				 
				 if(Bedwars.blau.size()==0){
					 if(Bukkit.getOnlinePlayers().size()>=4){
						 Methods.clearFromArray(p);
						 Bedwars.blau.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §9Blau"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
				 if(Bedwars.blau.size()==1){
					 if(Bukkit.getOnlinePlayers().size()>=8){
						 Methods.clearFromArray(p);
						 Bedwars.blau.add(p.getName());
						 p.sendMessage(Bedwars.pr+"Du bist jetzt im Team §9Blau"+Bedwars.n+"!");
					 }
					 else{
						 p.sendMessage(Bedwars.pr+"Dieses Team ist voll.");
					 }
				 }
			 }

		 }
		 catch(Exception e1){
			 
		 }
	}
}
