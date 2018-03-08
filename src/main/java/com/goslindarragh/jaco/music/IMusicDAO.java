package	com.goslindarragh.jaco.music;
import	java.util.ArrayList;
public interface IMusicDAO {
				
				public	ArrayList<Music>	getAllMusics();
				public	Music	getMusic(int	MusicID);
				public int addMusic(	Music	aMusic);
				public void updateMusic(	Music	aMusic);
				public void deleteMusic(	Music	aMusic);
				public	String	printMusic(	int	MusicID);
}