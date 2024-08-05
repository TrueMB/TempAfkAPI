package me.truemb.tempafk.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.truemb.tempafk.utils.UtilitiesAPI;

public class AfkTimeBuyEvent extends Event implements Cancellable{

	private static final HandlerList handlers = new HandlerList();
	private boolean cancel = false;

	private Player player;

	private String afkTimeS;
	private long afkTimeMillis;
	private double price;

	public AfkTimeBuyEvent(Player player, String afkTimeS, double price) {
		this.player = player;
		this.afkTimeS = afkTimeS;
		this.afkTimeMillis = UtilitiesAPI.getMilliseconds(afkTimeS);
		this.price = price;
	}

	public String getAfkTimeAsString() {
		return this.afkTimeS;
	}
	
	public long getAfkTimeMillis() {
		return this.afkTimeMillis;
	}

	public Player getPlayer() {
		return this.player;
	}

	public double getPrice() {
		return this.price;
	}
	
	
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return this.cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
