package	com.goslindarragh.jaco.user;
import	java.util.Scanner;
public class UserController {
				
				private	UserConsoleView	view;
				private	UserDAO	model;
				Scanner	input	=	new	Scanner(System.in);
				
				public	UserController(UserConsoleView	view,	UserDAO	model)	{
								this.view	=	view;
								this.model	=	model;
				}
				public	void	display()	{
								
								view.setUserList(model.getAllUsers());
								view.display();
								System.out.println("	\n	Press	enter	return	to	the	main	menu");
								this.input.nextLine();
								
				}	
}