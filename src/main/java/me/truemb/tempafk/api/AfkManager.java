package me.truemb.tempafk.api;

import java.util.UUID;

import org.bukkit.entity.Player;

import me.truemb.tempafk.enums.AfkState;
import me.truemb.tempafk.enums.Time;
import me.truemb.tempafk.objects.PlayerData;

public class AfkManager {
	
	/**
	 * 
	 * @param uuid - Player UUID
	 * @return PlayerData of the Player, contains the Caching Options
	 */
	public PlayerData getPlayerData(UUID uuid) {
		return null;
	}
	
	/**
	 * 
	 * @param uuid - Player UUID
	 * @return true if PlayerData for the uuid exists (loaded on Join and unloaded on Quit)
	 */
	public boolean hasPlayerData(UUID uuid) {
		return true;
	}
	
	/**
	 * Removes the Player Data
	 * 
	 * @param uuid - Player UUID
	 */
	public void removePlayerData(UUID uuid) {}
	
	/**
	 * Is Temp AFK active for the player? Or will he kicked after the default time?
	 * 
	 * @param uuid - Player UUID
	 * @return
	 */
	public boolean isAfkMode(UUID uuid) {
		return false;
	}
	
	/**
	 * Sets the AFK Mode; If active, the player AFK time will be counting
	 * 
	 * @param uuid - Player UUID
	 * @param value - AFK Mode Status
	 */
	public void setAfkMode(UUID uuid, boolean value) {}
	
	/**
	 * 
	 * @param player - The Player to check the AFK Status
	 * @return boolean - if the player is AFK
	 */
	public boolean isAfk(UUID uuid) {
		return this.getAfkState(uuid) != AfkState.NONE;
			
	}
	
	/**
	 * 
	 * @param player - The Player to get the AFK State from
	 * @return boolean - Get the AFK State
	 */
	public AfkState getAfkState(UUID uuid) {
		return AfkState.NONE;
			
	}
	
	/**
	 * Sets the Player AFK;
	 * 
	 * @param player
	 * @param value
	 * @return
	 */
	public void setPlayerAfk(Player player, AfkState state) {}
	
	/**
	 * Set the AFK time of the given Player
	 * 
	 * @param uuid - The Player UUID
	 * @param millis - The AFK time to add in Milliseconds
	 */
	public void setAfkTime(UUID uuid, long millis) {}
	
	/**
	 * Gets the AFK time that is left for the given Player
	 * 
	 * @param uuid - The Player UUID
	 * @return - The AFK time in Milliseconds that is left
	 */
	public long getAfkTime(UUID uuid) {
		return -1;
	}
	
	/**
	 * Add the AFK time to the given Player
	 * 
	 * @param uuid = The Player UUID
	 * @param millis - The AFK time to add in Milliseconds
	 */
	public void addAfkTime(UUID uuid, long millis) {}

	/**
	 * Remove the AFK time from the given Player
	 * 
	 * @param uuid = The Player UUID
	 * @param millis - The AFK time to remove in Milliseconds
	 */
	public void removeAfkTime(UUID uuid, long millis) {}

	/**
	 * Kick Player with the AFK Message
	 * 
	 * @param p
	 */
	public void kickPlayer(Player p) {
		return;
	}
	
	/**
	 * Converts the Time from Human Input to Milliseconds
	 * 
	 * @param timeUnit - The Time Unit
	 * @param timeValue - The Time Amount
	 * @return - Milliseconds
	 */
	public long getTimeConvertedMillis(Time timeUnit, long timeValue) {

		long fin = timeValue;
		
		switch (timeUnit) {
		case DAYS: fin *= 24;
		case HOURS: fin *= 60;
		case MINUTES: fin *= 60;
		case SECONDS: fin *= 1000;
		default:
			break;
		}
		
		return fin;
	}
	
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid) {
		return this.getTimeFormatted(uuid, this.getAfkTime(uuid));
	}
	
	/**
	 * The Formatted String for the Time left
	 * 
	 * @param uuid - The Player UUID
	 * @param time - the time to convert
	 * @return - The String formatted Time
	 */
	public String getTimeFormatted(UUID uuid, long time) {
		return null;
	}
	
}
