package me.truemb.tempafk.enums;

public enum Time {

	MILLISECONDS("ms"),
	SECONDS("s"),
	MINUTES("m"),
	HOURS("H"),
	DAYS("d");
	

	private String timeFormat;
	
	private Time(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	
	public String getTimeFormat() {
		return this.timeFormat;
	}

	public static Time getTimeFromString(String s) {
		if(s == null)
			return null;
		
		for(Time time : Time.values())
			if(time.toString().equalsIgnoreCase(s))
				return time;
				
		return null;
	}
	
	public static Time getTimeFromShort(String s) {
		if(s == null)
			return null;
		
		for(Time time : Time.values())
			if(time.getTimeFormat().equals(s))
				return time;
				
		return null;
	}
	

}
