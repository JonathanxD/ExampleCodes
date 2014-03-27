/**
 *@author _Jonathan_xD 
 *@about This class contains related Client Events.
 **/

public class ClientEventListener extends PlayerExtraListener implements Listener{
	@EventHandler
	public void onNameTag(PlayerReceiveNameTagEvent e){
		Player p = e.getNamedPlayer();
		e.setTag(Main.clans.getClanColor(Main.clans.getPlayerClan(p))+p.getName()+ChatColor.RESET);
	}	
}