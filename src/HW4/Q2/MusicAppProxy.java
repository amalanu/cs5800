package HW4.Q2;

import java.util.ArrayList;
import java.util.List;

public class MusicAppProxy implements SongService{
    ArrayList<Song> songLibrary = new ArrayList<>();
    SongService currentApp;

    //I am assuming the proxy does not already have the songs
    //and must fetch them from the server itself
    //any songs fetched from the server are saved to 
    //proxy's library, so if that same song is searched again
    //the proxy can access it much faster.
    public MusicAppProxy(SongService app) {
        this.currentApp = app;
    } 

    @Override
    public Song searchByID(Integer songID) {
        Song currentSong;
        if (songLibrary.size() > songID) {
            currentSong = songLibrary.get(songID);
        }
        else {
           currentSong = currentApp.searchByID(songID);

           //this adds the whole album the song is from so that
           //if searchByAlbum is called the proxy has the whole album loaded 
           ArrayList<Song> getWholeAlbum;
           getWholeAlbum = (ArrayList<Song>) currentApp.searchByAlbum(currentSong.getAlbum());
            for (int i = 0; i < getWholeAlbum.size(); i++) {
                songLibrary.add(getWholeAlbum.get(i));
            }
        }

        return currentSong;
    }
    
    @Override
    public List<Song> searchByTitle(String title) {

        ArrayList<Song> titleMatch = new ArrayList<>();
        String currentTitle;
        for (int i = 0; i < songLibrary.size(); i++) {
            currentTitle = songLibrary.get(i).getTitle();
            if (title.equalsIgnoreCase(currentTitle)) {
                titleMatch.add(songLibrary.get(i));
            }
        }

        if (titleMatch.size() <= 0) {
            titleMatch = (ArrayList<Song>) currentApp.searchByTitle(title);
            for (int i = 0; i < titleMatch.size(); i++) {
                songLibrary.add(titleMatch.get(i));
            }
        }

        return titleMatch;
    }

    @Override
    public List<Song> searchByAlbum(String album) {

        ArrayList<Song> albumMatch = new ArrayList<>();
        String currentAlbum;
        for (int i = 0; i < songLibrary.size(); i++) {
            currentAlbum = songLibrary.get(i).getAlbum();
            if (album.equalsIgnoreCase(currentAlbum)) {
                albumMatch.add(songLibrary.get(i));
            }
        }

        if (albumMatch.size() <= 0) {
            albumMatch = (ArrayList<Song>) currentApp.searchByAlbum(album);
            for (int i = 0; i < albumMatch.size(); i++) {
                songLibrary.add(albumMatch.get(i));
            }
        }

        return albumMatch;
    }
}
