package	com.goslindarragh.jaco.playlist;
import	java.sql.Connection;
import	java.sql.DriverManager;
import	java.sql.ResultSet;
import	java.sql.SQLException;
import	java.sql.Statement;
import	java.util.ArrayList;
import	org.apache.logging.log4j.LogManager;
import	org.apache.logging.log4j.Logger;
import	com.goslindarragh.jaco.data.IDataManager;
public class playlistDAO implements IplaylistDAO{
				
				//	DATA
				//............................................................
				
				private	IDataManager	dataManager;
				
				//	This	is	added	to	every	class	that	needs	to	log	with	one	change
				//	The	getLogger(	)	part	should	contain	the	name	of	the	class	its	in
				//	So	you	know	the	messages	that	came	from	objects	of	this	class
				private final	Logger	LOG	=	LogManager.getLogger(playlistDAO.class);
				//	CONSTRUCTORS
				//............................................................
				
				public playlistDAO(	IDataManager	dataManager	) {
								
								this.dataManager	=	dataManager;
				}
				
				//	METHODS
				//............................................................
				
				public	ArrayList<playlist>	getAllplaylists(){
								
								ArrayList<playlist>	playlistList	=	new	ArrayList<playlist>();
								
								//	Get	JDBC	connection	to	database
								Connection	connection	=	null;
								
								try
								{
									 		//	get	a	database	connection
									 		connection	=	this.dataManager.getConnectionObject();
									 	 	 								
										Statement	statement	=	connection.createStatement();
										statement.setQueryTimeout(30);		//	set	timeout	to	30	sec.
										
										//	Run	the	query
										
										ResultSet	resultSet	=	statement.executeQuery("select	*	from	playlist");
										
										//	iterate	through	the	results	create	Playlist	objects	put	in	the	ListArray
										
										while(resultSet.next())
										{
									 			 		playlist	playlist		=	new	playlist(
									 			 	 	 		resultSet.getInt("playlistID"),
									 			 	 	 		resultSet.getString("playlistName"),
									 			 	 	 		resultSet.getString("playlistEmail"),
									 			 	 	 		resultSet.getString("playlistRole"),
									 			 	 	 		resultSet.getString("playlistToken"),
									 			 	 	 		resultSet.getInt("playlistStatus"),
									 			 	 	 		resultSet.getString("playlistLastUpdate")
									 			 	 	 		);
														
														//	putting	the	playlist	objects	into	the	list	but	not	using	them	yet
														playlistList.add(playlist);
														
														//	print	the	results	by	using	the	toString()	on	playlist
														LOG.debug(	"playlist	object	:	"	+	playlist);
										}
									 		
								}
								catch(SQLException	e)
								{
										//	if	the	error	message	is	"out	of	memory",
										//	it	probably	means	no	database	file	is	found
										LOG.error(e.getMessage());
								}	
								finally
								{
										try
										{
												if(connection	!=	null)
													 this.dataManager.disconnect();
										}
										catch(SQLException	e)
										{
												//	connection	close	failed.
												LOG.error(e.getMessage());
										}
								}
								
								return	playlistList;
				}//EOM
				
				public playlist	getplaylist(int	playlistID) {
								throw new	UnsupportedOperationException();
				}
				
				public int addplaylist(	playlist	aplaylist) {
								throw new	UnsupportedOperationException();
				}
				
				public void updateplaylist(	playlist	aplaylist) {
								throw new	UnsupportedOperationException();
				}
				
				public void deleteplaylist(	playlist	aplaylist) {
								throw new	UnsupportedOperationException();
				}
				
				public String	printplaylist(	int	playlistID) {
								throw new	UnsupportedOperationException();
				}
}