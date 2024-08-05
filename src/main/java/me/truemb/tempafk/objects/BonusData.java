package me.truemb.tempafk.objects;

import java.sql.Timestamp;

public class BonusData {

	private Timestamp lastLoginReward;
	private int joinStreak;
	
	public Timestamp getLastLoginReward() {
		return this.lastLoginReward;
	}
	
	public int getJoinStreak() {
		return this.joinStreak;
	}
}
