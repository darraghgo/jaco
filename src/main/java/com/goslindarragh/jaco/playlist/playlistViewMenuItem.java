package	com.goslindarragh.jaco.playlist;
import	com.goslindarragh.jaco.data.DataManagerSQLite;
import	com.goslindarragh.jaco.menu.IExecutable;
public class playlistViewMenuItem implements IExecutable {
				
				public	playlistViewMenuItem(){}
				
				public	void	execute()
				{
								//System.out.println("I	ran:	"	+	playlistViewMenuItem.class.getName());
								
								//Get	the	playlist	data
								playlistDAO	model	=	new playlistDAO(	DataManagerSQLite.getInstance()	);
								playlistConsoleView	view	=	new playlistConsoleView();
								playlistController	controller	=	new playlistController(	view,	model);
								controller.display();
								
				}
				
}