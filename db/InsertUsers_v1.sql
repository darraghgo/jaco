BEGIN TRANSACTION;
insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('John Critic', 'theOne@freemail.com', 'admin', 'full', '1', datetime('now'));
insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate )
values ('Todd ItS', 'roboRock@eircom.com', 'guest', 'basic', '2', datetime('now'));
insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('Lindsay Ellis', 'LinE@hotmail.com', 'guest', 'basic', '3', datetime('now'));
COMMIT;
