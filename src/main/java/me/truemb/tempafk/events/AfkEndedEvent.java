package me.truemb.tempafk.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class AfkEndedEvent extends AfkEvent {

	private static final HandlerList handlers = new HandlerList();

	public AfkEndedEvent(Player player) {
		super(player);
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

}
