package me.truemb.tempafk.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import me.truemb.tempafk.enums.AfkState;

public class AfkStartEvent extends AfkEvent {

	private static final HandlerList handlers = new HandlerList();
	
	private AfkState afkState;

	public AfkStartEvent(Player player, AfkState state) {
		super(player);
		
		this.afkState = state;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public AfkState getAfkState() {
		return this.afkState;
	}

}
