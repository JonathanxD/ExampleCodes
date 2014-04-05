import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public static boolean eventoOcorrendo = false;

	public void onEnable(){
		getConfig().addDefault("Horario dos Eventos", "13:00,16:00,18:00");
		getConfig().options().copyDefaults(true);
		saveConfig();
		this.getLogger().info("Enabled");
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new TimeCheck(), 20L, 10L);		
	}
	public void onDisable(){
		this.getLogger().info("Disabled");
	}
	public class TimeCheck implements Runnable {
		@Override
		public void run() {
			Locale ptBr = new Locale("pt", "BR");
			GregorianCalendar ggc = new GregorianCalendar(ptBr);
			Date td = ggc.getTime(); 
			int h = hours(td, ptBr);
			int h2 = minutes(td, ptBr);
			for(String t : getConfig().getString("Horario dos Eventos").split(",")){
				try{
					int hora = Integer.parseInt(t.split(":")[0]);
					int min = Integer.parseInt(t.split(":")[1]);
					if(hora == h && min == h2 && !eventoOcorrendo){
						Bukkit.broadcastMessage(ChatColor.GREEN+"Um evento foi iniciado.");
						eventoOcorrendo = true;
					}
				}catch(Exception e){
					getLogger().severe("Error on Test/plugin.yml");
				}
			}
			
		}
	}
	public static int hours(Date time, Locale loc)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("HH",loc);
		String res = sdf.format(time);
		return Integer.parseInt(res);
	}
	public static int minutes(Date time, Locale loc)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("mm",loc);
		String res = sdf.format(time);
		return Integer.parseInt(res);
	}
	public static int secounds(Date time, Locale loc)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("ss",loc);
		String res = sdf.format(time);
		return Integer.parseInt(res);
	}
	
}
