package de.dittich.bedwars;

import java.util.ArrayList;

import org.bukkit.plugin.java.JavaPlugin;

import de.dittich.listener.JoinQuit;
import de.dittich.utils.GameManager;

public class Bedwars extends JavaPlugin{
	
	public static ArrayList<String> rot = new ArrayList<String>();
	public static ArrayList<String> gelb = new ArrayList<String>();
	public static ArrayList<String> gruen = new ArrayList<String>();
	public static ArrayList<String> blau = new ArrayList<String>();
	
	public static boolean canRespawnRot = true;
	public static boolean canRespawnGelb = true;
	public static boolean canRespawnGruen = true;
	public static boolean canRespawnBlau = true;
	
	public static String pr = "§f[§bBedwars§f]§b ";
	public static String a = "§b";
	public static String n = "§7";
	
	public static Bedwars plugin;
	
	public void onEnable(){
		GameManager.setState(GameManager.LOBBY);
		plugin = this;
		this.getServer().getPluginManager().registerEvents(new JoinQuit(), this);
	}
	
}
