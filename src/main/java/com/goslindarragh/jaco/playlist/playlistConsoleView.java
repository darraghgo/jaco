package	com.goslindarragh.jaco.playlist;
import	java.util.ArrayList;
import	java.util.Iterator;
import	com.goslindarragh.jaco.menu.ConsoleControls;
public class playlistConsoleView {
				
				ArrayList<playlist>	playlistList;
				
				public playlistConsoleView() {
				}
				public void setplaylistList(	ArrayList<playlist>	playlistList) {
								this.playlistList	=	playlistList;
				}
				
				public void display() {
								
								System.out.println(	ConsoleControls.ANSI_YELLOW_BRIGHT	+	"...	Playlist	VIEWER	..."	+	ConsoleControls.ANSI_RESET);
								System.out.println("\n");
								Iterator<playlist>	iterator	=	this.playlistList.iterator();
								while	(iterator.hasNext())	{
												playlist	aplaylist	=	
																(playlist)iterator.next();
												aplaylist.display();
								}
				}
}