package me.truemb.tempafk.objects;

import java.util.UUID;

import com.google.gson.JsonObject;

import me.truemb.tempafk.enums.AfkState;

public class PlayerData {
	
	private UUID uuid;
	private String username;
	
	private long afkTime;
	private boolean afkMode;
	private AfkState afkState = AfkState.NONE;
	private long afkStateSince;
	
	private BonusData bonusData = new BonusData();
	
	public PlayerData(UUID uuid, String username) {
		this.uuid = uuid;
		this.username = username;
	}
	
	public void loadUserData(JsonObject json) {}
	
	public JsonObject getDataAsJson() {
		return null;
	}

	public String getUsername() {
		return this.username;
	}

	public UUID getUUID() {
		return this.uuid;
	}
	
	public long getAfkTime() {
		return this.afkTime;
	}

	public long getAfkStateSince() {
		return this.afkStateSince;
	}
	
	public BonusData getBonusData() {
		return this.bonusData;
	}

	public boolean isAfkMode() {
		return this.afkMode;
	}

	public AfkState getAfkState() {
		return this.afkState;
	}

}
