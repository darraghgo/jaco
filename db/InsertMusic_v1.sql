BEGIN TRANSACTION;
insert into Music ( musicName, musicEmail, musicRole, musicToken, musicStatus, musicLastUpdate ) 
values  ('Freddie Freeloader', 'an all Time classic, sets a great mood', '', '', '1', datetime('now'));
insert into Music ( musicName, musicEmail, musicRole, musicToken, musicStatus, musicLastUpdate ) 
values  ('Chamelon', 'So funky, makes me wanna dance', '', '', '2', datetime('now'));
insert into Music ( musicName, musicEmail, musicRole, musicToken, musicStatus, musicLastUpdate ) 
values  ('Autumn Leaves', 'The definitive classic', '', '', '4', datetime('now'));
COMMIT;
