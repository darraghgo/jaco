CREATE TABLE Music
(
	MusicID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	MusicName			varchar(100)	 null,
	MusicEmail		varchar(100)	 null,
	MusicRole			varchar(20)	 null,
	MusicToken		varchar(100)	 null,
	MusicStatus		integer null,
	MusicLastUpdate	text not null
);
