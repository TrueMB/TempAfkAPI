package me.truemb.tempafk.utils;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAmount;

public class UtilitiesAPI {
	
	public static TemporalAmount getTimeParsed(String feString) {
		try {
		    if (Character.isUpperCase(feString.charAt(feString.length() - 1))) {
		        return Period.parse("P" + feString);
		    } else {
		        return Duration.parse("PT" + feString);
		    }
		}catch(DateTimeParseException ex){
			return null;
		}
	}

	public static long getMilliseconds(String feString) {
		return UtilitiesAPI.getMilliseconds(UtilitiesAPI.getTimeParsed(feString));
	}
	
	public static long getMilliseconds(TemporalAmount amount) {
		//Convert to LocalDateTime. Use no offset for timezone
		LocalDateTime time = LocalDateTime.ofInstant(Instant.ofEpochMilli(0), ZoneOffset.ofHours(0));
		
		//Add time
		time = time.plus(amount); //Time from String

		//Convert back to instant, again, no time zone offset.
		Instant output = time.atZone(ZoneOffset.ofHours(0)).toInstant();
		
		return output.getEpochSecond() * 1000;
	}

	public static Timestamp getNewTimestamp(String feString) {
		return UtilitiesAPI.getNewTimestamp(new Timestamp(System.currentTimeMillis()), feString);
	}
	
	public static Timestamp getNewTimestamp(Timestamp ts, String feString) {
		
		for(String s : feString.split("(?<=[a-zA-Z])")) {
			//Convert to LocalDateTime. Use no offset for timezone
			LocalDateTime time = LocalDateTime.ofInstant(ts.toInstant(), ZoneOffset.ofHours(0));

			//Add time
			time = time.plus(getTimeParsed(s)); //Time from String

			//Convert back to instant, again, no time zone offset.
			Instant output = time.atZone(ZoneOffset.ofHours(0)).toInstant();

			ts = Timestamp.from(output);
		}
		
		return ts;
	}

	public static Timestamp getTimestampBefore(Timestamp ts, String feString) {
		
		for(String s : feString.split("(?<=[a-zA-Z])")) {
			//Convert to LocalDateTime. Use no offset for timezone
			LocalDateTime time = LocalDateTime.ofInstant(ts.toInstant(), ZoneOffset.ofHours(0));

			//Add time
			time = time.minus(getTimeParsed(s)); //Time from String

			//Convert back to instant, again, no time zone offset.
			Instant output = time.atZone(ZoneOffset.ofHours(0)).toInstant();

			ts = Timestamp.from(output);
		}
		
		return ts;
	}

	public static Timestamp addTimeToTimestamp(Timestamp ts, String feString) {
		
		for(String s : feString.split("(?<=[a-zA-Z])")) {
			//Convert to LocalDateTime. Use no offset for timezone
			LocalDateTime time = LocalDateTime.ofInstant(ts.toInstant(), ZoneOffset.ofHours(0));

			//Add time
			time = time.plus(getTimeParsed(s)); //Time from String

			//Convert back to instant, again, no time zone offset.
			Instant output = time.atZone(ZoneOffset.ofHours(0)).toInstant();

			ts = Timestamp.from(output);
		}
		
		return ts;
	}
}
