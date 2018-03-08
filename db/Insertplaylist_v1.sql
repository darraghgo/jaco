BEGIN TRANSACTION;
insert into playlist ( playlistName, playlistEmail, playlistRole, playlistToken, playlistStatus, playlistLastUpdate ) 
values  ('Miles Davis', 'Freddie FreeLoader', 'So What', 'jazz', '1', datetime('now'));
insert into playlist ( playlistName, playlistEmail, playlistRole, playlistToken, playlistStatus, playlistLastUpdate ) 
values  ('Herbie Hancock', 'Chameleon ', 'HeadHunters', 'funk jazz', '2', datetime('now'));
insert into playlist ( playlistName, playlistEmail, playlistRole, playlistToken, playlistStatus, playlistLastUpdate ) 
values  ('Cannonball Adderley', 'Autumn Leaves', 'Something Else', 'jazz', '3', datetime('now'));
COMMIT;
