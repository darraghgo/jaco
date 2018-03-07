package	com.goslindarragh.jaco.playlist;
import	java.util.ArrayList;
public interface IplaylistDAO {
				
				public	ArrayList<playlist>	getAllplaylists();
				public	playlist	getplaylist(int	playlistID);
				public int addplaylist(	playlist	aplaylist);
				public void updateplaylist(	playlist	aplaylist);
				public void deleteplaylist(	playlist	aplaylist);
				public	String	printplaylist(	int	playlistID);
}