package me.truemb.tempafk.enums;

public enum AfkState {

	NONE, //Not Afk
	DEFAULT_AFK, //Status if player is already AFK, but time doesn't get removed because of default AFK time.
	TEMP_AFK; //Player is AFK and temp AFK time gets removed

}
