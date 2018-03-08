package	com.goslindarragh.jaco.music;
import	java.util.Scanner;
public class MusicController {
				
				private	MusicConsoleView	view;
				private	MusicDAO	model;
				Scanner	input	=	new	Scanner(System.in);
				
				public	MusicController(MusicConsoleView	view,	MusicDAO	model)	{
								this.view	=	view;
								this.model	=	model;
				}
				public	void	display()	{
								
								view.setMusicList(model.getAllMusics());
								view.display();
								System.out.println("	\n	Press	enter	return	to	the	main	menu");
								this.input.nextLine();
								
				}	
}