package me.truemb.tempafk.enums;

public enum Receiver {

	PLAYER, //Message only to the Player
	SERVER, //Message will be send to every player on the current server
	PROXY; //Message will be send to every player on the Proxy

	public static Receiver getReceiverFromString(String s) {
		if(s == null)
			return null;
		
		for(Receiver receiver : Receiver.values())
			if(receiver.toString().equalsIgnoreCase(s))
				return receiver;
				
		return null;
	}
}
