package	com.goslindarragh.jaco.user;
import	com.goslindarragh.jaco.data.DataManagerSQLite;
import	com.goslindarragh.jaco.menu.IExecutable;
public class UserViewMenuItem implements IExecutable {
				
				public	UserViewMenuItem(){}
				
				public	void	execute()
				{
								//System.out.println("I	ran:	"	+	UserViewMenuItem.class.getName());
								
								//Get	the	User	data
								UserDAO	model	=	new UserDAO(	DataManagerSQLite.getInstance()	);
								UserConsoleView	view	=	new UserConsoleView();
								UserController	controller	=	new UserController(	view,	model);
								controller.display();
								
				}
				
}