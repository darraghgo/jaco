package	com.goslindarragh.jaco.playlist;
import	java.util.Scanner;
public class playlistController {
				
				private	playlistConsoleView	view;
				private	playlistDAO	model;
				Scanner	input	=	new	Scanner(System.in);
				
				public	playlistController(playlistConsoleView	view,	playlistDAO	model)	{
								this.view	=	view;
								this.model	=	model;
				}
				public	void	display()	{
								
								view.setplaylistList(model.getAllplaylists());
								view.display();
								System.out.println("	\n	Press	enter	return	to	the	main	menu");
								this.input.nextLine();
								
				}	
}