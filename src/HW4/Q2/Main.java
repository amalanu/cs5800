package HW4.Q2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Song> songList = new ArrayList<>();

        Song song1 = new Song("We Will Rock You", "Queen", "News of the World", 202);
        Song song2 = new Song("We Are The Champions", "Queen", "News of the World", 259);
        Song song3 = new Song("Somebody to Love", "Queen", "A Day at the Races", 456);
        Song song4 = new Song("Livin' on a Prayer", "Bon Jovi", "Slippery When Wet", 211);
        Song song5 = new Song("You Give Love a Bad Name", "Bon Jovi", "Slippery When Wet", 342);
        Song song6 = new Song("Out of Touch", "Hall & Oates", "Big Bam Boom", 421);

        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);
        songList.add(song6);

        MusicApplication musicApp = new MusicApplication(songList);
        MusicAppProxy musicAppProxy =  new MusicAppProxy(musicApp);

        System.out.println();
        musicAppProxy.searchByID(1).print();
        System.out.println();
        musicAppProxy.searchByID(5).print();
        System.out.println();

        List<Song> searchList = musicAppProxy.searchByAlbum("News of the World");
        for (int i = 0; i < searchList.size(); i++) {
            searchList.get(i).print();
        }
        System.out.println();

        searchList = musicAppProxy.searchByTitle("Livin' on a Prayer");
        for (int i = 0; i < searchList.size(); i++) {
            searchList.get(i).print();
        }
        System.out.println();
    }
}
