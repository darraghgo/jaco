package	com.goslindarragh.jaco.music;
import	com.goslindarragh.jaco.data.DataManagerSQLite;
import	com.goslindarragh.jaco.menu.IExecutable;
public class MusicViewMenuItem implements IExecutable {
				
				public	MusicViewMenuItem(){}
				
				public	void	execute()
				{
								//System.out.println("I	ran:	"	+	MusicViewMenuItem.class.getName());
								
								//Get	the	Music	data
								MusicDAO	model	=	new MusicDAO(	DataManagerSQLite.getInstance()	);
								MusicConsoleView	view	=	new MusicConsoleView();
								MusicController	controller	=	new MusicController(	view,	model);
								controller.display();
								
				}
				
}