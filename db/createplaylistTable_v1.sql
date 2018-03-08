CREATE TABLE playlist
(
	playlistID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	playlistName			varchar(100)	not null,
	playlistEmail		varchar(100)	not null,
	playlistRole			varchar(20)	not null,
	playlistToken		varchar(100)	not null,
	playlistStatus		integer	not null,
	playlistLastUpdate	text not null
);
