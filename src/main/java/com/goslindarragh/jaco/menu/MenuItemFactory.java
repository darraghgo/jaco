package	com.goslindarragh.jaco.menu;
import	org.apache.logging.log4j.LogManager;
import	org.apache.logging.log4j.Logger;
import	com.goslindarragh.jaco.App;
import com.goslindarragh.jaco.music.MusicViewMenuItem;
import com.goslindarragh.jaco.playlist.playlistViewMenuItem;
import	com.goslindarragh.jaco.music.MusicViewMenuItem;
import	com.goslindarragh.jaco.playlist.playlistViewMenuItem;
import	com.goslindarragh.jaco.user.UserViewMenuItem;
/*
	*	This	class	could	be	used	instead	of	the	generic	Factory	class
	*/
public class MenuItemFactory {
				
				private static	Logger	LOG;
				
				public	MenuItemFactory()	{
								LOG	=	LogManager.getLogger(MenuItemFactory.class);
				}
				public	IExecutable	getMenuItem(String	className)	{
								
								if	("com.goslindarragh.jaco.playlist.PlaylistViewMenuItem".equals(className))	{
												return	(IExecutable)	new playlistViewMenuItem();
								}
								
								if	("com.goslindarragh.jaco.music.MusicViewMenuItem".equals(className))	{
												return	(IExecutable)	new MusicViewMenuItem();
								}
								
								if	("com.goslindarragh.jaco.user.UserViewMenuItem".equals(className))	{
												return	(IExecutable)	new UserViewMenuItem();
								}
								
								//	for	each	menu	item	take	a	copy	of	an	if	line	above	change	the	class	it	is	looking	for
								//	and	the	class	to	use
								
								
								//	this	catches	deliberetly	undefined	menu	items	and	errors
								
								if	("com.goslindarragh.jaco.playlist.UndefinedMenuItem".equals(className))	{
												return	(IExecutable)	new UndefinedMenuItem();
								}
								else
								{
												LOG.error("Undefined	class	requested"	+	className);
												return	(IExecutable)	new UndefinedMenuItem();
								}
								
				}
}