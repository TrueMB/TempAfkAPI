package me.truemb.tempafk.enums;

public enum ValueAction {
	
	SET,
	ADD,
	REMOVE,
	GIVE;
	
	public static ValueAction getValueActionFromString(String s) {
		if(s == null)
			return null;
		
		for(ValueAction time : ValueAction.values())
			if(time.toString().equalsIgnoreCase(s))
				return time;
				
		return null;
	}
	

}
