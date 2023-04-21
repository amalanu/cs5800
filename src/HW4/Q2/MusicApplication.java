package HW4.Q2;

import java.util.ArrayList;
import java.util.List;

public class MusicApplication implements SongService{
    ArrayList<Song> songLibrary;

    public MusicApplication(ArrayList<Song> songList) {
        this.songLibrary = songList;
    } 

    @Override
    public Song searchByID(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        return songLibrary.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        ArrayList<Song> titleMatch = new ArrayList<>();

        String currentTitle;
        for (int i = 0; i < songLibrary.size(); i++) {
            currentTitle = songLibrary.get(i).getTitle();
            if (title.equalsIgnoreCase(currentTitle)) {
                titleMatch.add(songLibrary.get(i));
            }
        }

        return titleMatch;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        ArrayList<Song> albumMatch = new ArrayList<>();

        String currentAlbum;
        for (int i = 0; i < songLibrary.size(); i++) {
            currentAlbum = songLibrary.get(i).getAlbum();
            if (album.equalsIgnoreCase(currentAlbum)) {
                albumMatch.add(songLibrary.get(i));
            }
        }

        return albumMatch;
    }
    
}
