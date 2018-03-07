package com.goslindarragh.jaco.playlist;

public class playlist {

	private int playlistID;
	private String playlistName;
	private String playlistEmail;
	private String playlistRole;
	private String playlistToken;
	private int playlistStatus;
	private String userLastUpdate;
	public playlist(int playlistID, String playlistName, String playlistEmail, String playlistRole,
			String playlistToken, int playlistStatus, String userLastUpdate) {
		this.playlistID = playlistID;
		this.playlistName = playlistName;
		this.playlistEmail = playlistEmail;
		this.playlistRole = playlistRole;
		this.playlistToken = playlistToken;
		this.playlistStatus = playlistStatus;
		this.userLastUpdate = userLastUpdate;
	}
	public int getPlaylistID() {
		return playlistID;
	}
	public void setPlaylistID(int playlistID) {
		this.playlistID = playlistID;
	}
	public String getPlaylistName() {
		return playlistName;
	}
	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}
	public String getPlaylistEmail() {
		return playlistEmail;
	}
	public void setPlaylistEmail(String playlistEmail) {
		this.playlistEmail = playlistEmail;
	}
	public String getPlaylistRole() {
		return playlistRole;
	}
	public void setPlaylistRole(String playlistRole) {
		this.playlistRole = playlistRole;
	}
	public String getPlaylistToken() {
		return playlistToken;
	}
	public void setPlaylistToken(String playlistToken) {
		this.playlistToken = playlistToken;
	}
	public int getPlaylistStatus() {
		return playlistStatus;
	}
	public void setPlaylistStatus(int playlistStatus) {
		this.playlistStatus = playlistStatus;
	}
	public String getUserLastUpdate() {
		return userLastUpdate;
	}
	public void setUserLastUpdate(String userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	}
	@Override
	public String toString() {
		return "playlist [playlistID=" + playlistID + ", playlistName=" + playlistName + ", playlistEmail="
				+ playlistEmail + ", playlistRole=" + playlistRole + ", playlistToken=" + playlistToken
				+ ", playlistStatus=" + playlistStatus + ", userLastUpdate=" + userLastUpdate + "]";
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}
