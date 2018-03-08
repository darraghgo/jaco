package	com.goslindarragh.jaco.music;
import	java.util.ArrayList;
import	java.util.Iterator;
import	com.goslindarragh.jaco.menu.ConsoleControls;
public class MusicConsoleView {
				
				ArrayList<Music>	MusicList;
				
				public MusicConsoleView() {
				}
				public void setMusicList(	ArrayList<Music>	MusicList) {
								this.MusicList	=	MusicList;
				}
				
				public void display() {
								
								System.out.println(	ConsoleControls.ANSI_YELLOW_BRIGHT	+	"...	Music	VIEWER	..."	+	ConsoleControls.ANSI_RESET);
								System.out.println("\n");
								Iterator<Music>	iterator	=	this.MusicList.iterator();
								while	(iterator.hasNext())	{
												Music	aMusic	=	
																(Music)iterator.next();
												aMusic.display();
								}
				}
}