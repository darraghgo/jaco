package com.goslindarragh.jaco.music;

public class Music {
	private int MusicID;
	private String MusicName;
	private String MusicEmail;
	private String MusicRole;
	private String MusicToken;
	private int MusicStatus;
	private String MusicLastUpdate;
	public Music(int musicID, String musicName, String musicEmail, String musicRole, String musicToken, int musicStatus,
			String musicLastUpdate) {
		MusicID = musicID;
		MusicName = musicName;
		MusicEmail = musicEmail;
		MusicRole = musicRole;
		MusicToken = musicToken;
		MusicStatus = musicStatus;
		MusicLastUpdate = musicLastUpdate;
		
	}
	public int getMusicID() {
		return MusicID;
	}
	public void setMusicID(int musicID) {
		MusicID = musicID;
	}
	public String getMusicName() {
		return MusicName;
	}
	public void setMusicName(String musicName) {
		MusicName = musicName;
	}
	public String getMusicEmail() {
		return MusicEmail;
	}
	public void setMusicEmail(String musicEmail) {
		MusicEmail = musicEmail;
	}
	public String getMusicRole() {
		return MusicRole;
	}
	public void setMusicRole(String musicRole) {
		MusicRole = musicRole;
	}
	public String getMusicToken() {
		return MusicToken;
	}
	public void setMusicToken(String musicToken) {
		MusicToken = musicToken;
	}
	public int getMusicStatus() {
		return MusicStatus;
	}
	public void setMusicStatus(int musicStatus) {
		MusicStatus = musicStatus;
	}
	public String getMusicLastUpdate() {
		return MusicLastUpdate;
	}
	public void setMusicLastUpdate(String musicLastUpdate) {
		MusicLastUpdate = musicLastUpdate;
	}
	@Override
	public String toString() {
		return "Music [MusicID=" + MusicID + ", MusicName=" + MusicName + ", MusicEmail=" + MusicEmail + ", MusicRole="
				+ MusicRole + ", MusicToken=" + MusicToken + ", MusicStatus=" + MusicStatus + ", MusicLastUpdate="
				+ MusicLastUpdate + "]";
	}
	public void display() {
		System.out.println(this.toString());
		
	}

}
