package me.truemb.tempafk.enums;

public enum MessageType {
	
	ACTION_BAR,
	TITLE,
	CHAT;

	public static MessageType getMessageType(String s) {
		if(s == null)
			return null;
		
		for(MessageType type : MessageType.values())
			if(type.toString().equalsIgnoreCase(s))
				return type;
				
		return null;
	}
}
