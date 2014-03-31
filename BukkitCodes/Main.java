package me.MsKylew.com.br;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable()
	{
		Bukkit.getServer().getConsoleSender().sendMessage("§0[§bMsKHealth§0] §fPlugin Ativado!");
	}
	public void onDisable()
	{
		Bukkit.getServer().getConsoleSender().sendMessage("§0[§bMsKHealth§0] §fPlugin Desativado!");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("curar"))
		{
			Player p = null;
			if(sender instanceof Player)
			{
				String Name;
				p = (Player)sender;
				sender.sendMessage("§aVocê foi curado!");				
			}else
			{
				if(args.length() == 0)
				{
					sender.sendMessage("Erro, uso /curar [jogador]");
					return true;
				}
				p = Bukkit.getServer().getPlayer(args[0]);			
				if(p == null || !p.isOnline()){
					sender.sendMessage("§cO jogador "+args[0]+" nao esta online.");
					return true;
				}
				sender.sendMessage("§a'" + player.getName() + "' foi curado!");				
				
			}
			if(p != null){
				p.setHealth(20);
				p.setFoodLevel(20);
			}
			return true;
		}
		return false;
  }
}