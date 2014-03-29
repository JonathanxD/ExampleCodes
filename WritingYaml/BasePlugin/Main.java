package me._Jonathan_xD.BasePlugin;


import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	public static void main(String[] args)
	{
		YamlConfiguration ycfg = new YamlConfiguration();
		ycfg.set("Teste", "Olá ppp");
		try {
			ycfg.save(new File("500.yml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onEnable(){
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("Plugin Enabled");
	}
	public void onDisable(){
		this.getLogger().info("Plugin Disabled");
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("bp")){
			sender.sendMessage(ChatColor.RED+"Base plugin working :)");
			return true;
		}
		return false;
	}
}
