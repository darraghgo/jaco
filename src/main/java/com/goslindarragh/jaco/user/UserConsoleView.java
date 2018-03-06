package	com.goslindarragh.jaco.user;
import	java.util.ArrayList;
import	java.util.Iterator;
import	com.goslindarragh.jaco.menu.ConsoleControls;
public class UserConsoleView {
				
				ArrayList<User>	userList;
				
				public UserConsoleView() {
				}
				public void setUserList(	ArrayList<User>	userList) {
								this.userList	=	userList;
				}
				
				public void display() {
								
								System.out.println(	ConsoleControls.ANSI_YELLOW_BRIGHT	+	"...	USER	VIEWER	..."	+	ConsoleControls.ANSI_RESET);
								System.out.println("\n");
								Iterator<User>	iterator	=	this.userList.iterator();
								while	(iterator.hasNext())	{
												User	aUser	=	
																(User)iterator.next();
												aUser.display();
								}
				}
}